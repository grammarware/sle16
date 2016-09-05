package lambda.ast;

public class Constant extends Expression {
	String value;
	
	public String getValue() {
		return value;
	}
	
	public Constant(String value) {
		this.value = value;
	}
	
	public Constant(Integer value) {
		this.value = value.toString();
	}
	
	public Constant(Boolean x) {
		this.value = value.toString();
	}
	
	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return value;
	}
}
