/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Value;
import arduinoTrace.States.State;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Transceiver data Received Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl#getDataReceived <em>Data Received</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BluetoothTransceiver_dataReceived_ValueImpl extends MinimalEObjectImpl.Container implements BluetoothTransceiver_dataReceived_Value {
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
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothTransceiver_dataReceived_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDataReceived() {
		if (dataReceived == null) {
			dataReceived = new EDataTypeUniqueEList<Integer>(Integer.class, this, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED);
		}
		return dataReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBluetoothTransceiver getParent() {
		if (eContainerFeatureID() != StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT) return null;
		return (TracedBluetoothTransceiver)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedBluetoothTransceiver newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedBluetoothTransceiver newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE, TracedBluetoothTransceiver.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES, StatesPackage.STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES);
		}
		return states;
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedBluetoothTransceiver)otherEnd, msgs);
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE, TracedBluetoothTransceiver.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				return getDataReceived();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				return getParent();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES:
				return getStates();
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				getDataReceived().clear();
				getDataReceived().addAll((Collection<? extends Integer>)newValue);
				return;
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				setParent((TracedBluetoothTransceiver)newValue);
				return;
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				getDataReceived().clear();
				return;
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				setParent((TracedBluetoothTransceiver)null);
				return;
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				return dataReceived != null && !dataReceived.isEmpty();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES:
				return states != null && !states.isEmpty();
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
		result.append(" (dataReceived: ");
		result.append(dataReceived);
		result.append(')');
		return result.toString();
	}

} //BluetoothTransceiver_dataReceived_ValueImpl
