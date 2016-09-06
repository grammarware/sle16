/**
 */
package org.gemoc.gel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Events Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.DomainSpecificEventsSpecification#getEvents <em>Events</em>}</li>
 *   <li>{@link org.gemoc.gel.DomainSpecificEventsSpecification#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventsSpecification()
 * @model
 * @generated
 */
public interface DomainSpecificEventsSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.DomainSpecificEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventsSpecification_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventsSpecification_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImports();

} // DomainSpecificEventsSpecification
