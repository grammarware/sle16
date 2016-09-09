
package org.gemoc.arduino.sequential.arduino.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ArduinoTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("push")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getBluetoothTransceiver().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_BluetoothTransceiver_Push();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getDelay().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Delay_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getIf().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_If_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getModuleAssignment().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_ModuleAssignment_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setup")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getProject().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Project_Setup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getRepeat().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Repeat_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getVariableAssignment().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_VariableAssignment_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
						.getVariableDeclaration().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_VariableDeclaration_Execute();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
