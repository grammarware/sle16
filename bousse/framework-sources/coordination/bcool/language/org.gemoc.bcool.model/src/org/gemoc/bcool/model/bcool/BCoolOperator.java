/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCool Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolOperator#getBcoolCompositionRules <em>Bcool Composition Rules</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolOperator#getGlobalEventExpressions <em>Global Event Expressions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolOperator#getGlobalDSEs <em>Global DS Es</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator()
 * @model
 * @generated
 */
public interface BCoolOperator extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bcool Composition Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.BCoolCompositionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcool Composition Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcool Composition Rules</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator_BcoolCompositionRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BCoolCompositionRule> getBcoolCompositionRules();

	/**
	 * Returns the value of the '<em><b>Global Event Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.EventExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Event Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Event Expressions</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator_GlobalEventExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventExpression> getGlobalEventExpressions();

	/**
	 * Returns the value of the '<em><b>Global DS Es</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global DS Es</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global DS Es</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator_GlobalDSEs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefPropertyCS> getGlobalDSEs();

} // BCoolOperator
