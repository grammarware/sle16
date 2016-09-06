/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.ExecutionFunction#getResult <em>Result</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.ExecutionFunction#getCallKind <em>Call Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getExecutionFunction()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(ExecutionFunctionResult)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getExecutionFunction_Result()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionFunctionResult getResult();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.ExecutionFunction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ExecutionFunctionResult value);

	/**
	 * Returns the value of the '<em><b>Call Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.gel.microgel.CallKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Kind</em>' attribute.
	 * @see org.gemoc.gel.microgel.CallKind
	 * @see #setCallKind(CallKind)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getExecutionFunction_CallKind()
	 * @model required="true"
	 * @generated
	 */
	CallKind getCallKind();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.ExecutionFunction#getCallKind <em>Call Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Kind</em>' attribute.
	 * @see org.gemoc.gel.microgel.CallKind
	 * @see #getCallKind()
	 * @generated
	 */
	void setCallKind(CallKind value);

} // ExecutionFunction
