package lambda.ast;

public class Conditional extends Expression
{
	
	Expression exp1;
	Expression exp2;
	Expression exp3;
	
	public Conditional() {}
	
	public Conditional(Expression e1, Expression e2, Expression e3) {
		exp1 = e1; exp2 = e2; exp3 = e3;
	}
	
	public Expression getExp1() {
		return exp1;
	}
	
	public Expression getExp2() {
		return exp2;
	}
	
	public Expression getExp3() {
		return exp3;
	}

	public void setExp1(Expression exp1) {
		this.exp1 = exp1;
	}

	public void setExp2(Expression exp2) {
		this.exp2 = exp2;
	}

	public void setExp3(Expression exp3) {
		this.exp3 = exp3;
	}

	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "if " + exp1 + "\n   then " + exp2 + "\n   else " + exp3 ;
	}
}
