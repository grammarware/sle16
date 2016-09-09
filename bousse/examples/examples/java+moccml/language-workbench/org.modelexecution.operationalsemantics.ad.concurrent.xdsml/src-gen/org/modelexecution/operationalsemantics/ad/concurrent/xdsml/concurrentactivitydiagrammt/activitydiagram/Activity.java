/**
 */
package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getInputValuePath <em>Input Value Path</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Nodes()
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocals();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Trace()
	 * @model containment="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

	/**
	 * Returns the value of the '<em><b>Input Value Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value Path</em>' attribute.
	 * @see #setInputValuePath(String)
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_InputValuePath()
	 * @model
	 * @generated
	 */
	String getInputValuePath();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getInputValuePath <em>Input Value Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Value Path</em>' attribute.
	 * @see #getInputValuePath()
	 * @generated
	 */
	void setInputValuePath(String value);

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Signals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(Context)
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Context()
	 * @model dataType="org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Context"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finish();

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
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeToFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String printTrace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getIntegerVariableValue(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean getBooleanVariableValue(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value getVariableValue(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Variable getVariable(String variableName);

} // Activity
