/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.ExpressionDefinition#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getExpressionDefinition()
 * @model
 * @generated
 */
public interface ExpressionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ExpressionDeclaration)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getExpressionDefinition_Definition()
	 * @model required="true"
	 * @generated
	 */
	ExpressionDeclaration getDefinition();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.ExpressionDefinition#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ExpressionDeclaration value);

} // ExpressionDefinition
