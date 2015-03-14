package jalgpall;

import play.*;
import java.util.Scanner;

public class Goal {
	private long goalTime;
	private String goalTeam;
	private String goalScorer;

	public Goal(String team, String scorer, long time) {
		this.goalTeam = team;
		this.goalScorer = scorer;
		this.goalTime = time;
	}

	public String toString() {
		return goalTime + " " + goalTeam + " " + goalScorer;
	}
}
