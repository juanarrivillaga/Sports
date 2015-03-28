
public class Soccer extends TeamSport {
	private int goalsScored;
	private int goalsAllowed;
	private int yellowCards;
	private int redCards;
	
	public Soccer(String countryOfOrigin, String teamName, int numberOfPlayers, 
		int goalsScored, int goalsAllowed, int yellowCards, int redCards) {
		
		super(countryOfOrigin, teamName, numberOfPlayers);
		this.setGoalsScored(goalsScored);
		this.setGoalsAllowed(goalsAllowed);
		this.setYellowCards(yellowCards);
		this.setRedCards(redCards);
		
	}

	public Soccer() {
		super();
		this.setGoalsScored(0);
		this.setGoalsAllowed(0);
		this.setYellowCards(0);
		this.setRedCards(0);
	}

	public int getGoalsScored() {
		return goalsScored;
	}


	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public int getGoalsAllowed() {
		return goalsAllowed;
	}

	public void setGoalsAllowed(int goalsAllowed) {
		this.goalsAllowed = goalsAllowed;
	}

	public int getYellowCards() {
		return yellowCards;
	}

	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}

	public int getRedCards() {
		return redCards;
	}

	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}
	
	@Override
	public String toString(){
		return String.format("%s%nGoals Scored: %d Goals Allowed: %d%nYellow Cards: %d Red Cards: %d", 
			super.toString(), getGoalsScored(), getGoalsAllowed(), getYellowCards(), getRedCards());
	}

}
