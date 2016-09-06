package org.gemoc.mocc.transformations.ecl2mtl.services;


import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.PackageDeclarationCS;
import org.eclipse.xtend.core.xtend.XtendVariableDeclaration;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XWhileExpression;

@SuppressWarnings({ "restriction", "unused" })
public class ServicesXtend {
	
		
		public XtendFile getXtendFileFromObject(EObject obj)
		{
			return (XtendFile) obj;
		}
		
		public String parseXtendClass(XtendClass cl)
		{
			StringBuilder sb = new StringBuilder();
			EList <XtendField> listParam = new BasicEList<>();
			EList <String> listED = new BasicEList<>();
			EList <XtendFunction> listFunc = new BasicEList<>();
			
		
			listED = getClassListOfVariables(cl);
			
			for(XtendMember mb : cl.getMembers())
			{
				if(mb instanceof XtendField)
				{
					listParam.add((XtendField)mb);
				}
				if(mb instanceof XtendFunction)
				{
					listFunc.add((XtendFunction)mb);
				}
			}	
			
			if(listFunc.size()!=0)
			{
				for(XtendFunction f : listFunc)
				{
					String spacing = "";
					EList <String> listVar = new BasicEList<>();
					sb.append("function " + cl.getName().toString().replace("Aspect", "_")+f.getName() + "("+computeFunctionParameters(f)+ "&global: SystemDataRoot" +" , " +"_self : read "+ cl.getName().toString().replace("Aspect", "")+") :"+" SystemDataRoot "+"is \n");
					if(f.getExpression()!=null)
					{
						XExpression expr = f.getExpression();
						if(expr instanceof XBlockExpression)
					  	{
							for (XExpression e : ((XBlockExpression) expr).getExpressions()) {
								if(e instanceof XForLoopExpression)
								{
									String param = ((XForLoopExpression) e).getDeclaredParam().getSimpleName();
									listVar.add(param + ": int");
								}
							}
					  	}
						if(expr instanceof XBlockExpression)
					  	{
							if((getFunctionvars(((XBlockExpression)expr).getExpressions()).size() != 0))
				 			{
					 			sb.append("var\n");
					 			spacing = incrementSpacing(spacing);
					 			XtendVariableDeclaration dvar;
					 			for(int i = 0; i< getFunctionvars(((XBlockExpression)expr).getExpressions()).size() ; i++)
					 			{
					 				dvar = getFunctionvars(((XBlockExpression)expr).getExpressions()).get(i);
					 				if(!(dvar.getRight() instanceof XConstructorCall))
					 				{
					 					String toSelf=dvar.getIdentifier();
					 					if(listED.contains(dvar.getIdentifier().toString())) toSelf = "_self."+ dvar.getIdentifier().toString();
					 					listVar.add(toSelf + ": "+getVarType(dvar.getRight())+ " := " + atomicBinaryOperationInspection(dvar.getRight(),listED)); 
					 					//sb.append(spacing + toSelf + " := " + atomicBinaryOperationInspection(dvar.getRight(),listED) + ",\n");
					 				}
					 			}
					 			for (Iterator<String> iterator = listVar.iterator(); iterator
										.hasNext();) {
									String input = (String) iterator.next();
									sb.append(spacing + input);
									if(iterator.hasNext()) sb.append(",\n");
								}
					 			//dvar = getFunctionvars(((XBlockExpression)expr).getExpressions()).get(getFunctionvars(((XBlockExpression)expr).getExpressions()).size()-1);
					 			//String toSelf=dvar.getIdentifier();
			 					//if(listED.contains(dvar.getIdentifier().toString())) toSelf = "_self."+ dvar.getIdentifier().toString();
					 			//sb.append(spacing + toSelf + " := " + atomicBinaryOperationInspection(dvar.getRight(),listED)+ "\n");
				 			}
					  	}
						sb.append("\nbegin\n");
						spacing = "";
						sb.append(parseAllFunctionBlockcomputeXEpression(expr,spacing,listED));
					}
					//sb.append("; \n" );
					sb.append("return global" + " \nend\n\n");
				}
			}
		
			return sb.toString();
		}
		
