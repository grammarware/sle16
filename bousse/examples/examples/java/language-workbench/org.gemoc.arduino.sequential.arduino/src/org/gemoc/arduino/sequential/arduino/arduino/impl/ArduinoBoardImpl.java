/**
 */
package org.gemoc.arduino.sequential.arduino.arduino.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.arduino.sequential.arduino.arduino.AnalogPin;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.arduino.arduino.DigitalPin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.impl.ArduinoBoardImpl#getDigitalPins <em>Digital Pins</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.impl.ArduinoBoardImpl#getAnalogPins <em>Analog Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArduinoBoardImpl extends BoardImpl implements ArduinoBoard {
	/**
	 * The cached value of the '{@link #getDigitalPins() <em>Digital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalPin> digitalPins;

	/**
	 * The cached value of the '{@link #getAnalogPins() <em>Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogPin> analogPins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.ARDUINO_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DigitalPin> getDigitalPins() {
		if (digitalPins == null) {
			digitalPins = new EObjectContainmentEList<DigitalPin>(DigitalPin.class, this, ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS);
		}
		return digitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogPin> getAnalogPins() {
		if (analogPins == null) {
			analogPins = new EObjectContainmentEList<AnalogPin>(AnalogPin.class, this, ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS);
		}
		return analogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
				return ((InternalEList<?>)getDigitalPins()).basicRemove(otherEnd, msgs);
			case ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
				return ((InternalEList<?>)getAnalogPins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
				return getDigitalPins();
			case ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
				return getAnalogPins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
				getDigitalPins().clear();
				getDigitalPins().addAll((Collection<? extends DigitalPin>)newValue);
				return;
			case ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
				getAnalogPins().clear();
				getAnalogPins().addAll((Collection<? extends AnalogPin>)newValue);
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
			case ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
				getDigitalPins().clear();
				return;
			case ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
				getAnalogPins().clear();
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
			case ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
				return digitalPins != null && !digitalPins.isEmpty();
			case ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
				return analogPins != null && !analogPins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArduinoBoardImpl
