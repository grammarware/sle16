/**
 */
package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;

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
 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlFactory
 * @model kind="package"
 * @generated
 */
public interface Concurrent_xdsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concurrent_xdsml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/concurrent_xdsml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concurrent_xdsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Concurrent_xdsmlPackage eINSTANCE = org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.ConcurrentLanguageDefinitionImpl <em>Concurrent Language Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.ConcurrentLanguageDefinitionImpl
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getConcurrentLanguageDefinition()
	 * @generated
	 */
	int CONCURRENT_LANGUAGE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Domain Model Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__DOMAIN_MODEL_PROJECT = Xdsml_basePackage.LANGUAGE_DEFINITION__DOMAIN_MODEL_PROJECT;

	/**
	 * The feature id for the '<em><b>Editor Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__EDITOR_PROJECTS = Xdsml_basePackage.LANGUAGE_DEFINITION__EDITOR_PROJECTS;

	/**
	 * The feature id for the '<em><b>Animator Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__ANIMATOR_PROJECTS = Xdsml_basePackage.LANGUAGE_DEFINITION__ANIMATOR_PROJECTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__NAME = Xdsml_basePackage.LANGUAGE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Melange URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__MELANGE_URI = Xdsml_basePackage.LANGUAGE_DEFINITION__MELANGE_URI;

	/**
	 * The feature id for the '<em><b>Need Melange Synchronization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__NEED_MELANGE_SYNCHRONIZATION = Xdsml_basePackage.LANGUAGE_DEFINITION__NEED_MELANGE_SYNCHRONIZATION;

	/**
	 * The feature id for the '<em><b>Dsa Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT = Xdsml_basePackage.LANGUAGE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mo CC Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT = Xdsml_basePackage.LANGUAGE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DSE Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT = Xdsml_basePackage.LANGUAGE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concurrent Language Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION_FEATURE_COUNT = Xdsml_basePackage.LANGUAGE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get File Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION___GET_FILE_EXTENSIONS = Xdsml_basePackage.LANGUAGE_DEFINITION___GET_FILE_EXTENSIONS;

	/**
	 * The number of operations of the '<em>Concurrent Language Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_DEFINITION_OPERATION_COUNT = Xdsml_basePackage.LANGUAGE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSAProjectImpl <em>DSA Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSAProjectImpl
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getDSAProject()
	 * @generated
	 */
	int DSA_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_PROJECT__PROJECT_NAME = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Project Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_PROJECT__PROJECT_KIND = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_KIND;

	/**
	 * The feature id for the '<em><b>Code Executor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_PROJECT__CODE_EXECUTOR_CLASS = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_PROJECT__ENTRY_POINT = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DSA Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_PROJECT_FEATURE_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DSA Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_PROJECT_OPERATION_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.MoCCProjectImpl <em>Mo CC Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.MoCCProjectImpl
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getMoCCProject()
	 * @generated
	 */
	int MO_CC_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CC_PROJECT__PROJECT_NAME = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Project Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CC_PROJECT__PROJECT_KIND = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_KIND;

	/**
	 * The number of structural features of the '<em>Mo CC Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CC_PROJECT_FEATURE_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mo CC Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CC_PROJECT_OPERATION_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSEProjectImpl <em>DSE Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSEProjectImpl
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getDSEProject()
	 * @generated
	 */
	int DSE_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROJECT__PROJECT_NAME = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Project Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROJECT__PROJECT_KIND = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_KIND;

	/**
	 * The feature id for the '<em><b>Qvto URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROJECT__QVTO_URI = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solver Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROJECT__SOLVER_CLASS = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DSE Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROJECT_FEATURE_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DSE Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROJECT_OPERATION_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition <em>Concurrent Language Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrent Language Definition</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition
	 * @generated
	 */
	EClass getConcurrentLanguageDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition#getDsaProject <em>Dsa Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsa Project</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition#getDsaProject()
	 * @see #getConcurrentLanguageDefinition()
	 * @generated
	 */
	EReference getConcurrentLanguageDefinition_DsaProject();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition#getMoCCProject <em>Mo CC Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo CC Project</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition#getMoCCProject()
	 * @see #getConcurrentLanguageDefinition()
	 * @generated
	 */
	EReference getConcurrentLanguageDefinition_MoCCProject();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition#getDSEProject <em>DSE Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DSE Project</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition#getDSEProject()
	 * @see #getConcurrentLanguageDefinition()
	 * @generated
	 */
	EReference getConcurrentLanguageDefinition_DSEProject();

	/**
	 * Returns the meta object for class '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject <em>DSA Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSA Project</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject
	 * @generated
	 */
	EClass getDSAProject();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject#getCodeExecutorClass <em>Code Executor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Executor Class</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject#getCodeExecutorClass()
	 * @see #getDSAProject()
	 * @generated
	 */
	EAttribute getDSAProject_CodeExecutorClass();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject#getEntryPoint()
	 * @see #getDSAProject()
	 * @generated
	 */
	EAttribute getDSAProject_EntryPoint();

	/**
	 * Returns the meta object for class '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.MoCCProject <em>Mo CC Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CC Project</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.MoCCProject
	 * @generated
	 */
	EClass getMoCCProject();

	/**
	 * Returns the meta object for class '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject <em>DSE Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Project</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject
	 * @generated
	 */
	EClass getDSEProject();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject#getQvtoURI <em>Qvto URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qvto URI</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject#getQvtoURI()
	 * @see #getDSEProject()
	 * @generated
	 */
	EAttribute getDSEProject_QvtoURI();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject#getSolverClass <em>Solver Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Class</em>'.
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject#getSolverClass()
	 * @see #getDSEProject()
	 * @generated
	 */
	EAttribute getDSEProject_SolverClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Concurrent_xdsmlFactory getConcurrent_xdsmlFactory();

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
		 * The meta object literal for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.ConcurrentLanguageDefinitionImpl <em>Concurrent Language Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.ConcurrentLanguageDefinitionImpl
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getConcurrentLanguageDefinition()
		 * @generated
		 */
		EClass CONCURRENT_LANGUAGE_DEFINITION = eINSTANCE.getConcurrentLanguageDefinition();

		/**
		 * The meta object literal for the '<em><b>Dsa Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT = eINSTANCE.getConcurrentLanguageDefinition_DsaProject();

		/**
		 * The meta object literal for the '<em><b>Mo CC Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT = eINSTANCE.getConcurrentLanguageDefinition_MoCCProject();

		/**
		 * The meta object literal for the '<em><b>DSE Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT = eINSTANCE.getConcurrentLanguageDefinition_DSEProject();

		/**
		 * The meta object literal for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSAProjectImpl <em>DSA Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSAProjectImpl
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getDSAProject()
		 * @generated
		 */
		EClass DSA_PROJECT = eINSTANCE.getDSAProject();

		/**
		 * The meta object literal for the '<em><b>Code Executor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_PROJECT__CODE_EXECUTOR_CLASS = eINSTANCE.getDSAProject_CodeExecutorClass();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSA_PROJECT__ENTRY_POINT = eINSTANCE.getDSAProject_EntryPoint();

		/**
		 * The meta object literal for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.MoCCProjectImpl <em>Mo CC Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.MoCCProjectImpl
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getMoCCProject()
		 * @generated
		 */
		EClass MO_CC_PROJECT = eINSTANCE.getMoCCProject();

		/**
		 * The meta object literal for the '{@link org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSEProjectImpl <em>DSE Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.DSEProjectImpl
		 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlPackageImpl#getDSEProject()
		 * @generated
		 */
		EClass DSE_PROJECT = eINSTANCE.getDSEProject();

		/**
		 * The meta object literal for the '<em><b>Qvto URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_PROJECT__QVTO_URI = eINSTANCE.getDSEProject_QvtoURI();

		/**
		 * The meta object literal for the '<em><b>Solver Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSE_PROJECT__SOLVER_CLASS = eINSTANCE.getDSEProject_SolverClass();

	}

} //Concurrent_xdsmlPackage
