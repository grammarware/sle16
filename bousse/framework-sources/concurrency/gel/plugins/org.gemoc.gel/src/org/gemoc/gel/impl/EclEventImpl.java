/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.GelPackage;

import fr.inria.aoste.timesquare.ECL.ECLDefCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecl Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.EclEventImpl#getEventReference <em>Event Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EclEventImpl extends MoccEventImpl implements EclEvent {
	/**
	 * The cached value of the '{@link #getEventReference() <em>Event Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventReference()
	 * @generated
	 * @ordered
	 */
	protected ECLDefCS eventReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.ECL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLDefCS getEventReference() {
		if (eventReference != null && eventReference.eIsProxy()) {
			InternalEObject oldEventReference = (InternalEObject)eventReference;
			eventReference = (ECLDefCS)eResolveProxy(oldEventReference);
			if (eventReference != oldEventReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.ECL_EVENT__EVENT_REFERENCE, oldEventReference, eventReference));
			}
		}
		return eventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLDefCS basicGetEventReference() {
		return eventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventReference(ECLDefCS newEventReference) {
		ECLDefCS oldEventReference = eventReference;
		eventReference = newEventReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.ECL_EVENT__EVENT_REFERENCE, oldEventReference, eventReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GelPackage.ECL_EVENT__EVENT_REFERENCE:
				if (resolve) return getEventReference();
				return basicGetEventReference();
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
			case GelPackage.ECL_EVENT__EVENT_REFERENCE:
				setEventReference((ECLDefCS)newValue);
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
			case GelPackage.ECL_EVENT__EVENT_REFERENCE:
				setEventReference((ECLDefCS)null);
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
			case GelPackage.ECL_EVENT__EVENT_REFERENCE:
				return eventReference != null;
		}
		return super.eIsSet(featureID);
	}

} //EclEventImpl
