/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Model Specific Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getUponMoccEventInstance <em>Upon Mocc Event Instance</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionFunction <em>Execution Function</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getFeedbackPolicy <em>Feedback Policy</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getRaisedMoccEventInstance <em>Raised Mocc Event Instance</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionKind <em>Execution Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent()
 * @model
 * @generated
 */
public interface AtomicModelSpecificEvent extends ModelSpecificEvent {
	/**
	 * Returns the value of the '<em><b>Upon Mocc Event Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upon Mocc Event Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upon Mocc Event Instance</em>' containment reference.
	 * @see #setUponMoccEventInstance(MoccEventInstance)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent_UponMoccEventInstance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MoccEventInstance getUponMoccEventInstance();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getUponMoccEventInstance <em>Upon Mocc Event Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upon Mocc Event Instance</em>' containment reference.
	 * @see #getUponMoccEventInstance()
	 * @generated
	 */
	void setUponMoccEventInstance(MoccEventInstance value);

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
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent_ExecutionFunction()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionFunction getExecutionFunction();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionFunction <em>Execution Function</em>}' containment reference.
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
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent_FeedbackPolicy()
	 * @model containment="true"
	 * @generated
	 */
	FeedbackPolicy getFeedbackPolicy();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getFeedbackPolicy <em>Feedback Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Policy</em>' containment reference.
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	void setFeedbackPolicy(FeedbackPolicy value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent_Target()
	 * @model required="true"
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Raised Mocc Event Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Mocc Event Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Mocc Event Instance</em>' containment reference.
	 * @see #setRaisedMoccEventInstance(MoccEventInstance)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent_RaisedMoccEventInstance()
	 * @model containment="true"
	 * @generated
	 */
	MoccEventInstance getRaisedMoccEventInstance();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getRaisedMoccEventInstance <em>Raised Mocc Event Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised Mocc Event Instance</em>' containment reference.
	 * @see #getRaisedMoccEventInstance()
	 * @generated
	 */
	void setRaisedMoccEventInstance(MoccEventInstance value);

	/**
	 * Returns the value of the '<em><b>Execution Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.gel.microgel.ExecutionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Kind</em>' attribute.
	 * @see org.gemoc.gel.microgel.ExecutionKind
	 * @see #setExecutionKind(ExecutionKind)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getAtomicModelSpecificEvent_ExecutionKind()
	 * @model
	 * @generated
	 */
	ExecutionKind getExecutionKind();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionKind <em>Execution Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Kind</em>' attribute.
	 * @see org.gemoc.gel.microgel.ExecutionKind
	 * @see #getExecutionKind()
	 * @generated
	 */
	void setExecutionKind(ExecutionKind value);

} // AtomicModelSpecificEvent
