/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCool Composition Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getBCoolOperatorArgs <em>BCool Operator Args</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getMatchingRule <em>Matching Rule</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getCoordinationRule <em>Coordination Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolCompositionRule()
 * @model
 * @generated
 */
public interface BCoolCompositionRule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>BCool Operator Args</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.BCoolOperatorArg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BCool Operator Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BCool Operator Args</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolCompositionRule_BCoolOperatorArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<BCoolOperatorArg> getBCoolOperatorArgs();

	/**
	 * Returns the value of the '<em><b>Matching Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Rule</em>' containment reference.
	 * @see #setMatchingRule(MatchingRule)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolCompositionRule_MatchingRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MatchingRule getMatchingRule();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getMatchingRule <em>Matching Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Rule</em>' containment reference.
	 * @see #getMatchingRule()
	 * @generated
	 */
	void setMatchingRule(MatchingRule value);

	/**
	 * Returns the value of the '<em><b>Coordination Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Rule</em>' containment reference.
	 * @see #setCoordinationRule(CoordinationRule)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolCompositionRule_CoordinationRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoordinationRule getCoordinationRule();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getCoordinationRule <em>Coordination Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Rule</em>' containment reference.
	 * @see #getCoordinationRule()
	 * @generated
	 */
	void setCoordinationRule(CoordinationRule value);

} // BCoolCompositionRule
