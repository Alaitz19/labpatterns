package adapter2;

import domain.Covid19Pacient;
import java.util.Observable;
import observer.PacientSymptomGUI;

public class Main {

	public static void main(String[] args) {
		//Lehen bi galderak
	/*	
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
Covid19Pacient pacient2=new Covid19Pacient("ana", 55);
		
		pacient2.addSymptomByName("fiebre", 2);
		pacient2.addSymptomByName("tos seca", 1);
		pacient2.addSymptomByName("escalofrios", 3);
		
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		gui2.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
	*/
		//Hautazkoa

		Observable pacient=new Covid19Pacient("aitor", 35);
		
		((Covid19Pacient)pacient).addSymptomByName("disnea", 2);
		((Covid19Pacient)pacient).addSymptomByName("cefalea", 2);
		((Covid19Pacient)pacient).addSymptomByName("astenia", 2);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		
		new PacientSymptomGUI((Covid19Pacient) pacient);
		
		gui.setVisible(true);
		

	}

}
