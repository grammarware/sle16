package org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic

import activitydiagram.Activity
import activitydiagram.ActivityNode
import activitydiagram.ActivitydiagramPackage
import activitydiagram.BooleanValue 
import activitydiagram.BooleanVariable
import activitydiagram.Input
import activitydiagram.InputValue
import activitydiagram.IntegerValue
import activitydiagram.IntegerVariable
import activitydiagram.Value
import activitydiagram.Variable
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.XtextResourceSet
import org.modelexecution.operationalsemantics.ActivityDiagramInputStandaloneSetup
import org.modelexecution.operationalsemantics.ActivityDiagramStandaloneSetup
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ControlFlowAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.OpaqueActionAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.InitialNodeAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityFinalNodeAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ForkNodeAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.JoinNodeAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.MergeNodeAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.DecisionNodeAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.IntegerVariableAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.BooleanVariableAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.IntegerCalculationExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.IntegerComparisonExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.BooleanUnaryExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.BooleanBinaryExpressionAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activitydiagram.OpaqueAction
import activitydiagram.InitialNode
import activitydiagram.ActivityFinalNode
import activitydiagram.ForkNode
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.DecisionNode
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerComparisonExpression
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanBinaryExpression
import activitydiagram.ControlFlow
import activitydiagram.NamedElement
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import java.util.concurrent.Executors
import activitydiagram.ActivityEdge
import java.util.concurrent.Future
import java.util.concurrent.Callable
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import activitydiagram.Expression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonOperator
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanBinaryOperator
import java.util.Scanner
import activitydiagram.Trace
import activitydiagram.Token
import activitydiagram.Offer
import activitydiagram.ActivitydiagramFactory
import activitydiagram.ForkedToken
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import activitydiagram.SendSignalAction
import activitydiagram.AcceptEventAction

class Util {
	public static final Object LINE_BREAK = System.getProperty("line.separator");

	public static final  def Input getInput(String inputPath) {
		var Input input = null;
		if (inputPath != null) {
			var XtextResourceSet resourceSet ;resourceSet = new XtextResourceSet();
			var resource = resourceSet.getResource(createFileURI(inputPath), true);
			var eObject = resource.getContents().get(0);
			if (eObject instanceof Input) {
				input = eObject as Input;
			}
		}
		return input;
	}
	
	public static final	def List<InputValue> getInputValues(String inputPath) {
		var inputValues = new ArrayList<InputValue>();
		var input = Util.getInput(inputPath);
		if (input != null) {
			inputValues.addAll(input.getInputValues());
		}
		return inputValues;
	}
	
	public static final  def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}
	public static final  def File createFile(String path) {
		return new File(path);
	}

}

//class Offer { 
//	public List<Token> offeredTokens = new ArrayList<Token>() ;
//
////	public def boolean hasTokens() {
////		removeWithdrawnTokens();
////		return offeredTokens.size() > 0;
////	}
//
////	public def void removeWithdrawnTokens() {
////		val tokensToBeRemoved = new ArrayList<Token>();
////		offeredTokens.forEach [ token |
////			if (token.withdrawn) {
////				tokensToBeRemoved.add(token);
////			}
////		]
////		this.offeredTokens.removeAll(tokensToBeRemoved);
////	}
//
//}

//abstract class Token {
//
//	public ActivityNode holder
//
//	public def Token transfer(ActivityNode holder) {
//		if (this.holder != null) {
//			this.withdraw();
//		}
//		this.holder = holder;
//		return this;
//	}
//
//	public def void withdraw() {
//		if (!isWithdrawn()) {
//			holder.removeToken(this);
//			holder = null;
//		}
//	}
//
//	public def boolean isWithdrawn() {
//		return this.holder == null;
//	}
//}


class RuntimeTrace {
	public List<ActivityNode> executedNodes = new ArrayList<ActivityNode>();
}
//
//class ControlToken extends Token {
//}
//
//class ForkedToken extends Token {
//	public Token baseToken ;
//	public Integer remainingOffersCount;
//}

class Context {
	public RuntimeTrace output;
	public Activity activity;
	public Context parent;
	public List<InputValue> inputValues ;
	public JoinNode node ;

	new() {
		//output = ActivitydiagramFactory.eINSTANCE.createTrace()
	}

