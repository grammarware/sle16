/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventsPattern;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.UnfoldingStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Domain Specific Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.CompositeDomainSpecificEventImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.CompositeDomainSpecificEventImpl#getUnfoldingStrategy <em>Unfolding Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeDomainSpecificEventImpl extends DomainSpecificEventImpl implements CompositeDomainSpecificEvent {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected DomainSpecificEventsPattern body;

	/**
	 * The cached value of the '{@link #getUnfoldingStrategy() <em>Unfolding Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnfoldingStrategy()
	 * @generated
	 * @ordered
	 */
	protected UnfoldingStrategy unfoldingStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDomainSpecificEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.COMPOSITE_DOMAIN_SPECIFIC_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEventsPattern getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(DomainSpecificEventsPattern newBody, NotificationChain msgs) {
		DomainSpecificEventsPattern oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(DomainSpecificEventsPattern newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnfoldingStrategy getUnfoldingStrategy() {
		return unfoldingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnfoldingStrategy(UnfoldingStrategy newUnfoldingStrategy, NotificationChain msgs) {
		UnfoldingStrategy oldUnfoldingStrategy = unfoldingStrategy;
		unfoldingStrategy = newUnfoldingStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY, oldUnfoldingStrategy, newUnfoldingStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnfoldingStrategy(UnfoldingStrategy newUnfoldingStrategy) {
		if (newUnfoldingStrategy != unfoldingStrategy) {
			NotificationChain msgs = null;
			if (unfoldingStrategy != null)
				msgs = ((InternalEObject)unfoldingStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY, null, msgs);
			if (newUnfoldingStrategy != null)
				msgs = ((InternalEObject)newUnfoldingStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY, null, msgs);
			msgs = basicSetUnfoldingStrategy(newUnfoldingStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY, newUnfoldingStrategy, newUnfoldingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY:
				return basicSetBody(null, msgs);
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY:
				return basicSetUnfoldingStrategy(null, msgs);
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
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY:
				return getBody();
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY:
				return getUnfoldingStrategy();
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
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY:
				setBody((DomainSpecificEventsPattern)newValue);
				return;
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY:
				setUnfoldingStrategy((UnfoldingStrategy)newValue);
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
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY:
				setBody((DomainSpecificEventsPattern)null);
				return;
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY:
				setUnfoldingStrategy((UnfoldingStrategy)null);
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
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY:
				return body != null;
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY:
				return unfoldingStrategy != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeDomainSpecificEventImpl
