/**
 */
package org.gemoc.bflow.bFlow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>modelinput</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bflow.bFlow.modelinput#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.modelinput#getModeluri <em>Modeluri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bflow.bFlow.BFlowPackage#getmodelinput()
 * @model
 * @generated
 */
public interface modelinput extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getmodelinput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.bflow.bFlow.modelinput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modeluri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeluri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeluri</em>' attribute.
	 * @see #setModeluri(String)
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getmodelinput_Modeluri()
	 * @model
	 * @generated
	 */
	String getModeluri();

	/**
	 * Sets the value of the '{@link org.gemoc.bflow.bFlow.modelinput#getModeluri <em>Modeluri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeluri</em>' attribute.
	 * @see #getModeluri()
	 * @generated
	 */
	void setModeluri(String value);

} // modelinput
