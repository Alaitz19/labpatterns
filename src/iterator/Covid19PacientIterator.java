package iterator;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;
import java.util.ArrayList;

import adapter.InvertedIterator;


public class Covid19PacientIterator implements Iterator,InvertedIterator{
	List<Symptom> symptoms=new Vector<Symptom>();
	ListIterator<Symptom> iterator;
	
	int position=0;
	 public Covid19PacientIterator(Covid19Pacient pacient) {
	        
	        this.symptoms = new ArrayList<>(pacient.getSymptoms());
	        this.goLast(); 
	    }

	public Covid19PacientIterator(Set<Symptom> s) {
		Iterator<Symptom> i=s.iterator();
		while (i.hasNext())
			symptoms.add(i.next());
	}

	@Override
	public boolean hasNext() {
		return position<symptoms.size();
	}

	@Override
	public Object next() {
		Symptom symptom=symptoms.get(position);
		position++;
		return symptom;
	}

	@Override
	public Object previous() {
		return iterator.previous();
	}

	@Override
	public boolean hasPrevious() {
		return iterator.hasPrevious();
	}

	@Override
	public void goLast() {
		this.iterator = symptoms.listIterator(symptoms.size());
		
	}

}
