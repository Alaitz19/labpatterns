package adapter2;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel implements TableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] { "Symptom", "Weight" };

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient = p;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int i) {

		return columnNames[i];
	}

	public int getRowCount() {

		return pacient.getSymptoms().size();
	}

	public Object getValueAt(int row, int col) {
		Object Symptom = pacient.getSymptoms().toArray()[row];
		if (col == 0) {
			Symptom s = (Symptom) Symptom;
			return (Object) s.getName();
		} else {
			return pacient.getWeight((Symptom) Symptom);
		}
	}

}
