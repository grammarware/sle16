package org.gemoc.bcool.transformation.bcool2qvto.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//http://www.eclipse.org/ocl/1.1.0/oclstdlib.ecore







import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.xtext.base.basecs.ImportCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.PackageDeclarationCS;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.bcool.EventExpression;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.gemoc.gexpressions.GExpression;
import org.eclipse.ocl.ecore.IntegerLiteralExp;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ECL.ECLDocument;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.IntegerElement;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.impl.IntegerImpl;
import fr.inria.aoste.timesquare.ecl.xtext.EclStandaloneSetup;

import org.gemoc.gexpressions.GAndExpression;
import org.gemoc.gexpressions.GBooleanExpression;
import org.gemoc.gexpressions.GBraceExpression;
import org.gemoc.gexpressions.GEqualityExpression;
import org.gemoc.gexpressions.GIntegerExpression;
import org.gemoc.gexpressions.GNavigationExpression;
import org.gemoc.gexpressions.GNegationExpression;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.GStringExpression;
import org.gemoc.gexpressions.GexpressionsFactory;
//import org.gemoc.gexpressions.xtext.GExpressionsStandaloneSetup;
import org.eclipse.xtext.serializer.impl.Serializer;



@SuppressWarnings("restriction")
public class helperNsURI {
	
	
	
	
	public String prettyPrintAlias(String e) {
		return e.substring(maxPositive(0,e.lastIndexOf('/')+1), e.lastIndexOf('.'));
	}
	private int maxPositive(int i1, int i2) {
		if (i1 < 0 && i2 <0)
			return 0;
		if (i1 < 0)
			return i2;
		if (i2 < 0)
			return i1;
		if (i1 < i2)
			return i2;
		else
			return i1;
	}
	
	
	public ECLDocument getEclDocument(ImportInterfaceStatement importInterfaceStatement){
		//init Xtext
				String modelPath = importInterfaceStatement.getImportURI();
				
				EclStandaloneSetup  ess= new EclStandaloneSetup();
				Injector injector = ess.createInjector();
			    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
				aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE);
				EcoreUtil.resolveAll(aSet);
				EclStandaloneSetup.doSetup();

				URI uri =null;
				//filter URI
				if (modelPath.startsWith("platform:/plugin")){
					uri = URI.createPlatformPluginURI(modelPath.replace("platform:/plugin", ""), false);
				}else
				if(modelPath.startsWith("platform:/resource")){
					uri = URI.createPlatformResourceURI(modelPath.replace("platform:/resource", ""),false);
				}else{//relative path
//					throw new IllegalArgumentException("the path of the library must be platform based (platform:/resource or platform:/plugin)");
					uri = URI.createFileURI(modelPath);
				}
				
			    //load the corresponding resource
			    Resource eclResource = aSet.getResource(uri, true);
			    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
			    Builder aBuilder = SaveOptions.newBuilder();
			    SaveOptions anOption = aBuilder.getOptions();
			    anOption.addTo(saveOptions);
			    try {
			    	eclResource.load(saveOptions);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    
			    ECLDocument eclDoc = (ECLDocument)eclResource.getContents().get(0);
			    return eclDoc;
	}
	
	
	
