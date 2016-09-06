/**
 */
package org.gemoc.bflow.bFlow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bflow.bFlow.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.Model#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.Model#getOutputtimemodel <em>Outputtimemodel</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.Model#getModels <em>Models</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.Model#getBcoolflow <em>Bcoolflow</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.Model#getLaunchers <em>Launchers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.bflow.bFlow.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link org.gemoc.bflow.bFlow.Model#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Outputtimemodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputtimemodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputtimemodel</em>' attribute.
	 * @see #setOutputtimemodel(String)
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel_Outputtimemodel()
	 * @model
	 * @generated
	 */
	String getOutputtimemodel();

	/**
	 * Sets the value of the '{@link org.gemoc.bflow.bFlow.Model#getOutputtimemodel <em>Outputtimemodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputtimemodel</em>' attribute.
	 * @see #getOutputtimemodel()
	 * @generated
	 */
	void setOutputtimemodel(String value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bflow.bFlow.modelinput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<modelinput> getModels();

	/**
	 * Returns the value of the '<em><b>Bcoolflow</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bflow.bFlow.Flows}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcoolflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcoolflow</em>' containment reference list.
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel_Bcoolflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flows> getBcoolflow();

	/**
	 * Returns the value of the '<em><b>Launchers</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bflow.bFlow.Launcher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launchers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launchers</em>' containment reference list.
	 * @see org.gemoc.bflow.bFlow.BFlowPackage#getModel_Launchers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Launcher> getLaunchers();

} // Model
