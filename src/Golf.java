
public class Golf extends IndividualSport {
	private int careerWins;
	
	public Golf(String countryOfOrigin, String athleteFirstName,
			String athleteLastName, int yearOfBirth, int careerWins) {
		super(countryOfOrigin, athleteFirstName, athleteLastName, yearOfBirth);
		this.careerWins = careerWins;
	}

	public Golf() {
		super();
		careerWins = 0;
	}

	public int getCareerWins() {
		return careerWins;
	}

	public void setCareerWins(int careerWins) {
		this.careerWins = careerWins;
	}
	
	@Override 
	
	public String toString(){
		return String.format("%s%nCareer Wins: %d", super.toString(), getCareerWins());
	}

}
