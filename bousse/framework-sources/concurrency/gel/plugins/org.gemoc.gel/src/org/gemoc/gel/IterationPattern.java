/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.IterationPattern#getNumberOfIterations <em>Number Of Iterations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getIterationPattern()
 * @model
 * @generated
 */
public interface IterationPattern extends UnaryPattern {
	/**
	 * Returns the value of the '<em><b>Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Iterations</em>' attribute.
	 * @see #setNumberOfIterations(Integer)
	 * @see org.gemoc.gel.GelPackage#getIterationPattern_NumberOfIterations()
	 * @model required="true"
	 * @generated
	 */
	Integer getNumberOfIterations();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.IterationPattern#getNumberOfIterations <em>Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Iterations</em>' attribute.
	 * @see #getNumberOfIterations()
	 * @generated
	 */
	void setNumberOfIterations(Integer value);

} // IterationPattern
