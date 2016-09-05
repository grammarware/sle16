package lambda.domains;

import java.math.BigInteger;

public class NumberValue extends DenotableValue {
	BigInteger value;
	
	public NumberValue(BigInteger v) {
		value = v;
	}

	public NumberValue(Integer v) {
		value = BigInteger.valueOf(v);
	}
	
	public NumberValue plus(NumberValue v2) {
		return new NumberValue(value.add(v2.value));
	}
	
	public NumberValue mult(NumberValue v2) {
		return new NumberValue(value.multiply(v2.value));
	}
	
	public BooleanValue equals(NumberValue v2) {
		return value.equals(v2.value) ? BooleanValue.TRUE : BooleanValue.FALSE;
	}
	
	public BooleanValue lt(NumberValue v2) {
		return value.compareTo(v2.value) < 0 ? BooleanValue.TRUE : BooleanValue.FALSE;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
