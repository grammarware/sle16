package org.gemoc.arduino.sequential.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor;
import org.gemoc.arduino.sequential.arduino.arduino.AnalogPin;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoCommunicationModule;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoModule;
import org.gemoc.arduino.sequential.arduino.arduino.Assignment;
import org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.sequential.arduino.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.arduino.arduino.Block;
import org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.arduino.arduino.Board;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.sequential.arduino.arduino.Buzzer;
import org.gemoc.arduino.sequential.arduino.arduino.Constant;
import org.gemoc.arduino.sequential.arduino.arduino.Control;
import org.gemoc.arduino.sequential.arduino.arduino.Delay;
import org.gemoc.arduino.sequential.arduino.arduino.DigitalPin;
import org.gemoc.arduino.sequential.arduino.arduino.Expression;
import org.gemoc.arduino.sequential.arduino.arduino.Fan;
import org.gemoc.arduino.sequential.arduino.arduino.If;
import org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor;
import org.gemoc.arduino.sequential.arduino.arduino.Instruction;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerExpression;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.sequential.arduino.arduino.LED;
import org.gemoc.arduino.sequential.arduino.arduino.MicroServo;
import org.gemoc.arduino.sequential.arduino.arduino.Module;
import org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.arduino.arduino.ModuleGet;
import org.gemoc.arduino.sequential.arduino.arduino.ModuleInstruction;
import org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer;
import org.gemoc.arduino.sequential.arduino.arduino.NamedElement;
import org.gemoc.arduino.sequential.arduino.arduino.Pin;
import org.gemoc.arduino.sequential.arduino.arduino.Project;
import org.gemoc.arduino.sequential.arduino.arduino.PushButton;
import org.gemoc.arduino.sequential.arduino.arduino.Repeat;
import org.gemoc.arduino.sequential.arduino.arduino.RotationSensor;
import org.gemoc.arduino.sequential.arduino.arduino.Sketch;
import org.gemoc.arduino.sequential.arduino.arduino.SoundSensor;
import org.gemoc.arduino.sequential.arduino.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.sequential.arduino.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.arduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.sequential.arduino.arduino.Utilities;
import org.gemoc.arduino.sequential.arduino.arduino.Variable;
import org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment;
import org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration;
import org.gemoc.arduino.sequential.arduino.arduino.VariableRef;
import org.gemoc.arduino.sequential.arduino.arduino.While;

@SuppressWarnings("all")
public class ArduinoMTAdaptersFactory implements AdaptersFactory {
  private static org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory instance;
  
