/**
 */
package org.gemoc.gel.microgel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.gel.microgel.BinaryPattern;
import org.gemoc.gel.microgel.MicrogelFactory;
import org.gemoc.gel.microgel.MicrogelPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.gel.microgel.BinaryPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryPatternItemProvider extends ModelSpecificEventsPatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryPatternItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND);
			childrenFeatures.add(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BinaryPattern_type");
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

		switch (notification.getFeatureID(BinaryPattern.class)) {
			case MicrogelPackage.BINARY_PATTERN__LEFT_OPERAND:
			case MicrogelPackage.BINARY_PATTERN__RIGHT_OPERAND:
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
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createCoincidencePattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createLogicalSequence()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createOrPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createXorPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createPlusPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createIterationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND,
				 MicrogelFactory.eINSTANCE.createModelSpecificEventReference()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createCoincidencePattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createLogicalSequence()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createOrPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createXorPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createPlusPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createIterationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND,
				 MicrogelFactory.eINSTANCE.createModelSpecificEventReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MicrogelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND ||
			childFeature == MicrogelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
