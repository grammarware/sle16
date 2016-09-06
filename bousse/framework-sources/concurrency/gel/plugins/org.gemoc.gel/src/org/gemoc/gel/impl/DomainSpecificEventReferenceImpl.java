/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.GelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Event Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.DomainSpecificEventReferenceImpl#getReferencedDse <em>Referenced Dse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainSpecificEventReferenceImpl extends DomainSpecificEventsPatternImpl implements DomainSpecificEventReference {
	/**
	 * The cached value of the '{@link #getReferencedDse() <em>Referenced Dse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedDse()
	 * @generated
	 * @ordered
	 */
	protected DomainSpecificEvent referencedDse;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificEventReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEvent getReferencedDse() {
		if (referencedDse != null && referencedDse.eIsProxy()) {
			InternalEObject oldReferencedDse = (InternalEObject)referencedDse;
			referencedDse = (DomainSpecificEvent)eResolveProxy(oldReferencedDse);
			if (referencedDse != oldReferencedDse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE, oldReferencedDse, referencedDse));
			}
		}
		return referencedDse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEvent basicGetReferencedDse() {
		return referencedDse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedDse(DomainSpecificEvent newReferencedDse) {
		DomainSpecificEvent oldReferencedDse = referencedDse;
		referencedDse = newReferencedDse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE, oldReferencedDse, referencedDse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE:
				if (resolve) return getReferencedDse();
				return basicGetReferencedDse();
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
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE:
				setReferencedDse((DomainSpecificEvent)newValue);
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
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE:
				setReferencedDse((DomainSpecificEvent)null);
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
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE:
				return referencedDse != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainSpecificEventReferenceImpl
