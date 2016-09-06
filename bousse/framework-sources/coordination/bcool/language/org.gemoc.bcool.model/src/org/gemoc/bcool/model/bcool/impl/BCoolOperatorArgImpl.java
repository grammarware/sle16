/**
 */
package org.gemoc.bcool.model.bcool.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;
import org.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCool Operator Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl#getDSE <em>DSE</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCoolOperatorArgImpl extends NamedElementImpl implements BCoolOperatorArg {
	/**
	 * The cached value of the '{@link #getDSE() <em>DSE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSE()
	 * @generated
	 * @ordered
	 */
	protected DefPropertyCS dse;
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected ImportInterfaceStatement interface_;
	/**
	 * The cached value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
	protected EClass interfaceClass;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCoolOperatorArgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.BCOOL_OPERATOR_ARG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefPropertyCS getDSE() {
		if (dse != null && dse.eIsProxy()) {
			InternalEObject oldDSE = (InternalEObject)dse;
			dse = (DefPropertyCS)eResolveProxy(oldDSE);
			if (dse != oldDSE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BcoolPackage.BCOOL_OPERATOR_ARG__DSE, oldDSE, dse));
			}
		}
		return dse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefPropertyCS basicGetDSE() {
		return dse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSE(DefPropertyCS newDSE) {
		DefPropertyCS oldDSE = dse;
		dse = newDSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_OPERATOR_ARG__DSE, oldDSE, dse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportInterfaceStatement getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (ImportInterfaceStatement)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportInterfaceStatement basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(ImportInterfaceStatement newInterface) {
		ImportInterfaceStatement oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClass() {
		if (interfaceClass != null && interfaceClass.eIsProxy()) {
			InternalEObject oldInterfaceClass = (InternalEObject)interfaceClass;
			interfaceClass = (EClass)eResolveProxy(oldInterfaceClass);
			if (interfaceClass != oldInterfaceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE_CLASS, oldInterfaceClass, interfaceClass));
			}
		}
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetInterfaceClass() {
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceClass(EClass newInterfaceClass) {
		EClass oldInterfaceClass = interfaceClass;
		interfaceClass = newInterfaceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE_CLASS, oldInterfaceClass, interfaceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BcoolPackage.BCOOL_OPERATOR_ARG__DSE:
				if (resolve) return getDSE();
				return basicGetDSE();
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE_CLASS:
				if (resolve) return getInterfaceClass();
				return basicGetInterfaceClass();
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
			case BcoolPackage.BCOOL_OPERATOR_ARG__DSE:
				setDSE((DefPropertyCS)newValue);
				return;
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE:
				setInterface((ImportInterfaceStatement)newValue);
				return;
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE_CLASS:
				setInterfaceClass((EClass)newValue);
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
			case BcoolPackage.BCOOL_OPERATOR_ARG__DSE:
				setDSE((DefPropertyCS)null);
				return;
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE:
				setInterface((ImportInterfaceStatement)null);
				return;
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE_CLASS:
				setInterfaceClass((EClass)null);
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
			case BcoolPackage.BCOOL_OPERATOR_ARG__DSE:
				return dse != null;
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE:
				return interface_ != null;
			case BcoolPackage.BCOOL_OPERATOR_ARG__INTERFACE_CLASS:
				return interfaceClass != null;
		}
		return super.eIsSet(featureID);
	}

} //BCoolOperatorArgImpl