	public ECLDocument getEclDocumentfromURI(String modelPath){
		//init Xtext
				
				EclStandaloneSetup  ess= new EclStandaloneSetup();
				Injector injector = ess.createInjector();
			    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
				aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				EcoreUtil.resolveAll(aSet);
				EclStandaloneSetup.doSetup();

				URI uri =null;
				//filter URI
				if (modelPath.startsWith("platform:/plugin")){
					uri = URI.createPlatformPluginURI(modelPath.replace("platform:/plugin", ""), false);
				}else
				if(modelPath.startsWith("platform:/resource")){
					uri = URI.createPlatformResourceURI(modelPath.replace("platform:/resource", ""),false);
				}else{//relative path
//					throw new IllegalArgumentException("the path of the library must be platform based (platform:/resource or platform:/plugin)");
					uri = URI.createFileURI(modelPath);
				}
				
			    //load the corresponding resource
			    Resource eclResource = aSet.getResource(uri, true);
			    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
			    Builder aBuilder = SaveOptions.newBuilder();
			    SaveOptions anOption = aBuilder.getOptions();
			    anOption.addTo(saveOptions);
			    try {
			    	eclResource.load(saveOptions);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    
			    ECLDocument eclDoc = (ECLDocument)eclResource.getContents().get(0);
			    return eclDoc;
	}
	
	
	
	public String resolveAll(BCoolSpecification aBCoolSpec){
		EcoreUtil.resolveAll(aBCoolSpec.eResource().getResourceSet());
		return "// This is the result of the compilation of a BCool spec";
	}
	
	//
	// getNSURI:
	//
	// return the corresponding NSURI for an ecore
	//
	public String getNSURI(ImportInterfaceStatement importInterfaceStatement){
		//ECLDocument eclDoc = getEclDocument(importInterfaceStatement);
	    //String oclimport = eclDoc.getOwnedImport().get(0).toString();
	    // I get the first import that corresponds with the metamodel
	    String ecoreimport = importInterfaceStatement.getImportURI();
		//ecoreimport = ecoreimport.substring(ecoreimport.indexOf('\'')+1, ecoreimport.lastIndexOf('\''));
	    
	    	URI metaURI=URI.createURI(ecoreimport,false);
	    	ResourceSet resourceSet = new ResourceSetImpl(); 
	        Resource resource1 = resourceSet.getResource(metaURI, true);
	        
	        EPackage wdwPackage = (EPackage)resource1.getContents().get(0);
	    	return wdwPackage.getNsURI();
	    // It is a NSURI
	//    }else if (oclimport.startsWith("http:/")) {
	 //   	return oclimport;
	    // Not recognized
	   // }else {
	   // 	return "bad metamodel in ecl";
	   // }
	}
	
	public  EPackage getEcoreDocument(ImportInterfaceStatement importInterfaceStatement){
	    String ecoreimport = importInterfaceStatement.getImportURI();
		//ecoreimport = ecoreimport.substring(ecoreimport.indexOf('\'')+1, ecoreimport.lastIndexOf('\''));
	    
	    	URI metaURI=URI.createURI(ecoreimport,false);
	    	ResourceSet resourceSet = new ResourceSetImpl(); 
	        Resource resource1 = resourceSet.getResource(metaURI, true);
	        
	        EPackage wdwPackage = (EPackage)resource1.getContents().get(0);
	    	return wdwPackage;
	}
	
	
	// getNSURIIndex (i):
	// return the corresponding NSURI for the i-esimo ecore imported by the ecl.
	//
	public String getNSURIIndex(ImportInterfaceStatement importInterfaceStatement, Integer i){
		ECLDocument eclDoc = getEclDocument(importInterfaceStatement);
	    // This gets directly the imported statement
		String oclimport = eclDoc.getOwnedImport().get(i).getPathName().toString();
	    // some cleaning 
		oclimport = oclimport.substring(oclimport.indexOf('\'')+1, oclimport.lastIndexOf('\''));
	    
		// Depending on the kind of import we found differently the NSURI
	    if (oclimport.endsWith(".ecore")) {
	    	
	    	// In ECL, if the .ecore is imported as resource, it is changed by plugin
	    	// WARN: the BCOoL should not be in the same workbench that the languages
	    	if (oclimport.startsWith("platform:/resource")) {
	    		oclimport = oclimport.replace("resource","plugin");
	    	}
	    	URI metaURI=URI.createURI(oclimport,false);
	    	ResourceSet resourceSet = new ResourceSetImpl(); 
	        Resource resource1 = resourceSet.getResource(metaURI, true);
	        
	        EPackage wdwPackage = (EPackage)resource1.getContents().get(0);
	    	return wdwPackage.getNsURI();
	    // It is a NSURI
	    }else if (oclimport.startsWith("http:/")) {
	    	return oclimport;
	    // Not recognized
	    }else {
	    	return "bad metamodel in ecl";
	    }
	}
	
//	public String getpackageIndex(ECLDocument eclDoc, String objectName){
//	EList<PackageDeclarationCS> allpackages = eclDoc.getPackages();
//	
//	for(int i=0; i< allpackages.size(); i++){
//		PackageDeclarationCS pdecl = allpackages.get(i);
//		org.eclipse.ocl.examples.pivot.Package p =  pdecl.getPackage();
//		TreeIterator<EObject> it = p.eAllContents();
//		while( it.hasNext()){
//			EObject eo = it.next();
//			String eoName = "";
//			try {
//				if(eo.getClass().getMethod("getName") != null){
//					eoName = (String) eo.getClass().getMethod("getName").invoke(eo, new Object[]{});
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if ((eoName != null) && (eoName.compareTo(objectName)==0)){
//				return (new Integer(i+1)).toString();
//			}
//		}
//	}
//	return (new Integer(1)).toString(); //1 is returned by default since we do not necessarly know the name of the rootElement and it is PAckage by default (for UML)
//}
	
	public int getpackageIndex(ECLDocument eclDoc, ClassifierContextDeclCS contextDecl){
//		EList<PackageDeclarationCS> allpackages = eclDoc.getPackages();
//		System.out.println("\n\n*************************************************\n");
//		System.out.println(contextDecl.getPathName().getElement());
//		System.out.println(contextDecl.getPathName().getElement().eResource());
//		System.out.println(contextDecl.getPathName().getElement().eResource().getURI());
//		System.out.println("*******************************************************");
		String packageName = contextDecl.getPathName().getElement().eResource().getURI().toString();
		EList<ImportCS> allImports = eclDoc.getOwnedImport();
		for(int i = 0; i < allImports.size(); i++){
			if (allImports.get(i).getPathName().getElement().eResource().getURI().toString().compareTo(packageName) == 0){
				return i+1;
			}
		}
		return 1;
//		for(int i=0; i< allpackages.size(); i++){
//			PackageDeclarationCS pdecl = allpackages.get(i);
//				if ((packageName != null) && (packageName.compareTo(pdecl.getPackage().getName())==0)){
//					return (new Integer(i+1)).toString();
//				}
//			}
//		return (new Integer(1)).toString(); //1 is returned by default since we do not necessarly know the name of the rootElement and it is PAckage by default (for UML)
	}
	
	
	
	
	public String getrootfromInterface (ImportInterfaceStatement importInterfaceStatement){
		String uri = getNSURI (importInterfaceStatement);
		
		return "";
	}
	
	
	public String getModelPath(EObject d){
		String res ="";
			res = d.eResource().getURI().toFileString();
		return res;
	}
	
	
	
   // given a GNavigationExpression returns the serialization 
	public String GOperandtoString (GNavigationExpression operand){
		 String m = "";
		 GNavigationExpression test1 = (GNavigationExpression) operand;
		 while (true)
		  {
			  if (test1.getReferencedEObject() instanceof EAttribute) {
				  EAttribute nameatt = (EAttribute) test1.getReferencedEObject();
				  m =  "."  + nameatt.getName()  +  m;
			  } else if (test1.getReferencedEObject() instanceof EReference) {
				  EReference nameatt = (EReference) test1.getReferencedEObject();
				  m =  "."  + nameatt.getName()  +  m;
			  }
			  
			  if (test1.getBody() instanceof GReferenceExpression) break;
			  
			  test1 = (GNavigationExpression) test1.getBody();	 
		  }
		 
		 GReferenceExpression test2 = (GReferenceExpression) test1.getBody();
		 BCoolOperatorArg nameatt = (BCoolOperatorArg) test2.getReferencedEObject();
		 m =  nameatt.getName()  +  m;
		 return m;
	}
	
	// GEqualitytoString:
	// 
	// Convert a GEquality expression to String. The operand can be either a NavigationExpression or String
	// Other operands may cause an exception, e.g., Integer
	//
	public String GEqualitytoString (GEqualityExpression exp)
	{
		String serial = "";
		String leftoperstr =  "";
		String rightoperstr =  "";
		
		if (exp.getLeftOperand() instanceof GNavigationExpression) {
			GNavigationExpression leftoper = (GNavigationExpression) exp.getLeftOperand();
			leftoperstr =  GOperandtoString (leftoper);
		} else if (exp.getLeftOperand() instanceof GStringExpression){
			GStringExpression leftoper = (GStringExpression) exp.getLeftOperand();
			leftoperstr = '"'+ leftoper.getValue() + '"';
		} else if (exp.getLeftOperand() instanceof GBooleanExpression) {
			GBooleanExpression leftoper = (GBooleanExpression) exp.getLeftOperand();
			
			if (leftoper.isValue()) {
				leftoperstr = "true";
			} else {leftoperstr = "false";}
	// this is the case when only the context is used to compare elements
	} else if (exp.getLeftOperand() instanceof GReferenceExpression) {
		GReferenceExpression leftoper = (GReferenceExpression) exp.getLeftOperand(); 
		if (leftoper.getReferencedEObject() instanceof BCoolOperatorArg) {
			BCoolOperatorArg bcoolarg = (BCoolOperatorArg) leftoper.getReferencedEObject();
			 leftoperstr  =  bcoolarg.getName();
		  } else {leftoperstr  =  "bad model element";}
	}
			

		if (exp.getRightOperand() instanceof GNavigationExpression) {
			GNavigationExpression rightoper = (GNavigationExpression) exp.getRightOperand();
			rightoperstr = GOperandtoString (rightoper); 
			//serial =  serial + "=" +GOperandtoString (rightoper);
		} else if (exp.getRightOperand() instanceof GStringExpression){
			GStringExpression rightoper = (GStringExpression) exp.getRightOperand();
			//serial = serial + "=" + '"' + rightoper.getValue()+ '"';
			rightoperstr = '"' + rightoper.getValue()+ '"'; 
		} else if (exp.getRightOperand() instanceof GBooleanExpression) {
			GBooleanExpression rightoper = (GBooleanExpression) exp.getRightOperand();
			
			if (rightoper.isValue()) {
				rightoperstr  = "true";
			} else {rightoperstr  = "false";}
		// this is the case when only the context is used to compare elements
		} else if (exp.getRightOperand() instanceof GReferenceExpression) {
			GReferenceExpression rightoper = (GReferenceExpression) exp.getRightOperand(); 
			if (rightoper.getReferencedEObject() instanceof BCoolOperatorArg) {
				BCoolOperatorArg bcoolarg = (BCoolOperatorArg) rightoper.getReferencedEObject();
				  rightoperstr  =  bcoolarg.getName();
			  } else {rightoperstr  =  "bad model element";}
		} 
		
		// Equal and Not Equal are the same GExpression
		if (exp.getOperator().getName().contains("NOTEQUAL")) {
				serial = leftoperstr + "<>" +  rightoperstr;
		}else if (exp.getOperator().getName().contains("EQUAL")){
			serial = leftoperstr + "=" +  rightoperstr;
		}

		
		return serial;
	}
	
	
	
	
	public String GBraceExpressiontoString (GBraceExpression exp)
	{
		String serial = "";
		
		if (exp.getInnerExpression() instanceof GEqualityExpression ){
			GEqualityExpression  gexp = (GEqualityExpression) exp.getInnerExpression();
			serial = "("+ GEqualitytoString (gexp)+ ")";
		} else if (exp.getInnerExpression() instanceof GAndExpression) {
			GAndExpression   gexp = (GAndExpression) exp.getInnerExpression();
			serial = "(" + GAndtoString (gexp) + ")";
		} else if (exp.getInnerExpression() instanceof GBraceExpression) {
			GBraceExpression  gexp = (GBraceExpression) exp.getInnerExpression();
			serial = "(" + GBraceExpressiontoString (gexp) + ")";
		} else if (exp.getInnerExpression() instanceof GNavigationExpression){
  		  GNavigationExpression gexp = (GNavigationExpression) exp.getInnerExpression();
  		  serial = "(" + GOperandtoString(gexp) + ")";
		}else if (exp.getInnerExpression() instanceof GNegationExpression) {
			GNegationExpression gexp = (GNegationExpression) exp.getInnerExpression();
			 serial = "(" + GNegationExpressiontoString(gexp) + ")";
		}
			
		return serial;		
	}
	
	public String GNegationExpressiontoString(GNegationExpression exp) {
		String serial = "";
		
		if (exp.getOperand() instanceof GBraceExpression){
			GBraceExpression gexp = (GBraceExpression) exp.getOperand();
			serial = "not" + GBraceExpressiontoString (gexp);
		}else if (exp.getOperand() instanceof GNegationExpression ) {
			GNegationExpression gexp2  = (GNegationExpression) exp.getOperand();
			serial = GNegationExpressiontoString (gexp2);
		}
		return serial;
	}
	
	
	public String GAndtoString (GAndExpression exp)
	{
		String serial ="";
		
		// first the left operator
		if (exp.getLeftOperand() instanceof GBraceExpression  ) {
			GBraceExpression gexp = (GBraceExpression) exp.getLeftOperand();
			serial =  GBraceExpressiontoString (gexp);
		} else if (exp.getLeftOperand() instanceof GNavigationExpression ){
			GNavigationExpression gexp = (GNavigationExpression) exp.getLeftOperand();
			serial =  GOperandtoString (gexp);
		} else if (exp.getLeftOperand() instanceof GAndExpression){
			GAndExpression gexp = (GAndExpression) exp.getLeftOperand();
			serial = GAndtoString (gexp);
		} else if (exp.getLeftOperand() instanceof GNegationExpression) {
			GNegationExpression gexp = (GNegationExpression) exp.getLeftOperand();
  		  	serial = GNegationExpressiontoString (gexp);
			//GBraceExpression gexp2 = (GBraceExpression) gexp.getOperand();
  		  	//serial = "not" + GBraceExpressiontoString (gexp2);
		}

		serial = serial +" and ";
		
		// next, the second operator
		if (exp.getRightOperand() instanceof GBraceExpression  ) {
			GBraceExpression gexp = (GBraceExpression) exp.getRightOperand();
			serial =  serial + GBraceExpressiontoString (gexp);
		} else if (exp.getRightOperand() instanceof GNavigationExpression ){
			GNavigationExpression gexp = (GNavigationExpression) exp.getLeftOperand();
			serial =  serial + GOperandtoString (gexp);
		} else if (exp.getRightOperand() instanceof GAndExpression ){
			GAndExpression gexp = (GAndExpression) exp.getRightOperand();
			serial = serial + GAndtoString (gexp);
		} else if (exp.getRightOperand() instanceof GNegationExpression) {
			GNegationExpression gexp = (GNegationExpression) exp.getRightOperand();
			serial= serial + GNegationExpressiontoString (gexp);
			//GBraceExpression gexp2 = (GBraceExpression) gexp.getOperand();
  		  	//serial = "not" + GBraceExpressiontoString (gexp2);
		}
		
		return serial;
	}
	
	public String GexpressiontoString (GExpression exp ){
	String serial = "";
		try {  
	    	  
	    	  if (exp instanceof GEqualityExpression) {
	    		GEqualityExpression  gexp = (GEqualityExpression) exp;
	    		serial = GEqualitytoString (gexp);
	    	  } else if (exp instanceof GAndExpression) {
	    		  GAndExpression   gexp = (GAndExpression) exp;
	    		  serial = GAndtoString (gexp);
	    	  }else if (exp instanceof GBraceExpression){
	    		  GBraceExpression  gexp = (GBraceExpression) exp;
	    		  serial = GBraceExpressiontoString (gexp);
	    	  }else if (exp instanceof GNavigationExpression){
	    		  GNavigationExpression gexp = (GNavigationExpression) exp;
	    		  serial = GOperandtoString(gexp);
	    	  }else if (exp instanceof GNegationExpression){
	    		  GNegationExpression gexp = (GNegationExpression) exp;
	    		  //GBraceExpression gexp2 = (GBraceExpression) gexp.getOperand();
	    		  serial = GNegationExpressiontoString (gexp);
	    	  } else if (exp instanceof GStringExpression){
	    		  GStringExpression gexp =(GStringExpression) exp;
	    		  serial = gexp.getValue();
	    	  }
	    		
	    	  } catch (Exception ex) { // fall back:  
	    		  ex.printStackTrace();
	    		  serial = "Bad GExpression serialization!";
	    	  }
		return serial;
	}
	
	
	public String DSEtoString (EObject dse ){
		if (dse instanceof DefPropertyCS) {
			DefPropertyCS dsetmp = (DefPropertyCS) dse ;
		return dsetmp.getName();
		}
		
		if (dse instanceof EventExpression) {
			EventExpression dsetmp = (EventExpression) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof IntegerImpl) {
			IntegerImpl dsetmp = (IntegerImpl) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof IntegerElement) {
			IntegerElement dsetmp = (IntegerElement) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof BCoolOperatorArg) {
			BCoolOperatorArg dsetmp= (BCoolOperatorArg) dse; 
			return dsetmp.getName();
			}

		return "naddda";
	}
	
	
}
