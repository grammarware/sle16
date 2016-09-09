/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Value;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Value;
import arduinoTrace.States.BooleanVariable_value_Value;
import arduinoTrace.States.IntegerVariable_value_Value;
import arduinoTrace.States.Pin_level_Value;
import arduinoTrace.States.State;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.Steps.SpecificStep;
import arduinoTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getBluetoothTransceiver_dataReceived_Values <em>Bluetooth Transceiver data Received Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getBluetoothTransceiver_dataToSend_Values <em>Bluetooth Transceiver data To Send Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getBooleanVariable_value_Values <em>Boolean Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getIntegerVariable_value_Values <em>Integer Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getPin_level_Values <em>Pin level Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getBluetoothTransceiver_dataReceived_Values() <em>Bluetooth Transceiver data Received Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBluetoothTransceiver_dataReceived_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BluetoothTransceiver_dataReceived_Value> bluetoothTransceiver_dataReceived_Values;

	/**
	 * The cached value of the '{@link #getBluetoothTransceiver_dataToSend_Values() <em>Bluetooth Transceiver data To Send Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBluetoothTransceiver_dataToSend_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BluetoothTransceiver_dataToSend_Value> bluetoothTransceiver_dataToSend_Values;

	/**
	 * The cached value of the '{@link #getBooleanVariable_value_Values() <em>Boolean Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanVariable_value_Value> booleanVariable_value_Values;

	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getIntegerVariable_value_Values() <em>Integer Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerVariable_value_Value> integerVariable_value_Values;

	/**
	 * The cached value of the '{@link #getPin_level_Values() <em>Pin level Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin_level_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin_level_Value> pin_level_Values;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BluetoothTransceiver_dataReceived_Value> getBluetoothTransceiver_dataReceived_Values() {
		if (bluetoothTransceiver_dataReceived_Values == null) {
			bluetoothTransceiver_dataReceived_Values = new EObjectWithInverseResolvingEList.ManyInverse<BluetoothTransceiver_dataReceived_Value>(BluetoothTransceiver_dataReceived_Value.class, this, StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES);
		}
		return bluetoothTransceiver_dataReceived_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BluetoothTransceiver_dataToSend_Value> getBluetoothTransceiver_dataToSend_Values() {
		if (bluetoothTransceiver_dataToSend_Values == null) {
			bluetoothTransceiver_dataToSend_Values = new EObjectWithInverseResolvingEList.ManyInverse<BluetoothTransceiver_dataToSend_Value>(BluetoothTransceiver_dataToSend_Value.class, this, StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__STATES);
		}
		return bluetoothTransceiver_dataToSend_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanVariable_value_Value> getBooleanVariable_value_Values() {
		if (booleanVariable_value_Values == null) {
			booleanVariable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanVariable_value_Value>(BooleanVariable_value_Value.class, this, StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES, StatesPackage.BOOLEAN_VARIABLE_VALUE_VALUE__STATES);
		}
		return booleanVariable_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerVariable_value_Value> getIntegerVariable_value_Values() {
		if (integerVariable_value_Values == null) {
			integerVariable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerVariable_value_Value>(IntegerVariable_value_Value.class, this, StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES, StatesPackage.INTEGER_VARIABLE_VALUE_VALUE__STATES);
		}
		return integerVariable_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin_level_Value> getPin_level_Values() {
		if (pin_level_Values == null) {
			pin_level_Values = new EObjectWithInverseResolvingEList.ManyInverse<Pin_level_Value>(Pin_level_Value.class, this, StatesPackage.STATE__PIN_LEVEL_VALUES, StatesPackage.PIN_LEVEL_VALUE__STATES);
		}
		return pin_level_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBluetoothTransceiver_dataReceived_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBluetoothTransceiver_dataToSend_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanVariable_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerVariable_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPin_level_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES:
				return ((InternalEList<?>)getBluetoothTransceiver_dataReceived_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES:
				return ((InternalEList<?>)getBluetoothTransceiver_dataToSend_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanVariable_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getIntegerVariable_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return ((InternalEList<?>)getPin_level_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES:
				return getBluetoothTransceiver_dataReceived_Values();
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES:
				return getBluetoothTransceiver_dataToSend_Values();
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return getBooleanVariable_value_Values();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return getIntegerVariable_value_Values();
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return getPin_level_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
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
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES:
				getBluetoothTransceiver_dataReceived_Values().clear();
				getBluetoothTransceiver_dataReceived_Values().addAll((Collection<? extends BluetoothTransceiver_dataReceived_Value>)newValue);
				return;
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES:
				getBluetoothTransceiver_dataToSend_Values().clear();
				getBluetoothTransceiver_dataToSend_Values().addAll((Collection<? extends BluetoothTransceiver_dataToSend_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				getBooleanVariable_value_Values().clear();
				getBooleanVariable_value_Values().addAll((Collection<? extends BooleanVariable_value_Value>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				getIntegerVariable_value_Values().clear();
				getIntegerVariable_value_Values().addAll((Collection<? extends IntegerVariable_value_Value>)newValue);
				return;
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				getPin_level_Values().clear();
				getPin_level_Values().addAll((Collection<? extends Pin_level_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
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
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES:
				getBluetoothTransceiver_dataReceived_Values().clear();
				return;
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES:
				getBluetoothTransceiver_dataToSend_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				getBooleanVariable_value_Values().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				getIntegerVariable_value_Values().clear();
				return;
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				getPin_level_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
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
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES:
				return bluetoothTransceiver_dataReceived_Values != null && !bluetoothTransceiver_dataReceived_Values.isEmpty();
			case StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES:
				return bluetoothTransceiver_dataToSend_Values != null && !bluetoothTransceiver_dataToSend_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return booleanVariable_value_Values != null && !booleanVariable_value_Values.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return integerVariable_value_Values != null && !integerVariable_value_Values.isEmpty();
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return pin_level_Values != null && !pin_level_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
