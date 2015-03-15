package jalgpall;

import play.*;
import java.util.Scanner;

public class Goal {
	private long goalTime;
	private String goalTeam;
	private String goalScorer;
	
	/**
	 * Värava konstruktor.
	 * @param team Värava löönud meeskonna nimi.
	 * @param scorer Värava löönud mängija nimi.
	 * @param time Värava aeg.
	 */
	public Goal(String team, String scorer, long time) {
		this.goalTeam = team;
		this.goalScorer = scorer;
		this.goalTime = time;
	}

	public String toString() {
		return "Värava aeg: " + goalTime + ". minut \nVärava löönud meeskond: " + goalTeam + " \nVärava löönud mängija: " + goalScorer;
	}
}
