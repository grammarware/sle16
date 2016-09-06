package org.gemoc.mocc.transformations.ecl2mtl.services;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class XtendFileChooserBasic {

	String xtendfl;
	public XtendFileChooserBasic(String xtendFilePath){xtendfl = xtendFilePath;}
	
	public File getFile(){
		File selectedFile = null;
		JFileChooser  fl = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Xtend Extension","xtend");
		fl.setFileFilter(filter);
		//fl.setCurrentDirectory(new File(System.getProperty("user.dir")));
		fl.setCurrentDirectory(new File(xtendfl));
		int result = fl.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
		    selectedFile = fl.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		}
		return selectedFile;
	}
}
