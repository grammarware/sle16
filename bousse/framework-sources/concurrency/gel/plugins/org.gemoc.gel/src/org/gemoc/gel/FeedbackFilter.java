/**
 */
package org.gemoc.gel;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.FeedbackFilter#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getFeedbackFilter()
 * @model
 * @generated
 */
public interface FeedbackFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(GExpression)
	 * @see org.gemoc.gel.GelPackage#getFeedbackFilter_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getBody();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.FeedbackFilter#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(GExpression value);

} // FeedbackFilter
