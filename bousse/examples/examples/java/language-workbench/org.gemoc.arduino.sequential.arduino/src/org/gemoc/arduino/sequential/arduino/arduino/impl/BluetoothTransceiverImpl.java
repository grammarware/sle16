/**
 */
package org.gemoc.arduino.sequential.arduino.arduino.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.impl.BluetoothTransceiverImpl#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.impl.BluetoothTransceiverImpl#getDataToSend <em>Data To Send</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.impl.BluetoothTransceiverImpl#getDataReceived <em>Data Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BluetoothTransceiverImpl extends ArduinoAnalogModuleImpl implements BluetoothTransceiver {
	/**
	 * The cached value of the '{@link #getConnectedTransceiver() <em>Connected Transceiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTransceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<BluetoothTransceiver> connectedTransceiver;

	/**
	 * The cached value of the '{@link #getDataToSend() <em>Data To Send</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataToSend()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dataToSend;

	/**
	 * The cached value of the '{@link #getDataReceived() <em>Data Received</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReceived()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dataReceived;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothTransceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.BLUETOOTH_TRANSCEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BluetoothTransceiver> getConnectedTransceiver() {
		if (connectedTransceiver == null) {
			connectedTransceiver = new EObjectResolvingEList<BluetoothTransceiver>(BluetoothTransceiver.class, this, ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER);
		}
		return connectedTransceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDataToSend() {
		if (dataToSend == null) {
			dataToSend = new EDataTypeUniqueEList<Integer>(Integer.class, this, ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND);
		}
		return dataToSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDataReceived() {
		if (dataReceived == null) {
			dataReceived = new EDataTypeUniqueEList<Integer>(Integer.class, this, ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED);
		}
		return dataReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void push() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				return getConnectedTransceiver();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				return getDataToSend();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				return getDataReceived();
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
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				getConnectedTransceiver().clear();
				getConnectedTransceiver().addAll((Collection<? extends BluetoothTransceiver>)newValue);
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				getDataToSend().clear();
				getDataToSend().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				getDataReceived().clear();
				getDataReceived().addAll((Collection<? extends Integer>)newValue);
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
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				getConnectedTransceiver().clear();
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				getDataToSend().clear();
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				getDataReceived().clear();
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
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				return connectedTransceiver != null && !connectedTransceiver.isEmpty();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				return dataToSend != null && !dataToSend.isEmpty();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				return dataReceived != null && !dataReceived.isEmpty();
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
		result.append(" (dataToSend: ");
		result.append(dataToSend);
		result.append(", dataReceived: ");
		result.append(dataReceived);
		result.append(')');
		return result.toString();
	}

} //BluetoothTransceiverImpl
