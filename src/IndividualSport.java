
public class IndividualSport extends Sport{
	private String athleteFirstName;
	private String athleteLastName;
	private int yearOfBirth;
	
	public IndividualSport(String countryOfOrigin, String athleteFirstName, String athleteLastName,
		int yearOfBirth){
		
		super(countryOfOrigin);
		this.athleteFirstName = athleteFirstName;
		this.yearOfBirth = yearOfBirth;
		this.athleteLastName = athleteLastName;
	}
	
	public IndividualSport() {
		this("Not Yet Specified", "Not Yet Specified", "Not Yet Specified", 0000);
	}
	
	public String getAthleteFirstName() {
		return athleteFirstName;
	}
	
	public void setAthleteFirstName(String athleteFirstName) {
		this.athleteFirstName = athleteFirstName;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getAthleteLastName() {
		return athleteLastName;
	}
	
	public void setAthleteLastName(String athleteLastName) {
		this.athleteLastName = athleteLastName;
	}
	
	@Override 
	public String toString(){
		return String.format("%s%nName: %s %s%nYear of birth: %s", super.toString(),
				getAthleteFirstName(), getAthleteLastName(), getYearOfBirth());
	}
}
