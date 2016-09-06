/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Specific Events Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.ModelSpecificEventsSpecification#getEvents <em>Events</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.ModelSpecificEventsSpecification#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getModelSpecificEventsSpecification()
 * @model
 * @generated
 */
public interface ModelSpecificEventsSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.microgel.ModelSpecificEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getModelSpecificEventsSpecification_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelSpecificEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.microgel.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getModelSpecificEventsSpecification_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImports();

} // ModelSpecificEventsSpecification
