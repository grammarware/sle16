package lambda.ast;

public class Primitive extends Expression {
	Variable operator;
	Expression lhs;
	Expression rhs;
	
	public Primitive(Variable op, Expression lhs, Expression rhs) {
		this.operator = op;
		this.lhs = lhs;
		this.rhs = rhs;
	}
	/** FIXME temp helper-constructor */
	public Primitive(String x, String op, Integer v) {
		this.operator = new Variable(op);
		this.lhs = new Variable(x);
		this.rhs = new Constant(v);
	}
	
	/** FIXME temp helper-constructor */
	public Primitive(String x, String op, Expression exp) {
		this.operator = new Variable(op);
		this.lhs = new Variable(x);
		this.rhs = exp;
	}

	
	public Expression getLhs() {
		return lhs;
	}
	
	public Expression getRhs() {
		return rhs;
	}
	
	public Variable getOperator() {
		return operator;
	}

	public void setOperator(Variable operator) {
		this.operator = operator;
	}

	public void setLhs(Expression lhs) {
		this.lhs = lhs;
	}

	public void setRhs(Expression rhs) {
		this.rhs = rhs;
	}
	
	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "(" + operator + " " + lhs + " " + rhs + ")";
	}
}


