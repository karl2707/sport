package jalgpall;

public class Team {
	private String teamName;
	
	
	/**
	 * @param teamName Meeskonna nimi.
	 */
	Team(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	public String toString() {
		return teamName;
	}
}
