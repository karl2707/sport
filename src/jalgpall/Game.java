package jalgpall;

import java.util.ArrayList;
import java.sql.*;

public class Game {
	private int periodLength;
	private boolean gameRunning;
	private Time gameStartTime;
	private ArrayList<Actionable> actions = new ArrayList<Actionable>();
	private Team[]  teamList;

	/**
	 * Loob uue m�ngu isendi.
	 * @param periodLength Poolaja pikkus.
	 */
	public Game(int periodLength, Team t1, Team t2) {
		this.periodLength = periodLength;
		teamList = new Team[] {t1, t2};
	}

	/**
	 * 
	 * @return
	 */
	public String getGameStartTime() {
		return gameStartTime.toString();
	}
	
	public String getGameRunningTime() {
		return null;
	}
	
	public boolean isRunning() {
		return gameRunning;
	}
	
	/**
	 * 
	 * @return
	 */
	public Team[] getTeamList() {
		return teamList;
	}

	/**
	 * Alustab m�ngu. Paneb paika m�ngu algushetke.
	 */
	public void startGame() {
		this.gameRunning = true;
		this.gameStartTime = new Time(System.currentTimeMillis());
	}

	public void endGame() {
		this.gameRunning = false;
	}
	
	public ArrayList<Actionable> getActions() {
		return actions;
	}

	/**
	 * Kontrollib, kas etteantud meeskond kuulub selle m�ngu meeskondade hulka.
	 * 
	 * @param goalTeam Etteantud meeskond.
	 * @return V�ljastab true v�i false.
	 *//*
	public boolean teamCheck(String goalTeam) {
		ArrayList<Team> team = Peaklass.soccerGame.teamList;
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getTeamName().equals(goalTeam)) {
				return true;
			}
		}
		return false;
	}*/
	
	/**
	 * Lisab antud meeskonnale �he v�rava.
	 * 
	 * @param goalTeam
	 *            V�rava saanud meeskonna nimi.
	 *//*
	public void addScore(String goalTeam) {
		ArrayList<Team> team = Peaklass.soccerGame.teamList;
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getTeamName().equals(goalTeam)) {
				team.get(i).addGoal();
			}
		}
	}
	*/
	/**
	 * Lisab antud meeskonnale �he vea.
	 * 
	 * @param foulTeam
	 *            Vea teinud meeskonna nimi.
	 *//*
	public void addFoul(String foulTeam) {
		ArrayList<Team> team = Peaklass.soccerGame.teamList;
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getTeamName().equals(foulTeam)) {
				team.get(i).addFoul();
			}
		}
	}*/

	/**
	 * V�rava registreerimsie meetod. K�igepealt leiab meetod v�rava l��mise aja
	 * ja seej�rel k�sitakse kasutaja k�est v�rava l��nud meeskonna nime. Kui
	 * meeskonna nimi ei sobi, k�sitakse kasutaja k�est meeskonna nime, kuni see
	 * sobib. Seej�rel lisatakse meeskonna objektile �ks v�rav. Seej�rel
	 * k�sitakse v�rava l��nud m�ngija nime. Seej�rel luuakse uus v�rava objekt
	 * ja lisatakse see v�ravate listi.
	 */
	/*
	public void goal() {

		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long goalTime = ((currentTime - startTime) / 1000 / 60) + 1;

		System.out.println("Sisesta skoorinud meeskonna nimi: ");
		String goalTeam = Peaklass.getInput();

		while (!teamCheck(goalTeam)) {
			System.out
					.println("Sisestasite vale meeskonna nime, proovige uuesti: ");
			goalTeam = Peaklass.getInput();
		}

		addScore(goalTeam);

		System.out.println("Sisesta skoorinud m�ngija nimi: ");
		String goalScorer = Peaklass.getInput();

		Goal goal = new Goal(goalTeam, goalScorer, goalTime);

		goalList.add(goal);
	}*/

	/**
	 * Vea registreerimise meetod. K�igepealt leiab meetod vea sooritamise aja,
	 * seej�rel k�sitakse vea sooritanud m�ngija nime ja meeskonda ning vea
	 * saanud m�ngija nime. Kui meeskonna nimi ei sobi, k�sitakse kasutaja k�est
	 * meeskonna nime, kuni see sobib. Seej�rel lisatakse meeskonna objektile
	 * �ks viga. Seej�rel k�sitakse, kas vea t�ttu anti v�lja kaart. Seej�rel
	 * luuakse uus vea objekt ja lisatakse see listi.
	 *//*
	public void foul() {
		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long foulTime = ((currentTime - startTime) / 1000 / 60) + 1;

		System.out.println("Sisesta m�ngija nimi, kes vea tegi: ");
		String foulCommitter = Peaklass.getInput();

		System.out
				.println("Sisesta meeskonna nimi, milles vea teinud m�ngija on: ");
		String foulTeam = Peaklass.getInput();

		while (!teamCheck(foulTeam)) {
			System.out
					.println("Sisestasite vale meeskonna nime, proovige uuesti: ");
			foulTeam = Peaklass.getInput();
		}

		addFoul(foulTeam);

		System.out.println("Sisesta m�ngija nimi, kelle viga tehti: ");
		String foulRecipient = Peaklass.getInput();
		System.out
				.println("Sisesta kaart, kui see anti (kui ei antud, �ra sisesta midagi): ");
		String card = Peaklass.getInput().toLowerCase();

		if (card.equals("")) {
			Foul foul = new Foul(foulCommitter, foulRecipient, foulTime);
			foulList.add(foul);
		} else {
			Foul foul = new Foul(foulCommitter, foulRecipient, card, foulTime);
			foulList.add(foul);
		}
	}*/

	/**
	 * Teeb String-sisendi p�hjal meeskonnad ja lisab need meeskondade listi.
	 * 
	 * @param first Esimese meeskonna nimi.
	 * @param second Teise meeskonna nimi.
	 *//*
	public void createTeams(String first, String second) {
		Team firstTeam = new Team(first);
		Team secondTeam = new Team(second);

		teamList.add(firstTeam);
		teamList.add(secondTeam);
	}*/
	
	/**
	 * Leiab m�ngu seisu ja tagastab selle 
	 * @return Tagastab seisu stringina.
	 *//*
	public String seis() {
		StringBuilder seis = new StringBuilder();
		ArrayList<Team> team = Peaklass.soccerGame.teamList;

		seis.append(team.get(0).getTeamName() + " " + team.get(0).getGoals()
				+ " - " + team.get(1).getGoals() + " "
				+ team.get(1).getTeamName());
		
		return seis.toString();
	}*/
}
