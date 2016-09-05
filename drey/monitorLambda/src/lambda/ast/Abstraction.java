package lambda.ast;

public class Abstraction extends Expression {

	Variable arg;
	Expression exp;

	public Abstraction() {}
	public Abstraction(Variable arg, Expression exp) {
		this.arg = arg;
		this.exp = exp;
	}

	public Variable getArg() {
		return arg;
	}

	public Expression getExp() {
		return exp;
	}

	public void setArg(Variable arg) {
		this.arg = arg;
	}

	public void setArg(String arg) {
		this.arg = new Variable(arg);
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}
	
	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "\\" + arg + "." + exp;
	}
}
