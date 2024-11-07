package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import factory.SymptomFactory;


public class Medicament {
	private String name;
	private List<Symptom> symptoms=new ArrayList<Symptom>();
	 private SymptomFactory sf;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Medicament(String name) {
		super();
		this.name = name;
		 this.sf = SymptomFactory.getInstance();
	}

	public Symptom addSymptomByName(String symptom){
		 Symptom existingSymptom = getSymptomByName(symptom);
	        if (existingSymptom == null) {
	            Symptom newSymptom = sf.createSymptom(symptom);            if (newSymptom != null) {
	                symptoms.add(newSymptom);
	                return newSymptom;
	            }
	        }
	        return existingSymptom;

	}
	public void removeSymptom(Symptom s){
		symptoms.remove(s);

	}
	public Iterator<Symptom> getSymptoms() {
		return symptoms.iterator();
	}
	public Symptom getSymptomByName(String symptomName) {
		Iterator<Symptom> i= symptoms.iterator();
		Symptom s=null;
		while (i.hasNext()) {
			s=i.next();
			if (s!=null && s.getName().compareTo(symptomName)==0) return s;
		}
		return null;	
	}
	public Symptom removeSymptomByName(String symptomName) {
		Symptom s=getSymptomByName(symptomName);
		if (s!=null)removeSymptom(s);
		return s;
	}
	}
