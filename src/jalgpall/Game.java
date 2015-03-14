package jalgpall;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private int periodLength;
	private int numberOfPeriods;
	private boolean gameRunning;
	private long gameStartTime;
	private ArrayList<Goal> goalList; 

	public Game(int periodLength) {		
		this.periodLength = periodLength;
		
		this.goalList = new ArrayList<Goal>();
	}

	public void startGame() {
		this.gameRunning = true;
		this.gameStartTime = System.currentTimeMillis();
	}
	
	public long getGameStartTime() {
		return gameStartTime;
	}

	public void endGame() {

	}
	
	public void goal() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sisesta skoorinud meeskonna nimi: ");
		String goalTeam = scan.nextLine();
		System.out.println("Sisesta skoorinud mängija nimi: ");
		String goalScorer = scan.nextLine();
		
		Goal goal = new Goal(goalTeam, goalScorer);
		
		goalList.add(goal);
	}
}
