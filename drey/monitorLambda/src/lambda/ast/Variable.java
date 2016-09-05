package lambda.ast;

public class Variable extends Expression {
	String iname;

	public Variable() {}

	public String getIname() {
		return iname;
	}

	public Variable(String n) {
		iname = n;
	}

	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public String toString() {
		return iname;
	}
}
