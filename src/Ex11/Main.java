package Ex11;

import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Main {

	public static void main(String[] args) {
		Button.waitForAnyPress(); 
		EV3ColorSensor cs = (EV3ColorSensor) new EV3ColorSensor(SensorPort.S3);
		float[]sample = new float[]{0f};
		Behavior b1 = new DriveForward(cs);
		Behavior b2 = new Rotation(cs);
		Behavior[] tab = new Behavior[] {b1, b2 };
		Arbitrator arby = new Arbitrator(tab);
		arby.go();

	}

}
