/**
 */
package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.Context;

import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.AcceptEventAction;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Action;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityFinalNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanBinaryExpression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanBinaryOperator;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanExpression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanUnaryExpression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanUnaryOperator;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanValue;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ControlFlow;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ControlNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ControlToken;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.DecisionNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ExecutableNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Expression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.FinalNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ForkNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ForkedToken;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.InitialNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Input;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerCalculationExpression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerCalculationOperator;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerComparisonExpression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerComparisonOperator;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerExpression;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerValue;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.IntegerVariable;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.JoinNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.MergeNode;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.NamedElement;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.OpaqueAction;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.SendSignalAction;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.SignalEvent;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Value;
import org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramPackageImpl extends EPackageImpl implements ActivitydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerCalculationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integerCalculationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integerComparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanUnaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanBinaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitydiagramPackageImpl() {
		super(eNS_URI, ActivitydiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ActivitydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitydiagramPackage init() {
		if (isInited) return (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Obtain or create and register package
		ActivitydiagramPackageImpl theActivitydiagramPackage = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitydiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActivitydiagramPackage.createPackageContents();

		// Initialize created meta-data
		theActivitydiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitydiagramPackage.eNS_URI, theActivitydiagramPackage);
		return theActivitydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Nodes() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edges() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Locals() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inputs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Trace() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_InputValuePath() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Signals() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Context() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Running() {
		return (EAttribute)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_HeldTokens() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Offers() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Guard() {
		return (EReference)controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_Expressions() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InitialValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CurrentValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_Operand2() {
		return (EReference)integerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_Operand1() {
		return (EReference)integerExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Assignee() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerCalculationExpression() {
		return integerCalculationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_Assignee() {
		return (EReference)integerCalculationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerCalculationExpression_Operator() {
		return (EAttribute)integerCalculationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpression() {
		return integerComparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_Assignee() {
		return (EReference)integerComparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerComparisonExpression_Operator() {
		return (EAttribute)integerComparisonExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpression() {
		return booleanUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_Operand() {
		return (EReference)booleanUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanUnaryExpression_Operator() {
		return (EAttribute)booleanUnaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression() {
		return booleanBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_Operand1() {
		return (EReference)booleanBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_Operand2() {
		return (EReference)booleanBinaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBinaryExpression_Operator() {
		return (EAttribute)booleanBinaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_OfferedTokens() {
		return (EReference)offerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Holder() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ExecutedNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Value() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Variable() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputValues() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlToken() {
		return controlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken() {
		return forkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_BaseToken() {
		return (EReference)forkedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_RemainingOffersCount() {
		return (EAttribute)forkedTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEvent() {
		return signalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegerCalculationOperator() {
		return integerCalculationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegerComparisonOperator() {
		return integerComparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanUnaryOperator() {
		return booleanUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanBinaryOperator() {
		return booleanBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContext() {
		return contextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactory getActivitydiagramFactory() {
		return (ActivitydiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__NODES);
		createEReference(activityEClass, ACTIVITY__EDGES);
		createEReference(activityEClass, ACTIVITY__LOCALS);
		createEReference(activityEClass, ACTIVITY__INPUTS);
		createEReference(activityEClass, ACTIVITY__TRACE);
		createEAttribute(activityEClass, ACTIVITY__INPUT_VALUE_PATH);
		createEReference(activityEClass, ACTIVITY__SIGNALS);
		createEAttribute(activityEClass, ACTIVITY__CONTEXT);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEAttribute(activityNodeEClass, ACTIVITY_NODE__RUNNING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__HELD_TOKENS);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__OFFERS);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEReference(controlFlowEClass, CONTROL_FLOW__GUARD);

		controlNodeEClass = createEClass(CONTROL_NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);

		actionEClass = createEClass(ACTION);

		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__EXPRESSIONS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		initialNodeEClass = createEClass(INITIAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);

		mergeNodeEClass = createEClass(MERGE_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__INITIAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__CURRENT_VALUE);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);

		valueEClass = createEClass(VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		expressionEClass = createEClass(EXPRESSION);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);
		createEReference(integerExpressionEClass, INTEGER_EXPRESSION__OPERAND2);
		createEReference(integerExpressionEClass, INTEGER_EXPRESSION__OPERAND1);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__ASSIGNEE);

		integerCalculationExpressionEClass = createEClass(INTEGER_CALCULATION_EXPRESSION);
		createEReference(integerCalculationExpressionEClass, INTEGER_CALCULATION_EXPRESSION__ASSIGNEE);
		createEAttribute(integerCalculationExpressionEClass, INTEGER_CALCULATION_EXPRESSION__OPERATOR);

		integerComparisonExpressionEClass = createEClass(INTEGER_COMPARISON_EXPRESSION);
		createEReference(integerComparisonExpressionEClass, INTEGER_COMPARISON_EXPRESSION__ASSIGNEE);
		createEAttribute(integerComparisonExpressionEClass, INTEGER_COMPARISON_EXPRESSION__OPERATOR);

		booleanUnaryExpressionEClass = createEClass(BOOLEAN_UNARY_EXPRESSION);
		createEReference(booleanUnaryExpressionEClass, BOOLEAN_UNARY_EXPRESSION__OPERAND);
		createEAttribute(booleanUnaryExpressionEClass, BOOLEAN_UNARY_EXPRESSION__OPERATOR);

		booleanBinaryExpressionEClass = createEClass(BOOLEAN_BINARY_EXPRESSION);
		createEReference(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__OPERAND1);
		createEReference(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__OPERAND2);
		createEAttribute(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__OPERATOR);

		offerEClass = createEClass(OFFER);
		createEReference(offerEClass, OFFER__OFFERED_TOKENS);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__HOLDER);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__EXECUTED_NODES);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VARIABLE);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUT_VALUES);

		controlTokenEClass = createEClass(CONTROL_TOKEN);

		forkedTokenEClass = createEClass(FORKED_TOKEN);
		createEReference(forkedTokenEClass, FORKED_TOKEN__BASE_TOKEN);
		createEAttribute(forkedTokenEClass, FORKED_TOKEN__REMAINING_OFFERS_COUNT);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);

		signalEClass = createEClass(SIGNAL);

		signalEventEClass = createEClass(SIGNAL_EVENT);

		// Create enums
		integerCalculationOperatorEEnum = createEEnum(INTEGER_CALCULATION_OPERATOR);
		integerComparisonOperatorEEnum = createEEnum(INTEGER_COMPARISON_OPERATOR);
		booleanUnaryOperatorEEnum = createEEnum(BOOLEAN_UNARY_OPERATOR);
		booleanBinaryOperatorEEnum = createEEnum(BOOLEAN_BINARY_OPERATOR);

		// Create data types
		contextEDataType = createEDataType(CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getNamedElement());
		activityNodeEClass.getESuperTypes().add(this.getNamedElement());
		activityEdgeEClass.getESuperTypes().add(this.getNamedElement());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		integerVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		integerValueEClass.getESuperTypes().add(this.getValue());
		integerExpressionEClass.getESuperTypes().add(this.getExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		integerCalculationExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		integerComparisonExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		booleanUnaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanBinaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		controlTokenEClass.getESuperTypes().add(this.getToken());
		forkedTokenEClass.getESuperTypes().add(this.getToken());
		sendSignalActionEClass.getESuperTypes().add(this.getAction());
		acceptEventActionEClass.getESuperTypes().add(this.getAction());
		signalEClass.getESuperTypes().add(this.getNamedElement());
		signalEventEClass.getESuperTypes().add(this.getSignal());

		// Initialize classes and features; add operations and parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Nodes(), this.getActivityNode(), this.getActivityNode_Activity(), "nodes", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Edges(), this.getActivityEdge(), null, "edges", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Locals(), this.getVariable(), null, "locals", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Inputs(), this.getVariable(), null, "inputs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Trace(), this.getTrace(), null, "trace", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_InputValuePath(), ecorePackage.getEString(), "inputValuePath", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Signals(), this.getSignal(), null, "signals", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Context(), this.getContext(), "context", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(activityEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "finish", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, null, "writeToFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, ecorePackage.getEString(), "printTrace", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(activityEClass, ecorePackage.getEInt(), "getIntegerVariableValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, ecorePackage.getEBoolean(), "getBooleanVariableValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, this.getValue(), "getVariableValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, this.getVariable(), "getVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Nodes(), "activity", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNode_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_HeldTokens(), this.getToken(), this.getToken_Holder(), "heldTokens", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(activityNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityNodeEClass, null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityNodeEClass, null, "addTokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "tokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityNodeEClass, null, "removeToken", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "token", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Offers(), this.getOffer(), null, "offers", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(activityEdgeEClass, ecorePackage.getEBoolean(), "evaluateGuard", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, null, "clearOffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, null, "sendOffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, null, "takeOfferedTokens", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, null, "transferTokens", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_Guard(), this.getBooleanVariable(), null, "guard", null, 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueAction_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(opaqueActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(initialNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activityFinalNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(forkNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(joinNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(mergeNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(decisionNodeEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_InitialValue(), this.getValue(), null, "initialValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_CurrentValue(), this.getValue(), null, "currentValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(integerVariableEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(integerVariableEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(booleanVariableEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(booleanVariableEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(expressionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerExpression_Operand2(), this.getIntegerVariable(), null, "operand2", null, 0, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerExpression_Operand1(), this.getIntegerVariable(), null, "operand1", null, 0, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Assignee(), this.getBooleanVariable(), null, "assignee", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerCalculationExpressionEClass, IntegerCalculationExpression.class, "IntegerCalculationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerCalculationExpression_Assignee(), this.getIntegerVariable(), null, "assignee", null, 1, 1, IntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerCalculationExpression_Operator(), this.getIntegerCalculationOperator(), "operator", null, 1, 1, IntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(integerCalculationExpressionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerComparisonExpressionEClass, IntegerComparisonExpression.class, "IntegerComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerComparisonExpression_Assignee(), this.getBooleanVariable(), null, "assignee", null, 1, 1, IntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerComparisonExpression_Operator(), this.getIntegerComparisonOperator(), "operator", null, 1, 1, IntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(integerComparisonExpressionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanUnaryExpressionEClass, BooleanUnaryExpression.class, "BooleanUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanUnaryExpression_Operand(), this.getBooleanVariable(), null, "operand", null, 1, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanUnaryExpression_Operator(), this.getBooleanUnaryOperator(), "operator", null, 1, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanUnaryExpressionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanBinaryExpressionEClass, BooleanBinaryExpression.class, "BooleanBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanBinaryExpression_Operand1(), this.getBooleanVariable(), null, "operand1", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_Operand2(), this.getBooleanVariable(), null, "operand2", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanBinaryExpression_Operator(), this.getBooleanBinaryOperator(), "operator", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanBinaryExpressionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_OfferedTokens(), this.getToken(), null, "offeredTokens", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Holder(), this.getActivityNode(), this.getActivityNode_HeldTokens(), "holder", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_ExecutedNodes(), this.getActivityNode(), null, "executedNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_Value(), this.getValue(), null, "value", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_Variable(), this.getVariable(), null, "variable", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_InputValues(), this.getInputValue(), null, "inputValues", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlTokenEClass, ControlToken.class, "ControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkedTokenEClass, ForkedToken.class, "ForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_BaseToken(), this.getToken(), null, "baseToken", null, 1, 1, ForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkedToken_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 1, 1, ForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignalAction_Signal(), this.getSignal(), null, "signal", null, 0, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sendSignalActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptEventAction_Trigger(), this.getSignalEvent(), null, "trigger", null, 0, 1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(acceptEventActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalEventEClass, SignalEvent.class, "SignalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(integerCalculationOperatorEEnum, IntegerCalculationOperator.class, "IntegerCalculationOperator");
		addEEnumLiteral(integerCalculationOperatorEEnum, IntegerCalculationOperator.ADD);
		addEEnumLiteral(integerCalculationOperatorEEnum, IntegerCalculationOperator.SUBRACT);

		initEEnum(integerComparisonOperatorEEnum, IntegerComparisonOperator.class, "IntegerComparisonOperator");
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.SMALLER);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.SMALLER_EQUALS);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.EQUALS);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.GREATER_EQUALS);
		addEEnumLiteral(integerComparisonOperatorEEnum, IntegerComparisonOperator.GREATER);

		initEEnum(booleanUnaryOperatorEEnum, BooleanUnaryOperator.class, "BooleanUnaryOperator");
		addEEnumLiteral(booleanUnaryOperatorEEnum, BooleanUnaryOperator.NOT);

		initEEnum(booleanBinaryOperatorEEnum, BooleanBinaryOperator.class, "BooleanBinaryOperator");
		addEEnumLiteral(booleanBinaryOperatorEEnum, BooleanBinaryOperator.AND);
		addEEnumLiteral(booleanBinaryOperatorEEnum, BooleanBinaryOperator.OR);

		// Initialize data types
		initEDataType(contextEDataType, Context.class, "Context", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (activityEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_Trace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_Context(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityNodeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityNodeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_HeldTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEdgeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEdgeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEdgeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityEdgeEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Offers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (opaqueActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (initialNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityFinalNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (forkNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (joinNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (mergeNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (decisionNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_CurrentValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerVariableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerVariableEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanVariableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanVariableEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (expressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerCalculationExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerComparisonExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanUnaryExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanBinaryExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tokenEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (inputValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (inputEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (controlTokenEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (forkedTokenEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (sendSignalActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (acceptEventActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (contextEDataType, 
		   source, 
		   new String[] {
		   });
	}

} //ActivitydiagramPackageImpl