		public EList<String> getClassListOfVariables(XtendClass cl)
		{
			EList<String> lst = new BasicEList<>();
			for(XtendMember mb : cl.getMembers())
			{
				if(mb instanceof XtendField)
				{
					if(mb.getModifiers().toString().contains("public"))
					{
						lst.add(((XtendField)mb).getName());
					}
				}
			}	
			return lst;
		}
		
		public String parseAllFunctionBlockcomputeXEpression(XExpression expression, String spacing, EList<String> lst)
		{
			StringBuilder sb = new StringBuilder();
			EList<XExpression> list_exp = new BasicEList<XExpression>();
		 	if(expression instanceof XBlockExpression)
		  	{
		 		for(XExpression exp :  ((XBlockExpression)expression).getExpressions())
		  		{
					list_exp.add(exp);
		  		}
				
				if(list_exp.size()!=0)
				{
					spacing = incrementSpacing(spacing);
					for(int i = 0; i<list_exp.size()-1;i++)
					{
						//System.out.println("### Expression Type: " + list_exp.get(i).getClass().getSimpleName());
						if(!(list_exp.get(i) instanceof XtendVariableDeclaration) && !(list_exp.get(i) instanceof XFeatureCall))
							sb.append(spacing + computeAtomicXExpression(list_exp.get(i),spacing,lst) + ";\n");
					}
					if(!(list_exp.get(list_exp.size()-1) instanceof XtendVariableDeclaration) && !(list_exp.get(list_exp.size()-1) instanceof XFeatureCall))
						sb.append(spacing+ computeAtomicXExpression(list_exp.get(list_exp.size()-1),spacing,lst) + ";\n");
				}
		  	}
			return sb.toString();
		}
		
		public String parseABlock(XBlockExpression expression, String spacing, EList<String> lst)
		{
			StringBuilder sb = new StringBuilder();
			EList<XExpression> list_exp = new BasicEList<XExpression>();
			
			for(XExpression exp :  expression.getExpressions())
		  	{
				list_exp.add(exp);
		  	}
			
			if(list_exp.size()!=0)
			{
				spacing = incrementSpacing(spacing);
				for(int i = 0; i<list_exp.size()-1;i++)
				{
					//System.out.println("### Expression Type: " + list_exp.get(i).getClass().getSimpleName());
					if(!(list_exp.get(i) instanceof XtendVariableDeclaration) && !(list_exp.get(i) instanceof XFeatureCall))
					sb.append(spacing + computeAtomicXExpression(list_exp.get(i),spacing,lst) + ";\n");
				}
				if(!(list_exp.get(list_exp.size()-1) instanceof XtendVariableDeclaration) && !(list_exp.get(list_exp.size()-1) instanceof XFeatureCall))
					sb.append(spacing+ computeAtomicXExpression(list_exp.get(list_exp.size()-1),spacing,lst) + "\n");
			}
			return sb.toString();
		}
		
		
		
		public String computeAtomicXExpression( XExpression expression, String spacing, EList<String> lst)
		 {
			StringBuilder sb = new StringBuilder();
			if(expression instanceof XAssignment)
		 	{
				sb.append(doAssignement((XAssignment) expression,lst));
		 	}
		 	if(expression instanceof XWhileExpression)
		 	{
		 		sb.append(doWhileToWhile((XWhileExpression) expression,spacing,lst));
		 	}
		 	if(expression instanceof XForLoopExpression)
		 	{
		 		sb.append(doForToWhile((XForLoopExpression) expression,spacing,lst));
		 	}
		 	if (expression instanceof XIfExpression)
		 	{
		 		sb.append(doIf((XIfExpression) expression,spacing,lst));
		 	}
		 	return sb.toString();
		 }

