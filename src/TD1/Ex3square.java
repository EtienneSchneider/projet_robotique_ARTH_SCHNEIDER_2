package TD1;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;

public class Ex3square {

	public static void main(String[] args) {
		Button.waitForAnyPress(); 
		for(int i=0;i<4;i++) {
			Motor.B.setSpeed(300); Motor.C.setSpeed(300);
			Motor.C.forward(); Motor.B.forward();
			Delay.msDelay(1500);
			Motor.B.stop(); Motor.C.stop();
			Motor.C.rotate(386);
		}
	}

}
