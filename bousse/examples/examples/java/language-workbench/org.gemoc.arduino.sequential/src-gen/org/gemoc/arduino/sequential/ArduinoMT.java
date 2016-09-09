package org.gemoc.arduino.sequential;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ArduinoMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoFactory getArduinoFactory();
  
  public abstract void save(final String uri) throws IOException;
}
