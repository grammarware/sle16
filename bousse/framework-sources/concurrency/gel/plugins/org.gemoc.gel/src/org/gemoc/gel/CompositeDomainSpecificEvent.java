/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Domain Specific Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.CompositeDomainSpecificEvent#getBody <em>Body</em>}</li>
 *   <li>{@link org.gemoc.gel.CompositeDomainSpecificEvent#getUnfoldingStrategy <em>Unfolding Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getCompositeDomainSpecificEvent()
 * @model
 * @generated
 */
public interface CompositeDomainSpecificEvent extends DomainSpecificEvent {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(DomainSpecificEventsPattern)
	 * @see org.gemoc.gel.GelPackage#getCompositeDomainSpecificEvent_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainSpecificEventsPattern getBody();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.CompositeDomainSpecificEvent#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(DomainSpecificEventsPattern value);

	/**
	 * Returns the value of the '<em><b>Unfolding Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unfolding Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unfolding Strategy</em>' containment reference.
	 * @see #setUnfoldingStrategy(UnfoldingStrategy)
	 * @see org.gemoc.gel.GelPackage#getCompositeDomainSpecificEvent_UnfoldingStrategy()
	 * @model containment="true"
	 * @generated
	 */
	UnfoldingStrategy getUnfoldingStrategy();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.CompositeDomainSpecificEvent#getUnfoldingStrategy <em>Unfolding Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unfolding Strategy</em>' containment reference.
	 * @see #getUnfoldingStrategy()
	 * @generated
	 */
	void setUnfoldingStrategy(UnfoldingStrategy value);

} // CompositeDomainSpecificEvent
