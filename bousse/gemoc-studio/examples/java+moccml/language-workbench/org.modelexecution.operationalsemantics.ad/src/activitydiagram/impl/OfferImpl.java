/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Offer;
import activitydiagram.Token;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.OfferImpl#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfferImpl extends MinimalEObjectImpl.Container implements Offer {
	/**
	 * The cached value of the '{@link #getOfferedTokens() <em>Offered Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> offeredTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getOfferedTokens() {
		if (offeredTokens == null) {
			offeredTokens = new EObjectResolvingEList<Token>(Token.class, this, ActivitydiagramPackage.OFFER__OFFERED_TOKENS);
		}
		return offeredTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
				return getOfferedTokens();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
				getOfferedTokens().clear();
				getOfferedTokens().addAll((Collection<? extends Token>)newValue);
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
			case ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
				getOfferedTokens().clear();
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
			case ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
				return offeredTokens != null && !offeredTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OfferImpl
