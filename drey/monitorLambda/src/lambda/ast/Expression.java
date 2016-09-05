package lambda.ast;

public abstract class Expression {
	
	public <T> T accept(ILambdaVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	/** type: MonExpression.class , MonLetrec*/
	public Boolean isOfType(Class<?> type) { 
		return (type.isAssignableFrom(this.getClass()));
	}
	
}
