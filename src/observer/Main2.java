package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main2 {
	public static void main(String args[]) {
		Observable pacient = new Covid19Pacient("Aitor", 35);
		new PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientObserverGUI(pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
		
		Observable pacient2 = new Covid19Pacient("Ana", 55);
		new PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientObserverGUI(pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);
		
		Observable pacient3 = new Covid19Pacient("Igor", 15);
		new PacientSymptomGUI((Covid19Pacient) pacient3);
		new PacientObserverGUI(pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);
		
	}

}
