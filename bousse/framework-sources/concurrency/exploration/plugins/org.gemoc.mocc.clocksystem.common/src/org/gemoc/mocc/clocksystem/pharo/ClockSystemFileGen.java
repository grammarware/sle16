/**
 * Copyright (c) 2012-2016 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Papa Issa Diallo - ENSTA Bretagne [papa_issa.diallo@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */

package org.gemoc.mocc.clocksystem.pharo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class ClockSystemFileGen {
	
	ProcessBuilder pb;

	String vmtype;
	OSDectect od;
	
	//private URI uriJar;
	private File vmFile;

	private Shell activeShell;
	
	public ClockSystemFileGen() throws URISyntaxException, IOException
	{
		od = new OSDectect();
		if(od.curos.equals("Windows")){
			vmtype = "win_vm";
			vmFile = new File(FileLocator.getBundleFile(Platform.getBundle("org.gemoc.mocc.clocksystem.win")).toURI());	
		}
		else if (od.curos.equals("mac")){
			vmtype = "mac_vm";
			vmFile = new File(FileLocator.getBundleFile(Platform.getBundle("org.gemoc.mocc.clocksystem.mac")).toURI());
		}
		else if (od.curos.equals("linux")){
			vmtype = "linux_vm";
			vmFile = new File(FileLocator.getBundleFile(Platform.getBundle("org.gemoc.mocc.clocksystem.linux")).toURI());
		}
		System.out.println("====================================");
		System.out.println("File Name= " + vmFile);
		System.out.println("OS = " + od.curos +"\n"+"VM ="+  vmtype);
		System.out.println("====================================");
		
	}
	
	public void GenerateExploration(String filetab[], String dirtab[])
	{
		String currpath = getVmpath().replace("\\", "/");	
		String currpath_win = getVmpath().replace("\\", "\\\\");
		
		String image_pathwin = currpath_win + vmtype + "\\\\" + "ClockSystem.image";
		String image_pathother = currpath + "/" + vmtype + "/" + "ClockSystem.image";
		
		String runwinvm = currpath_win + vmtype + "\\\\" + "Pharo.exe";
		String runlinvm = currpath + "/" + vmtype + "/" + "pharo";
		String runmacvm = currpath + "/" + vmtype + "/" + "Contents" + "/" + "MacOS" + "/" + "Pharo";

		System.out.println("====================================");
		System.out.println("currpath_win= " + currpath_win);
		System.out.println("image_pathwin= "+ image_pathwin);
		System.out.println("runwinvm= "+ runwinvm);
		System.out.println("====================================");
		
		/*String locwin= "stream := FileStream readOnlyFileNamed:'"+filetab[0]+"'. ";
		String locoth= "stream := '"+filetab[1]+"' asFileReference readStream. ";
		String arg1= "sys := (Compiler evaluate: stream contents)system. ";
		String arg2= " ClockSystem4GeMoC ";
		String arg3= "explore: sys resultIn: ";
		
		String toEvaluateWin = locwin + arg1 + arg2 + arg3 + "'"+dirtab[0]+"'"+".";
		String toEvaluateOth = locoth + arg1 + arg2 + arg3 + "'"+dirtab[1]+"'"+".";
		
		System.out.println("linux path = " + runlinvm);
		System.out.println("output path = " + dirtab[1]);
		
		String myPath = "C://g//concurrency//exploration//plugins//org.gemoc.mocc.clocksystem.win.core//win_vm//";
		pb = new ProcessBuilder(myPath + "//Pharo.exe","--headless",myPath + "//ClockSystem.image","eval", generatePharoScript(filetab[0], dirtab[0]).getAbsolutePath());
		System.out.println("Create new process builder for windows");*/
		
		
		if(od.curos.equals("Windows"))
		{
			pb = new ProcessBuilder(runwinvm,"--headless",image_pathwin,"eval",generatePharoScript(filetab[0], dirtab[0]).getAbsolutePath());
			System.out.println("Create new process builder for windows");
		}
		else if (od.curos.equals("mac"))
		{
			pb = new ProcessBuilder(runmacvm,"-headless",image_pathother,"eval",generatePharoScript(filetab[1], dirtab[1]).getAbsolutePath());
		}
		else if (od.curos.equals("linux"))
		{
			File lunchScript = generatePharoScript(filetab[1], dirtab[1]);
			lunchScript.setReadable(true);
			pb = new ProcessBuilder("/bin/bash", runlinvm,image_pathother,"eval",lunchScript.getAbsolutePath());
		}
		runFileGen();
		//pb.directory(new File("C:\\OBPFiacreTests\\GenOutput"));
	}
	
	private File generatePharoScript(String clockSystemPath, String clockSystemRepositoryPath){
		File result = new File(clockSystemRepositoryPath+"clockSystemScript.st");
		try{
			result.createNewFile();
			FileWriter fileWriter=new FileWriter(result);
			fileWriter.write("stream := FileStream readOnlyFileNamed:'"+clockSystemPath+"'. ");
			fileWriter.write("sys := (Compiler evaluate: stream contents)system. ");
			fileWriter.write(" ClockSystem4GeMoC explore: sys resultIn:'" +clockSystemRepositoryPath +"'." );
			//fileWriter.write(" Pharo exit." );
			fileWriter.close();
		}
		catch (Exception e) {
				activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
				return result;
		}
		return result;
	}
	
	public File getVmFile() {
		return vmFile;
	}
	
	public String getVmpath() {
		/*if(vmFile.isDirectory()){
			return vmFile.getAbsolutePath();
		}else if(vmFile.isFile()){
			return vmpath = System.getProperty("java.io.tmpdir");
		}
		return vmpath;*/
		return System.getProperty("java.io.tmpdir");
	}
	
	public void unzipClockSystemfromJar() throws URISyntaxException, IOException {
		
		//URI uriJar = ClockSystemFileGen.class.getProtectionDomain().getCodeSource().getLocation().toURI();
		//File aFile = new File(uriJar);
		
		try {
			JarFile jar = new JarFile(vmFile);
			extractJar(jar, "ClockSystemFileGen.class",getVmpath());				
		} 
		catch (final FileNotFoundException e) {
		e.printStackTrace();
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    public void run() {
		    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
			}
		});
		
		} catch (final UnsupportedEncodingException e) {
		e.printStackTrace();
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    public void run() {
		    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
			}
		});
		}
	}

	private void extractJar(JarFile jar, String tmpdir, String temp_dir_path) {
		System.out.println("Extract jar " + jar.getName() + " from dir " + tmpdir);
		Enumeration<JarEntry> entries =  jar.entries();
		ArrayList<File> list = new ArrayList<File>();
		// Approximately takes 3 to 5 Minutes
		final String Message = "Calling <ClockSystem Exhaustive Exploration> might take some minutes the first time \n"
				+ "This is due to the Extraction of the ClockSystem Virtual Machine into the folder : \n"
				+"<"+vmtype+">" + " in " + temp_dir_path+"\n"
				+ "This step is only done once";
		while(entries.hasMoreElements())
	    {
		   String destdir = temp_dir_path;     //destination directory
	        
	       JarEntry entry = entries.nextElement();
	         
	       File fl = new File(destdir, entry.getName());
		    
	       if(!fl.exists())
	        {
	    	   
	    	   if( fl.toString().endsWith(vmtype)==true){
	    	       PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
	    			    public void run() {
	    			    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    			    	MessageDialog.openInformation(activeShell, "ClockSystem File Generation and VM Extraction", Message);
	    				}
	    			});
	    		   fl.getParentFile().mkdirs();
	    		   if(list.contains(fl.getParentFile())==false)
	    			   list.add(fl.getParentFile());
	    		   fl = new File(destdir, entry.getName());
	    		   if(list.contains(fl)==false)
	    			   list.add(fl);
	    		   if(entry.isDirectory())
	   	        	{
	    			   continue;
	   	        	}
	   	       
	    		   InputStream jarStream;
	    		   FileOutputStream oStream;
	    		   try {
	    			   	jarStream = jar.getInputStream(entry);
	    			   	oStream = new java.io.FileOutputStream(fl);
	   	        
	    			   	while(jarStream.available()>0)
	    			   	{
	    			   		oStream.write(jarStream.read());
	    			   	}
	    			   	oStream.close();
	    			   	jarStream.close();  
	    		   } catch (final IOException e) {
					e.printStackTrace();
					PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
	    			    public void run() {
	    			    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    			    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
	    				}
	    			});
					
				}
	    	   }
	    	   
	    	  if((fl.toString().endsWith(vmtype)==false) && (fl.getParentFile().toString().endsWith(vmtype)==true))
	    	   {
	   	       	  fl.getParentFile().mkdirs();
	   	       	  if(list.contains(fl.getParentFile())==false)
	   	       		  list.add(fl.getParentFile());
	   	       	  fl = new File(destdir, entry.getName());
	   	       	  if(list.contains(fl)==false)
	   	       		  list.add(fl);
	  
	    		   if(entry.isDirectory())
	   	        	{
	    			   //fl.setExecutable(true);
		    		   continue;
	   	        	}
	    		   InputStream jarStream;
	    		   FileOutputStream oStream;
				try {
	    		   jarStream = jar.getInputStream(entry);
	    		   oStream = new java.io.FileOutputStream(fl);
	   	       
	    		   while(jarStream.available()>0)
	   	        	{
	    			   oStream.write(jarStream.read());
	   	        	}
	    		   	oStream.close();
	   	        	jarStream.close();  
				} catch (final IOException e) {
					e.printStackTrace();
					PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
	    			    public void run() {
	    			    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    			    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
	    				}
	    			});
				}
	    	   }
	    	 
	    	  if(vmtype.equals("linux_vm")==true)
	    	  {
	    		  if(( fl.toString().endsWith(vmtype)==false) && (fl.getParentFile().toString().contains(vmtype)==true)&& (fl.getParentFile().toString().endsWith("bin")==true))
	    		  {	  
		   	       	  fl.getParentFile().mkdirs(); 
		   	       	  if(list.contains(fl.getParentFile())==false)
		   	       		  list.add(fl.getParentFile());
		   	       	  fl = new File(destdir, entry.getName());
		   	       	  if(list.contains(fl)==false)
		   	       		  list.add(fl);
	    		  
		    		   if(entry.isDirectory())
		   	        	{
		    			   continue;
		   	        	}
		    		   InputStream jarStream;
		    		   FileOutputStream oStream;
					try {
		    		   jarStream = jar.getInputStream(entry);
		    		   oStream = new java.io.FileOutputStream(fl);
		   	       
		    		   while(jarStream.available()>0)
		   	        	{
		    			   oStream.write(jarStream.read());
		   	        	}
		    		   	oStream.close();
		   	        	jarStream.close();  
					} catch (final IOException e) {
						e.printStackTrace();
						PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    			    public void run() {
		    			    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    			    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
		    				}
		    			});
					}
	    		  }
	    		  if(( fl.toString().endsWith(vmtype)==false) && (fl.getParentFile().toString().contains(vmtype)==true)&& (fl.getParentFile().toString().endsWith("icons")==true))
	    		  {
		   	       	  fl.getParentFile().mkdirs();
		   	       	  if(list.contains(fl.getParentFile())==false)
		   	       		  list.add(fl.getParentFile());
		   	       	  fl = new File(destdir, entry.getName());
		   	       	  if(list.contains(fl)==false)
		   	       		  list.add(fl); 
		    		   
		   	       	  if(entry.isDirectory())
		   	        	{
		    			   continue;
		   	        	}
		    		   InputStream jarStream;
		    		   FileOutputStream oStream;
					try {
		    		   jarStream = jar.getInputStream(entry);
		    		   oStream = new java.io.FileOutputStream(fl);
		   	       
		    		   while(jarStream.available()>0)
		   	        	{
		    			   oStream.write(jarStream.read());
		   	        	}
		    		   	oStream.close();
		   	        	jarStream.close();  
					} catch (final IOException e) {
						e.printStackTrace();
						PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    			    public void run() {
		    			    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    			    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
		    				}
		    			});
					}
	    		  }
	    		  if(( fl.toString().endsWith(vmtype)==false) && (fl.getParentFile().toString().contains(vmtype)==true)&& (fl.getParentFile().toString().endsWith("shared")==true))
	    		  {
	    			  fl.getParentFile().mkdirs();
	    			  if(list.contains(fl.getParentFile())==false)
		    			   list.add(fl.getParentFile());
		    		   fl = new File(destdir, entry.getName());
		    		   if(list.contains(fl)==false)
		    			   list.add(fl);

		    		   if(entry.isDirectory())
		   	        	{
		    			   continue;
		   	        	}
		    		   InputStream jarStream;
		    		   FileOutputStream oStream;
					try {
		    		   jarStream = jar.getInputStream(entry);
		    		   oStream = new java.io.FileOutputStream(fl);
		   	       
		    		   while(jarStream.available()>0)
		   	        	{
		    			   oStream.write(jarStream.read());
		   	        	}
		    		   	oStream.close();
		   	        	jarStream.close();  
					} catch (final IOException e) {
						e.printStackTrace();
						PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    			    public void run() {
		    			    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    			    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
		    				}
		    			});
					}
	    		  }
	    	  }
	    	  if(vmtype.equals("mac_vm")==true)
	    	  {
	    		  //TODO parse repo
	    	  }
	        }
	    }
		for(File l:list)
		{
			l.setReadable(true, false);
			l.setWritable(true, false);
			if(l.isDirectory()==false)
			{
				if((l.toString().endsWith("pharo")) ||(l.toString().endsWith("Pharo")) || (l.toString().endsWith("Pharo.exe"))) 
				{
					l.setExecutable(true, false);
				}
			}
		}
	}

	public void runFileGen()
	{
		try 
		{
			System.out.println("Run file gen");
			//JOptionPane.showMessageDialog(null, pb.command(), "Command", JOptionPane.INFORMATION_MESSAGE);
			Process p = pb.start();
			LogStreamReader lsr = new LogStreamReader(p.getInputStream());
			Thread thread = new Thread(lsr, "LogStreamReader");
			thread.start();
		} 
		catch (final IOException e) 
		{
        e.printStackTrace();
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    public void run() {
		    	activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    	MessageDialog.openError(activeShell, "ERROR MESSAGE", e.toString());
			}
		});
		}
	}
}