package lambda.ast;

public class Application extends Expression {
	
	Expression exp1;
	Expression exp2;
	
	public Application(Expression e1, Expression e2) {
		exp1 = e1;
		exp2 = e2;
	}

	public Expression getExp1() {
		return exp1;
	}
	
	public Expression getExp2() {
		return exp2;
	}

	public void setExp1(Expression exp1) {
		this.exp1 = exp1;
	}

	public void setExp2(Expression exp2) {
		this.exp2 = exp2;
	}
	
	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "(" + exp1 + " " + exp2 + ")";
	}
}
