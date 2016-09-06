/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.MicrogelPackage;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ccsl Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.impl.CcslClockImpl#getReferencedClock <em>Referenced Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CcslClockImpl extends MoccEventInstanceImpl implements CcslClock {
	/**
	 * The cached value of the '{@link #getReferencedClock() <em>Referenced Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedClock()
	 * @generated
	 * @ordered
	 */
	protected Clock referencedClock;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CcslClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrogelPackage.Literals.CCSL_CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getReferencedClock() {
		if (referencedClock != null && referencedClock.eIsProxy()) {
			InternalEObject oldReferencedClock = (InternalEObject)referencedClock;
			referencedClock = (Clock)eResolveProxy(oldReferencedClock);
			if (referencedClock != oldReferencedClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicrogelPackage.CCSL_CLOCK__REFERENCED_CLOCK, oldReferencedClock, referencedClock));
			}
		}
		return referencedClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetReferencedClock() {
		return referencedClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedClock(Clock newReferencedClock) {
		Clock oldReferencedClock = referencedClock;
		referencedClock = newReferencedClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.CCSL_CLOCK__REFERENCED_CLOCK, oldReferencedClock, referencedClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicrogelPackage.CCSL_CLOCK__REFERENCED_CLOCK:
				if (resolve) return getReferencedClock();
				return basicGetReferencedClock();
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
			case MicrogelPackage.CCSL_CLOCK__REFERENCED_CLOCK:
				setReferencedClock((Clock)newValue);
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
			case MicrogelPackage.CCSL_CLOCK__REFERENCED_CLOCK:
				setReferencedClock((Clock)null);
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
			case MicrogelPackage.CCSL_CLOCK__REFERENCED_CLOCK:
				return referencedClock != null;
		}
		return super.eIsSet(featureID);
	}

} //CcslClockImpl
