/**
 */
package org.gemoc.gel.microgel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
import org.gemoc.gel.microgel.MicrogelFactory;
import org.gemoc.gel.microgel.MicrogelPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.gel.microgel.CompositeModelSpecificEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeModelSpecificEventItemProvider extends ModelSpecificEventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeModelSpecificEventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTargetsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Targets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeModelSpecificEvent_targets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeModelSpecificEvent_targets_feature", "_UI_CompositeModelSpecificEvent_type"),
				 MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__TARGETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CompositeModelSpecificEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeModelSpecificEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeModelSpecificEvent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeModelSpecificEvent_type") :
			getString("_UI_CompositeModelSpecificEvent_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompositeModelSpecificEvent.class)) {
			case MicrogelPackage.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createCoincidencePattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createLogicalSequence()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createOrPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createXorPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createPlusPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createIterationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.COMPOSITE_MODEL_SPECIFIC_EVENT__BODY,
				 MicrogelFactory.eINSTANCE.createModelSpecificEventReference()));
	}

}
