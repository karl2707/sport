package jalgpall;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import play.Peaklass;

public class Game {
	private int periodLength;
	private boolean gameRunning;
	private long gameStartTime;
	private ArrayList<Goal> goalList = new ArrayList<Goal>();
	private ArrayList<Foul> foulList = new ArrayList<Foul>();
	private ArrayList<Team> teamList = new ArrayList<Team>();

	/**
	 * Loob uue m�ngu isendi.
	 * 
	 * @param periodLength
	 *            Poolaja pikkus.
	 */
	public Game(int periodLength) {
		this.periodLength = periodLength;
	}

	public long getGameStartTime() {
		return gameStartTime;
	}

	public ArrayList<Goal> getGoalList() {
		return goalList;
	}

	public ArrayList<Team> getTeamList() {
		return teamList;
	}

	/**
	 * Alustab m�ngu. Paneb paika m�ngu algushetke.
	 */
	public void startGame() {
		this.gameRunning = true;
		this.gameStartTime = System.currentTimeMillis();
	}

	public void endGame() {

	}

	/**
	 * Meetodi abil luuakse uus v�rava objekt ja lisatakse see v�ravate listi.
	 * K�igepealt leiab meetod v�rava l��mise aja ja seej�rel k�sitakse kasutaja
	 * k�est v�rava l��nud meeskonna ja m�ngija nime.
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

	public void foul() {
		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long foulTime = ((currentTime - startTime) / 1000 / 60) + 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Sisesta m�ngija nimi, kes vea tegi: ");
		String foulCommitter = scan.nextLine();
		System.out.println("Sisesta m�ngija nimi, kelle viga tehti: ");
		String foulRecipient = scan.nextLine();
		System.out
				.println("Sisesta kaart, kui see anti (kui ei antud, �ra sisesta midagi): ");
		String card = scan.nextLine();

		if (card.equals("")) {
			Foul foul = new Foul(foulCommitter, foulRecipient, foulTime);
			foulList.add(foul);
		} else {
			Foul foul = new Foul(foulCommitter, foulRecipient, card, foulTime);
			foulList.add(foul);
		}
	}

	public void createTeams(String first, String second) {
		Team firstTeam = new Team(first);
		Team secondTeam = new Team(second);

		System.out.println(firstTeam + " " + secondTeam);

		teamList.add(firstTeam);
		teamList.add(secondTeam);
	}
}
