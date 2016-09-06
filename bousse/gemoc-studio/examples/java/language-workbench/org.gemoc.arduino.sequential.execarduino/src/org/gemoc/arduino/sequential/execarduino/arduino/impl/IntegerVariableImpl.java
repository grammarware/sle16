/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerVariableImpl extends VariableImpl implements IntegerVariable {
	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected int initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.INTEGER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(int newInitialValue) {
		int oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.INTEGER_VARIABLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
				return getInitialValue();
			case ArduinoPackage.INTEGER_VARIABLE__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
				setInitialValue((Integer)newValue);
				return;
			case ArduinoPackage.INTEGER_VARIABLE__VALUE:
				setValue((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case ArduinoPackage.INTEGER_VARIABLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
			case ArduinoPackage.INTEGER_VARIABLE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialValue: ");
		result.append(initialValue);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IntegerVariableImpl
