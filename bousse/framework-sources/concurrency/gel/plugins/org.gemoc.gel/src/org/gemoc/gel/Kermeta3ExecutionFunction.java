/**
 */
package org.gemoc.gel;

import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta3 Execution Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.Kermeta3ExecutionFunction#getNavigationPathToOperation <em>Navigation Path To Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getKermeta3ExecutionFunction()
 * @model
 * @generated
 */
public interface Kermeta3ExecutionFunction extends ExecutionFunction {
	/**
	 * Returns the value of the '<em><b>Navigation Path To Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Path To Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Path To Operation</em>' containment reference.
	 * @see #setNavigationPathToOperation(GExpression)
	 * @see org.gemoc.gel.GelPackage#getKermeta3ExecutionFunction_NavigationPathToOperation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getNavigationPathToOperation();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.Kermeta3ExecutionFunction#getNavigationPathToOperation <em>Navigation Path To Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Path To Operation</em>' containment reference.
	 * @see #getNavigationPathToOperation()
	 * @generated
	 */
	void setNavigationPathToOperation(GExpression value);

} // Kermeta3ExecutionFunction
