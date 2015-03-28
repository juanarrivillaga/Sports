
public class TeamSport extends Sport{

	private String teamName;
	private int numberOfPlayers; // this field stores the number of players registered for the team
	
	public TeamSport(String countryOfOrigin, String teamName, int numberOfPlayers){
		super(countryOfOrigin);
		this.teamName = teamName;
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public TeamSport() {
		super();
		this.teamName = "Not Yet Specified";
		this.numberOfPlayers = 0;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	@Override 
	public String toString(){
		return String.format("%s%nTeam Name: %s%nNumber of players on team: %d", 
				super.toString(), getTeamName(), getNumberOfPlayers());
	}

}
