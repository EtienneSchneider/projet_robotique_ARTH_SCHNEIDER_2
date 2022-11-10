package Ex11;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class EmergencyStop implements Behavior{
	
	private EV3TouchSensor ts;
	private Arbitrator arby;
	
	public boolean takeControl() {
		return Button.LEFT.isDown();
	}
	
	public void suppress() {
		System.exit(0);
	}
	
	public void action() {
		Motor.B.stop(true);
		Motor.C.stop(true);
		ts.close();
		arby.stop();
	}
	
	public EmergencyStop(EV3TouchSensor t) {
		this.ts = t;
	}
	
	public void setArby(Arbitrator a) {
		this.arby = a;
	}

}
