/**
 */
package org.gemoc.arduino.sequential.model.arduino.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.arduino.sequential.model.arduino.ArduinoFactory;
import org.gemoc.arduino.sequential.model.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.model.arduino.ModuleAssignment;

/**
 * This is the item provider adapter for a {@link org.gemoc.arduino.sequential.model.arduino.ModuleAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleAssignmentItemProvider extends ModuleInstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleAssignmentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ArduinoPackage.Literals.ASSIGNMENT__OPERAND);
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
	 * This returns ModuleAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ModuleAssignment_type");
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

		switch (notification.getFeatureID(ModuleAssignment.class)) {
			case ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
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
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createBinaryIntegerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createBinaryBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createBooleanModuleGet()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createIntegerModuleGet()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createUnaryBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createUnaryIntegerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createIntegerVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ASSIGNMENT__OPERAND,
				 ArduinoFactory.eINSTANCE.createBooleanVariableRef()));
	}

}
