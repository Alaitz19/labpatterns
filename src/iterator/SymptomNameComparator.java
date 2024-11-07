package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SymptomNameComparator implements Comparator<Object> {
	 @Override
	    public int compare(Object o1, Object o2) {
	        if (o1 instanceof Symptom && o2 instanceof Symptom) {
	            Symptom s1 = (Symptom) o1;
	            Symptom s2 = (Symptom) o2;
	            return s1.getName().compareTo(s2.getName());
	        }
	        throw new IllegalArgumentException("Expected Symptom objects");
	    }
	

}
