package Ex11;

import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.*;
import lejos.robotics.navigation.MovePilot;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.subsumption.Behavior;

public class Rotation implements Behavior{
	EV3ColorSensor sensor;
	Wheel wheel1 = WheeledChassis.modelWheel(Motor.B,56).offset(-60);
	Wheel wheel2 = WheeledChassis.modelWheel(Motor.C,56).offset(60);
	Chassis chassis = new WheeledChassis(new Wheel[] {wheel1, wheel2},2);
	MovePilot pilot = new MovePilot(chassis);
	int colorID;

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return sensor.getColorID()!=Color.BLACK;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		pilot.rotate(-2);
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
	}
	
	public Rotation(EV3ColorSensor s) {
		this.sensor=s;
	}
	

}
