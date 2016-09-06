/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.ExecutionFunction;
import org.gemoc.gel.microgel.ExecutionKind;
import org.gemoc.gel.microgel.FeedbackPolicy;
import org.gemoc.gel.microgel.MicrogelPackage;
import org.gemoc.gel.microgel.MoccEventInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Model Specific Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl#getUponMoccEventInstance <em>Upon Mocc Event Instance</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl#getExecutionFunction <em>Execution Function</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl#getFeedbackPolicy <em>Feedback Policy</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl#getRaisedMoccEventInstance <em>Raised Mocc Event Instance</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl#getExecutionKind <em>Execution Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicModelSpecificEventImpl extends ModelSpecificEventImpl implements AtomicModelSpecificEvent {
	/**
	 * The cached value of the '{@link #getUponMoccEventInstance() <em>Upon Mocc Event Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUponMoccEventInstance()
	 * @generated
	 * @ordered
	 */
	protected MoccEventInstance uponMoccEventInstance;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The cached value of the '{@link #getRaisedMoccEventInstance() <em>Raised Mocc Event Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedMoccEventInstance()
	 * @generated
	 * @ordered
	 */
	protected MoccEventInstance raisedMoccEventInstance;

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
	protected AtomicModelSpecificEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrogelPackage.Literals.ATOMIC_MODEL_SPECIFIC_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoccEventInstance getUponMoccEventInstance() {
		return uponMoccEventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUponMoccEventInstance(MoccEventInstance newUponMoccEventInstance, NotificationChain msgs) {
		MoccEventInstance oldUponMoccEventInstance = uponMoccEventInstance;
		uponMoccEventInstance = newUponMoccEventInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE, oldUponMoccEventInstance, newUponMoccEventInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUponMoccEventInstance(MoccEventInstance newUponMoccEventInstance) {
		if (newUponMoccEventInstance != uponMoccEventInstance) {
			NotificationChain msgs = null;
			if (uponMoccEventInstance != null)
				msgs = ((InternalEObject)uponMoccEventInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE, null, msgs);
			if (newUponMoccEventInstance != null)
				msgs = ((InternalEObject)newUponMoccEventInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE, null, msgs);
			msgs = basicSetUponMoccEventInstance(newUponMoccEventInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE, newUponMoccEventInstance, newUponMoccEventInstance));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION, oldExecutionFunction, newExecutionFunction);
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
				msgs = ((InternalEObject)executionFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION, null, msgs);
			if (newExecutionFunction != null)
				msgs = ((InternalEObject)newExecutionFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION, null, msgs);
			msgs = basicSetExecutionFunction(newExecutionFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION, newExecutionFunction, newExecutionFunction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY, oldFeedbackPolicy, newFeedbackPolicy);
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
				msgs = ((InternalEObject)feedbackPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY, null, msgs);
			if (newFeedbackPolicy != null)
				msgs = ((InternalEObject)newFeedbackPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY, null, msgs);
			msgs = basicSetFeedbackPolicy(newFeedbackPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY, newFeedbackPolicy, newFeedbackPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoccEventInstance getRaisedMoccEventInstance() {
		return raisedMoccEventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaisedMoccEventInstance(MoccEventInstance newRaisedMoccEventInstance, NotificationChain msgs) {
		MoccEventInstance oldRaisedMoccEventInstance = raisedMoccEventInstance;
		raisedMoccEventInstance = newRaisedMoccEventInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE, oldRaisedMoccEventInstance, newRaisedMoccEventInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedMoccEventInstance(MoccEventInstance newRaisedMoccEventInstance) {
		if (newRaisedMoccEventInstance != raisedMoccEventInstance) {
			NotificationChain msgs = null;
			if (raisedMoccEventInstance != null)
				msgs = ((InternalEObject)raisedMoccEventInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE, null, msgs);
			if (newRaisedMoccEventInstance != null)
				msgs = ((InternalEObject)newRaisedMoccEventInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE, null, msgs);
			msgs = basicSetRaisedMoccEventInstance(newRaisedMoccEventInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE, newRaisedMoccEventInstance, newRaisedMoccEventInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND, oldExecutionKind, executionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE:
				return basicSetUponMoccEventInstance(null, msgs);
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				return basicSetExecutionFunction(null, msgs);
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY:
				return basicSetFeedbackPolicy(null, msgs);
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE:
				return basicSetRaisedMoccEventInstance(null, msgs);
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
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE:
				return getUponMoccEventInstance();
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				return getExecutionFunction();
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY:
				return getFeedbackPolicy();
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE:
				return getRaisedMoccEventInstance();
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND:
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
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE:
				setUponMoccEventInstance((MoccEventInstance)newValue);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				setExecutionFunction((ExecutionFunction)newValue);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY:
				setFeedbackPolicy((FeedbackPolicy)newValue);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__TARGET:
				setTarget((EObject)newValue);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE:
				setRaisedMoccEventInstance((MoccEventInstance)newValue);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND:
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
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE:
				setUponMoccEventInstance((MoccEventInstance)null);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				setExecutionFunction((ExecutionFunction)null);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY:
				setFeedbackPolicy((FeedbackPolicy)null);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__TARGET:
				setTarget((EObject)null);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE:
				setRaisedMoccEventInstance((MoccEventInstance)null);
				return;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND:
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
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE:
				return uponMoccEventInstance != null;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION:
				return executionFunction != null;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY:
				return feedbackPolicy != null;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__TARGET:
				return target != null;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE:
				return raisedMoccEventInstance != null;
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND:
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

} //AtomicModelSpecificEventImpl
