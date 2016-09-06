/**
 */
package org.gemoc.gel.microgel;

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
 * @see org.gemoc.gel.microgel.MicrogelFactory
 * @model kind="package"
 * @generated
 */
public interface MicrogelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "microgel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/gel/microgel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "microgel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicrogelPackage eINSTANCE = org.gemoc.gel.microgel.impl.MicrogelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventsSpecificationImpl <em>Model Specific Events Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventsSpecificationImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEventsSpecification()
	 * @generated
	 */
	int MODEL_SPECIFIC_EVENTS_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENTS_SPECIFICATION__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Model Specific Events Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENTS_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Specific Events Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENTS_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ImportStatementImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getImportStatement()
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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventImpl <em>Model Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEvent()
	 * @generated
	 */
	int MODEL_SPECIFIC_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__VISIBILITY = 1;

	/**
	 * The number of structural features of the '<em>Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl <em>Atomic Model Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getAtomicModelSpecificEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__NAME = MODEL_SPECIFIC_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__VISIBILITY = MODEL_SPECIFIC_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Upon Mocc Event Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feedback Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__TARGET = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Raised Mocc Event Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Atomic Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT_FEATURE_COUNT = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Atomic Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SPECIFIC_EVENT_OPERATION_COUNT = MODEL_SPECIFIC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.CompositeModelSpecificEventImpl <em>Composite Model Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.CompositeModelSpecificEventImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCompositeModelSpecificEvent()
	 * @generated
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT__NAME = MODEL_SPECIFIC_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT__VISIBILITY = MODEL_SPECIFIC_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT__BODY = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT__TARGETS = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT_FEATURE_COUNT = MODEL_SPECIFIC_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODEL_SPECIFIC_EVENT_OPERATION_COUNT = MODEL_SPECIFIC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventsPatternImpl <em>Model Specific Events Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventsPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEventsPattern()
	 * @generated
	 */
	int MODEL_SPECIFIC_EVENTS_PATTERN = 5;

	/**
	 * The number of structural features of the '<em>Model Specific Events Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Specific Events Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.UnaryPatternImpl <em>Unary Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.UnaryPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getUnaryPattern()
	 * @generated
	 */
	int UNARY_PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN__OPERAND = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN_FEATURE_COUNT = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN_OPERATION_COUNT = MODEL_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.BinaryPatternImpl <em>Binary Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.BinaryPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getBinaryPattern()
	 * @generated
	 */
	int BINARY_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN__LEFT_OPERAND = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN__RIGHT_OPERAND = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN_FEATURE_COUNT = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PATTERN_OPERATION_COUNT = MODEL_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.CoincidencePatternImpl <em>Coincidence Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.CoincidencePatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCoincidencePattern()
	 * @generated
	 */
	int COINCIDENCE_PATTERN = 8;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.LogicalSequenceImpl <em>Logical Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.LogicalSequenceImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getLogicalSequence()
	 * @generated
	 */
	int LOGICAL_SEQUENCE = 9;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.OrPatternImpl <em>Or Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.OrPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getOrPattern()
	 * @generated
	 */
	int OR_PATTERN = 10;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.XorPatternImpl <em>Xor Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.XorPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getXorPattern()
	 * @generated
	 */
	int XOR_PATTERN = 11;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.PlusPatternImpl <em>Plus Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.PlusPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getPlusPattern()
	 * @generated
	 */
	int PLUS_PATTERN = 12;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.IterationPatternImpl <em>Iteration Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.IterationPatternImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getIterationPattern()
	 * @generated
	 */
	int ITERATION_PATTERN = 13;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventReferenceImpl <em>Model Specific Event Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventReferenceImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEventReference()
	 * @generated
	 */
	int MODEL_SPECIFIC_EVENT_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Referenced Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Specific Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_REFERENCE_FEATURE_COUNT = MODEL_SPECIFIC_EVENTS_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Specific Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_REFERENCE_OPERATION_COUNT = MODEL_SPECIFIC_EVENTS_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.FeedbackPolicyImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackPolicy()
	 * @generated
	 */
	int FEEDBACK_POLICY = 15;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.FeedbackRuleImpl <em>Feedback Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.FeedbackRuleImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackRule()
	 * @generated
	 */
	int FEEDBACK_RULE = 16;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.FeedbackFilterImpl <em>Feedback Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.FeedbackFilterImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackFilter()
	 * @generated
	 */
	int FEEDBACK_FILTER = 17;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.FeedbackConsequenceImpl <em>Feedback Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.FeedbackConsequenceImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackConsequence()
	 * @generated
	 */
	int FEEDBACK_CONSEQUENCE = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_CONSEQUENCE__TARGET = 0;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.MoccEventInstanceImpl <em>Mocc Event Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.MoccEventInstanceImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getMoccEventInstance()
	 * @generated
	 */
	int MOCC_EVENT_INSTANCE = 19;

	/**
	 * The number of structural features of the '<em>Mocc Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCC_EVENT_INSTANCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mocc Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCC_EVENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.CcslClockImpl <em>Ccsl Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.CcslClockImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCcslClock()
	 * @generated
	 */
	int CCSL_CLOCK = 20;

	/**
	 * The feature id for the '<em><b>Referenced Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_CLOCK__REFERENCED_CLOCK = MOCC_EVENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ccsl Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_CLOCK_FEATURE_COUNT = MOCC_EVENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ccsl Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_CLOCK_OPERATION_COUNT = MOCC_EVENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ExecutionFunctionResultImpl <em>Execution Function Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ExecutionFunctionResultImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getExecutionFunctionResult()
	 * @generated
	 */
	int EXECUTION_FUNCTION_RESULT = 21;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.ExecutionFunctionImpl <em>Execution Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.ExecutionFunctionImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getExecutionFunction()
	 * @generated
	 */
	int EXECUTION_FUNCTION = 22;

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
	 * The meta object id for the '{@link org.gemoc.gel.microgel.impl.Kermeta3ExecutionFunctionImpl <em>Kermeta3 Execution Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.impl.Kermeta3ExecutionFunctionImpl
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getKermeta3ExecutionFunction()
	 * @generated
	 */
	int KERMETA3_EXECUTION_FUNCTION = 23;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION__OPERATION = EXECUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION__TARGET = EXECUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kermeta3 Execution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION_FEATURE_COUNT = EXECUTION_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kermeta3 Execution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA3_EXECUTION_FUNCTION_OPERATION_COUNT = EXECUTION_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.Visibility
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 24;


	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.ExecutionKind <em>Execution Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.ExecutionKind
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getExecutionKind()
	 * @generated
	 */
	int EXECUTION_KIND = 25;


	/**
	 * The meta object id for the '{@link org.gemoc.gel.microgel.CallKind <em>Call Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.gel.microgel.CallKind
	 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCallKind()
	 * @generated
	 */
	int CALL_KIND = 26;


	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ModelSpecificEventsSpecification <em>Model Specific Events Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Specific Events Specification</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventsSpecification
	 * @generated
	 */
	EClass getModelSpecificEventsSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.microgel.ModelSpecificEventsSpecification#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventsSpecification#getEvents()
	 * @see #getModelSpecificEventsSpecification()
	 * @generated
	 */
	EReference getModelSpecificEventsSpecification_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.microgel.ModelSpecificEventsSpecification#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventsSpecification#getImports()
	 * @see #getModelSpecificEventsSpecification()
	 * @generated
	 */
	EReference getModelSpecificEventsSpecification_Imports();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.gemoc.gel.microgel.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.ImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.gemoc.gel.microgel.ImportStatement#getImportURI()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ModelSpecificEvent <em>Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Specific Event</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEvent
	 * @generated
	 */
	EClass getModelSpecificEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.ModelSpecificEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEvent#getName()
	 * @see #getModelSpecificEvent()
	 * @generated
	 */
	EAttribute getModelSpecificEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.ModelSpecificEvent#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEvent#getVisibility()
	 * @see #getModelSpecificEvent()
	 * @generated
	 */
	EAttribute getModelSpecificEvent_Visibility();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent <em>Atomic Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Specific Event</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent
	 * @generated
	 */
	EClass getAtomicModelSpecificEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getUponMoccEventInstance <em>Upon Mocc Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upon Mocc Event Instance</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent#getUponMoccEventInstance()
	 * @see #getAtomicModelSpecificEvent()
	 * @generated
	 */
	EReference getAtomicModelSpecificEvent_UponMoccEventInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionFunction <em>Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Function</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionFunction()
	 * @see #getAtomicModelSpecificEvent()
	 * @generated
	 */
	EReference getAtomicModelSpecificEvent_ExecutionFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getFeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback Policy</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent#getFeedbackPolicy()
	 * @see #getAtomicModelSpecificEvent()
	 * @generated
	 */
	EReference getAtomicModelSpecificEvent_FeedbackPolicy();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent#getTarget()
	 * @see #getAtomicModelSpecificEvent()
	 * @generated
	 */
	EReference getAtomicModelSpecificEvent_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getRaisedMoccEventInstance <em>Raised Mocc Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raised Mocc Event Instance</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent#getRaisedMoccEventInstance()
	 * @see #getAtomicModelSpecificEvent()
	 * @generated
	 */
	EReference getAtomicModelSpecificEvent_RaisedMoccEventInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionKind <em>Execution Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Kind</em>'.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent#getExecutionKind()
	 * @see #getAtomicModelSpecificEvent()
	 * @generated
	 */
	EAttribute getAtomicModelSpecificEvent_ExecutionKind();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent <em>Composite Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Model Specific Event</em>'.
	 * @see org.gemoc.gel.microgel.CompositeModelSpecificEvent
	 * @generated
	 */
	EClass getCompositeModelSpecificEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.gemoc.gel.microgel.CompositeModelSpecificEvent#getBody()
	 * @see #getCompositeModelSpecificEvent()
	 * @generated
	 */
	EReference getCompositeModelSpecificEvent_Body();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.gemoc.gel.microgel.CompositeModelSpecificEvent#getTargets()
	 * @see #getCompositeModelSpecificEvent()
	 * @generated
	 */
	EReference getCompositeModelSpecificEvent_Targets();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ModelSpecificEventsPattern <em>Model Specific Events Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Specific Events Pattern</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventsPattern
	 * @generated
	 */
	EClass getModelSpecificEventsPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.UnaryPattern <em>Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Pattern</em>'.
	 * @see org.gemoc.gel.microgel.UnaryPattern
	 * @generated
	 */
	EClass getUnaryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.UnaryPattern#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.gel.microgel.UnaryPattern#getOperand()
	 * @see #getUnaryPattern()
	 * @generated
	 */
	EReference getUnaryPattern_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.BinaryPattern <em>Binary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Pattern</em>'.
	 * @see org.gemoc.gel.microgel.BinaryPattern
	 * @generated
	 */
	EClass getBinaryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.BinaryPattern#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.gemoc.gel.microgel.BinaryPattern#getLeftOperand()
	 * @see #getBinaryPattern()
	 * @generated
	 */
	EReference getBinaryPattern_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.BinaryPattern#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.gemoc.gel.microgel.BinaryPattern#getRightOperand()
	 * @see #getBinaryPattern()
	 * @generated
	 */
	EReference getBinaryPattern_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.CoincidencePattern <em>Coincidence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coincidence Pattern</em>'.
	 * @see org.gemoc.gel.microgel.CoincidencePattern
	 * @generated
	 */
	EClass getCoincidencePattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.LogicalSequence <em>Logical Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Sequence</em>'.
	 * @see org.gemoc.gel.microgel.LogicalSequence
	 * @generated
	 */
	EClass getLogicalSequence();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.OrPattern <em>Or Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Pattern</em>'.
	 * @see org.gemoc.gel.microgel.OrPattern
	 * @generated
	 */
	EClass getOrPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.XorPattern <em>Xor Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Pattern</em>'.
	 * @see org.gemoc.gel.microgel.XorPattern
	 * @generated
	 */
	EClass getXorPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.PlusPattern <em>Plus Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Pattern</em>'.
	 * @see org.gemoc.gel.microgel.PlusPattern
	 * @generated
	 */
	EClass getPlusPattern();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.IterationPattern <em>Iteration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Pattern</em>'.
	 * @see org.gemoc.gel.microgel.IterationPattern
	 * @generated
	 */
	EClass getIterationPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.IterationPattern#getNumberOfIterations <em>Number Of Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Iterations</em>'.
	 * @see org.gemoc.gel.microgel.IterationPattern#getNumberOfIterations()
	 * @see #getIterationPattern()
	 * @generated
	 */
	EAttribute getIterationPattern_NumberOfIterations();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ModelSpecificEventReference <em>Model Specific Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Specific Event Reference</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventReference
	 * @generated
	 */
	EClass getModelSpecificEventReference();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.microgel.ModelSpecificEventReference#getReferencedMse <em>Referenced Mse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Mse</em>'.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventReference#getReferencedMse()
	 * @see #getModelSpecificEventReference()
	 * @generated
	 */
	EReference getModelSpecificEventReference_ReferencedMse();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Policy</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackPolicy
	 * @generated
	 */
	EClass getFeedbackPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.gel.microgel.FeedbackPolicy#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackPolicy#getRules()
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	EReference getFeedbackPolicy_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.FeedbackPolicy#getDefaultRule <em>Default Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Rule</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackPolicy#getDefaultRule()
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	EReference getFeedbackPolicy_DefaultRule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.FeedbackRule <em>Feedback Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Rule</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackRule
	 * @generated
	 */
	EClass getFeedbackRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.FeedbackRule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackRule#getFilter()
	 * @see #getFeedbackRule()
	 * @generated
	 */
	EReference getFeedbackRule_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.FeedbackRule#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequence</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackRule#getConsequence()
	 * @see #getFeedbackRule()
	 * @generated
	 */
	EReference getFeedbackRule_Consequence();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.FeedbackFilter <em>Feedback Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Filter</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackFilter
	 * @generated
	 */
	EClass getFeedbackFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.FeedbackFilter#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackFilter#getBody()
	 * @see #getFeedbackFilter()
	 * @generated
	 */
	EReference getFeedbackFilter_Body();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.FeedbackConsequence <em>Feedback Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Consequence</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackConsequence
	 * @generated
	 */
	EClass getFeedbackConsequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.FeedbackConsequence#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.gemoc.gel.microgel.FeedbackConsequence#getTarget()
	 * @see #getFeedbackConsequence()
	 * @generated
	 */
	EReference getFeedbackConsequence_Target();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.MoccEventInstance <em>Mocc Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mocc Event Instance</em>'.
	 * @see org.gemoc.gel.microgel.MoccEventInstance
	 * @generated
	 */
	EClass getMoccEventInstance();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.CcslClock <em>Ccsl Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ccsl Clock</em>'.
	 * @see org.gemoc.gel.microgel.CcslClock
	 * @generated
	 */
	EClass getCcslClock();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.microgel.CcslClock#getReferencedClock <em>Referenced Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Clock</em>'.
	 * @see org.gemoc.gel.microgel.CcslClock#getReferencedClock()
	 * @see #getCcslClock()
	 * @generated
	 */
	EReference getCcslClock_ReferencedClock();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ExecutionFunctionResult <em>Execution Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Function Result</em>'.
	 * @see org.gemoc.gel.microgel.ExecutionFunctionResult
	 * @generated
	 */
	EClass getExecutionFunctionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.ExecutionFunctionResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.gel.microgel.ExecutionFunctionResult#getName()
	 * @see #getExecutionFunctionResult()
	 * @generated
	 */
	EAttribute getExecutionFunctionResult_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.ExecutionFunction <em>Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Function</em>'.
	 * @see org.gemoc.gel.microgel.ExecutionFunction
	 * @generated
	 */
	EClass getExecutionFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.gel.microgel.ExecutionFunction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.gemoc.gel.microgel.ExecutionFunction#getResult()
	 * @see #getExecutionFunction()
	 * @generated
	 */
	EReference getExecutionFunction_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.gel.microgel.ExecutionFunction#getCallKind <em>Call Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Kind</em>'.
	 * @see org.gemoc.gel.microgel.ExecutionFunction#getCallKind()
	 * @see #getExecutionFunction()
	 * @generated
	 */
	EAttribute getExecutionFunction_CallKind();

	/**
	 * Returns the meta object for class '{@link org.gemoc.gel.microgel.Kermeta3ExecutionFunction <em>Kermeta3 Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta3 Execution Function</em>'.
	 * @see org.gemoc.gel.microgel.Kermeta3ExecutionFunction
	 * @generated
	 */
	EClass getKermeta3ExecutionFunction();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.microgel.Kermeta3ExecutionFunction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.gemoc.gel.microgel.Kermeta3ExecutionFunction#getOperation()
	 * @see #getKermeta3ExecutionFunction()
	 * @generated
	 */
	EReference getKermeta3ExecutionFunction_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.gel.microgel.Kermeta3ExecutionFunction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.gel.microgel.Kermeta3ExecutionFunction#getTarget()
	 * @see #getKermeta3ExecutionFunction()
	 * @generated
	 */
	EReference getKermeta3ExecutionFunction_Target();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.gel.microgel.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.gemoc.gel.microgel.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.gel.microgel.ExecutionKind <em>Execution Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Kind</em>'.
	 * @see org.gemoc.gel.microgel.ExecutionKind
	 * @generated
	 */
	EEnum getExecutionKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.gel.microgel.CallKind <em>Call Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Kind</em>'.
	 * @see org.gemoc.gel.microgel.CallKind
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
	MicrogelFactory getMicrogelFactory();

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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventsSpecificationImpl <em>Model Specific Events Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventsSpecificationImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEventsSpecification()
		 * @generated
		 */
		EClass MODEL_SPECIFIC_EVENTS_SPECIFICATION = eINSTANCE.getModelSpecificEventsSpecification();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SPECIFIC_EVENTS_SPECIFICATION__EVENTS = eINSTANCE.getModelSpecificEventsSpecification_Events();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS = eINSTANCE.getModelSpecificEventsSpecification_Imports();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ImportStatementImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getImportStatement()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventImpl <em>Model Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEvent()
		 * @generated
		 */
		EClass MODEL_SPECIFIC_EVENT = eINSTANCE.getModelSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SPECIFIC_EVENT__NAME = eINSTANCE.getModelSpecificEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SPECIFIC_EVENT__VISIBILITY = eINSTANCE.getModelSpecificEvent_Visibility();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl <em>Atomic Model Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.AtomicModelSpecificEventImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getAtomicModelSpecificEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_SPECIFIC_EVENT = eINSTANCE.getAtomicModelSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Upon Mocc Event Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE = eINSTANCE.getAtomicModelSpecificEvent_UponMoccEventInstance();

		/**
		 * The meta object literal for the '<em><b>Execution Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION = eINSTANCE.getAtomicModelSpecificEvent_ExecutionFunction();

		/**
		 * The meta object literal for the '<em><b>Feedback Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY = eINSTANCE.getAtomicModelSpecificEvent_FeedbackPolicy();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL_SPECIFIC_EVENT__TARGET = eINSTANCE.getAtomicModelSpecificEvent_Target();

		/**
		 * The meta object literal for the '<em><b>Raised Mocc Event Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE = eINSTANCE.getAtomicModelSpecificEvent_RaisedMoccEventInstance();

		/**
		 * The meta object literal for the '<em><b>Execution Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND = eINSTANCE.getAtomicModelSpecificEvent_ExecutionKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.CompositeModelSpecificEventImpl <em>Composite Model Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.CompositeModelSpecificEventImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCompositeModelSpecificEvent()
		 * @generated
		 */
		EClass COMPOSITE_MODEL_SPECIFIC_EVENT = eINSTANCE.getCompositeModelSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODEL_SPECIFIC_EVENT__BODY = eINSTANCE.getCompositeModelSpecificEvent_Body();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODEL_SPECIFIC_EVENT__TARGETS = eINSTANCE.getCompositeModelSpecificEvent_Targets();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventsPatternImpl <em>Model Specific Events Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventsPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEventsPattern()
		 * @generated
		 */
		EClass MODEL_SPECIFIC_EVENTS_PATTERN = eINSTANCE.getModelSpecificEventsPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.UnaryPatternImpl <em>Unary Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.UnaryPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getUnaryPattern()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.BinaryPatternImpl <em>Binary Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.BinaryPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getBinaryPattern()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.CoincidencePatternImpl <em>Coincidence Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.CoincidencePatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCoincidencePattern()
		 * @generated
		 */
		EClass COINCIDENCE_PATTERN = eINSTANCE.getCoincidencePattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.LogicalSequenceImpl <em>Logical Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.LogicalSequenceImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getLogicalSequence()
		 * @generated
		 */
		EClass LOGICAL_SEQUENCE = eINSTANCE.getLogicalSequence();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.OrPatternImpl <em>Or Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.OrPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getOrPattern()
		 * @generated
		 */
		EClass OR_PATTERN = eINSTANCE.getOrPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.XorPatternImpl <em>Xor Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.XorPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getXorPattern()
		 * @generated
		 */
		EClass XOR_PATTERN = eINSTANCE.getXorPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.PlusPatternImpl <em>Plus Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.PlusPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getPlusPattern()
		 * @generated
		 */
		EClass PLUS_PATTERN = eINSTANCE.getPlusPattern();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.IterationPatternImpl <em>Iteration Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.IterationPatternImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getIterationPattern()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ModelSpecificEventReferenceImpl <em>Model Specific Event Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ModelSpecificEventReferenceImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getModelSpecificEventReference()
		 * @generated
		 */
		EClass MODEL_SPECIFIC_EVENT_REFERENCE = eINSTANCE.getModelSpecificEventReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Mse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE = eINSTANCE.getModelSpecificEventReference_ReferencedMse();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.FeedbackPolicyImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackPolicy()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.FeedbackRuleImpl <em>Feedback Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.FeedbackRuleImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackRule()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.FeedbackFilterImpl <em>Feedback Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.FeedbackFilterImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackFilter()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.FeedbackConsequenceImpl <em>Feedback Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.FeedbackConsequenceImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getFeedbackConsequence()
		 * @generated
		 */
		EClass FEEDBACK_CONSEQUENCE = eINSTANCE.getFeedbackConsequence();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_CONSEQUENCE__TARGET = eINSTANCE.getFeedbackConsequence_Target();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.MoccEventInstanceImpl <em>Mocc Event Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.MoccEventInstanceImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getMoccEventInstance()
		 * @generated
		 */
		EClass MOCC_EVENT_INSTANCE = eINSTANCE.getMoccEventInstance();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.CcslClockImpl <em>Ccsl Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.CcslClockImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCcslClock()
		 * @generated
		 */
		EClass CCSL_CLOCK = eINSTANCE.getCcslClock();

		/**
		 * The meta object literal for the '<em><b>Referenced Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCSL_CLOCK__REFERENCED_CLOCK = eINSTANCE.getCcslClock_ReferencedClock();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ExecutionFunctionResultImpl <em>Execution Function Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ExecutionFunctionResultImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getExecutionFunctionResult()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.ExecutionFunctionImpl <em>Execution Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.ExecutionFunctionImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getExecutionFunction()
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
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.impl.Kermeta3ExecutionFunctionImpl <em>Kermeta3 Execution Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.impl.Kermeta3ExecutionFunctionImpl
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getKermeta3ExecutionFunction()
		 * @generated
		 */
		EClass KERMETA3_EXECUTION_FUNCTION = eINSTANCE.getKermeta3ExecutionFunction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA3_EXECUTION_FUNCTION__OPERATION = eINSTANCE.getKermeta3ExecutionFunction_Operation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA3_EXECUTION_FUNCTION__TARGET = eINSTANCE.getKermeta3ExecutionFunction_Target();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.Visibility
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.ExecutionKind <em>Execution Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.ExecutionKind
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getExecutionKind()
		 * @generated
		 */
		EEnum EXECUTION_KIND = eINSTANCE.getExecutionKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.gel.microgel.CallKind <em>Call Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.gel.microgel.CallKind
		 * @see org.gemoc.gel.microgel.impl.MicrogelPackageImpl#getCallKind()
		 * @generated
		 */
		EEnum CALL_KIND = eINSTANCE.getCallKind();

	}

} //MicrogelPackage