		public EList<XtendVariableDeclaration> getFunctionvars(EList<XExpression> list){
			
			EList<XtendVariableDeclaration> fVarDecl =  new BasicEList<XtendVariableDeclaration>();
			
			for(XExpression expression : list)
			{
				if(expression instanceof XtendVariableDeclaration)
				{
					fVarDecl.add((XtendVariableDeclaration) expression);
				}
			}
			return fVarDecl;
		}
		public String doAssignement( XAssignment expression, EList<String> lst)
		 {
			StringBuilder sb = new StringBuilder();
			
			String toSelf=expression.getConcreteSyntaxFeatureName();
			if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
			//sb.append(expression.getConcreteSyntaxFeatureName() + " := ");
			sb.append(toSelf + " := ");
			
			for(XExpression arg : expression.getActualArguments())
			{	
				sb.append(atomicBinaryOperationInspection(arg,lst));	
			}
			
			return sb.toString();
		 }

		public String doWhileToWhile (XWhileExpression expression, String spacing, EList<String> lst)
		 {
			StringBuilder sb = new StringBuilder();
			String operator =(((XBinaryOperation)expression.getPredicate()).getConcreteSyntaxFeatureName()).toString();
			if(operator.equals("==")) operator ="=";
			
			sb.append(spacing + "while ");
			sb.append( atomicBinaryOperationInspection(((XBinaryOperation)expression.getPredicate()).getLeftOperand(),lst) + " " + operator + " "+ atomicBinaryOperationInspection(((XBinaryOperation)expression.getPredicate()).getRightOperand(),lst)+" ");
			sb.append("do\n");
			if(expression.getBody() instanceof XBlockExpression)
			{
				sb.append(spacing + parseABlock((XBlockExpression) expression.getBody(),spacing,lst));
			}
			else
			{
				sb.append(computeAtomicXExpression(expression.getBody(),spacing,lst));
			}
			sb.append (spacing + "end  while");		 	
			
			return sb.toString();
		 }

		/**For Loops in XTend are transformed into While loops in Fiacre*/
		public String doForToWhile (XForLoopExpression expression, String spacing, EList<String> lst)
		 {
			StringBuilder sb = new StringBuilder();
			String operator =(((XBinaryOperation)expression.getForExpression()).getConcreteSyntaxFeatureName()).toString().replace("..", "");
			if(operator.equals("==")) operator ="=";
			sb.append(expression.getDeclaredParam().getSimpleName() + " := " + atomicBinaryOperationInspection(((XBinaryOperation)expression.getForExpression()).getLeftOperand(),lst)+ ";\n");
			sb.append(spacing + "while ");
			sb.append( expression.getDeclaredParam().getSimpleName() + " " + operator + " "+ atomicBinaryOperationInspection(((XBinaryOperation)expression.getForExpression()).getRightOperand(),lst)+" ");
			sb.append("do\n"); 
			// sb.append("  " + computeXEpression(expression.getEachExpression()));
			if(expression.getEachExpression() instanceof XBlockExpression)
			{
				sb.append(parseABlock((XBlockExpression) expression.getEachExpression(),spacing,lst));
			}
			else
			{
				sb.append(computeAtomicXExpression(expression.getEachExpression(),spacing,lst));
			}
			//sb.append(computeXEpression(expression.getEachExpression(),spacing));
			sb.append (spacing + "end  while");
		 	return sb.toString();
		 }

		public String doIf (XIfExpression expression, String spacing, EList<String> lst)
		 {
			StringBuilder sb = new StringBuilder();
			String operator = (((XBinaryOperation)expression.getIf()).getConcreteSyntaxFeatureName()).toString();
			if(operator.equals("==")) operator ="=";
			sb.append("if ");
			sb.append( atomicBinaryOperationInspection(((XBinaryOperation)expression.getIf()).getLeftOperand(),lst) + " " + operator + " "+ atomicBinaryOperationInspection(((XBinaryOperation)expression.getIf()).getRightOperand(),lst)+" ");
			sb.append("then\n");
			//sb.append("  " + computeXEpression(expression.getThen()));
			if(expression.getThen() instanceof XBlockExpression)
			{
				sb.append(parseABlock((XBlockExpression) expression.getThen(),spacing,lst));
			}
			else
			{
				spacing = incrementSpacing(spacing);
				sb.append(spacing + computeAtomicXExpression(expression.getThen(),spacing,lst) + "\n");
			}
			//sb.append(computeXEpression(expression.getThen(),spacing));
			if(expression.getElse() != null)
			{
				sb.append(doElse(expression.getElse(),spacing,lst));
			}
			sb.append (spacing + "end  if");	
			
			return sb.toString();
		 }
		
