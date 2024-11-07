package iterator;

import domain.Covid19Pacient;
import factory.SymptomFactory;
import adapter.Sorting;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
       
        Covid19Pacient pacient = new Covid19Pacient("Ane", 29);
        SymptomFactory factory = SymptomFactory.getInstance();

        pacient.addSymptom(factory.createSymptom("fiebre"), 1);
        pacient.addSymptom(factory.createSymptom("tos seca"), 2);
        pacient.addSymptom(factory.createSymptom("astenia"), 3);
        pacient.addSymptom(factory.createSymptom("cefalea"), 4);
        pacient.addSymptom(factory.createSymptom("mialgia"), 5);

        
        Covid19PacientIterator pacientAdapter = new Covid19PacientIterator(pacient);

        System.out.println("Ordenado por symptomName:");
        Iterator<Object> nameSortedIterator = Sorting.sortedIterator(pacientAdapter, new SymptomNameComparator());
        while (nameSortedIterator.hasNext()) {
            System.out.println(nameSortedIterator.next());
        }

        System.out.println("\nOrdenado por severityIndex:");
        Iterator<Object> severitySortedIterator = Sorting.sortedIterator(pacientAdapter, new SeverityIndexComparator());
        while (severitySortedIterator.hasNext()) {
            System.out.println(severitySortedIterator.next());
        }
    }
}
