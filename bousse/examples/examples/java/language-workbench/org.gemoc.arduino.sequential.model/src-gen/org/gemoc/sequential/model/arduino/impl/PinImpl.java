/**
 */
package org.gemoc.sequential.model.arduino.impl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.sequential.model.arduino.ArduinoPackage;
import org.gemoc.sequential.model.arduino.Pin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PinImpl extends NamedElementImpl implements Pin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.PIN;
	}

} //PinImpl
