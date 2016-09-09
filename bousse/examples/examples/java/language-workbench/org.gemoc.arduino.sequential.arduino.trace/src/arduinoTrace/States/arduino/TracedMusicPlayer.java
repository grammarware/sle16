/**
 */
package arduinoTrace.States.arduino;

import org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Music Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedMusicPlayer#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedMusicPlayer()
 * @model
 * @generated
 */
public interface TracedMusicPlayer extends TracedArduinoAnalogModule {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(MusicPlayer)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedMusicPlayer_OriginalObject()
	 * @model
	 * @generated
	 */
	MusicPlayer getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedMusicPlayer#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(MusicPlayer value);

} // TracedMusicPlayer
