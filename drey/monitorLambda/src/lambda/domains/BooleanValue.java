package lambda.domains;

/*
 * Booleans can have only two instances TRUE and FALSE
 * */
public class BooleanValue extends DenotableValue {
	Boolean value;
	
	public static BooleanValue TRUE = new BooleanValue(true);
	public static BooleanValue FALSE = new BooleanValue(false);
			
	private BooleanValue(boolean b) {
		this.value = b;
	}
	
	public Boolean getValue() {
		return value;
	}
	
	public BooleanValue equal(BooleanValue v2) {
		return new BooleanValue(value = v2.value);
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
