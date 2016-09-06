package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.modelexecution.xmof.vm.XMOFBasedModelSynchronizer;
import org.modelexecution.xmof.vm.XMOFInstanceMap;

public class GemocModelSynchronizer extends XMOFBasedModelSynchronizer {

	public GemocModelSynchronizer(XMOFInstanceMap instanceMap,
			EditingDomain editingDomain) {
		super(instanceMap, editingDomain);
	}

	@Override
	protected Command createAddCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, EList<?> list,
			Collection<?> addedValues) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				@SuppressWarnings("unchecked")
				EList<Object> list = (EList<Object>) eObject
						.eGet(eStructuralFeature);
				list.addAll(addedValues);
			}
		};
	}

	@Override
	protected Command createAddCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, EList<Object> addedValues,
			int position) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				@SuppressWarnings("unchecked")
				EList<Object> list = (EList<Object>) eObject
						.eGet(eStructuralFeature);
				list.addAll(position, addedValues);
			}
		};
	}

	@Override
	protected Command createAddCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, Object value) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				@SuppressWarnings("unchecked")
				EList<Object> list = (EList<Object>) eObject
						.eGet(eStructuralFeature);
				list.add(value);
			}
		};
	}

	@Override
	protected Command createAddCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, Object value, int position) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				@SuppressWarnings("unchecked")
				EList<Object> list = (EList<Object>) eObject
						.eGet(eStructuralFeature);
				list.add(position, value);
			}
		};
	}

	@Override
	protected Command createAddCommand(Resource resource, EObject eObject) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				resource.getContents().add(eObject);
			}
		};
	}

	@Override
	protected Command createRemoveCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, EList<?> list,
			EList<?> removedValues) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				@SuppressWarnings("unchecked")
				EList<Object> list = (EList<Object>) eObject
						.eGet(eStructuralFeature);
				list.removeAll(removedValues);
			}
		};
	}

	@Override
	protected Command createRemoveCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, Object value) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				@SuppressWarnings("unchecked")
				EList<Object> list = (EList<Object>) eObject
						.eGet(eStructuralFeature);
				list.remove(value);
			}
		};
	}

	@Override
	protected Command createRemoveCommand(Resource resource, EObject eObject) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				resource.getContents().remove(eObject);
			}
		};
	}

	@Override
	protected Command createSetCommand(EObject eObject,
			EStructuralFeature eStructuralFeature, Object value) {
		return new RecordingCommand(getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				if (value == SetCommand.UNSET_VALUE) {
					eObject.eUnset(eStructuralFeature);
				} else {
					eObject.eSet(eStructuralFeature, value);
				}
			}
		};
	}

	private TransactionalEditingDomain getTransactionalEditingDomain() {
		return (TransactionalEditingDomain) getEditingDomain();
	}

}
