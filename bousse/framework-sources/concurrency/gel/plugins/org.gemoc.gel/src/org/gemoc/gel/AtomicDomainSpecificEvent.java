/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Domain Specific Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.AtomicDomainSpecificEvent#getUponMoccEvent <em>Upon Mocc Event</em>}</li>
 *   <li>{@link org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionFunction <em>Execution Function</em>}</li>
 *   <li>{@link org.gemoc.gel.AtomicDomainSpecificEvent#getFeedbackPolicy <em>Feedback Policy</em>}</li>
 *   <li>{@link org.gemoc.gel.AtomicDomainSpecificEvent#getRaisedMoccEvent <em>Raised Mocc Event</em>}</li>
 *   <li>{@link org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionKind <em>Execution Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getAtomicDomainSpecificEvent()
 * @model
 * @generated
 */
public interface AtomicDomainSpecificEvent extends DomainSpecificEvent {
	/**
	 * Returns the value of the '<em><b>Upon Mocc Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upon Mocc Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upon Mocc Event</em>' containment reference.
	 * @see #setUponMoccEvent(MoccEvent)
	 * @see org.gemoc.gel.GelPackage#getAtomicDomainSpecificEvent_UponMoccEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MoccEvent getUponMoccEvent();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getUponMoccEvent <em>Upon Mocc Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upon Mocc Event</em>' containment reference.
	 * @see #getUponMoccEvent()
	 * @generated
	 */
	void setUponMoccEvent(MoccEvent value);

	/**
	 * Returns the value of the '<em><b>Execution Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Function</em>' containment reference.
	 * @see #setExecutionFunction(ExecutionFunction)
	 * @see org.gemoc.gel.GelPackage#getAtomicDomainSpecificEvent_ExecutionFunction()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionFunction getExecutionFunction();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionFunction <em>Execution Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Function</em>' containment reference.
	 * @see #getExecutionFunction()
	 * @generated
	 */
	void setExecutionFunction(ExecutionFunction value);

	/**
	 * Returns the value of the '<em><b>Feedback Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Policy</em>' containment reference.
	 * @see #setFeedbackPolicy(FeedbackPolicy)
	 * @see org.gemoc.gel.GelPackage#getAtomicDomainSpecificEvent_FeedbackPolicy()
	 * @model containment="true"
	 * @generated
	 */
	FeedbackPolicy getFeedbackPolicy();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getFeedbackPolicy <em>Feedback Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Policy</em>' containment reference.
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	void setFeedbackPolicy(FeedbackPolicy value);

	/**
	 * Returns the value of the '<em><b>Raised Mocc Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Mocc Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Mocc Event</em>' containment reference.
	 * @see #setRaisedMoccEvent(MoccEvent)
	 * @see org.gemoc.gel.GelPackage#getAtomicDomainSpecificEvent_RaisedMoccEvent()
	 * @model containment="true"
	 * @generated
	 */
	MoccEvent getRaisedMoccEvent();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getRaisedMoccEvent <em>Raised Mocc Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised Mocc Event</em>' containment reference.
	 * @see #getRaisedMoccEvent()
	 * @generated
	 */
	void setRaisedMoccEvent(MoccEvent value);

	/**
	 * Returns the value of the '<em><b>Execution Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.gel.ExecutionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Kind</em>' attribute.
	 * @see org.gemoc.gel.ExecutionKind
	 * @see #setExecutionKind(ExecutionKind)
	 * @see org.gemoc.gel.GelPackage#getAtomicDomainSpecificEvent_ExecutionKind()
	 * @model
	 * @generated
	 */
	ExecutionKind getExecutionKind();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionKind <em>Execution Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Kind</em>' attribute.
	 * @see org.gemoc.gel.ExecutionKind
	 * @see #getExecutionKind()
	 * @generated
	 */
	void setExecutionKind(ExecutionKind value);

} // AtomicDomainSpecificEvent
