package TD1;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;

public class Ex3 {

	public static void main(String[] args) {
		EV3ColorSensor capteurCouleur;
		capteurCouleur = new EV3ColorSensor(SensorPort.S3);
		int c = capteurCouleur.getColorID();
		if(c == Color.BLACK) {
			System.out.println("bonjour"); 
		}float[] tab = new float[3];
		capteurCouleur.getRGBMode().fetchSample(tab,0);
	}

}