	new(RuntimeTrace c, Activity a, List<InputValue> inputValues, Context parent) {
		this.output = c
		this.activity = a
		this.inputValues = inputValues
		this.parent = parent
	}

}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	RuntimeTrace runtimeTrace
	public Context context
	long start
	long stop
	
	@ReplaceAspectMethod
	public def void initialize() {
		println("############## let's start ! ##############")
		var List<InputValue> inputValues = new ArrayList<InputValue>();
		var String inputPath = _self.inputValuePath
        if (inputPath != null && inputPath != ""){
	
			var input = Util.getInput(inputPath);
			if (input != null) {
				inputValues.addAll(input.getInputValues());
				inputValues?.forEach[v|
					val theV = v.getVariable()
					_self.inputs.forEach[i|if (i.name == theV.name){
						i.currentValue = v.value
						i.initialValue = v.value									
					}]
					//theV.setCurrentValue(v.getValue());
				]
			}
		}
		
		_self.start = System.nanoTime;
		
		_self.context = new Context
		_self.context.inputValues = inputValues
		_self.context.activity = _self
		//_self.trace = new Trace;
		_self.runtimeTrace = new RuntimeTrace
		_self.context.output = _self.runtimeTrace
		
		_self.nodes.forEach[n|n.running =true] //this is creapy strange to do that but it is in the spec
		//_self.execute()
		_self.locals.forEach[v|v.init()]
	}

	public def void execute() {
//		_self.locals.forEach[v|v.init()] 
//		_self.nodes.filter[node|node instanceof InitialNode].get(0).execute(_self.context)
//		
//		var list =  _self.nodes.filter[node|node.hasOffers]
//		while (list!=null && list.size>0 ){
//			list.get(0).execute(_self.context)
//			list =  _self.nodes.filter[node|node.hasOffers]
//			 
//		}
	}

	def void reset() {
		_self.runtimeTrace = null;
	}

	def void writeToFile() {
		var text = _self.printTrace();
		try {
			var writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(new File(_self.getName() + ".txt"))));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	def String printTrace() {
		val text = new StringBuffer();
		_self.runtimeTrace.executedNodes.forEach[n|text.append(n.getName()); text.append(Util.LINE_BREAK);]

		_self.getLocals().forEach [ v |
			text.append(v.print);
			text.append(Util.LINE_BREAK);
		]
		return text.toString();
	}

	def int getIntegerVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof IntegerValue) {
			var integerValue = currentValue as IntegerValue;
			return integerValue.getValue();
		}
		return -1;
	}

	def boolean getBooleanVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName); 
		if (currentValue instanceof BooleanValue) {
			var booleanValue = currentValue as BooleanValue;
			return booleanValue.isValue();
		}
		return false;
	}

	def Value getVariableValue(String variableName) {
		var variable = _self.getVariable(variableName);
		var currentValue = variable.getCurrentValue();
		return currentValue;
	}

	def Variable getVariable(String variableName) {
		var allVariables = new ArrayList<Variable>();
		allVariables.addAll(_self.getLocals());
		allVariables.addAll(_self.getInputs());
		for (Variable var1 : allVariables) {
			if (var1.getName().equals(variableName)) {
				return var1;
			}
		}
		return null;
	}

	public  def void finish() {
		_self.stop = System.nanoTime;
		println("##############  finished ! ############## ")
		println("time to execute " + ( _self.stop - _self.start))
		println(_self.printTrace())
		_self.writeToFile;
		_self.reset();
	}
	


}

@Aspect(className=NamedElement)
class NamedElementAspect {
//	public def void execute() {
//	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.NamedElementAspect {
//	public List<Token> heldTokens = new ArrayList<Token>

	public def void execute() {
		//_self.sendOffers1(_self.takeOfferdTokens1)
	}

	public def void terminate() {
		_self.running = false;
	}

	/**
	 * @generated NOT
	 */
	public def void addTokens(List<Token> tokens) {
		for (Token token : tokens) {
			token.holder=_self
			var transferredToken = token;
			_self.heldTokens.add(transferredToken);
		}
	}


	public def void removeToken(Token token) {
		token.holder = null
		_self.heldTokens.remove(token);
	}

}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {
	@Containment
	public List<Offer> offers = new ArrayList<Offer>

	//write
	public def void sendOffer() {
		val offer = ActivitydiagramFactory.eINSTANCE.createOffer();
		if (_self.source instanceof ForkNode){
			var indexOfSelf = _self.source.outgoing.indexOf(_self)
			offer.offeredTokens.add(_self.source.heldTokens.get(indexOfSelf))
		}else{
			offer.offeredTokens.add(_self.source.heldTokens.get(_self.source.heldTokens.size()-1))
		}
		_self.offers.add(offer);
	}

	public def void clearOffer(){
		_self.offers.clear();
	}
	
	//read
	public def void takeOfferedTokens() {
		val ArrayList<Token> tokens = new ArrayList<Token>()
		tokens.addAll(_self.offers.get(_self.offers.size()-1).offeredTokens)
		_self.offers.remove(_self.offers.size()-1);
		if (_self.source.heldTokens.size() > 0){
			if (_self.source instanceof ForkNode){
				var indexOfToken0 = _self.source.heldTokens.indexOf(tokens.get(0))
				_self.source.heldTokens.remove(indexOfToken0)
			}else{
				_self.source.heldTokens.remove(_self.source.heldTokens.size()-1);
			}
		}
		_self.target.addTokens(tokens)
		return;
	}
	
	//transfert
	public def void transferTokens() {
		_self.sendOffer()
		_self.takeOfferedTokens()
		return;
	}

	public def boolean evaluateGuard(){
		if (!(_self instanceof ControlFlow &&  (_self as ControlFlow).guard != null)) {
			return true
		}
		(_self as ControlFlow).guard.execute()
		return ((_self as ControlFlow).guard.currentValue as BooleanValue).value 
	}


}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {

}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		_self.expressions.forEach[e|e.execute()]
		_self.outgoing.forEach[o | o.sendOffer()]
	}
}

