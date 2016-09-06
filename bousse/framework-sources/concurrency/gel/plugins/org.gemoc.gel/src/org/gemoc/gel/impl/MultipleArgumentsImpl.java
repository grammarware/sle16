/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.ListOfArguments;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.MultipleArguments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.MultipleArgumentsImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.MultipleArgumentsImpl#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleArgumentsImpl extends ListOfArgumentsImpl implements MultipleArguments {
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable head;

	/**
	 * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTail()
	 * @generated
	 * @ordered
	 */
	protected ListOfArguments tail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleArgumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.MULTIPLE_ARGUMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getHead() {
		if (head != null && head.eIsProxy()) {
			InternalEObject oldHead = (InternalEObject)head;
			head = (LocalVariable)eResolveProxy(oldHead);
			if (head != oldHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.MULTIPLE_ARGUMENTS__HEAD, oldHead, head));
			}
		}
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(LocalVariable newHead) {
		LocalVariable oldHead = head;
		head = newHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.MULTIPLE_ARGUMENTS__HEAD, oldHead, head));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfArguments getTail() {
		return tail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTail(ListOfArguments newTail, NotificationChain msgs) {
		ListOfArguments oldTail = tail;
		tail = newTail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.MULTIPLE_ARGUMENTS__TAIL, oldTail, newTail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTail(ListOfArguments newTail) {
		if (newTail != tail) {
			NotificationChain msgs = null;
			if (tail != null)
				msgs = ((InternalEObject)tail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.MULTIPLE_ARGUMENTS__TAIL, null, msgs);
			if (newTail != null)
				msgs = ((InternalEObject)newTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.MULTIPLE_ARGUMENTS__TAIL, null, msgs);
			msgs = basicSetTail(newTail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.MULTIPLE_ARGUMENTS__TAIL, newTail, newTail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.MULTIPLE_ARGUMENTS__TAIL:
				return basicSetTail(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GelPackage.MULTIPLE_ARGUMENTS__HEAD:
				if (resolve) return getHead();
				return basicGetHead();
			case GelPackage.MULTIPLE_ARGUMENTS__TAIL:
				return getTail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GelPackage.MULTIPLE_ARGUMENTS__HEAD:
				setHead((LocalVariable)newValue);
				return;
			case GelPackage.MULTIPLE_ARGUMENTS__TAIL:
				setTail((ListOfArguments)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GelPackage.MULTIPLE_ARGUMENTS__HEAD:
				setHead((LocalVariable)null);
				return;
			case GelPackage.MULTIPLE_ARGUMENTS__TAIL:
				setTail((ListOfArguments)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GelPackage.MULTIPLE_ARGUMENTS__HEAD:
				return head != null;
			case GelPackage.MULTIPLE_ARGUMENTS__TAIL:
				return tail != null;
		}
		return super.eIsSet(featureID);
	}

} //MultipleArgumentsImpl
