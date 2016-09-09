/**
 */
package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Input#getInputValues <em>Input Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.InputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getInput_InputValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputValue> getInputValues();

} // Input
