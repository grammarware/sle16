/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCool Operator Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getDSE <em>DSE</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperatorArg()
 * @model
 * @generated
 */
public interface BCoolOperatorArg extends NamedElement {
	/**
	 * Returns the value of the '<em><b>DSE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSE</em>' reference.
	 * @see #setDSE(DefPropertyCS)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperatorArg_DSE()
	 * @model
	 * @generated
	 */
	DefPropertyCS getDSE();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getDSE <em>DSE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSE</em>' reference.
	 * @see #getDSE()
	 * @generated
	 */
	void setDSE(DefPropertyCS value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(ImportInterfaceStatement)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperatorArg_Interface()
	 * @model required="true"
	 * @generated
	 */
	ImportInterfaceStatement getInterface();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ImportInterfaceStatement value);

	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' reference.
	 * @see #setInterfaceClass(EClass)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperatorArg_InterfaceClass()
	 * @model
	 * @generated
	 */
	EClass getInterfaceClass();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterfaceClass <em>Interface Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Class</em>' reference.
	 * @see #getInterfaceClass()
	 * @generated
	 */
	void setInterfaceClass(EClass value);

} // BCoolOperatorArg
