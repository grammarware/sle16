/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Offer#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getOffer()
 * @model
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getOffer_OfferedTokens()
	 * @model
	 * @generated
	 */
	EList<Token> getOfferedTokens();

} // Offer
