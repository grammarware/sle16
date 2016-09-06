/**
 */
package org.gemoc.gel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unfolding Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.UnfoldingStrategy#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link org.gemoc.gel.UnfoldingStrategy#getInstantiationPredicates <em>Instantiation Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getUnfoldingStrategy()
 * @model
 * @generated
 */
public interface UnfoldingStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see org.gemoc.gel.GelPackage#getUnfoldingStrategy_LocalVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LocalVariable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Instantiation Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.InstantiationPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation Predicates</em>' containment reference list.
	 * @see org.gemoc.gel.GelPackage#getUnfoldingStrategy_InstantiationPredicates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InstantiationPredicate> getInstantiationPredicates();

} // UnfoldingStrategy
