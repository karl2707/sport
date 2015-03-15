package jalgpall;

import play.*;
import java.util.Scanner;

public class Goal {
	private long goalTime;
	private String goalTeam;
	private String goalScorer;
	
	/**
	 * V�rava konstruktor.
	 * @param team V�rava l��nud meeskonna nimi.
	 * @param scorer V�rava l��nud m�ngija nimi.
	 * @param time V�rava aeg.
	 */
	public Goal(String team, String scorer, long time) {
		this.goalTeam = team;
		this.goalScorer = scorer;
		this.goalTime = time;
	}

	public String toString() {
		return "V�rava aeg: " + goalTime + ". minut \nV�rava l��nud meeskond: " + goalTeam + " \nV�rava l��nud m�ngija: " + goalScorer;
	}
}