@Aspect(className=SendSignalAction)
class SendSignalActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		_self.outgoing.forEach[o | o.sendOffer()]
	}
}

@Aspect(className=AcceptEventAction)
class AcceptEventActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		_self.outgoing.forEach[o | o.sendOffer()]
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		var r = ActivitydiagramFactory.eINSTANCE.createControlToken();
		r.holder = _self
		_self.heldTokens.add(r)
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		_self.outgoing.forEach[o | o.sendOffer()]
	}
}

@Aspect(className=Expression)
class ExpressionAspect {
	public def void execute() {
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)	
		_self.heldTokens.clear()
		//_self.sendOffers(_self.takeOfferdTokens)
	}
}


@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		var tokens  =_self.heldTokens	
		var forkedTokens = new ArrayList<Token>();
		for(Token token : tokens) {
			for (var int i = 0; i < _self.outgoing.size() ; i++){
				var forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
				forkedToken.baseToken = token;
				forkedTokens.add(forkedToken);
			//	forkedToken.remainingOffersCount = _self.outgoing.size();
			}
		}
		_self.heldTokens.clear()
		_self.addTokens(forkedTokens);
		_self.outgoing.forEach[o | o.sendOffer()]
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		var firstToken = _self.heldTokens.get(0)
		if (firstToken instanceof ForkedToken){
			_self.heldTokens.clear()
			_self.heldTokens.add((firstToken as ForkedToken).baseToken)
		}else{
			_self.heldTokens.clear()
			_self.heldTokens.add(firstToken)
		}
		_self.outgoing.forEach[o | o.sendOffer()]
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | if (i.offers.size() > 0) (i.takeOfferedTokens())]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		_self.outgoing.forEach[o | o.sendOffer()]

	}
//	public def boolean hasOffers() {
//		return  _self.incoming.exists[edge|edge.hasOffer()]
//	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	public def void execute() {
		_self.incoming.forEach[ i | i.takeOfferedTokens()]
		(_self.eContainer() as Activity).context.output.executedNodes.add(_self)
		_self.outgoing.forEach[o | o.sendOffer()]
//		_self.sendOffers(_self.takeOfferdTokens)

	}
	
	
	
//	@OverrideAspectMethod
//	public def void sendOffers(List<Token> tokens) {
//		for (ActivityEdge edge : _self.getOutgoing()) {
//			if (edge instanceof ControlFlow &&  ( edge as ControlFlow).guard != null) {
//				if ((( edge as ControlFlow).guard.currentValue as BooleanValue).value) {
//					edge.sendOffer(tokens);
//				}
//			}		
//		}
//	}
}

@Aspect(className=Variable)
class VariableAspect {
	
	public def void execute() {
	}

	public def void init() {
		if (_self.initialValue != null){
			_self.currentValue = _self.initialValue
		}
	}

	public def String print() {
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.VariableAspect {
	@OverrideAspectMethod
	public def void execute() {
	}

	@OverrideAspectMethod
	public def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as IntegerValue).getValue());
		return text.toString();
	}
}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.VariableAspect {
	public def void execute() {
	}

	@OverrideAspectMethod
	public def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as BooleanValue).isValue());
		return text.toString();
	}

}



@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ExpressionAspect {
	@OverrideAspectMethod
	public def void execute() {
		if (_self.operator.value == IntegerCalculationOperator.ADD_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value +
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerCalculationOperator.SUBRACT_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value -
				(_self.operand2.currentValue as IntegerValue).value
		}

	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ExpressionAspect {
	@OverrideAspectMethod
	public def void execute() {
		if (_self.operator.value == IntegerComparisonOperator.EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value ==
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >=
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_VALUE) {
			
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <=
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <
				(_self.operand2.currentValue as IntegerValue).value
		}
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ExpressionAspect {
	@OverrideAspectMethod
	public def void execute() {
		if (_self.operator.value == BooleanUnaryOperator.NOT_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = !(_self.operand.currentValue as BooleanValue).value
		}

	}
}
 
@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ExpressionAspect {
	@OverrideAspectMethod
	public def void execute() {
		if (_self.operator.value == BooleanBinaryOperator.AND_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value &&
				(_self.operand2.currentValue as BooleanValue).value
		} else if (_self.operator.value == BooleanBinaryOperator.OR_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value ||
				(_self.operand2.currentValue as BooleanValue).value
		}
	}
}

