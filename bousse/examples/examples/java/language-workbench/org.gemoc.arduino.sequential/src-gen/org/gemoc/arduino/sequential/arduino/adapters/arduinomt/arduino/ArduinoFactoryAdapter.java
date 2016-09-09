package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class ArduinoFactoryAdapter extends EFactoryImpl implements org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoFactory {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  
  private ArduinoFactory arduinoAdaptee = org.gemoc.arduino.sequential.arduino.arduino.ArduinoFactory.eINSTANCE;
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.DigitalPin createDigitalPin() {
    return adaptersFactory.createDigitalPinAdapter(arduinoAdaptee.createDigitalPin(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.AnalogPin createAnalogPin() {
    return adaptersFactory.createAnalogPinAdapter(arduinoAdaptee.createAnalogPin(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Sketch createSketch() {
    return adaptersFactory.createSketchAdapter(arduinoAdaptee.createSketch(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Project createProject() {
    return adaptersFactory.createProjectAdapter(arduinoAdaptee.createProject(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.ModuleAssignment createModuleAssignment() {
    return adaptersFactory.createModuleAssignmentAdapter(arduinoAdaptee.createModuleAssignment(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Delay createDelay() {
    return adaptersFactory.createDelayAdapter(arduinoAdaptee.createDelay(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Repeat createRepeat() {
    return adaptersFactory.createRepeatAdapter(arduinoAdaptee.createRepeat(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.While createWhile() {
    return adaptersFactory.createWhileAdapter(arduinoAdaptee.createWhile(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.VariableAssignment createVariableAssignment() {
    return adaptersFactory.createVariableAssignmentAdapter(arduinoAdaptee.createVariableAssignment(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerExpression createBinaryIntegerExpression() {
    return adaptersFactory.createBinaryIntegerExpressionAdapter(arduinoAdaptee.createBinaryIntegerExpression(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanExpression createBinaryBooleanExpression() {
    return adaptersFactory.createBinaryBooleanExpressionAdapter(arduinoAdaptee.createBinaryBooleanExpression(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.If createIf() {
    return adaptersFactory.createIfAdapter(arduinoAdaptee.createIf(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.IntegerConstant createIntegerConstant() {
    return adaptersFactory.createIntegerConstantAdapter(arduinoAdaptee.createIntegerConstant(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BooleanConstant createBooleanConstant() {
    return adaptersFactory.createBooleanConstantAdapter(arduinoAdaptee.createBooleanConstant(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(arduinoAdaptee.createIntegerVariable(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(arduinoAdaptee.createBooleanVariable(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BooleanModuleGet createBooleanModuleGet() {
    return adaptersFactory.createBooleanModuleGetAdapter(arduinoAdaptee.createBooleanModuleGet(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.IntegerModuleGet createIntegerModuleGet() {
    return adaptersFactory.createIntegerModuleGetAdapter(arduinoAdaptee.createIntegerModuleGet(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.UnaryBooleanExpression createUnaryBooleanExpression() {
    return adaptersFactory.createUnaryBooleanExpressionAdapter(arduinoAdaptee.createUnaryBooleanExpression(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerExpression createUnaryIntegerExpression() {
    return adaptersFactory.createUnaryIntegerExpressionAdapter(arduinoAdaptee.createUnaryIntegerExpression(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.VariableDeclaration createVariableDeclaration() {
    return adaptersFactory.createVariableDeclarationAdapter(arduinoAdaptee.createVariableDeclaration(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.IntegerVariableRef createIntegerVariableRef() {
    return adaptersFactory.createIntegerVariableRefAdapter(arduinoAdaptee.createIntegerVariableRef(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.LED createLED() {
    return adaptersFactory.createLEDAdapter(arduinoAdaptee.createLED(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.PushButton createPushButton() {
    return adaptersFactory.createPushButtonAdapter(arduinoAdaptee.createPushButton(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Buzzer createBuzzer() {
    return adaptersFactory.createBuzzerAdapter(arduinoAdaptee.createBuzzer(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.RotationSensor createRotationSensor() {
    return adaptersFactory.createRotationSensorAdapter(arduinoAdaptee.createRotationSensor(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.MicroServo createMicroServo() {
    return adaptersFactory.createMicroServoAdapter(arduinoAdaptee.createMicroServo(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.InfraRedSensor createInfraRedSensor() {
    return adaptersFactory.createInfraRedSensorAdapter(arduinoAdaptee.createInfraRedSensor(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.AmbientLightSensor createAmbientLightSensor() {
    return adaptersFactory.createAmbientLightSensorAdapter(arduinoAdaptee.createAmbientLightSensor(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.SoundSensor createSoundSensor() {
    return adaptersFactory.createSoundSensorAdapter(arduinoAdaptee.createSoundSensor(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Fan createFan() {
    return adaptersFactory.createFanAdapter(arduinoAdaptee.createFan(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.MusicPlayer createMusicPlayer() {
    return adaptersFactory.createMusicPlayerAdapter(arduinoAdaptee.createMusicPlayer(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Block createBlock() {
    return adaptersFactory.createBlockAdapter(arduinoAdaptee.createBlock(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoBoard createArduinoBoard() {
    return adaptersFactory.createArduinoBoardAdapter(arduinoAdaptee.createArduinoBoard(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BooleanVariableRef createBooleanVariableRef() {
    return adaptersFactory.createBooleanVariableRefAdapter(arduinoAdaptee.createBooleanVariableRef(), null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BluetoothTransceiver createBluetoothTransceiver() {
    return adaptersFactory.createBluetoothTransceiverAdapter(arduinoAdaptee.createBluetoothTransceiver(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getArduinoPackage();
  }
  
  public org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage getArduinoPackage() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE;
  }
}
