
public class BaseBall extends TeamSport {
	private int totalRuns;
	private int homeRunHits;
	private int runsBattedIn;
	private int runsAllowed;
	

	public BaseBall(String countryOfOrigin, String teamName, int numberOfPlayers, 
		int totalRuns, int homeRunHits, int runsBattedIn, int runsAllowed) {
		super(countryOfOrigin, teamName, numberOfPlayers);
		
		this.totalRuns = totalRuns;
		this.homeRunHits = homeRunHits;
		this.runsBattedIn = runsBattedIn;
		this.runsAllowed = runsAllowed;
		
	}

	public BaseBall() {
		super();
		this.totalRuns = 0;
		this.homeRunHits = 0;
		this.runsBattedIn = 0;
		this.runsAllowed = 0;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getHomeRunHits() {
		return homeRunHits;
	}

	public void setHomeRunHits(int homeRunHits) {
		this.homeRunHits = homeRunHits;
	}

	public int getRunsBattedIn() {
		return runsBattedIn;
	}

	public void setRunsBattedIn(int runsBattedIn) {
		this.runsBattedIn = runsBattedIn;
	}

	public int getRunsAllowed() {
		return runsAllowed;
	}

	public void setRunsAllowed(int runsAllowed) {
		this.runsAllowed = runsAllowed;
	}
	
	@Override
	public String toString(){
		return String.format("%s%nTotal Runs: %d Runs Batted In: %d Home run hits:%d%nRuns Allowed: %d",
				super.toString(), getTotalRuns(), getRunsBattedIn(), getHomeRunHits(), getRunsAllowed());
	}

}
