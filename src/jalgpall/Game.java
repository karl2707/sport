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
	 * Loob uue m�ngu isendi.
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
	 * Alustab m�ngu.
	 * Paneb paika m�ngu algushetke.
	 */
	public void startGame() {
		this.gameRunning = true;
		this.gameStartTime = System.currentTimeMillis();
	}
	
	public void endGame() {

	}
	
	/**
	 * Meetodi abil luuakse uus v�rava objekt ja lisatakse see v�ravate listi.
	 * K�igepealt leiab meetod v�rava l��mise aja ja seej�rel k�sitakse 
	 * kasutaja k�est v�rava l��nud meeskonna ja m�ngija nime.
	 */
	public void goal() {
		
		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long goalTime = ((currentTime - startTime) / 1000 / 60) + 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sisesta skoorinud meeskonna nimi: ");
		String goalTeam = scan.nextLine();
		System.out.println("Sisesta skoorinud m�ngija nimi: ");
		String goalScorer = scan.nextLine();
		
		Goal goal = new Goal(goalTeam, goalScorer, goalTime);
		
		goalList.add(goal);
	}
}
