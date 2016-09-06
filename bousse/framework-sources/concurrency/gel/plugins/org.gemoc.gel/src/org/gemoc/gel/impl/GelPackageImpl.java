/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.BinaryPattern;
import org.gemoc.gel.CallKind;
import org.gemoc.gel.CoincidencePattern;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.DomainSpecificEventReferenceWithArguments;
import org.gemoc.gel.DomainSpecificEventsPattern;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.ExecutionFunction;
import org.gemoc.gel.ExecutionFunctionResult;
import org.gemoc.gel.ExecutionKind;
import org.gemoc.gel.FeedbackConsequence;
import org.gemoc.gel.FeedbackFilter;
import org.gemoc.gel.FeedbackPolicy;
import org.gemoc.gel.FeedbackRule;
import org.gemoc.gel.GelFactory;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.ImportStatement;
import org.gemoc.gel.InstantiationPredicate;
import org.gemoc.gel.IterationPattern;
import org.gemoc.gel.Kermeta3ExecutionFunction;
import org.gemoc.gel.ListOfArguments;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.LogicalSequence;
import org.gemoc.gel.MoccEvent;
import org.gemoc.gel.MultipleArguments;
import org.gemoc.gel.OrPattern;
import org.gemoc.gel.PlusPattern;
import org.gemoc.gel.SingleArgument;
import org.gemoc.gel.UnaryPattern;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.Visibility;
import org.gemoc.gel.XorPattern;
import org.gemoc.gexpressions.GexpressionsPackage;

