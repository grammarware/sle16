/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.microgel.MicrogelPackage;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Specific Event Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.impl.ModelSpecificEventReferenceImpl#getReferencedMse <em>Referenced Mse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelSpecificEventReferenceImpl extends ModelSpecificEventsPatternImpl implements ModelSpecificEventReference {
	/**
	 * The cached value of the '{@link #getReferencedMse() <em>Referenced Mse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMse()
	 * @generated
	 * @ordered
	 */
	protected ModelSpecificEvent referencedMse;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSpecificEventReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrogelPackage.Literals.MODEL_SPECIFIC_EVENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent getReferencedMse() {
		if (referencedMse != null && referencedMse.eIsProxy()) {
			InternalEObject oldReferencedMse = (InternalEObject)referencedMse;
			referencedMse = (ModelSpecificEvent)eResolveProxy(oldReferencedMse);
			if (referencedMse != oldReferencedMse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE, oldReferencedMse, referencedMse));
			}
		}
		return referencedMse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent basicGetReferencedMse() {
		return referencedMse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMse(ModelSpecificEvent newReferencedMse) {
		ModelSpecificEvent oldReferencedMse = referencedMse;
		referencedMse = newReferencedMse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE, oldReferencedMse, referencedMse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE:
				if (resolve) return getReferencedMse();
				return basicGetReferencedMse();
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
			case MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE:
				setReferencedMse((ModelSpecificEvent)newValue);
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
			case MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE:
				setReferencedMse((ModelSpecificEvent)null);
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
			case MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE:
				return referencedMse != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelSpecificEventReferenceImpl
