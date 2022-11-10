package Ex11;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class IsLine implements Behavior{
	private Arbitrator arby;
	EV3ColorSensor sensor;
	int colorID;
	
	public IsLine(EV3ColorSensor s) {
		this.sensor=s;
	}
	
	
	public boolean takeControl() {
		return sensor.getColorID()!=Color.BLACK;
	}
	
	public void suppress() {
		this.sensor.close();
	}
	
	public void action() {
		System.out.println("stop");

	}
}