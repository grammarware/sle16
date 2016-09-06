/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCool Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolSpecification#getBcoolOperators <em>Bcool Operators</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolSpecification#getImportsLib <em>Imports Lib</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolSpecification#getImportsBehavioralInterface <em>Imports Behavioral Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolSpecification()
 * @model
 * @generated
 */
public interface BCoolSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bcool Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.BCoolOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcool Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcool Operators</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolSpecification_BcoolOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<BCoolOperator> getBcoolOperators();

	/**
	 * Returns the value of the '<em><b>Imports Lib</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.ImportLibStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Lib</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolSpecification_ImportsLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportLibStatement> getImportsLib();

	/**
	 * Returns the value of the '<em><b>Imports Behavioral Interface</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.ImportInterfaceStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Behavioral Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Behavioral Interface</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolSpecification_ImportsBehavioralInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImportInterfaceStatement> getImportsBehavioralInterface();

} // BCoolSpecification
