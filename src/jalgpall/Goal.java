package jalgpall;

import play.*;
import java.util.Scanner;

public class Goal {
	private double goalTime;
	private String goalTeam;
	private String goalScorer;

	public Goal(String team, String scorer) {
		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long goalTime = ((currentTime - startTime) / 1000 / 60) + 1;
		this.goalTeam = team;
		this.goalScorer = scorer;
	}

	public String toString() {
		return goalTime + " " + goalTeam + " " + goalScorer;
	}
}
