/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Integer Operator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getBinaryIntegerOperatorKind()
 * @model
 * @generated
 */
public enum BinaryIntegerOperatorKind implements Enumerator {
	/**
	 * The '<em><b>Minus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS(0, "minus", "minus"),

	/**
	 * The '<em><b>Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS(1, "plus", "plus"),

	/**
	 * The '<em><b>Mul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUL_VALUE
	 * @generated
	 * @ordered
	 */
	MUL(2, "mul", "mul"),

	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(3, "div", "div"),

	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(4, "min", "min"),

	/**
	 * The '<em><b>Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(5, "max", "max"),

	/**
	 * The '<em><b>Pourcent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POURCENT_VALUE
	 * @generated
	 * @ordered
	 */
	POURCENT(6, "pourcent", "pourcent");

	/**
	 * The '<em><b>Minus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS
	 * @model name="minus"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_VALUE = 0;

	/**
	 * The '<em><b>Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS
	 * @model name="plus"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_VALUE = 1;

	/**
	 * The '<em><b>Mul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mul</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUL
	 * @model name="mul"
	 * @generated
	 * @ordered
	 */
	public static final int MUL_VALUE = 2;

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Div</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 3;

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 4;

	/**
	 * The '<em><b>Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model name="max"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 5;

	/**
	 * The '<em><b>Pourcent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pourcent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POURCENT
	 * @model name="pourcent"
	 * @generated
	 * @ordered
	 */
	public static final int POURCENT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Binary Integer Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryIntegerOperatorKind[] VALUES_ARRAY =
		new BinaryIntegerOperatorKind[] {
			MINUS,
			PLUS,
			MUL,
			DIV,
			MIN,
			MAX,
			POURCENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Binary Integer Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BinaryIntegerOperatorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Integer Operator Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryIntegerOperatorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryIntegerOperatorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Integer Operator Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryIntegerOperatorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryIntegerOperatorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Integer Operator Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryIntegerOperatorKind get(int value) {
		switch (value) {
			case MINUS_VALUE: return MINUS;
			case PLUS_VALUE: return PLUS;
			case MUL_VALUE: return MUL;
			case DIV_VALUE: return DIV;
			case MIN_VALUE: return MIN;
			case MAX_VALUE: return MAX;
			case POURCENT_VALUE: return POURCENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BinaryIntegerOperatorKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BinaryIntegerOperatorKind