		public String doElse(XExpression expression, String spacing, EList<String> lst)
		{
			StringBuilder sb = new StringBuilder();
			if(expression instanceof XIfExpression)
			{
				sb.append(doElseIf((XIfExpression)expression,spacing,lst));
			}
			else
			{
				sb.append(spacing + "else \n");
				//sb.append(computeXEpression(expression));
				if(expression instanceof XBlockExpression)
				{

					sb.append(parseABlock((XBlockExpression) expression,spacing,lst));
				}
				else
				{
					spacing = incrementSpacing(spacing);
					sb.append(spacing + computeAtomicXExpression(expression,spacing,lst) + "\n");
				}
				//sb.append(computeXEpression(expression,spacing));
			}
			return sb.toString();
		}
		
		public String doElseIf (XIfExpression expression, String spacing, EList<String> lst)
		 {
			StringBuilder sb = new StringBuilder();
			String last_space = "";
			String operator = (((XBinaryOperation)expression.getIf()).getConcreteSyntaxFeatureName()).toString();
			if(operator.equals("==")) operator ="=";
			sb.append(spacing + "elsif ");
			sb.append( atomicBinaryOperationInspection(((XBinaryOperation)expression.getIf()).getLeftOperand(),lst) + " " + operator + " "+ atomicBinaryOperationInspection(((XBinaryOperation)expression.getIf()).getRightOperand(),lst)+" ");
			sb.append("then\n");
			//sb.append("  " + computeXEpression(expression.getThen()));
			if(expression.getThen() instanceof XBlockExpression)
			{
				sb.append(parseABlock((XBlockExpression) expression.getThen(),spacing,lst));
			}
			else
			{
				last_space = spacing;
				spacing = incrementSpacing(spacing);
				sb.append(spacing + computeAtomicXExpression(expression.getThen(),spacing,lst) + "\n");
			}
			//sb.append(computeXEpression(expression.getThen(),spacing));
			if(expression.getElse() != null)
			{
				sb.append(doElse(expression.getElse(),last_space,lst));
			}
			return sb.toString();
		 }
		
		
		public String computeDeclaration(XtendField fld)
		{
			String st = "";
			
			if(fld.getInitialValue() instanceof XNumberLiteral)
			{
				if(((XNumberLiteral)fld.getInitialValue()).getValue()!=null)
				{
					st ="var " + fld.getName() + " : int :=" + ((XNumberLiteral)fld.getInitialValue()).getValue();
				}
				else
				{
					st ="var " + fld.getName() + " : int";
				}
			}
			
			if(fld.getInitialValue() instanceof XBooleanLiteral)
			{
				if(((XBooleanLiteral)fld.getInitialValue()).isIsTrue()==true)
				{
					st ="var " + fld.getName() + " : bool :=" + "true";
				}
				else
				{
					st ="var " + fld.getName() + " : bool :=" + "false";
				}
			}
			
			if(fld.getInitialValue() instanceof XStringLiteral)
			{
				if(((XStringLiteral)fld.getInitialValue()).getValue()!=null)
				{
					st ="var " + fld.getName() + " : <string> :=" + ((XStringLiteral)fld.getInitialValue()).getValue();
				}
				else
				{
					st ="var " + fld.getName() + " : <string>";
				}
			}
			return st;
		}
		
		public String computeFunctions(XtendFunction func)
		{
			StringBuilder sb = new StringBuilder();
			
			return sb.toString();
		}
		