  public static org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ArduinoMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.DigitalPin){
    	return createDigitalPinAdapter((org.gemoc.arduino.sequential.arduino.arduino.DigitalPin) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.AnalogPin){
    	return createAnalogPinAdapter((org.gemoc.arduino.sequential.arduino.arduino.AnalogPin) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Sketch){
    	return createSketchAdapter((org.gemoc.arduino.sequential.arduino.arduino.Sketch) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Project){
    	return createProjectAdapter((org.gemoc.arduino.sequential.arduino.arduino.Project) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment){
    	return createModuleAssignmentAdapter((org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Delay){
    	return createDelayAdapter((org.gemoc.arduino.sequential.arduino.arduino.Delay) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Repeat){
    	return createRepeatAdapter((org.gemoc.arduino.sequential.arduino.arduino.Repeat) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.While){
    	return createWhileAdapter((org.gemoc.arduino.sequential.arduino.arduino.While) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment){
    	return createVariableAssignmentAdapter((org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerExpression){
    	return createBinaryIntegerExpressionAdapter((org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression){
    	return createBinaryBooleanExpressionAdapter((org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.If){
    	return createIfAdapter((org.gemoc.arduino.sequential.arduino.arduino.If) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant){
    	return createIntegerConstantAdapter((org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant){
    	return createBooleanConstantAdapter((org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable){
    	return createIntegerVariableAdapter((org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet){
    	return createBooleanModuleGetAdapter((org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerModuleGet){
    	return createIntegerModuleGetAdapter((org.gemoc.arduino.sequential.arduino.arduino.IntegerModuleGet) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.UnaryBooleanExpression){
    	return createUnaryBooleanExpressionAdapter((org.gemoc.arduino.sequential.arduino.arduino.UnaryBooleanExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.UnaryIntegerExpression){
    	return createUnaryIntegerExpressionAdapter((org.gemoc.arduino.sequential.arduino.arduino.UnaryIntegerExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration){
    	return createVariableDeclarationAdapter((org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerVariableRef){
    	return createIntegerVariableRefAdapter((org.gemoc.arduino.sequential.arduino.arduino.IntegerVariableRef) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.LED){
    	return createLEDAdapter((org.gemoc.arduino.sequential.arduino.arduino.LED) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.PushButton){
    	return createPushButtonAdapter((org.gemoc.arduino.sequential.arduino.arduino.PushButton) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Buzzer){
    	return createBuzzerAdapter((org.gemoc.arduino.sequential.arduino.arduino.Buzzer) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.RotationSensor){
    	return createRotationSensorAdapter((org.gemoc.arduino.sequential.arduino.arduino.RotationSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.MicroServo){
    	return createMicroServoAdapter((org.gemoc.arduino.sequential.arduino.arduino.MicroServo) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor){
    	return createInfraRedSensorAdapter((org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor){
    	return createAmbientLightSensorAdapter((org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.SoundSensor){
    	return createSoundSensorAdapter((org.gemoc.arduino.sequential.arduino.arduino.SoundSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Fan){
    	return createFanAdapter((org.gemoc.arduino.sequential.arduino.arduino.Fan) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer){
    	return createMusicPlayerAdapter((org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Block){
    	return createBlockAdapter((org.gemoc.arduino.sequential.arduino.arduino.Block) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard){
    	return createArduinoBoardAdapter((org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((org.gemoc.arduino.sequential.arduino.arduino.BooleanVariableRef) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver){
    	return createBluetoothTransceiverAdapter((org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) o, res);
    }
    
    return null;
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BoardAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DigitalPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DigitalPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DigitalPinAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PinAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AnalogPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AnalogPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AnalogPinAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SketchAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SketchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SketchAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ProjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ProjectAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InstructionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAssignmentAdapter createModuleAssignmentAdapter(final ModuleAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleAssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleInstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleInstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleInstructionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ControlAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ControlAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ControlAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UtilitiesAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UtilitiesAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UtilitiesAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DelayAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DelayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.DelayAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.NamedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RepeatAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RepeatAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RepeatAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ModuleGetAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.WhileAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.WhileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.WhileAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryIntegerExpressionAdapter createBinaryIntegerExpressionAdapter(final BinaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryIntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryIntegerExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryBooleanExpressionAdapter createBinaryBooleanExpressionAdapter(final BinaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryBooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BinaryBooleanExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ConstantAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IfAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IfAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerConstantAdapter createIntegerConstantAdapter(final IntegerConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerConstantAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanConstantAdapter createBooleanConstantAdapter(final BooleanConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanConstantAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanModuleGetAdapter createBooleanModuleGetAdapter(final BooleanModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanModuleGetAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerModuleGetAdapter createIntegerModuleGetAdapter(final IntegerModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerModuleGetAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryBooleanExpressionAdapter createUnaryBooleanExpressionAdapter(final UnaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryBooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryBooleanExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryIntegerExpressionAdapter createUnaryIntegerExpressionAdapter(final UnaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryIntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.UnaryIntegerExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableDeclarationAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableRefAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableRefAdapter createIntegerVariableRefAdapter(final IntegerVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.IntegerVariableRefAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.LEDAdapter createLEDAdapter(final LED adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.LEDAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.LEDAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.LEDAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PushButtonAdapter createPushButtonAdapter(final PushButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PushButtonAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PushButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.PushButtonAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BuzzerAdapter createBuzzerAdapter(final Buzzer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BuzzerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BuzzerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BuzzerAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RotationSensorAdapter createRotationSensorAdapter(final RotationSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RotationSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RotationSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.RotationSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MicroServoAdapter createMicroServoAdapter(final MicroServo adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MicroServoAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MicroServoAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MicroServoAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InfraRedSensorAdapter createInfraRedSensorAdapter(final InfraRedSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InfraRedSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InfraRedSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.InfraRedSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AmbientLightSensorAdapter createAmbientLightSensorAdapter(final AmbientLightSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AmbientLightSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AmbientLightSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.AmbientLightSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SoundSensorAdapter createSoundSensorAdapter(final SoundSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SoundSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SoundSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.SoundSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.FanAdapter createFanAdapter(final Fan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.FanAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.FanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.FanAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MusicPlayerAdapter createMusicPlayerAdapter(final MusicPlayer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MusicPlayerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MusicPlayerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.MusicPlayerAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoModuleAdapter createArduinoModuleAdapter(final ArduinoModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoBoardAdapter createArduinoBoardAdapter(final ArduinoBoard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoBoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoBoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoBoardAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoDigitalModuleAdapter createArduinoDigitalModuleAdapter(final ArduinoDigitalModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoDigitalModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoDigitalModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoDigitalModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoAnalogModuleAdapter createArduinoAnalogModuleAdapter(final ArduinoAnalogModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoAnalogModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoAnalogModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoAnalogModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanVariableRefAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoCommunicationModuleAdapter createArduinoCommunicationModuleAdapter(final ArduinoCommunicationModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoCommunicationModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoCommunicationModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoCommunicationModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BluetoothTransceiverAdapter createBluetoothTransceiverAdapter(final BluetoothTransceiver adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BluetoothTransceiverAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BluetoothTransceiverAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BluetoothTransceiverAdapter) adapter;
    }
  }
}
