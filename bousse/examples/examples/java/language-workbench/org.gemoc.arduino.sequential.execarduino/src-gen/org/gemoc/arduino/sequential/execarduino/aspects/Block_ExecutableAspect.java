package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.gemoc.arduino.sequential.execarduino.arduino.Block;
import org.gemoc.arduino.sequential.execarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.execarduino.aspects.Block_ExecutableAspectBlockAspectProperties;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class Block_ExecutableAspect {
  public static void execute(final Block _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Block_ExecutableAspectBlockAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Block_ExecutableAspectBlockAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);;
  }
  
  protected static void _privk3_execute(final Block_ExecutableAspectBlockAspectProperties _self_, final Block _self) {
    EList<Instruction> _instructions = _self.getInstructions();
    final Consumer<Instruction> _function = (Instruction i) -> {
      Instruction_ExecutableAspect.execute(i);
    };
    _instructions.forEach(_function);
  }
}
