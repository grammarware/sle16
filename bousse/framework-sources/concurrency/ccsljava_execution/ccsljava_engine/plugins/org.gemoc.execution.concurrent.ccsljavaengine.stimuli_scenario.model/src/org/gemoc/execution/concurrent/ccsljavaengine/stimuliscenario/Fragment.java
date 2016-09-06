/**
 */
package org.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.Fragment#getStepList <em>Step List</em>}</li>
 * </ul>
 *
 * @see org.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.ScenarioPackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends EObject {
	/**
	 * Returns the value of the '<em><b>Step List</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.ExecutionStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step List</em>' containment reference list.
	 * @see org.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.ScenarioPackage#getFragment_StepList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionStep> getStepList();

} // Fragment
