/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ForkedToken;
import activitydiagram.Token;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forked Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.ForkedTokenImpl#getBaseToken <em>Base Token</em>}</li>
 *   <li>{@link activitydiagram.impl.ForkedTokenImpl#getRemainingOffersCount <em>Remaining Offers Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForkedTokenImpl extends TokenImpl implements ForkedToken {
	/**
	 * The cached value of the '{@link #getBaseToken() <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseToken()
	 * @generated
	 * @ordered
	 */
	protected Token baseToken;

	/**
	 * The default value of the '{@link #getRemainingOffersCount() <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REMAINING_OFFERS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemainingOffersCount() <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCount()
	 * @generated
	 * @ordered
	 */
	protected int remainingOffersCount = REMAINING_OFFERS_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.FORKED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getBaseToken() {
		if (baseToken != null && baseToken.eIsProxy()) {
			InternalEObject oldBaseToken = (InternalEObject)baseToken;
			baseToken = (Token)eResolveProxy(oldBaseToken);
			if (baseToken != oldBaseToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN, oldBaseToken, baseToken));
			}
		}
		return baseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetBaseToken() {
		return baseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseToken(Token newBaseToken) {
		Token oldBaseToken = baseToken;
		baseToken = newBaseToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN, oldBaseToken, baseToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemainingOffersCount() {
		return remainingOffersCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOffersCount(int newRemainingOffersCount) {
		int oldRemainingOffersCount = remainingOffersCount;
		remainingOffersCount = newRemainingOffersCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT, oldRemainingOffersCount, remainingOffersCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
				if (resolve) return getBaseToken();
				return basicGetBaseToken();
			case ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				return getRemainingOffersCount();
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
			case ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
				setBaseToken((Token)newValue);
				return;
			case ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount((Integer)newValue);
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
			case ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
				setBaseToken((Token)null);
				return;
			case ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount(REMAINING_OFFERS_COUNT_EDEFAULT);
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
			case ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
				return baseToken != null;
			case ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
				return remainingOffersCount != REMAINING_OFFERS_COUNT_EDEFAULT;
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
		result.append(" (remainingOffersCount: ");
		result.append(remainingOffersCount);
		result.append(')');
		return result.toString();
	}

} //ForkedTokenImpl
