package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndexComparator implements Comparator<Object> {
	  @Override
	    public int compare(Object o1, Object o2) {
	        if (o1 instanceof Symptom && o2 instanceof Symptom) {
	            Symptom s1 = (Symptom) o1;
	            Symptom s2 = (Symptom) o2;
	            return Integer.compare(s1.getSeverityIndex(), s2.getSeverityIndex());
	        }
	        throw new IllegalArgumentException("Expected Symptom objects");
	    }

}
