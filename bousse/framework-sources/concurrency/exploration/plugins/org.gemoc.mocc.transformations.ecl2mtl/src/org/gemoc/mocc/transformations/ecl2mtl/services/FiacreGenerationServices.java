package org.gemoc.mocc.transformations.ecl2mtl.services;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.PackageDeclarationCS;


/**
 * Services to build the output Fiacre Processes for Properties Checking
 * <br/>add comments,
 * <br/>test more,
 * @author diallopa
 *
 */

public class FiacreGenerationServices {

	/**
	 * This Method builds the MTL rules to get all the constants values in a Given Model - in the Modeling Workbench Environment
	 * **/
	
	public String getModelConstantsDeclaration (PackageDeclarationCS pck, String root)
	{
		StringBuilder sb = new StringBuilder();
		EList <String> listOfconstants = new BasicEList<String>();
		//EList <Type> listOfConcepts = new BasicEList<Type>();
		
		ClassifierContextDeclCS cct = (ClassifierContextDeclCS)EclServices.getContextsFromPack(pck).get(0);
		
		// TODO add conditions on the contents of the Package to be only MetaClasses, NOT Enums, Not else
		listOfconstants.addAll(getMaxNumberOfElementForEachType(cct.getClassifier().getPackage().eContents(),root));
		
		for (Iterator<String> iterator = listOfconstants.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			sb.append(string + "\n");
		}
		
		return sb.toString();
	}
	
	/**
	 * This Method get the constants values representing the Maximum of instance for each Concept in the DSL
	 * **/
	
	public EList <String> getMaxNumberOfElementForEachType (EList <EObject> lstEObj, String root)
	{
		EList <String> lst = new BasicEList<String>();
		
		for (EObject eo : lstEObj) 
		{
			System.out.println("################## : " + ((Type)eo).getName() + " -- " + eo.getClass().getSimpleName());
		}
		
		for (EObject eo : lstEObj) 
		{
			if(isADSLMetaClass(eo)==false)
			{	
				String newConst = "const " + "NUMBER_"+ ((Type)eo).getName()+"s" + " : int is " + "[a"+root+".eAllContents("+((Type)eo).getName()+")->size()/]";
				lst.add(newConst);
			}
		}
		return lst;
	}
	
	
	public boolean isADSLMetaClass(EObject o){
		boolean isTrue = false;
		// Here we also exclude the MetaClass called NamedElement.. List of Exclusion to complete
		if(((Type)o).getName().equals("NamedElement"))
			isTrue  = true;
		if(o.getClass().getSimpleName().contains("Enum"))
			isTrue  = true;
		return isTrue;
	}
	
	/**
	 * Using this method is OPTIONAL. This Method gets the constant values of each attribute of Each concpet in the instance model
	 * **/
	public EList <String> getConstantValuesOfConceptAttributes (EList <EObject> lstEObj, String root)
	{
		EList <String> lst = new BasicEList<String>();
		
		// TODO Optional Method to Implement
		return lst;
	}
	
	/**
	 * This Method builds all the ID arrays related to the attributes (references) Types, for each concept of a DSL
	 * **/
	
	public String getTypeArrayIDDeclaration (PackageDeclarationCS pck, String root)
	{
		StringBuilder sb = new StringBuilder();
		EList <String> listIDArray = new BasicEList<String>();
		EList <Type> listOfType = new BasicEList<Type>();
		
		ClassifierContextDeclCS cct = (ClassifierContextDeclCS) EclServices.getContextsFromPack(pck).get(0);
		for (EObject eo : cct.getClassifier().getPackage().eContents()) {
			listOfType.add((org.eclipse.ocl.examples.pivot.Type)eo);
		}
		
		EList <TypeAndAttribute> list_attr = new BasicEList<TypeAndAttribute>();
		getListofAllOwnedAttributes(listOfType,list_attr); // Get the List of attributes at the MM Level
		
		System.out.println("============================================================");
		for (TypeAndAttribute atp : list_attr) 
		{
			// listIDArray.add(getAttributeArrayDefinition(attr,cct.getClassifier(),root));
			if(!getAttributeArrayDefinition(atp,cct.getClassifier(),root).equals("empty"))
				listIDArray.add(getAttributeArrayDefinition(atp,cct.getClassifier(),root));
		}
		System.out.println("============================================================");
		
		for (Iterator<String> iterator = listIDArray.iterator(); iterator.hasNext();) {
			String input = iterator.next();
			sb.append(input);
		}
		
		return sb.toString();
	}
	
	/**
	 * This Method gets the Array Declaration elements for each attribute of a Concept
	 * **/
	
	public String getAttributeArrayDefinition(TypeAndAttribute atp, Type type, String root)
	{
		FiacreArrayElement elt = new FiacreArrayElement("", "", "");
		String leftsideMetaClass = "";
		String rightsideMetaClass = "";
		String arraytoAdd = "empty";
		System.out.println("cct = " +type.getName() + "/ attrType = " + atp.prop.getType().getName());
		if (atp.prop.getType().getName().equalsIgnoreCase("OrderedSet")) 
		{
			if(atp.prop.getType().toString().contains(type.getPackage().toString())==true)
			{
				leftsideMetaClass = "OrderedSet"+"\\("+type.getPackage().toString()+"::";
			}
			
			else
			{
				leftsideMetaClass = "OrderedSet\\(ecore::";
			}
			
			rightsideMetaClass = "\\)";
			String ff = atp.prop.getType().toString();
			elt.conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "").replace("[+]","");
			elt.arrayname = elt.conceptname+"_"+atp.prop.getName() +"Array";
			elt.arrayname = elt.arrayname.replace("::", "_");

			//elt.arraysize = "[a"+root+".eContents("+elt.conceptname+")->size()/]";
			elt.arraysize = "["+atp.type.getName()+".eContents("+elt.conceptname+")->size()/]";
			arraytoAdd = "type " +elt.arrayname + " is array "+ elt.arraysize+" of "+ "int" +"\n";
		}
		
		if (atp.prop.getType().getName().equalsIgnoreCase("ArrayList")) 
		{
			if(atp.prop.getType().toString().contains(type.getPackage().toString())==true)
			{
				leftsideMetaClass = "ArrayList"+"\\("+type.getPackage().toString()+"::";
			}
			else
			{
				leftsideMetaClass = "ArrayList\\(ecore::";
			}
			rightsideMetaClass = "\\)";
			String ff = atp.prop.getType().toString();
			elt.conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "").replace("[+]","");
			elt.arrayname = elt.conceptname+"_"+atp.prop.getName() +"Array";
			elt.arrayname = elt.arrayname.replace("::", "_");
			
			elt.arraysize = "100";
			arraytoAdd = "type " +elt.arrayname + " is array "+ elt.arraysize+" of "+ "int" +"\n";
		}
		
		
		return arraytoAdd;
	}
	
	
	/**
	 * This Method gets the list of attributes of all the Types given
	 * **/
	public void getListofAllOwnedAttributes(EList <org.eclipse.ocl.examples.pivot.Type> lst, EList <TypeAndAttribute> listAtrr)
	{
		for (org.eclipse.ocl.examples.pivot.Type t : lst) 
		{
			for (Property property : t.getOwnedAttribute()) 
			{
				if(!(property.getName().equals(t.getName())))
				{
					TypeAndAttribute aTP = new TypeAndAttribute(t, property);
					listAtrr.add(aTP);
				}
			}
		}
	}
}
