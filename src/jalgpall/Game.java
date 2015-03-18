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
	 * Loob uue mängu isendi.
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
	 * Alustab mängu. Paneb paika mängu algushetke.
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
	 * Kontrollib, kas etteantud meeskond kuulub selle mängu meeskondade hulka.
	 * 
	 * @param goalTeam Etteantud meeskond.
	 * @return Väljastab true või false.
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
	 * Lisab antud meeskonnale ühe värava.
	 * 
	 * @param goalTeam
	 *            Värava saanud meeskonna nimi.
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
	 * Lisab antud meeskonnale ühe vea.
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
	 * Värava registreerimsie meetod. Kõigepealt leiab meetod värava löömise aja
	 * ja seejärel küsitakse kasutaja käest värava löönud meeskonna nime. Kui
	 * meeskonna nimi ei sobi, küsitakse kasutaja käest meeskonna nime, kuni see
	 * sobib. Seejärel lisatakse meeskonna objektile üks värav. Seejärel
	 * küsitakse värava löönud mängija nime. Seejärel luuakse uus värava objekt
	 * ja lisatakse see väravate listi.
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

		System.out.println("Sisesta skoorinud mängija nimi: ");
		String goalScorer = Peaklass.getInput();

		Goal goal = new Goal(goalTeam, goalScorer, goalTime);

		goalList.add(goal);
	}*/

	/**
	 * Vea registreerimise meetod. Kõigepealt leiab meetod vea sooritamise aja,
	 * seejärel küsitakse vea sooritanud mängija nime ja meeskonda ning vea
	 * saanud mängija nime. Kui meeskonna nimi ei sobi, küsitakse kasutaja käest
	 * meeskonna nime, kuni see sobib. Seejärel lisatakse meeskonna objektile
	 * üks viga. Seejärel küsitakse, kas vea tõttu anti välja kaart. Seejärel
	 * luuakse uus vea objekt ja lisatakse see listi.
	 *//*
	public void foul() {
		long currentTime = System.currentTimeMillis();
		long startTime = Peaklass.soccerGame.getGameStartTime();
		long foulTime = ((currentTime - startTime) / 1000 / 60) + 1;

		System.out.println("Sisesta mängija nimi, kes vea tegi: ");
		String foulCommitter = Peaklass.getInput();

		System.out
				.println("Sisesta meeskonna nimi, milles vea teinud mängija on: ");
		String foulTeam = Peaklass.getInput();

		while (!teamCheck(foulTeam)) {
			System.out
					.println("Sisestasite vale meeskonna nime, proovige uuesti: ");
			foulTeam = Peaklass.getInput();
		}

		addFoul(foulTeam);

		System.out.println("Sisesta mängija nimi, kelle viga tehti: ");
		String foulRecipient = Peaklass.getInput();
		System.out
				.println("Sisesta kaart, kui see anti (kui ei antud, ära sisesta midagi): ");
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
	 * Teeb String-sisendi põhjal meeskonnad ja lisab need meeskondade listi.
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
	 * Leiab mängu seisu ja tagastab selle 
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
