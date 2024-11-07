package adapter2;

import java.awt.Component;
import java.awt.Font;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
import javax.swing.table.TableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class ShowPacientTableGUI extends JFrame implements Observer {

	JTable table;
	Covid19Pacient pacient;

	public ShowPacientTableGUI(Observable pacient) {
		this.pacient = (Covid19Pacient) pacient;

		this.setTitle("Covid Symptoms " + this.pacient.getName());

		setFonts();

		TableModel tm = new Covid19PacientTableModelAdapter(this.pacient);
		table = new JTable(tm);
		table.setRowHeight(36);
		JScrollPane pane = new JScrollPane(table);
		pane.setPreferredSize(new java.awt.Dimension(300, 200));
		this.getContentPane().add(pane);
		pacient.addObserver(this);
	}

	public void update(Observable o, Object args) {
		Covid19Pacient p = (Covid19Pacient) o;
		table.setModel(new Covid19PacientTableModelAdapter(p));
	}

	private static void setFonts() {
		Font font = new Font("Dialog", Font.PLAIN, 18);
		UIManager.put("Table.font", font);
		UIManager.put("TableHeader.font", font);
	}
}