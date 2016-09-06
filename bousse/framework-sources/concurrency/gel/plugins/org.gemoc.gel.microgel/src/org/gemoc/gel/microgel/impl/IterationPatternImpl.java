/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.microgel.IterationPattern;
import org.gemoc.gel.microgel.MicrogelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.impl.IterationPatternImpl#getNumberOfIterations <em>Number Of Iterations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationPatternImpl extends UnaryPatternImpl implements IterationPattern {
	/**
	 * The default value of the '{@link #getNumberOfIterations() <em>Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfIterations()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_ITERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfIterations() <em>Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfIterations()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfIterations = NUMBER_OF_ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrogelPackage.Literals.ITERATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfIterations() {
		return numberOfIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfIterations(Integer newNumberOfIterations) {
		Integer oldNumberOfIterations = numberOfIterations;
		numberOfIterations = newNumberOfIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.ITERATION_PATTERN__NUMBER_OF_ITERATIONS, oldNumberOfIterations, numberOfIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicrogelPackage.ITERATION_PATTERN__NUMBER_OF_ITERATIONS:
				return getNumberOfIterations();
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
			case MicrogelPackage.ITERATION_PATTERN__NUMBER_OF_ITERATIONS:
				setNumberOfIterations((Integer)newValue);
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
			case MicrogelPackage.ITERATION_PATTERN__NUMBER_OF_ITERATIONS:
				setNumberOfIterations(NUMBER_OF_ITERATIONS_EDEFAULT);
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
			case MicrogelPackage.ITERATION_PATTERN__NUMBER_OF_ITERATIONS:
				return NUMBER_OF_ITERATIONS_EDEFAULT == null ? numberOfIterations != null : !NUMBER_OF_ITERATIONS_EDEFAULT.equals(numberOfIterations);
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
		result.append(" (numberOfIterations: ");
		result.append(numberOfIterations);
		result.append(')');
		return result.toString();
	}

} //IterationPatternImpl
