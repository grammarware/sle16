/**
 */
package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Concurrent_xdsmlFactoryImpl extends EFactoryImpl implements Concurrent_xdsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Concurrent_xdsmlFactory init() {
		try {
			Concurrent_xdsmlFactory theConcurrent_xdsmlFactory = (Concurrent_xdsmlFactory)EPackage.Registry.INSTANCE.getEFactory(Concurrent_xdsmlPackage.eNS_URI);
			if (theConcurrent_xdsmlFactory != null) {
				return theConcurrent_xdsmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Concurrent_xdsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_xdsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION: return createConcurrentLanguageDefinition();
			case Concurrent_xdsmlPackage.DSA_PROJECT: return createDSAProject();
			case Concurrent_xdsmlPackage.MO_CC_PROJECT: return createMoCCProject();
			case Concurrent_xdsmlPackage.DSE_PROJECT: return createDSEProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLanguageDefinition createConcurrentLanguageDefinition() {
		ConcurrentLanguageDefinitionImpl concurrentLanguageDefinition = new ConcurrentLanguageDefinitionImpl();
		return concurrentLanguageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAProject createDSAProject() {
		DSAProjectImpl dsaProject = new DSAProjectImpl();
		return dsaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCProject createMoCCProject() {
		MoCCProjectImpl moCCProject = new MoCCProjectImpl();
		return moCCProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSEProject createDSEProject() {
		DSEProjectImpl dseProject = new DSEProjectImpl();
		return dseProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_xdsmlPackage getConcurrent_xdsmlPackage() {
		return (Concurrent_xdsmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Concurrent_xdsmlPackage getPackage() {
		return Concurrent_xdsmlPackage.eINSTANCE;
	}

} //Concurrent_xdsmlFactoryImpl