		public String computeFunctionParameters(XtendFunction func)
		{
			StringBuilder sb = new StringBuilder();
						
			if(func.getParameters().isEmpty()==false)
			{
				sb.append("<PARAMS>");
			}
			return sb.toString();
		}
		
		public String recursiveBinaryOperationInspection(XExpression exp, EList<String> lst){
			StringBuilder sb = new StringBuilder();
			String v = "";
			
			if(exp instanceof XNumberLiteral)
			{
				String toSelf=((XNumberLiteral)exp).getValue().toString();
				if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
				
				//sb.append(((XNumberLiteral)exp).getValue());
				sb.append(toSelf);
			}
			
			if(exp instanceof XBooleanLiteral)
			{
				if(((XBooleanLiteral)exp).isIsTrue()==true)
				{
					sb.append("true");
				}
				else
				{
					sb.append("false");
				}
			}
			
			if(exp instanceof XStringLiteral)
			if(((XStringLiteral)exp).getValue()!=null)
			{
				//sb.append(((XStringLiteral)exp).getValue().toString());
				
			  	String toSelf=((XStringLiteral)exp).getValue().toString();
				if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
			  
			 // sb.append(((XStringLiteral)exp).getValue());
				sb.append(toSelf);
			}
			
			if(exp instanceof XFeatureCall)
			{
				String toSelf=exp.toString();
				if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
				
				sb.append(toSelf);
			}
			else if(exp instanceof XBinaryOperation)
			{
				sb.append("( ");
				sb.append(recursiveBinaryOperationInspection(((XBinaryOperation)exp).getLeftOperand(),lst) + " " + ((XBinaryOperation)exp).getConcreteSyntaxFeatureName()+ " " + recursiveBinaryOperationInspection(((XBinaryOperation)exp).getRightOperand(),lst));
				sb.append(" )");
			}
			return sb.toString();
		}
		
		public String getVarType(XExpression exp){
			String type ="";
			if(exp instanceof XNumberLiteral)
			{
				type = "int";
			}
			if(exp instanceof XBooleanLiteral)
			{
				type = "bool";
			}
			if(exp instanceof XStringLiteral){
				type = "string";
			}
			if(exp instanceof XFeatureCall)
			{
				type = "int";
				// TODO Change value of type
			}
			else if(exp instanceof XBinaryOperation)
			{
				type = "int";
			}
			return type;
		}
		public String atomicBinaryOperationInspection(XExpression exp, EList<String> lst){
			StringBuilder sb = new StringBuilder();
			String v = "";
			
			if(exp instanceof XNumberLiteral)
			{
				String toSelf=((XNumberLiteral)exp).getValue().toString();
				if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
				
				//sb.append(((XNumberLiteral)exp).getValue());
				sb.append(toSelf);
			}
			
			if(exp instanceof XBooleanLiteral)
			{
				if(((XBooleanLiteral)exp).isIsTrue()==true)
				{
					sb.append("true");
				}
				else
				{
					sb.append("false");
				}
			}
			
			if(exp instanceof XStringLiteral)
			  if(((XStringLiteral)exp).getValue()!=null)
			  {
				  	String toSelf=((XStringLiteral)exp).getValue();
					if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
				  
				 // sb.append(((XStringLiteral)exp).getValue());
					sb.append(toSelf);
			  }
			
			if(exp instanceof XFeatureCall)
			{
				String toSelf=exp.toString();
				if(lst.contains(toSelf)) toSelf = "_self."+toSelf;
				
				sb.append(toSelf);
				//sb.append(exp.toString());
			}
			else if(exp instanceof XBinaryOperation)
			{
				sb.append(recursiveBinaryOperationInspection(((XBinaryOperation)exp).getLeftOperand(),lst) + " " + ((XBinaryOperation)exp).getConcreteSyntaxFeatureName()+ " " + recursiveBinaryOperationInspection(((XBinaryOperation)exp).getRightOperand(),lst));
			}
			return sb.toString();
		}
		public String incrementSpacing (String s)
		{
			s = s + "    ";
			return s;
		}
}
