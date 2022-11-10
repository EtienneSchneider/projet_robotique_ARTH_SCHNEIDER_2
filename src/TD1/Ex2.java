package TD1;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class Ex2 {

	public static void main(String[] args) {
		Button.waitForAnyPress(); 
		Motor.B.setSpeed(300); Motor.C.setSpeed(300);
		Motor.C.forward(); Motor.B.forward();
		Delay.msDelay(5000);
		Motor.B.stop(); Motor.C.stop();
	}

}
