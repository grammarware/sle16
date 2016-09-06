/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.ExecutionFunction;
import org.gemoc.gel.ExecutionKind;
import org.gemoc.gel.FeedbackPolicy;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.MoccEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Domain Specific Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl#getUponMoccEvent <em>Upon Mocc Event</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl#getExecutionFunction <em>Execution Function</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl#getFeedbackPolicy <em>Feedback Policy</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl#getRaisedMoccEvent <em>Raised Mocc Event</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl#getExecutionKind <em>Execution Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicDomainSpecificEventImpl extends DomainSpecificEventImpl implements AtomicDomainSpecificEvent {
	/**
	 * The cached value of the '{@link #getUponMoccEvent() <em>Upon Mocc Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUponMoccEvent()
	 * @generated
	 * @ordered
	 */
	protected MoccEvent uponMoccEvent;

	/**
	 * The cached value of the '{@link #getExecutionFunction() <em>Execution Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionFunction()
	 * @generated
	 * @ordered
	 */
	protected ExecutionFunction executionFunction;

	/**
	 * The cached value of the '{@link #getFeedbackPolicy() <em>Feedback Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackPolicy()
	 * @generated
	 * @ordered
	 */
	protected FeedbackPolicy feedbackPolicy;

	/**
	 * The cached value of the '{@link #getRaisedMoccEvent() <em>Raised Mocc Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedMoccEvent()
	 * @generated
	 * @ordered
	 */
	protected MoccEvent raisedMoccEvent;

	/**
	 * The default value of the '{@link #getExecutionKind() <em>Execution Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionKind()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionKind EXECUTION_KIND_EDEFAULT = ExecutionKind.SUBMISSION;

	/**
	 * The cached value of the '{@link #getExecutionKind() <em>Execution Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionKind()
	 * @generated
	 * @ordered
	 */
	protected ExecutionKind executionKind = EXECUTION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDomainSpecificEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.ATOMIC_DOMAIN_SPECIFIC_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoccEvent getUponMoccEvent() {
		return uponMoccEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUponMoccEvent(MoccEvent newUponMoccEvent, NotificationChain msgs) {
		MoccEvent oldUponMoccEvent = uponMoccEvent;
		uponMoccEvent = newUponMoccEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT, oldUponMoccEvent, newUponMoccEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUponMoccEvent(MoccEvent newUponMoccEvent) {
		if (newUponMoccEvent != uponMoccEvent) {
			NotificationChain msgs = null;
			if (uponMoccEvent != null)
				msgs = ((InternalEObject)uponMoccEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT, null, msgs);
			if (newUponMoccEvent != null)
				msgs = ((InternalEObject)newUponMoccEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT, null, msgs);
			msgs = basicSetUponMoccEvent(newUponMoccEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT, newUponMoccEvent, newUponMoccEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFunction getExecutionFunction() {
		return executionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionFunction(ExecutionFunction newExecutionFunction, NotificationChain msgs) {
		ExecutionFunction oldExecutionFunction = executionFunction;
		executionFunction = newExecutionFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION, oldExecutionFunction, newExecutionFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionFunction(ExecutionFunction newExecutionFunction) {
		if (newExecutionFunction != executionFunction) {
			NotificationChain msgs = null;
			if (executionFunction != null)
				msgs = ((InternalEObject)executionFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION, null, msgs);
			if (newExecutionFunction != null)
				msgs = ((InternalEObject)newExecutionFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION, null, msgs);
			msgs = basicSetExecutionFunction(newExecutionFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION, newExecutionFunction, newExecutionFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackPolicy getFeedbackPolicy() {
		return feedbackPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedbackPolicy(FeedbackPolicy newFeedbackPolicy, NotificationChain msgs) {
		FeedbackPolicy oldFeedbackPolicy = feedbackPolicy;
		feedbackPolicy = newFeedbackPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY, oldFeedbackPolicy, newFeedbackPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackPolicy(FeedbackPolicy newFeedbackPolicy) {
		if (newFeedbackPolicy != feedbackPolicy) {
			NotificationChain msgs = null;
			if (feedbackPolicy != null)
				msgs = ((InternalEObject)feedbackPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY, null, msgs);
			if (newFeedbackPolicy != null)
				msgs = ((InternalEObject)newFeedbackPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY, null, msgs);
			msgs = basicSetFeedbackPolicy(newFeedbackPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY, newFeedbackPolicy, newFeedbackPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoccEvent getRaisedMoccEvent() {
		return raisedMoccEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaisedMoccEvent(MoccEvent newRaisedMoccEvent, NotificationChain msgs) {
		MoccEvent oldRaisedMoccEvent = raisedMoccEvent;
		raisedMoccEvent = newRaisedMoccEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT, oldRaisedMoccEvent, newRaisedMoccEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedMoccEvent(MoccEvent newRaisedMoccEvent) {
		if (newRaisedMoccEvent != raisedMoccEvent) {
			NotificationChain msgs = null;
			if (raisedMoccEvent != null)
				msgs = ((InternalEObject)raisedMoccEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT, null, msgs);
			if (newRaisedMoccEvent != null)
				msgs = ((InternalEObject)newRaisedMoccEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT, null, msgs);
			msgs = basicSetRaisedMoccEvent(newRaisedMoccEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT, newRaisedMoccEvent, newRaisedMoccEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionKind getExecutionKind() {
		return executionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionKind(ExecutionKind newExecutionKind) {
		ExecutionKind oldExecutionKind = executionKind;
		executionKind = newExecutionKind == null ? EXECUTION_KIND_EDEFAULT : newExecutionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND, oldExecutionKind, executionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT:
				return basicSetUponMoccEvent(null, msgs);
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				return basicSetExecutionFunction(null, msgs);
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY:
				return basicSetFeedbackPolicy(null, msgs);
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT:
				return basicSetRaisedMoccEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT:
				return getUponMoccEvent();
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				return getExecutionFunction();
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY:
				return getFeedbackPolicy();
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT:
				return getRaisedMoccEvent();
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND:
				return getExecutionKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT:
				setUponMoccEvent((MoccEvent)newValue);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				setExecutionFunction((ExecutionFunction)newValue);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY:
				setFeedbackPolicy((FeedbackPolicy)newValue);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT:
				setRaisedMoccEvent((MoccEvent)newValue);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND:
				setExecutionKind((ExecutionKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT:
				setUponMoccEvent((MoccEvent)null);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				setExecutionFunction((ExecutionFunction)null);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY:
				setFeedbackPolicy((FeedbackPolicy)null);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT:
				setRaisedMoccEvent((MoccEvent)null);
				return;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND:
				setExecutionKind(EXECUTION_KIND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT:
				return uponMoccEvent != null;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				return executionFunction != null;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY:
				return feedbackPolicy != null;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT:
				return raisedMoccEvent != null;
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND:
				return executionKind != EXECUTION_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (executionKind: ");
		result.append(executionKind);
		result.append(')');
		return result.toString();
	}

} //AtomicDomainSpecificEventImpl
