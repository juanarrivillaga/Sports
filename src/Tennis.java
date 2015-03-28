
public class Tennis extends IndividualSport {
	private int careerTitles;
	private int highestRank;
	private int currentRank;

	public Tennis(String countryOfOrigin, String athleteFirstName, String athleteLastName,
			int yearOfBirth, int careerTitles, int highestRank, int currentRank) {
		
		super(countryOfOrigin, athleteFirstName, athleteLastName, yearOfBirth);
		this.careerTitles = careerTitles;
		this.highestRank = highestRank;
		this.currentRank = currentRank;
		
	}

	public Tennis() {
		super();
		this.careerTitles = 0;
		this.highestRank = 0;
		this.currentRank = 0;
		
		
	}

	public int getCareerTitles() {
		return careerTitles;
	}

	public void setCareerTitles(int careerTitles) {
		this.careerTitles = careerTitles;
	}
	public int getHighestRank(){
		return highestRank;
	}
	public void setHighestRank(int highestRank){
		this.highestRank = highestRank;
	}
	public int getCurrentRank() {
		return currentRank;
	}

	public void setCurrentRank(int currentRank) {
		this.currentRank = currentRank;
	}
	
	@Override
	public String toString(){
		return String.format("%s%nCareer Titles: %d%nCurrent Rank: %d Highest Rank: %d",
				super.toString(), getCareerTitles(), getCurrentRank(), getHighestRank());
	}

}
