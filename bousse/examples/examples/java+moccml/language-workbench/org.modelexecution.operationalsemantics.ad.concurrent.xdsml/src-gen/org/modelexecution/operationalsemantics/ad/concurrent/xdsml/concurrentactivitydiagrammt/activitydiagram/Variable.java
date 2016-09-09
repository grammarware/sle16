/**
 */
package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Value)
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getVariable_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getInitialValue();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Value value);

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
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(Value)
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getVariable_CurrentValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getCurrentValue();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String print();

} // Variable
