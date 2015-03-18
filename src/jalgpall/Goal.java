package jalgpall;

public class Goal {
	private long goalTime;
	private Team goalTeam;
	private Player goalScorer;
	
	/**
	 * V�rava konstruktor.
	 * @param team V�rava l��nud meeskonna objekt
	 * @param scorer V�rava l��nud m�ngija objekt
	 * @param time V�rava aeg
	 */
	public Goal(Team team, Player scorer, long time) {
		this.goalTeam = team;
		this.goalScorer = scorer;
		this.goalTime = time;
	}

	public String toString() {
		return "V�rava aeg: " + goalTime + ". minut \nV�rava l��nud meeskond: " + goalTeam + " \nV�rava l��nud m�ngija: " + goalScorer;
	}
}