import fr.inria.aoste.timesquare.ECL.ECLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GelPackageImpl extends EPackageImpl implements GelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificEventsSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDomainSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDomainSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unfoldingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificEventsPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coincidencePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificEventReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificEventReferenceWithArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackConsequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moccEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFunctionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermeta3ExecutionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callKindEEnum = null;

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
	 * @see org.gemoc.gel.GelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GelPackageImpl() {
		super(eNS_URI, GelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GelPackage init() {
		if (isInited) return (GelPackage)EPackage.Registry.INSTANCE.getEPackage(GelPackage.eNS_URI);

		// Obtain or create and register package
		GelPackageImpl theGelPackage = (GelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ECLPackage.eINSTANCE.eClass();
		GexpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGelPackage.createPackageContents();

		// Initialize created meta-data
		theGelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GelPackage.eNS_URI, theGelPackage);
		return theGelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificEventsSpecification() {
		return domainSpecificEventsSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificEventsSpecification_Events() {
		return (EReference)domainSpecificEventsSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificEventsSpecification_Imports() {
		return (EReference)domainSpecificEventsSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportStatement() {
		return importStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportStatement_ImportURI() {
		return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificEvent() {
		return domainSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSpecificEvent_Name() {
		return (EAttribute)domainSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSpecificEvent_Visibility() {
		return (EAttribute)domainSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicDomainSpecificEvent() {
		return atomicDomainSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicDomainSpecificEvent_UponMoccEvent() {
		return (EReference)atomicDomainSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicDomainSpecificEvent_ExecutionFunction() {
		return (EReference)atomicDomainSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicDomainSpecificEvent_FeedbackPolicy() {
		return (EReference)atomicDomainSpecificEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicDomainSpecificEvent_RaisedMoccEvent() {
		return (EReference)atomicDomainSpecificEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicDomainSpecificEvent_ExecutionKind() {
		return (EAttribute)atomicDomainSpecificEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDomainSpecificEvent() {
		return compositeDomainSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDomainSpecificEvent_Body() {
		return (EReference)compositeDomainSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDomainSpecificEvent_UnfoldingStrategy() {
		return (EReference)compositeDomainSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnfoldingStrategy() {
		return unfoldingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnfoldingStrategy_LocalVariables() {
		return (EReference)unfoldingStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnfoldingStrategy_InstantiationPredicates() {
		return (EReference)unfoldingStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalVariable_Name() {
		return (EAttribute)localVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_Type() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiationPredicate() {
		return instantiationPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationPredicate_Body() {
		return (EReference)instantiationPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificEventsPattern() {
		return domainSpecificEventsPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPattern() {
		return unaryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryPattern_Operand() {
		return (EReference)unaryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryPattern() {
		return binaryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryPattern_LeftOperand() {
		return (EReference)binaryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryPattern_RightOperand() {
		return (EReference)binaryPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoincidencePattern() {
		return coincidencePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalSequence() {
		return logicalSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrPattern() {
		return orPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXorPattern() {
		return xorPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlusPattern() {
		return plusPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationPattern() {
		return iterationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationPattern_NumberOfIterations() {
		return (EAttribute)iterationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificEventReference() {
		return domainSpecificEventReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificEventReference_ReferencedDse() {
		return (EReference)domainSpecificEventReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificEventReferenceWithArguments() {
		return domainSpecificEventReferenceWithArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificEventReferenceWithArguments_Arguments() {
		return (EReference)domainSpecificEventReferenceWithArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfArguments() {
		return listOfArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleArgument() {
		return singleArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleArgument_Argument() {
		return (EReference)singleArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleArguments() {
		return multipleArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleArguments_Head() {
		return (EReference)multipleArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleArguments_Tail() {
		return (EReference)multipleArgumentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackPolicy() {
		return feedbackPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackPolicy_Rules() {
		return (EReference)feedbackPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackPolicy_DefaultRule() {
		return (EReference)feedbackPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackRule() {
		return feedbackRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackRule_Filter() {
		return (EReference)feedbackRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackRule_Consequence() {
		return (EReference)feedbackRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackFilter() {
		return feedbackFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackFilter_Body() {
		return (EReference)feedbackFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackConsequence() {
		return feedbackConsequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackConsequence_NavigationPathToMoccEvent() {
		return (EReference)feedbackConsequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoccEvent() {
		return moccEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclEvent() {
		return eclEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclEvent_EventReference() {
		return (EReference)eclEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFunctionResult() {
		return executionFunctionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionFunctionResult_Name() {
		return (EAttribute)executionFunctionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFunction() {
		return executionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFunction_Result() {
		return (EReference)executionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionFunction_CallKind() {
		return (EAttribute)executionFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermeta3ExecutionFunction() {
		return kermeta3ExecutionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermeta3ExecutionFunction_NavigationPathToOperation() {
		return (EReference)kermeta3ExecutionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionKind() {
		return executionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallKind() {
		return callKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GelFactory getGelFactory() {
		return (GelFactory)getEFactoryInstance();
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
		domainSpecificEventsSpecificationEClass = createEClass(DOMAIN_SPECIFIC_EVENTS_SPECIFICATION);
		createEReference(domainSpecificEventsSpecificationEClass, DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS);
		createEReference(domainSpecificEventsSpecificationEClass, DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS);

		importStatementEClass = createEClass(IMPORT_STATEMENT);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);

		domainSpecificEventEClass = createEClass(DOMAIN_SPECIFIC_EVENT);
		createEAttribute(domainSpecificEventEClass, DOMAIN_SPECIFIC_EVENT__NAME);
		createEAttribute(domainSpecificEventEClass, DOMAIN_SPECIFIC_EVENT__VISIBILITY);

		atomicDomainSpecificEventEClass = createEClass(ATOMIC_DOMAIN_SPECIFIC_EVENT);
		createEReference(atomicDomainSpecificEventEClass, ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT);
		createEReference(atomicDomainSpecificEventEClass, ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION);
		createEReference(atomicDomainSpecificEventEClass, ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY);
		createEReference(atomicDomainSpecificEventEClass, ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT);
		createEAttribute(atomicDomainSpecificEventEClass, ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND);

		compositeDomainSpecificEventEClass = createEClass(COMPOSITE_DOMAIN_SPECIFIC_EVENT);
		createEReference(compositeDomainSpecificEventEClass, COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY);
		createEReference(compositeDomainSpecificEventEClass, COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY);

		unfoldingStrategyEClass = createEClass(UNFOLDING_STRATEGY);
		createEReference(unfoldingStrategyEClass, UNFOLDING_STRATEGY__LOCAL_VARIABLES);
		createEReference(unfoldingStrategyEClass, UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES);

		localVariableEClass = createEClass(LOCAL_VARIABLE);
		createEAttribute(localVariableEClass, LOCAL_VARIABLE__NAME);
		createEReference(localVariableEClass, LOCAL_VARIABLE__TYPE);

		instantiationPredicateEClass = createEClass(INSTANTIATION_PREDICATE);
		createEReference(instantiationPredicateEClass, INSTANTIATION_PREDICATE__BODY);

		domainSpecificEventsPatternEClass = createEClass(DOMAIN_SPECIFIC_EVENTS_PATTERN);

		unaryPatternEClass = createEClass(UNARY_PATTERN);
		createEReference(unaryPatternEClass, UNARY_PATTERN__OPERAND);

		binaryPatternEClass = createEClass(BINARY_PATTERN);
		createEReference(binaryPatternEClass, BINARY_PATTERN__LEFT_OPERAND);
		createEReference(binaryPatternEClass, BINARY_PATTERN__RIGHT_OPERAND);

		coincidencePatternEClass = createEClass(COINCIDENCE_PATTERN);

		logicalSequenceEClass = createEClass(LOGICAL_SEQUENCE);

		orPatternEClass = createEClass(OR_PATTERN);

		xorPatternEClass = createEClass(XOR_PATTERN);

		plusPatternEClass = createEClass(PLUS_PATTERN);

		iterationPatternEClass = createEClass(ITERATION_PATTERN);
		createEAttribute(iterationPatternEClass, ITERATION_PATTERN__NUMBER_OF_ITERATIONS);

		domainSpecificEventReferenceEClass = createEClass(DOMAIN_SPECIFIC_EVENT_REFERENCE);
		createEReference(domainSpecificEventReferenceEClass, DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE);

		domainSpecificEventReferenceWithArgumentsEClass = createEClass(DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS);
		createEReference(domainSpecificEventReferenceWithArgumentsEClass, DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS__ARGUMENTS);

		listOfArgumentsEClass = createEClass(LIST_OF_ARGUMENTS);

		singleArgumentEClass = createEClass(SINGLE_ARGUMENT);
		createEReference(singleArgumentEClass, SINGLE_ARGUMENT__ARGUMENT);

		multipleArgumentsEClass = createEClass(MULTIPLE_ARGUMENTS);
		createEReference(multipleArgumentsEClass, MULTIPLE_ARGUMENTS__HEAD);
		createEReference(multipleArgumentsEClass, MULTIPLE_ARGUMENTS__TAIL);

		feedbackPolicyEClass = createEClass(FEEDBACK_POLICY);
		createEReference(feedbackPolicyEClass, FEEDBACK_POLICY__RULES);
		createEReference(feedbackPolicyEClass, FEEDBACK_POLICY__DEFAULT_RULE);

		feedbackRuleEClass = createEClass(FEEDBACK_RULE);
		createEReference(feedbackRuleEClass, FEEDBACK_RULE__FILTER);
		createEReference(feedbackRuleEClass, FEEDBACK_RULE__CONSEQUENCE);

		feedbackFilterEClass = createEClass(FEEDBACK_FILTER);
		createEReference(feedbackFilterEClass, FEEDBACK_FILTER__BODY);

		feedbackConsequenceEClass = createEClass(FEEDBACK_CONSEQUENCE);
		createEReference(feedbackConsequenceEClass, FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT);

		moccEventEClass = createEClass(MOCC_EVENT);

		eclEventEClass = createEClass(ECL_EVENT);
		createEReference(eclEventEClass, ECL_EVENT__EVENT_REFERENCE);

		executionFunctionResultEClass = createEClass(EXECUTION_FUNCTION_RESULT);
		createEAttribute(executionFunctionResultEClass, EXECUTION_FUNCTION_RESULT__NAME);

		executionFunctionEClass = createEClass(EXECUTION_FUNCTION);
		createEReference(executionFunctionEClass, EXECUTION_FUNCTION__RESULT);
		createEAttribute(executionFunctionEClass, EXECUTION_FUNCTION__CALL_KIND);

		kermeta3ExecutionFunctionEClass = createEClass(KERMETA3_EXECUTION_FUNCTION);
		createEReference(kermeta3ExecutionFunctionEClass, KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		executionKindEEnum = createEEnum(EXECUTION_KIND);
		callKindEEnum = createEEnum(CALL_KIND);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GexpressionsPackage theGexpressionsPackage = (GexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(GexpressionsPackage.eNS_URI);
		ECLPackage theECLPackage = (ECLPackage)EPackage.Registry.INSTANCE.getEPackage(ECLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomicDomainSpecificEventEClass.getESuperTypes().add(this.getDomainSpecificEvent());
		compositeDomainSpecificEventEClass.getESuperTypes().add(this.getDomainSpecificEvent());
		unaryPatternEClass.getESuperTypes().add(this.getDomainSpecificEventsPattern());
		binaryPatternEClass.getESuperTypes().add(this.getDomainSpecificEventsPattern());
		coincidencePatternEClass.getESuperTypes().add(this.getBinaryPattern());
		logicalSequenceEClass.getESuperTypes().add(this.getBinaryPattern());
		orPatternEClass.getESuperTypes().add(this.getBinaryPattern());
		xorPatternEClass.getESuperTypes().add(this.getBinaryPattern());
		plusPatternEClass.getESuperTypes().add(this.getUnaryPattern());
		iterationPatternEClass.getESuperTypes().add(this.getUnaryPattern());
		domainSpecificEventReferenceEClass.getESuperTypes().add(this.getDomainSpecificEventsPattern());
		domainSpecificEventReferenceWithArgumentsEClass.getESuperTypes().add(this.getDomainSpecificEventReference());
		singleArgumentEClass.getESuperTypes().add(this.getListOfArguments());
		multipleArgumentsEClass.getESuperTypes().add(this.getListOfArguments());
		eclEventEClass.getESuperTypes().add(this.getMoccEvent());
		kermeta3ExecutionFunctionEClass.getESuperTypes().add(this.getExecutionFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainSpecificEventsSpecificationEClass, DomainSpecificEventsSpecification.class, "DomainSpecificEventsSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainSpecificEventsSpecification_Events(), this.getDomainSpecificEvent(), null, "events", null, 0, -1, DomainSpecificEventsSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificEventsSpecification_Imports(), this.getImportStatement(), null, "imports", null, 0, -1, DomainSpecificEventsSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificEventEClass, DomainSpecificEvent.class, "DomainSpecificEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSpecificEvent_Visibility(), this.getVisibility(), "visibility", null, 1, 1, DomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicDomainSpecificEventEClass, AtomicDomainSpecificEvent.class, "AtomicDomainSpecificEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicDomainSpecificEvent_UponMoccEvent(), this.getMoccEvent(), null, "uponMoccEvent", null, 1, 1, AtomicDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDomainSpecificEvent_ExecutionFunction(), this.getExecutionFunction(), null, "executionFunction", null, 0, 1, AtomicDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDomainSpecificEvent_FeedbackPolicy(), this.getFeedbackPolicy(), null, "feedbackPolicy", null, 0, 1, AtomicDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDomainSpecificEvent_RaisedMoccEvent(), this.getMoccEvent(), null, "raisedMoccEvent", null, 0, 1, AtomicDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicDomainSpecificEvent_ExecutionKind(), this.getExecutionKind(), "executionKind", null, 0, 1, AtomicDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeDomainSpecificEventEClass, CompositeDomainSpecificEvent.class, "CompositeDomainSpecificEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDomainSpecificEvent_Body(), this.getDomainSpecificEventsPattern(), null, "body", null, 1, 1, CompositeDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeDomainSpecificEvent_UnfoldingStrategy(), this.getUnfoldingStrategy(), null, "unfoldingStrategy", null, 0, 1, CompositeDomainSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unfoldingStrategyEClass, UnfoldingStrategy.class, "UnfoldingStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnfoldingStrategy_LocalVariables(), this.getLocalVariable(), null, "localVariables", null, 1, -1, UnfoldingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnfoldingStrategy_InstantiationPredicates(), this.getInstantiationPredicate(), null, "instantiationPredicates", null, 1, -1, UnfoldingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalVariable_Type(), theEcorePackage.getEClassifier(), null, "type", null, 1, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationPredicateEClass, InstantiationPredicate.class, "InstantiationPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiationPredicate_Body(), theGexpressionsPackage.getGExpression(), null, "body", null, 1, 1, InstantiationPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificEventsPatternEClass, DomainSpecificEventsPattern.class, "DomainSpecificEventsPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryPatternEClass, UnaryPattern.class, "UnaryPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryPattern_Operand(), this.getDomainSpecificEventsPattern(), null, "operand", null, 1, 1, UnaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryPatternEClass, BinaryPattern.class, "BinaryPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryPattern_LeftOperand(), this.getDomainSpecificEventsPattern(), null, "leftOperand", null, 1, 1, BinaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryPattern_RightOperand(), this.getDomainSpecificEventsPattern(), null, "rightOperand", null, 1, 1, BinaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coincidencePatternEClass, CoincidencePattern.class, "CoincidencePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalSequenceEClass, LogicalSequence.class, "LogicalSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orPatternEClass, OrPattern.class, "OrPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorPatternEClass, XorPattern.class, "XorPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusPatternEClass, PlusPattern.class, "PlusPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationPatternEClass, IterationPattern.class, "IterationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIterationPattern_NumberOfIterations(), ecorePackage.getEIntegerObject(), "numberOfIterations", null, 1, 1, IterationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificEventReferenceEClass, DomainSpecificEventReference.class, "DomainSpecificEventReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainSpecificEventReference_ReferencedDse(), this.getDomainSpecificEvent(), null, "referencedDse", null, 1, 1, DomainSpecificEventReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificEventReferenceWithArgumentsEClass, DomainSpecificEventReferenceWithArguments.class, "DomainSpecificEventReferenceWithArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainSpecificEventReferenceWithArguments_Arguments(), this.getListOfArguments(), null, "arguments", null, 1, 1, DomainSpecificEventReferenceWithArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfArgumentsEClass, ListOfArguments.class, "ListOfArguments", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleArgumentEClass, SingleArgument.class, "SingleArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleArgument_Argument(), this.getLocalVariable(), null, "argument", null, 1, 1, SingleArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleArgumentsEClass, MultipleArguments.class, "MultipleArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleArguments_Head(), this.getLocalVariable(), null, "head", null, 1, 1, MultipleArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleArguments_Tail(), this.getListOfArguments(), null, "tail", null, 1, 1, MultipleArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackPolicyEClass, FeedbackPolicy.class, "FeedbackPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackPolicy_Rules(), this.getFeedbackRule(), null, "rules", null, 0, -1, FeedbackPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackPolicy_DefaultRule(), this.getFeedbackRule(), null, "defaultRule", null, 1, 1, FeedbackPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackRuleEClass, FeedbackRule.class, "FeedbackRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackRule_Filter(), this.getFeedbackFilter(), null, "filter", null, 0, 1, FeedbackRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackRule_Consequence(), this.getFeedbackConsequence(), null, "consequence", null, 1, 1, FeedbackRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackFilterEClass, FeedbackFilter.class, "FeedbackFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackFilter_Body(), theGexpressionsPackage.getGExpression(), null, "body", null, 1, 1, FeedbackFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackConsequenceEClass, FeedbackConsequence.class, "FeedbackConsequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackConsequence_NavigationPathToMoccEvent(), theGexpressionsPackage.getGExpression(), null, "navigationPathToMoccEvent", null, 1, 1, FeedbackConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moccEventEClass, MoccEvent.class, "MoccEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eclEventEClass, EclEvent.class, "EclEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEclEvent_EventReference(), theECLPackage.getECLDefCS(), null, "eventReference", null, 1, 1, EclEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionFunctionResultEClass, ExecutionFunctionResult.class, "ExecutionFunctionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionFunctionResult_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExecutionFunctionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionFunctionEClass, ExecutionFunction.class, "ExecutionFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionFunction_Result(), this.getExecutionFunctionResult(), null, "result", null, 0, 1, ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionFunction_CallKind(), this.getCallKind(), "callKind", null, 1, 1, ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kermeta3ExecutionFunctionEClass, Kermeta3ExecutionFunction.class, "Kermeta3ExecutionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermeta3ExecutionFunction_NavigationPathToOperation(), theGexpressionsPackage.getGExpression(), null, "navigationPathToOperation", null, 1, 1, Kermeta3ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

		initEEnum(executionKindEEnum, ExecutionKind.class, "ExecutionKind");
		addEEnumLiteral(executionKindEEnum, ExecutionKind.SUBMISSION);
		addEEnumLiteral(executionKindEEnum, ExecutionKind.INTERRUPTION);

		initEEnum(callKindEEnum, CallKind.class, "CallKind");
		addEEnumLiteral(callKindEEnum, CallKind.NON_BLOCKING);
		addEEnumLiteral(callKindEEnum, CallKind.BLOCKING);

		// Create resource
		createResource(eNS_URI);
	}

} //GelPackageImpl
