package Ex11;

import lejos.hardware.motor.Motor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior{
	EV3ColorSensor sensor;
	int colorID;

	@Override
	public boolean takeControl() {
		return sensor.getColorID()==Color.BLACK;
	}

	@Override
	public void action() {
		Motor.B.forward();
		Motor.C.forward();
	}

	@Override
	public void suppress() {
		Motor.B.stop(true);
		Motor.C.stop(true);
	}
	
	public DriveForward(EV3ColorSensor s) {
		this.sensor=s;
	}
	
	

}
