package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.Sketch;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements org.gemoc.arduino.sequential.arduinomt.arduino.Sketch {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Project getProject() {
    return () adaptersFactory.createAdapter(adaptee.getProject(), eResource);
  }
  
  @Override
  public void setProject(final org.gemoc.arduino.sequential.arduinomt.arduino.Project o) {
    if (o != null)
    	adaptee.setProject(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ProjectAdapter) o).getAdaptee());
    else adaptee.setProject(null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Block getBlock() {
    return () adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final org.gemoc.arduino.sequential.arduinomt.arduino.Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Board getBoard() {
    return () adaptersFactory.createAdapter(adaptee.getBoard(), eResource);
  }
  
  @Override
  public void setBoard(final org.gemoc.arduino.sequential.arduinomt.arduino.Board o) {
    if (o != null)
    	adaptee.setBoard(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BoardAdapter) o).getAdaptee());
    else adaptee.setBoard(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getSketch();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		return getProject();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__BOARD:
    		return getBoard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		return getProject() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__BOARD:
    		return getBoard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		setProject(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Project)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		setBlock(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Block)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.SKETCH__BOARD:
    		setBoard(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Board)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
