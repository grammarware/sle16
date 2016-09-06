/**
 */
package org.gemoc.gel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.gel.GelFactory
 * @model kind="package"
 * @generated
 */
public interface GelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/gel/GEL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GelPackage eINSTANCE = org.gemoc.gel.impl.GelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.DomainSpecificEventsSpecificationImpl <em>Domain Specific Events Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.DomainSpecificEventsSpecificationImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventsSpecification()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_EVENTS_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Domain Specific Events Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENTS_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Specific Events Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENTS_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.ImportStatementImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.DomainSpecificEventImpl <em>Domain Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.DomainSpecificEventImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEvent()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT__VISIBILITY = 1;

	/**
	 * The number of structural features of the '<em>Domain Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl <em>Atomic Domain Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.AtomicDomainSpecificEventImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getAtomicDomainSpecificEvent()
	 * @generated
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__NAME = DOMAIN_SPECIFIC_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__VISIBILITY = DOMAIN_SPECIFIC_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Upon Mocc Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feedback Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Raised Mocc Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Execution Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Atomic Domain Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Atomic Domain Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DOMAIN_SPECIFIC_EVENT_OPERATION_COUNT = DOMAIN_SPECIFIC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.CompositeDomainSpecificEventImpl <em>Composite Domain Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.CompositeDomainSpecificEventImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getCompositeDomainSpecificEvent()
	 * @generated
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT__NAME = DOMAIN_SPECIFIC_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT__VISIBILITY = DOMAIN_SPECIFIC_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unfolding Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Domain Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT = DOMAIN_SPECIFIC_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Domain Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DOMAIN_SPECIFIC_EVENT_OPERATION_COUNT = DOMAIN_SPECIFIC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.UnfoldingStrategyImpl <em>Unfolding Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.UnfoldingStrategyImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getUnfoldingStrategy()
	 * @generated
	 */
	int UNFOLDING_STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFOLDING_STRATEGY__LOCAL_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Instantiation Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES = 1;

	/**
	 * The number of structural features of the '<em>Unfolding Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFOLDING_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unfolding Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFOLDING_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.LocalVariableImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.InstantiationPredicateImpl <em>Instantiation Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.InstantiationPredicateImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getInstantiationPredicate()
	 * @generated
	 */
	int INSTANTIATION_PREDICATE = 7;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_PREDICATE__BODY = 0;

	/**
	 * The number of structural features of the '<em>Instantiation Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instantiation Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.DomainSpecificEventsPatternImpl <em>Domain Specific Events Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.DomainSpecificEventsPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventsPattern()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_EVENTS_PATTERN = 8;

	/**
	 * The number of structural features of the '<em>Domain Specific Events Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Domain Specific Events Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.UnaryPatternImpl <em>Unary Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.UnaryPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getUnaryPattern()
	 * @generated
	 */
	int UNARY_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN__OPERAND = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN_FEATURE_COUNT = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN_OPERATION_COUNT = DOMAIN_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.BinaryPatternImpl <em>Binary Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.BinaryPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getBinaryPattern()
	 * @generated
	 */
	int BINARY_PATTERN = 10;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN__LEFT_OPERAND = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN__RIGHT_OPERAND = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN_FEATURE_COUNT = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN_OPERATION_COUNT = DOMAIN_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.CoincidencePatternImpl <em>Coincidence Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.CoincidencePatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getCoincidencePattern()
	 * @generated
	 */
	int COINCIDENCE_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COINCIDENCE_PATTERN__LEFT_OPERAND = BINARY_PATTERN__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COINCIDENCE_PATTERN__RIGHT_OPERAND = BINARY_PATTERN__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Coincidence Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COINCIDENCE_PATTERN_FEATURE_COUNT = BINARY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coincidence Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COINCIDENCE_PATTERN_OPERATION_COUNT = BINARY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.LogicalSequenceImpl <em>Logical Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.LogicalSequenceImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getLogicalSequence()
	 * @generated
	 */
	int LOGICAL_SEQUENCE = 12;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SEQUENCE__LEFT_OPERAND = BINARY_PATTERN__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SEQUENCE__RIGHT_OPERAND = BINARY_PATTERN__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Logical Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SEQUENCE_FEATURE_COUNT = BINARY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_SEQUENCE_OPERATION_COUNT = BINARY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.OrPatternImpl <em>Or Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.OrPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getOrPattern()
	 * @generated
	 */
	int OR_PATTERN = 13;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PATTERN__LEFT_OPERAND = BINARY_PATTERN__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PATTERN__RIGHT_OPERAND = BINARY_PATTERN__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Or Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PATTERN_FEATURE_COUNT = BINARY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PATTERN_OPERATION_COUNT = BINARY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.XorPatternImpl <em>Xor Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.XorPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getXorPattern()
	 * @generated
	 */
	int XOR_PATTERN = 14;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_PATTERN__LEFT_OPERAND = BINARY_PATTERN__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_PATTERN__RIGHT_OPERAND = BINARY_PATTERN__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Xor Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_PATTERN_FEATURE_COUNT = BINARY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_PATTERN_OPERATION_COUNT = BINARY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.PlusPatternImpl <em>Plus Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.PlusPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getPlusPattern()
	 * @generated
	 */
	int PLUS_PATTERN = 15;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PATTERN__OPERAND = UNARY_PATTERN__OPERAND;

	/**
	 * The number of structural features of the '<em>Plus Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PATTERN_FEATURE_COUNT = UNARY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PATTERN_OPERATION_COUNT = UNARY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.IterationPatternImpl <em>Iteration Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.IterationPatternImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getIterationPattern()
	 * @generated
	 */
	int ITERATION_PATTERN = 16;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_PATTERN__OPERAND = UNARY_PATTERN__OPERAND;

	/**
	 * The feature id for the '<em><b>Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_PATTERN__NUMBER_OF_ITERATIONS = UNARY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iteration Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_PATTERN_FEATURE_COUNT = UNARY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iteration Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_PATTERN_OPERATION_COUNT = UNARY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.DomainSpecificEventReferenceImpl <em>Domain Specific Event Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.DomainSpecificEventReferenceImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventReference()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Referenced Dse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Specific Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_FEATURE_COUNT = DOMAIN_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Specific Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_OPERATION_COUNT = DOMAIN_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.DomainSpecificEventReferenceWithArgumentsImpl <em>Domain Specific Event Reference With Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.DomainSpecificEventReferenceWithArgumentsImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventReferenceWithArguments()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS = 18;

	/**
	 * The feature id for the '<em><b>Referenced Dse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS__REFERENCED_DSE = DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS__ARGUMENTS = DOMAIN_SPECIFIC_EVENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Specific Event Reference With Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS_FEATURE_COUNT = DOMAIN_SPECIFIC_EVENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Specific Event Reference With Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS_OPERATION_COUNT = DOMAIN_SPECIFIC_EVENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.ListOfArgumentsImpl <em>List Of Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.ListOfArgumentsImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getListOfArguments()
	 * @generated
	 */
	int LIST_OF_ARGUMENTS = 19;

	/**
	 * The number of structural features of the '<em>List Of Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ARGUMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Of Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.SingleArgumentImpl <em>Single Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.SingleArgumentImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getSingleArgument()
	 * @generated
	 */
	int SINGLE_ARGUMENT = 20;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ARGUMENT__ARGUMENT = LIST_OF_ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ARGUMENT_FEATURE_COUNT = LIST_OF_ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ARGUMENT_OPERATION_COUNT = LIST_OF_ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.MultipleArgumentsImpl <em>Multiple Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.MultipleArgumentsImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getMultipleArguments()
	 * @generated
	 */
	int MULTIPLE_ARGUMENTS = 21;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ARGUMENTS__HEAD = LIST_OF_ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ARGUMENTS__TAIL = LIST_OF_ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ARGUMENTS_FEATURE_COUNT = LIST_OF_ARGUMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ARGUMENTS_OPERATION_COUNT = LIST_OF_ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.FeedbackPolicyImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackPolicy()
	 * @generated
	 */
	int FEEDBACK_POLICY = 22;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY__RULES = 0;

	/**
	 * The feature id for the '<em><b>Default Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY__DEFAULT_RULE = 1;

	/**
	 * The number of structural features of the '<em>Feedback Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feedback Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.FeedbackRuleImpl <em>Feedback Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.FeedbackRuleImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackRule()
	 * @generated
	 */
	int FEEDBACK_RULE = 23;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_RULE__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_RULE__CONSEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Feedback Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feedback Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.FeedbackFilterImpl <em>Feedback Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.FeedbackFilterImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackFilter()
	 * @generated
	 */
	int FEEDBACK_FILTER = 24;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FILTER__BODY = 0;

	/**
	 * The number of structural features of the '<em>Feedback Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feedback Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.FeedbackConsequenceImpl <em>Feedback Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.FeedbackConsequenceImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackConsequence()
	 * @generated
	 */
	int FEEDBACK_CONSEQUENCE = 25;

	/**
	 * The feature id for the '<em><b>Navigation Path To Mocc Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Feedback Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONSEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feedback Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONSEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.MoccEventImpl <em>Mocc Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.MoccEventImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getMoccEvent()
	 * @generated
	 */
	int MOCC_EVENT = 26;

	/**
	 * The number of structural features of the '<em>Mocc Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCC_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mocc Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCC_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.EclEventImpl <em>Ecl Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.EclEventImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getEclEvent()
	 * @generated
	 */
	int ECL_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Event Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT__EVENT_REFERENCE = MOCC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_FEATURE_COUNT = MOCC_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecl Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_OPERATION_COUNT = MOCC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.ExecutionFunctionResultImpl <em>Execution Function Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.ExecutionFunctionResultImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getExecutionFunctionResult()
	 * @generated
	 */
	int EXECUTION_FUNCTION_RESULT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION_RESULT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Execution Function Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION_RESULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution Function Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.ExecutionFunctionImpl <em>Execution Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.ExecutionFunctionImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getExecutionFunction()
	 * @generated
	 */
	int EXECUTION_FUNCTION = 29;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Call Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION__CALL_KIND = 1;

	/**
	 * The number of structural features of the '<em>Execution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Execution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.impl.Kermeta3ExecutionFunctionImpl <em>Kermeta3 Execution Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.impl.Kermeta3ExecutionFunctionImpl
	 * @see org.gemoc.gel.impl.GelPackageImpl#getKermeta3ExecutionFunction()
	 * @generated
	 */
	int KERMETA3_EXECUTION_FUNCTION = 30;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION__RESULT = EXECUTION_FUNCTION__RESULT;

	/**
	 * The feature id for the '<em><b>Call Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION__CALL_KIND = EXECUTION_FUNCTION__CALL_KIND;

	/**
	 * The feature id for the '<em><b>Navigation Path To Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION = EXECUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kermeta3 Execution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION_FEATURE_COUNT = EXECUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kermeta3 Execution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION_OPERATION_COUNT = EXECUTION_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.gemoc.gel.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.Visibility
	 * @see org.gemoc.gel.impl.GelPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 31;


	/**
	 * The meta object id for the '{@link org.gemoc.gel.ExecutionKind <em>Execution Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.ExecutionKind
	 * @see org.gemoc.gel.impl.GelPackageImpl#getExecutionKind()
	 * @generated
	 */
	int EXECUTION_KIND = 32;


	/**
	 * The meta object id for the '{@link org.gemoc.gel.CallKind <em>Call Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.CallKind
	 * @see org.gemoc.gel.impl.GelPackageImpl#getCallKind()
	 * @generated
	 */
	int CALL_KIND = 33;


	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.DomainSpecificEventsSpecification <em>Domain Specific Events Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Events Specification</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventsSpecification
	 * @generated
	 */
	EClass getDomainSpecificEventsSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.DomainSpecificEventsSpecification#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventsSpecification#getEvents()
	 * @see #getDomainSpecificEventsSpecification()
	 * @generated
	 */
	EReference getDomainSpecificEventsSpecification_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.DomainSpecificEventsSpecification#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventsSpecification#getImports()
	 * @see #getDomainSpecificEventsSpecification()
	 * @generated
	 */
	EReference getDomainSpecificEventsSpecification_Imports();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.gemoc.gel.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.ImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.gemoc.gel.ImportStatement#getImportURI()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.DomainSpecificEvent <em>Domain Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Event</em>'.
	 * @see org.gemoc.gel.DomainSpecificEvent
	 * @generated
	 */
	EClass getDomainSpecificEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.DomainSpecificEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.gel.DomainSpecificEvent#getName()
	 * @see #getDomainSpecificEvent()
	 * @generated
	 */
	EAttribute getDomainSpecificEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.DomainSpecificEvent#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.gemoc.gel.DomainSpecificEvent#getVisibility()
	 * @see #getDomainSpecificEvent()
	 * @generated
	 */
	EAttribute getDomainSpecificEvent_Visibility();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.AtomicDomainSpecificEvent <em>Atomic Domain Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Domain Specific Event</em>'.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent
	 * @generated
	 */
	EClass getAtomicDomainSpecificEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getUponMoccEvent <em>Upon Mocc Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upon Mocc Event</em>'.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent#getUponMoccEvent()
	 * @see #getAtomicDomainSpecificEvent()
	 * @generated
	 */
	EReference getAtomicDomainSpecificEvent_UponMoccEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionFunction <em>Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Function</em>'.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionFunction()
	 * @see #getAtomicDomainSpecificEvent()
	 * @generated
	 */
	EReference getAtomicDomainSpecificEvent_ExecutionFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getFeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback Policy</em>'.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent#getFeedbackPolicy()
	 * @see #getAtomicDomainSpecificEvent()
	 * @generated
	 */
	EReference getAtomicDomainSpecificEvent_FeedbackPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getRaisedMoccEvent <em>Raised Mocc Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raised Mocc Event</em>'.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent#getRaisedMoccEvent()
	 * @see #getAtomicDomainSpecificEvent()
	 * @generated
	 */
	EReference getAtomicDomainSpecificEvent_RaisedMoccEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionKind <em>Execution Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Kind</em>'.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent#getExecutionKind()
	 * @see #getAtomicDomainSpecificEvent()
	 * @generated
	 */
	EAttribute getAtomicDomainSpecificEvent_ExecutionKind();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.CompositeDomainSpecificEvent <em>Composite Domain Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Domain Specific Event</em>'.
	 * @see org.gemoc.gel.CompositeDomainSpecificEvent
	 * @generated
	 */
	EClass getCompositeDomainSpecificEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.CompositeDomainSpecificEvent#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.gemoc.gel.CompositeDomainSpecificEvent#getBody()
	 * @see #getCompositeDomainSpecificEvent()
	 * @generated
	 */
	EReference getCompositeDomainSpecificEvent_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.CompositeDomainSpecificEvent#getUnfoldingStrategy <em>Unfolding Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unfolding Strategy</em>'.
	 * @see org.gemoc.gel.CompositeDomainSpecificEvent#getUnfoldingStrategy()
	 * @see #getCompositeDomainSpecificEvent()
	 * @generated
	 */
	EReference getCompositeDomainSpecificEvent_UnfoldingStrategy();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.UnfoldingStrategy <em>Unfolding Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unfolding Strategy</em>'.
	 * @see org.gemoc.gel.UnfoldingStrategy
	 * @generated
	 */
	EClass getUnfoldingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.UnfoldingStrategy#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see org.gemoc.gel.UnfoldingStrategy#getLocalVariables()
	 * @see #getUnfoldingStrategy()
	 * @generated
	 */
	EReference getUnfoldingStrategy_LocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.UnfoldingStrategy#getInstantiationPredicates <em>Instantiation Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instantiation Predicates</em>'.
	 * @see org.gemoc.gel.UnfoldingStrategy#getInstantiationPredicates()
	 * @see #getUnfoldingStrategy()
	 * @generated
	 */
	EReference getUnfoldingStrategy_InstantiationPredicates();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see org.gemoc.gel.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.LocalVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.gel.LocalVariable#getName()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.LocalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gemoc.gel.LocalVariable#getType()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.InstantiationPredicate <em>Instantiation Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Predicate</em>'.
	 * @see org.gemoc.gel.InstantiationPredicate
	 * @generated
	 */
	EClass getInstantiationPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.InstantiationPredicate#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.gemoc.gel.InstantiationPredicate#getBody()
	 * @see #getInstantiationPredicate()
	 * @generated
	 */
	EReference getInstantiationPredicate_Body();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.DomainSpecificEventsPattern <em>Domain Specific Events Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Events Pattern</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventsPattern
	 * @generated
	 */
	EClass getDomainSpecificEventsPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.UnaryPattern <em>Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Pattern</em>'.
	 * @see org.gemoc.gel.UnaryPattern
	 * @generated
	 */
	EClass getUnaryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.UnaryPattern#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.gel.UnaryPattern#getOperand()
	 * @see #getUnaryPattern()
	 * @generated
	 */
	EReference getUnaryPattern_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.BinaryPattern <em>Binary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Pattern</em>'.
	 * @see org.gemoc.gel.BinaryPattern
	 * @generated
	 */
	EClass getBinaryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.BinaryPattern#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.gemoc.gel.BinaryPattern#getLeftOperand()
	 * @see #getBinaryPattern()
	 * @generated
	 */
	EReference getBinaryPattern_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.BinaryPattern#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.gemoc.gel.BinaryPattern#getRightOperand()
	 * @see #getBinaryPattern()
	 * @generated
	 */
	EReference getBinaryPattern_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.CoincidencePattern <em>Coincidence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coincidence Pattern</em>'.
	 * @see org.gemoc.gel.CoincidencePattern
	 * @generated
	 */
	EClass getCoincidencePattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.LogicalSequence <em>Logical Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Sequence</em>'.
	 * @see org.gemoc.gel.LogicalSequence
	 * @generated
	 */
	EClass getLogicalSequence();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.OrPattern <em>Or Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Pattern</em>'.
	 * @see org.gemoc.gel.OrPattern
	 * @generated
	 */
	EClass getOrPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.XorPattern <em>Xor Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Pattern</em>'.
	 * @see org.gemoc.gel.XorPattern
	 * @generated
	 */
	EClass getXorPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.PlusPattern <em>Plus Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Pattern</em>'.
	 * @see org.gemoc.gel.PlusPattern
	 * @generated
	 */
	EClass getPlusPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.IterationPattern <em>Iteration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Pattern</em>'.
	 * @see org.gemoc.gel.IterationPattern
	 * @generated
	 */
	EClass getIterationPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.IterationPattern#getNumberOfIterations <em>Number Of Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Iterations</em>'.
	 * @see org.gemoc.gel.IterationPattern#getNumberOfIterations()
	 * @see #getIterationPattern()
	 * @generated
	 */
	EAttribute getIterationPattern_NumberOfIterations();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.DomainSpecificEventReference <em>Domain Specific Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Event Reference</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventReference
	 * @generated
	 */
	EClass getDomainSpecificEventReference();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.DomainSpecificEventReference#getReferencedDse <em>Referenced Dse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Dse</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventReference#getReferencedDse()
	 * @see #getDomainSpecificEventReference()
	 * @generated
	 */
	EReference getDomainSpecificEventReference_ReferencedDse();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.DomainSpecificEventReferenceWithArguments <em>Domain Specific Event Reference With Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Event Reference With Arguments</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventReferenceWithArguments
	 * @generated
	 */
	EClass getDomainSpecificEventReferenceWithArguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.DomainSpecificEventReferenceWithArguments#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see org.gemoc.gel.DomainSpecificEventReferenceWithArguments#getArguments()
	 * @see #getDomainSpecificEventReferenceWithArguments()
	 * @generated
	 */
	EReference getDomainSpecificEventReferenceWithArguments_Arguments();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.ListOfArguments <em>List Of Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Arguments</em>'.
	 * @see org.gemoc.gel.ListOfArguments
	 * @generated
	 */
	EClass getListOfArguments();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.SingleArgument <em>Single Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Argument</em>'.
	 * @see org.gemoc.gel.SingleArgument
	 * @generated
	 */
	EClass getSingleArgument();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.SingleArgument#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see org.gemoc.gel.SingleArgument#getArgument()
	 * @see #getSingleArgument()
	 * @generated
	 */
	EReference getSingleArgument_Argument();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.MultipleArguments <em>Multiple Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Arguments</em>'.
	 * @see org.gemoc.gel.MultipleArguments
	 * @generated
	 */
	EClass getMultipleArguments();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.MultipleArguments#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head</em>'.
	 * @see org.gemoc.gel.MultipleArguments#getHead()
	 * @see #getMultipleArguments()
	 * @generated
	 */
	EReference getMultipleArguments_Head();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.MultipleArguments#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see org.gemoc.gel.MultipleArguments#getTail()
	 * @see #getMultipleArguments()
	 * @generated
	 */
	EReference getMultipleArguments_Tail();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Policy</em>'.
	 * @see org.gemoc.gel.FeedbackPolicy
	 * @generated
	 */
	EClass getFeedbackPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.FeedbackPolicy#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.gemoc.gel.FeedbackPolicy#getRules()
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	EReference getFeedbackPolicy_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.FeedbackPolicy#getDefaultRule <em>Default Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Rule</em>'.
	 * @see org.gemoc.gel.FeedbackPolicy#getDefaultRule()
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	EReference getFeedbackPolicy_DefaultRule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.FeedbackRule <em>Feedback Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Rule</em>'.
	 * @see org.gemoc.gel.FeedbackRule
	 * @generated
	 */
	EClass getFeedbackRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.FeedbackRule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.gemoc.gel.FeedbackRule#getFilter()
	 * @see #getFeedbackRule()
	 * @generated
	 */
	EReference getFeedbackRule_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.FeedbackRule#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequence</em>'.
	 * @see org.gemoc.gel.FeedbackRule#getConsequence()
	 * @see #getFeedbackRule()
	 * @generated
	 */
	EReference getFeedbackRule_Consequence();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.FeedbackFilter <em>Feedback Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Filter</em>'.
	 * @see org.gemoc.gel.FeedbackFilter
	 * @generated
	 */
	EClass getFeedbackFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.FeedbackFilter#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.gemoc.gel.FeedbackFilter#getBody()
	 * @see #getFeedbackFilter()
	 * @generated
	 */
	EReference getFeedbackFilter_Body();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.FeedbackConsequence <em>Feedback Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Consequence</em>'.
	 * @see org.gemoc.gel.FeedbackConsequence
	 * @generated
	 */
	EClass getFeedbackConsequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.FeedbackConsequence#getNavigationPathToMoccEvent <em>Navigation Path To Mocc Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation Path To Mocc Event</em>'.
	 * @see org.gemoc.gel.FeedbackConsequence#getNavigationPathToMoccEvent()
	 * @see #getFeedbackConsequence()
	 * @generated
	 */
	EReference getFeedbackConsequence_NavigationPathToMoccEvent();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.MoccEvent <em>Mocc Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mocc Event</em>'.
	 * @see org.gemoc.gel.MoccEvent
	 * @generated
	 */
	EClass getMoccEvent();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.EclEvent <em>Ecl Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Event</em>'.
	 * @see org.gemoc.gel.EclEvent
	 * @generated
	 */
	EClass getEclEvent();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.EclEvent#getEventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Reference</em>'.
	 * @see org.gemoc.gel.EclEvent#getEventReference()
	 * @see #getEclEvent()
	 * @generated
	 */
	EReference getEclEvent_EventReference();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.ExecutionFunctionResult <em>Execution Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Function Result</em>'.
	 * @see org.gemoc.gel.ExecutionFunctionResult
	 * @generated
	 */
	EClass getExecutionFunctionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.ExecutionFunctionResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.gel.ExecutionFunctionResult#getName()
	 * @see #getExecutionFunctionResult()
	 * @generated
	 */
	EAttribute getExecutionFunctionResult_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.ExecutionFunction <em>Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Function</em>'.
	 * @see org.gemoc.gel.ExecutionFunction
	 * @generated
	 */
	EClass getExecutionFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.ExecutionFunction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.gemoc.gel.ExecutionFunction#getResult()
	 * @see #getExecutionFunction()
	 * @generated
	 */
	EReference getExecutionFunction_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.ExecutionFunction#getCallKind <em>Call Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Kind</em>'.
	 * @see org.gemoc.gel.ExecutionFunction#getCallKind()
	 * @see #getExecutionFunction()
	 * @generated
	 */
	EAttribute getExecutionFunction_CallKind();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.Kermeta3ExecutionFunction <em>Kermeta3 Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta3 Execution Function</em>'.
	 * @see org.gemoc.gel.Kermeta3ExecutionFunction
	 * @generated
	 */
	EClass getKermeta3ExecutionFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.Kermeta3ExecutionFunction#getNavigationPathToOperation <em>Navigation Path To Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation Path To Operation</em>'.
	 * @see org.gemoc.gel.Kermeta3ExecutionFunction#getNavigationPathToOperation()
	 * @see #getKermeta3ExecutionFunction()
	 * @generated
	 */
	EReference getKermeta3ExecutionFunction_NavigationPathToOperation();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.gel.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.gemoc.gel.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.gel.ExecutionKind <em>Execution Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Kind</em>'.
	 * @see org.gemoc.gel.ExecutionKind
	 * @generated
	 */
	EEnum getExecutionKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.gel.CallKind <em>Call Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Kind</em>'.
	 * @see org.gemoc.gel.CallKind
	 * @generated
	 */
	EEnum getCallKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GelFactory getGelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.DomainSpecificEventsSpecificationImpl <em>Domain Specific Events Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.DomainSpecificEventsSpecificationImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventsSpecification()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_EVENTS_SPECIFICATION = eINSTANCE.getDomainSpecificEventsSpecification();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS = eINSTANCE.getDomainSpecificEventsSpecification_Events();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS = eINSTANCE.getDomainSpecificEventsSpecification_Imports();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.ImportStatementImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__IMPORT_URI = eINSTANCE.getImportStatement_ImportURI();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.DomainSpecificEventImpl <em>Domain Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.DomainSpecificEventImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEvent()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_EVENT = eINSTANCE.getDomainSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_EVENT__NAME = eINSTANCE.getDomainSpecificEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_EVENT__VISIBILITY = eINSTANCE.getDomainSpecificEvent_Visibility();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.AtomicDomainSpecificEventImpl <em>Atomic Domain Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.AtomicDomainSpecificEventImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getAtomicDomainSpecificEvent()
		 * @generated
		 */
		EClass ATOMIC_DOMAIN_SPECIFIC_EVENT = eINSTANCE.getAtomicDomainSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Upon Mocc Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DOMAIN_SPECIFIC_EVENT__UPON_MOCC_EVENT = eINSTANCE.getAtomicDomainSpecificEvent_UponMoccEvent();

		/**
		 * The meta object literal for the '<em><b>Execution Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_FUNCTION = eINSTANCE.getAtomicDomainSpecificEvent_ExecutionFunction();

		/**
		 * The meta object literal for the '<em><b>Feedback Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DOMAIN_SPECIFIC_EVENT__FEEDBACK_POLICY = eINSTANCE.getAtomicDomainSpecificEvent_FeedbackPolicy();

		/**
		 * The meta object literal for the '<em><b>Raised Mocc Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DOMAIN_SPECIFIC_EVENT__RAISED_MOCC_EVENT = eINSTANCE.getAtomicDomainSpecificEvent_RaisedMoccEvent();

		/**
		 * The meta object literal for the '<em><b>Execution Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DOMAIN_SPECIFIC_EVENT__EXECUTION_KIND = eINSTANCE.getAtomicDomainSpecificEvent_ExecutionKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.CompositeDomainSpecificEventImpl <em>Composite Domain Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.CompositeDomainSpecificEventImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getCompositeDomainSpecificEvent()
		 * @generated
		 */
		EClass COMPOSITE_DOMAIN_SPECIFIC_EVENT = eINSTANCE.getCompositeDomainSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DOMAIN_SPECIFIC_EVENT__BODY = eINSTANCE.getCompositeDomainSpecificEvent_Body();

		/**
		 * The meta object literal for the '<em><b>Unfolding Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DOMAIN_SPECIFIC_EVENT__UNFOLDING_STRATEGY = eINSTANCE.getCompositeDomainSpecificEvent_UnfoldingStrategy();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.UnfoldingStrategyImpl <em>Unfolding Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.UnfoldingStrategyImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getUnfoldingStrategy()
		 * @generated
		 */
		EClass UNFOLDING_STRATEGY = eINSTANCE.getUnfoldingStrategy();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNFOLDING_STRATEGY__LOCAL_VARIABLES = eINSTANCE.getUnfoldingStrategy_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Instantiation Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES = eINSTANCE.getUnfoldingStrategy_InstantiationPredicates();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.LocalVariableImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__NAME = eINSTANCE.getLocalVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__TYPE = eINSTANCE.getLocalVariable_Type();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.InstantiationPredicateImpl <em>Instantiation Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.InstantiationPredicateImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getInstantiationPredicate()
		 * @generated
		 */
		EClass INSTANTIATION_PREDICATE = eINSTANCE.getInstantiationPredicate();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_PREDICATE__BODY = eINSTANCE.getInstantiationPredicate_Body();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.DomainSpecificEventsPatternImpl <em>Domain Specific Events Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.DomainSpecificEventsPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventsPattern()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_EVENTS_PATTERN = eINSTANCE.getDomainSpecificEventsPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.UnaryPatternImpl <em>Unary Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.UnaryPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getUnaryPattern()
		 * @generated
		 */
		EClass UNARY_PATTERN = eINSTANCE.getUnaryPattern();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_PATTERN__OPERAND = eINSTANCE.getUnaryPattern_Operand();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.BinaryPatternImpl <em>Binary Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.BinaryPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getBinaryPattern()
		 * @generated
		 */
		EClass BINARY_PATTERN = eINSTANCE.getBinaryPattern();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PATTERN__LEFT_OPERAND = eINSTANCE.getBinaryPattern_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PATTERN__RIGHT_OPERAND = eINSTANCE.getBinaryPattern_RightOperand();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.CoincidencePatternImpl <em>Coincidence Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.CoincidencePatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getCoincidencePattern()
		 * @generated
		 */
		EClass COINCIDENCE_PATTERN = eINSTANCE.getCoincidencePattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.LogicalSequenceImpl <em>Logical Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.LogicalSequenceImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getLogicalSequence()
		 * @generated
		 */
		EClass LOGICAL_SEQUENCE = eINSTANCE.getLogicalSequence();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.OrPatternImpl <em>Or Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.OrPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getOrPattern()
		 * @generated
		 */
		EClass OR_PATTERN = eINSTANCE.getOrPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.XorPatternImpl <em>Xor Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.XorPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getXorPattern()
		 * @generated
		 */
		EClass XOR_PATTERN = eINSTANCE.getXorPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.PlusPatternImpl <em>Plus Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.PlusPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getPlusPattern()
		 * @generated
		 */
		EClass PLUS_PATTERN = eINSTANCE.getPlusPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.IterationPatternImpl <em>Iteration Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.IterationPatternImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getIterationPattern()
		 * @generated
		 */
		EClass ITERATION_PATTERN = eINSTANCE.getIterationPattern();

		/**
		 * The meta object literal for the '<em><b>Number Of Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_PATTERN__NUMBER_OF_ITERATIONS = eINSTANCE.getIterationPattern_NumberOfIterations();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.DomainSpecificEventReferenceImpl <em>Domain Specific Event Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.DomainSpecificEventReferenceImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventReference()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_EVENT_REFERENCE = eINSTANCE.getDomainSpecificEventReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Dse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE = eINSTANCE.getDomainSpecificEventReference_ReferencedDse();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.DomainSpecificEventReferenceWithArgumentsImpl <em>Domain Specific Event Reference With Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.DomainSpecificEventReferenceWithArgumentsImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getDomainSpecificEventReferenceWithArguments()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS = eINSTANCE.getDomainSpecificEventReferenceWithArguments();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS__ARGUMENTS = eINSTANCE.getDomainSpecificEventReferenceWithArguments_Arguments();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.ListOfArgumentsImpl <em>List Of Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.ListOfArgumentsImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getListOfArguments()
		 * @generated
		 */
		EClass LIST_OF_ARGUMENTS = eINSTANCE.getListOfArguments();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.SingleArgumentImpl <em>Single Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.SingleArgumentImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getSingleArgument()
		 * @generated
		 */
		EClass SINGLE_ARGUMENT = eINSTANCE.getSingleArgument();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ARGUMENT__ARGUMENT = eINSTANCE.getSingleArgument_Argument();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.MultipleArgumentsImpl <em>Multiple Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.MultipleArgumentsImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getMultipleArguments()
		 * @generated
		 */
		EClass MULTIPLE_ARGUMENTS = eINSTANCE.getMultipleArguments();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ARGUMENTS__HEAD = eINSTANCE.getMultipleArguments_Head();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ARGUMENTS__TAIL = eINSTANCE.getMultipleArguments_Tail();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.FeedbackPolicyImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackPolicy()
		 * @generated
		 */
		EClass FEEDBACK_POLICY = eINSTANCE.getFeedbackPolicy();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_POLICY__RULES = eINSTANCE.getFeedbackPolicy_Rules();

		/**
		 * The meta object literal for the '<em><b>Default Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_POLICY__DEFAULT_RULE = eINSTANCE.getFeedbackPolicy_DefaultRule();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.FeedbackRuleImpl <em>Feedback Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.FeedbackRuleImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackRule()
		 * @generated
		 */
		EClass FEEDBACK_RULE = eINSTANCE.getFeedbackRule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_RULE__FILTER = eINSTANCE.getFeedbackRule_Filter();

		/**
		 * The meta object literal for the '<em><b>Consequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_RULE__CONSEQUENCE = eINSTANCE.getFeedbackRule_Consequence();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.FeedbackFilterImpl <em>Feedback Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.FeedbackFilterImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackFilter()
		 * @generated
		 */
		EClass FEEDBACK_FILTER = eINSTANCE.getFeedbackFilter();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_FILTER__BODY = eINSTANCE.getFeedbackFilter_Body();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.FeedbackConsequenceImpl <em>Feedback Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.FeedbackConsequenceImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getFeedbackConsequence()
		 * @generated
		 */
		EClass FEEDBACK_CONSEQUENCE = eINSTANCE.getFeedbackConsequence();

		/**
		 * The meta object literal for the '<em><b>Navigation Path To Mocc Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT = eINSTANCE.getFeedbackConsequence_NavigationPathToMoccEvent();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.MoccEventImpl <em>Mocc Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.MoccEventImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getMoccEvent()
		 * @generated
		 */
		EClass MOCC_EVENT = eINSTANCE.getMoccEvent();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.EclEventImpl <em>Ecl Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.EclEventImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getEclEvent()
		 * @generated
		 */
		EClass ECL_EVENT = eINSTANCE.getEclEvent();

		/**
		 * The meta object literal for the '<em><b>Event Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_EVENT__EVENT_REFERENCE = eINSTANCE.getEclEvent_EventReference();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.ExecutionFunctionResultImpl <em>Execution Function Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.ExecutionFunctionResultImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getExecutionFunctionResult()
		 * @generated
		 */
		EClass EXECUTION_FUNCTION_RESULT = eINSTANCE.getExecutionFunctionResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_FUNCTION_RESULT__NAME = eINSTANCE.getExecutionFunctionResult_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.ExecutionFunctionImpl <em>Execution Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.ExecutionFunctionImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getExecutionFunction()
		 * @generated
		 */
		EClass EXECUTION_FUNCTION = eINSTANCE.getExecutionFunction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FUNCTION__RESULT = eINSTANCE.getExecutionFunction_Result();

		/**
		 * The meta object literal for the '<em><b>Call Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_FUNCTION__CALL_KIND = eINSTANCE.getExecutionFunction_CallKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.impl.Kermeta3ExecutionFunctionImpl <em>Kermeta3 Execution Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.impl.Kermeta3ExecutionFunctionImpl
		 * @see org.gemoc.gel.impl.GelPackageImpl#getKermeta3ExecutionFunction()
		 * @generated
		 */
		EClass KERMETA3_EXECUTION_FUNCTION = eINSTANCE.getKermeta3ExecutionFunction();

		/**
		 * The meta object literal for the '<em><b>Navigation Path To Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION = eINSTANCE.getKermeta3ExecutionFunction_NavigationPathToOperation();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.Visibility
		 * @see org.gemoc.gel.impl.GelPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.ExecutionKind <em>Execution Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.ExecutionKind
		 * @see org.gemoc.gel.impl.GelPackageImpl#getExecutionKind()
		 * @generated
		 */
		EEnum EXECUTION_KIND = eINSTANCE.getExecutionKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.CallKind <em>Call Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.CallKind
		 * @see org.gemoc.gel.impl.GelPackageImpl#getCallKind()
		 * @generated
		 */
		EEnum CALL_KIND = eINSTANCE.getCallKind();

	}

} //GelPackage
