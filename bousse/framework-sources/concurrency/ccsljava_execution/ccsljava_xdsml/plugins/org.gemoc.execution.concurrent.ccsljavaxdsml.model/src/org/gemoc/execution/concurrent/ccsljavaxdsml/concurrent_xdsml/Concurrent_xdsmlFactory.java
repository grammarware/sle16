/**
 */
package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage
 * @generated
 */
public interface Concurrent_xdsmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Concurrent_xdsmlFactory eINSTANCE = org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concurrent Language Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrent Language Definition</em>'.
	 * @generated
	 */
	ConcurrentLanguageDefinition createConcurrentLanguageDefinition();

	/**
	 * Returns a new object of class '<em>DSA Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSA Project</em>'.
	 * @generated
	 */
	DSAProject createDSAProject();

	/**
	 * Returns a new object of class '<em>Mo CC Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CC Project</em>'.
	 * @generated
	 */
	MoCCProject createMoCCProject();

	/**
	 * Returns a new object of class '<em>DSE Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSE Project</em>'.
	 * @generated
	 */
	DSEProject createDSEProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Concurrent_xdsmlPackage getConcurrent_xdsmlPackage();

} //Concurrent_xdsmlFactory
