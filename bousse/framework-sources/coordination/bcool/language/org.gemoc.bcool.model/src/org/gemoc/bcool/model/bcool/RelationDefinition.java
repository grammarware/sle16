/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.RelationDefinition#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getRelationDefinition()
 * @model
 * @generated
 */
public interface RelationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(RelationDeclaration)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getRelationDefinition_Definition()
	 * @model required="true"
	 * @generated
	 */
	RelationDeclaration getDefinition();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.RelationDefinition#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(RelationDeclaration value);

} // RelationDefinition
