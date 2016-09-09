package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.arduino.aspects.Block_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Repeat_ExecutableAspectRepeatAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Block;
import org.gemoc.arduino.sequential.arduino.arduino.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class Repeat_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Repeat _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Repeat_ExecutableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Repeat_ExecutableAspectRepeatAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Repeat){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.arduino.sequential.arduino.aspects.Repeat_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.Repeat)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"Repeat","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Control){
    					org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Control)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Repeat _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Repeat_ExecutableAspectRepeatAspectProperties _self_, final Repeat _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block _block = _self.getBlock();
      Block_ExecutableAspect.execute(_block);
    }
    Instruction_ExecutableAspect.finalize(_self);
  }
}
