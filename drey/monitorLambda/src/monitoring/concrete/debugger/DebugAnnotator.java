package monitoring.concrete.debugger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lambda.ast.Abstraction;
import lambda.ast.Application;
import lambda.ast.Conditional;
import lambda.ast.Constant;
import lambda.ast.Expression;
import lambda.ast.ILambdaVisitor;
import lambda.ast.Letrec;
import lambda.ast.Primitive;
import lambda.ast.Variable;

/**
 * This is only a proof-of-concept annotator : Expressions of letrec
 * abstractions are uncompletely defined (e.g., case where several abstractions
 * are defined in a letrec : each single argument needs to be reported in the
 * LDebug annotation of the expressions of letrec abstractions.
 * Probably memory-consuming.
 */
public class DebugAnnotator implements ILambdaVisitor<ProgramPointElement> {


	LeafDebugger debugger;
	Stack<String> letrecNames = new Stack<String>();

	public DebugAnnotator(LeafDebugger dbg) {
		debugger = dbg;
	}

	@Override
	public ProgramPointElement visit(Abstraction aNode) {
		ProgramPointElement dExp = aNode.getExp().accept(this);
		aNode.setExp(dExp);
		// FIXME quick-and-dirty setting of an abstraction
		// belonging to a letrec definition.
		if (!letrecNames.isEmpty()) {
			List<String> args = new ArrayList<String>();
			args.add(aNode.getArg().getIname());
			String funName = letrecNames.pop();
			List<String> lvars = new ArrayList<String>();
			// TODO: collect localvars in a pass - there is not let construct, so local vars are actually always function names.
			lvars.add(funName);
			DebugAnnotation ann = new DebugAnnotation(funName, args, lvars);
			dExp.getLink().setAnnotationAST(ann);
		}
		return new ProgramPointElement(aNode, debugger);
	}

	public ProgramPointElement visit(Application aNode) {
		ProgramPointElement dExp2 = aNode.getExp2().accept(this);
		ProgramPointElement dExp1 = aNode.getExp1().accept(this);
		aNode.setExp1(dExp1);
		aNode.setExp2(dExp2);
		ProgramPointElement dNode = new ProgramPointElement(aNode, debugger);
		return dNode;
	}

	@Override
	public ProgramPointElement visit(Conditional aNode) {
		ProgramPointElement dExp1 = aNode.getExp1().accept(this);
		ProgramPointElement dExp2 = aNode.getExp2().accept(this);
		ProgramPointElement dExp3 = aNode.getExp3().accept(this);
		aNode.setExp1(dExp1);
		aNode.setExp2(dExp2);
		aNode.setExp3(dExp3);
		return new ProgramPointElement(aNode, debugger);
	}

	@Override
	public ProgramPointElement visit(Constant aNode) {
		return new ProgramPointElement(aNode, debugger);
	}

	@Override
	public ProgramPointElement visit(Variable aNode) {
		return new ProgramPointElement(aNode, debugger);
	}

	@Override
	public ProgramPointElement visit(Letrec aNode) {
		String funName = aNode.getIdentifier().getIname();
		letrecNames.push(funName); // FIXME:incomplete
		ProgramPointElement dAbstraction = aNode.getAbstraction().accept(this);
		ProgramPointElement dExp = aNode.getExp().accept(this);
		aNode.getAbstraction().setExp(((Abstraction) (dAbstraction.getOriginalElement())).getExp());
		// // FIXME Usual inheritance constraint - the getExp was annotated
		aNode.setExp(dExp);
		return new ProgramPointElement(aNode, debugger);
	}

	@Override
	public ProgramPointElement visit(Primitive aNode) {
		ProgramPointElement dLhs = aNode.getLhs().accept(this);
		ProgramPointElement dRhs = aNode.getRhs().accept(this);
		aNode.setLhs(dLhs);
		aNode.setRhs(dRhs);
		return new ProgramPointElement(aNode, debugger);
	}

	@Override
	public ProgramPointElement visit(Expression aNode) {
		return null;
	}

}
