/**
 */
package org.gemoc.arduino.sequential.model.arduino.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.gemoc.arduino.sequential.model.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.model.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.model.arduino.impl.BluetoothTransceiverImpl#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 * </ul>
 * </p>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				return getConnectedTransceiver();
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
		}
		return super.eIsSet(featureID);
	}

} //BluetoothTransceiverImpl
