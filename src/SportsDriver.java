
public class SportsDriver {
	public static void main(String[] args) {
		Sport[] sportsArray = new Sport[4];
		sportsArray[0] = new Soccer("United Kingdom", "Westshire United", 20, 15, 6, 1, 0);
		sportsArray[1] = new BaseBall("United States", "Richmond Rebels", 25, 43, 13, 30, 22);
		sportsArray[2] = new Tennis("Spain", "Rodrigo", "Federero", 1981, 81, 2, 1);
		sportsArray[3] = new Golf("United States", "Bill", "Ficklson", 1970, 51);
		
		// process Sports objects polymorphically...
		for (int counter = 0; counter < sportsArray.length; counter++){
			System.out.println(sportsArray[counter].toString());
			System.out.println();
		}
	}
}
/* Sample output:
Country of Origin: United Kingdom
Team Name: Westshire United
Number of players on team: 20
Goals Scored: 15 Goals Allowed: 6
Yellow Cards: 1 Red Cards: 0

Country of Origin: United States
Team Name: Richmond Rebels
Number of players on team: 25
Total Runs: 43 Runs Batted In: 30 Home run hits:13
Runs Allowed: 22

Country of Origin: Spain
Name: Rodrigo Federero
Year of birth: 1981
Career Titles: 81
Current Rank: 1 Highest Rank: 2

Country of Origin: United States
Name: Bill Ficklson
Year of birth: 1970
Career Wins: 51

*/