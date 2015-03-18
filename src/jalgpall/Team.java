package jalgpall;

import java.util.ArrayList;

public class Team {
	private String teamName;
	private ArrayList players;
	private ArrayList<Goal> goals = new ArrayList<Goal>();
	private ArrayList<Foul> fouls = new ArrayList<Foul>();

	/**
	 * @param teamName Meeskonna nimi.
	 */
	public Team(String teamName, ArrayList<Player> players) {
		super();
		this.teamName = teamName;
		this.players = players;
	}

	String getTeamName() {
		return teamName;
	}

	int getGoals() {
		return goals.size();
	}
	/**
	 * Lisab ühe värava.
	 */
	protected void addGoal(Goal goal) {
		this.goals.add(goal);
	}

	int getFouls() {
		return fouls.size();
	}
	
	/**
	 * Lisatakse vigade listi uus viga.
	 * @param foul Vea objekt. 
	 */
	protected void addFoul(Foul foul) {
		fouls.add(foul);
	}
	
	public String toString() {
		return teamName;
	}
}
