/**
 */
package org.gemoc.sequential.model.arduino.impl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.sequential.model.arduino.ArduinoPackage;
import org.gemoc.sequential.model.arduino.Constant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConstantImpl extends ExpressionImpl implements Constant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.CONSTANT;
	}

} //ConstantImpl
