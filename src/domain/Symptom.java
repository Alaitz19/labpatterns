package domain;

public interface Symptom {
	
	public String getName();
	public void setName(String name);
	public int getCovidImpact();
	public void setCovidImpact(int covidImpact);
	public int getSeverityIndex() ;
	public void setSeverityIndex(int severityIndex);

}
