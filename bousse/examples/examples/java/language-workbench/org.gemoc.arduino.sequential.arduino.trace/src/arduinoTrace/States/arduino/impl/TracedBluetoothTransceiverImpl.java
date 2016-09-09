/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Value;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Value;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl#getDataReceivedSequence <em>Data Received Sequence</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl#getDataToSendSequence <em>Data To Send Sequence</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedBluetoothTransceiverImpl extends TracedArduinoAnalogModuleImpl implements TracedBluetoothTransceiver {
	/**
	 * The cached value of the '{@link #getDataReceivedSequence() <em>Data Received Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReceivedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BluetoothTransceiver_dataReceived_Value> dataReceivedSequence;

	/**
	 * The cached value of the '{@link #getDataToSendSequence() <em>Data To Send Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataToSendSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BluetoothTransceiver_dataToSend_Value> dataToSendSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected BluetoothTransceiver originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBluetoothTransceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_BLUETOOTH_TRANSCEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BluetoothTransceiver_dataReceived_Value> getDataReceivedSequence() {
		if (dataReceivedSequence == null) {
			dataReceivedSequence = new EObjectContainmentWithInverseEList<BluetoothTransceiver_dataReceived_Value>(BluetoothTransceiver_dataReceived_Value.class, this, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT);
		}
		return dataReceivedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BluetoothTransceiver_dataToSend_Value> getDataToSendSequence() {
		if (dataToSendSequence == null) {
			dataToSendSequence = new EObjectContainmentWithInverseEList<BluetoothTransceiver_dataToSend_Value>(BluetoothTransceiver_dataToSend_Value.class, this, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__PARENT);
		}
		return dataToSendSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (BluetoothTransceiver)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(BluetoothTransceiver newOriginalObject) {
		BluetoothTransceiver oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataReceivedSequence()).basicAdd(otherEnd, msgs);
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataToSendSequence()).basicAdd(otherEnd, msgs);
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE:
				return ((InternalEList<?>)getDataReceivedSequence()).basicRemove(otherEnd, msgs);
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE:
				return ((InternalEList<?>)getDataToSendSequence()).basicRemove(otherEnd, msgs);
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE:
				return getDataReceivedSequence();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE:
				return getDataToSendSequence();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE:
				getDataReceivedSequence().clear();
				getDataReceivedSequence().addAll((Collection<? extends BluetoothTransceiver_dataReceived_Value>)newValue);
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE:
				getDataToSendSequence().clear();
				getDataToSendSequence().addAll((Collection<? extends BluetoothTransceiver_dataToSend_Value>)newValue);
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				setOriginalObject((BluetoothTransceiver)newValue);
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE:
				getDataReceivedSequence().clear();
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE:
				getDataToSendSequence().clear();
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				setOriginalObject((BluetoothTransceiver)null);
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE:
				return dataReceivedSequence != null && !dataReceivedSequence.isEmpty();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE:
				return dataToSendSequence != null && !dataToSendSequence.isEmpty();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedBluetoothTransceiverImpl
