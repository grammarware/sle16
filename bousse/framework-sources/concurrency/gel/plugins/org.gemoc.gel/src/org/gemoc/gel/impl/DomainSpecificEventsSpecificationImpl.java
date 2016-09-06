/**
 */
package org.gemoc.gel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.ImportStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Events Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.DomainSpecificEventsSpecificationImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.DomainSpecificEventsSpecificationImpl#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainSpecificEventsSpecificationImpl extends MinimalEObjectImpl.Container implements DomainSpecificEventsSpecification {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainSpecificEvent> events;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportStatement> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificEventsSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainSpecificEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<DomainSpecificEvent>(DomainSpecificEvent.class, this, GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportStatement> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ImportStatement>(ImportStatement.class, this, GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS:
				return getEvents();
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS:
				return getImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DomainSpecificEvent>)newValue);
				return;
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportStatement>)newValue);
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
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS:
				getEvents().clear();
				return;
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS:
				getImports().clear();
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
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__EVENTS:
				return events != null && !events.isEmpty();
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainSpecificEventsSpecificationImpl
