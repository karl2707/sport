package jalgpall;

public class Team {
	private String teamName;
	private int goals;
	private int fouls;

	/**
	 * @param teamName
	 *            Meeskonna nimi.
	 */
	Team(String teamName) {
		super();
		this.teamName = teamName;
		this.goals = 0;
		this.fouls = 0;
	}

	String getTeamName() {
		return teamName;
	}

	int getGoals() {
		return goals;
	}
	/**
	 * Lisab ühe värava.
	 */
	protected void addGoal() {
		this.goals ++;
	}

	int getFouls() {
		return fouls;
	}
	
	/**
	 * Lisab ühe vea.
	 */
	protected void addFoul() {
		this.fouls ++;
	}
	
	public String toString() {
		return teamName;
	}
}
