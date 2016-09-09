/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE: return createBluetoothTransceiver_dataReceived_Value();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE: return createBluetoothTransceiver_dataToSend_Value();
			case StatesPackage.BOOLEAN_VARIABLE_VALUE_VALUE: return createBooleanVariable_value_Value();
			case StatesPackage.INTEGER_VARIABLE_VALUE_VALUE: return createIntegerVariable_value_Value();
			case StatesPackage.PIN_LEVEL_VALUE: return createPin_level_Value();
			case StatesPackage.STATE: return createState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataReceived_Value createBluetoothTransceiver_dataReceived_Value() {
		BluetoothTransceiver_dataReceived_ValueImpl bluetoothTransceiver_dataReceived_Value = new BluetoothTransceiver_dataReceived_ValueImpl();
		return bluetoothTransceiver_dataReceived_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataToSend_Value createBluetoothTransceiver_dataToSend_Value() {
		BluetoothTransceiver_dataToSend_ValueImpl bluetoothTransceiver_dataToSend_Value = new BluetoothTransceiver_dataToSend_ValueImpl();
		return bluetoothTransceiver_dataToSend_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_value_Value createBooleanVariable_value_Value() {
		BooleanVariable_value_ValueImpl booleanVariable_value_Value = new BooleanVariable_value_ValueImpl();
		return booleanVariable_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_value_Value createIntegerVariable_value_Value() {
		IntegerVariable_value_ValueImpl integerVariable_value_Value = new IntegerVariable_value_ValueImpl();
		return integerVariable_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin_level_Value createPin_level_Value() {
		Pin_level_ValueImpl pin_level_Value = new Pin_level_ValueImpl();
		return pin_level_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
