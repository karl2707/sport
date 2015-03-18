package jalgpall;

public class Goal {
	private long goalTime;
	private Team goalTeam;
	private Player goalScorer;
	
	/**
	 * Värava konstruktor.
	 * @param team Värava löönud meeskonna objekt
	 * @param scorer Värava löönud mängija objekt
	 * @param time Värava aeg
	 */
	public Goal(Team team, Player scorer, long time) {
		this.goalTeam = team;
		this.goalScorer = scorer;
		this.goalTime = time;
	}

	public String toString() {
		return "Värava aeg: " + goalTime + ". minut \nVärava löönud meeskond: " + goalTeam + " \nVärava löönud mängija: " + goalScorer;
	}
}
