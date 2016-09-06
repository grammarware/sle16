/**
 */
package org.gemoc.gel;

import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta3 Navigation To Execution Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.Kermeta3NavigationToExecutionFunction#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getKermeta3NavigationToExecutionFunction()
 * @model
 * @generated
 */
public interface Kermeta3NavigationToExecutionFunction extends ExecutionFunction {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(GExpression)
	 * @see org.gemoc.gel.GelPackage#getKermeta3NavigationToExecutionFunction_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getExpression();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.Kermeta3NavigationToExecutionFunction#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(GExpression value);

} // Kermeta3NavigationToExecutionFunction
