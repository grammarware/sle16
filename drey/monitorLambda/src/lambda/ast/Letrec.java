package lambda.ast;

public class Letrec extends Expression {
	
	Variable identifier;
	Abstraction abstraction;
	Expression exp;

	public Letrec() {}
	public Letrec(Variable identifier, Abstraction abstraction, Expression exp) {
		this.identifier = identifier;
		this.abstraction = abstraction;
		this.exp = exp;
	}
	
	public void setIdentifier(Variable identifier) {
		this.identifier = identifier;
	}

	public void setAbstraction(Abstraction abstraction) {
		this.abstraction = abstraction;
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}

	public Variable getIdentifier() {
		return identifier;
	}
	
	public Abstraction getAbstraction() {
		return abstraction;
	}
	
	public Expression getExp() {
		return exp;
	}
	
	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "letrec " + identifier + "=" + abstraction + " in " + exp;
	}
}
