package jalgpall;

import java.util.ArrayList;
import java.util.Scanner;

import play.Peaklass;

public class Game {
	private int periodLength;
	private int numberOfPeriods;
	private boolean gameRunning;
	private long gameStartTime;
	private ArrayList<Goal> goalList; 
	
	/**
	 * Loob uue mängu isendi.
	 * @param periodLength Poolaja pikkus.
	 */
	public Game(int periodLength) {		
		this.periodLength = periodLength;
		goalList = new ArrayList<Goal>();
	}
	
	public long getGameStartTime() {
		return gameStartTime;
	}

	public ArrayList<Goal> getGoalList() {
		return goalList;
	}

	/**
	 * Alustab mängu.
	 * Paneb paika mängu algushetke.
	 */
	public void startGame() {
		this.gameRunning = true;
		this.gameStartTime = System.currentTimeMillis();
	}
	
	public void endGame() {

	}
	
	/**
	 * Meetodi abil luuakse uus värava objekt ja lisatakse see väravate listi.
	 * Kõigepealt leiab meetod värava löömise aja ja seejärel küsitakse 
	 * kasutaja käest värava löönud meeskonna ja mängija nime.
	 */
	public void goal() {
		
		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long goalTime = ((currentTime - startTime) / 1000 / 60) + 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sisesta skoorinud meeskonna nimi: ");
		String goalTeam = scan.nextLine();
		System.out.println("Sisesta skoorinud mängija nimi: ");
		String goalScorer = scan.nextLine();
		
		Goal goal = new Goal(goalTeam, goalScorer, goalTime);
		
		goalList.add(goal);
	}
}
