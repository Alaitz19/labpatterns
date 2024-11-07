package domain;

public class MovilitySymptom implements Symptom {

    private String name;
    private int covidImpact;
    private int severityIndex;

    public MovilitySymptom(String name, int severityIndex, int covidImpact) {
        this.name = name;
        this.severityIndex = severityIndex;
        this.covidImpact = covidImpact;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCovidImpact() {
        return covidImpact;
    }

    @Override
    public void setCovidImpact(int covidImpact) {
        this.covidImpact = covidImpact;
    }

    @Override
    public int getSeverityIndex() {
        return severityIndex;
    }

    @Override
    public void setSeverityIndex(int severityIndex) {
        this.severityIndex = severityIndex;
    }

}
