/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.UnaryPattern#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getUnaryPattern()
 * @model abstract="true"
 * @generated
 */
public interface UnaryPattern extends DomainSpecificEventsPattern {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(DomainSpecificEventsPattern)
	 * @see org.gemoc.gel.GelPackage#getUnaryPattern_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainSpecificEventsPattern getOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.UnaryPattern#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(DomainSpecificEventsPattern value);

} // UnaryPattern
