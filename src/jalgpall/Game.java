package jalgpall;

import java.util.ArrayList;
import java.sql.*;

public class Game {
	private boolean gameRunning;
	private int numPeriod;
	private Time gameStartTime;
	private ArrayList<Action> actions = new ArrayList<Action>();
	private Team[]  teamList;
	private int[] standing = {0, 0};

	/**
	 * Loob uue mängu isendi.
	 * @param periodLength Poolaja pikkus.
	 */
	public Game(Team t1, Team t2) {
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
	
	public String getTeamList() {
		return "[1] " + teamList[0] + " [2] " + teamList[1];
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
	
	public ArrayList<Action> getActions() {
		return actions;
	}
	
	public int[] getStanding() {
		return standing;
	}
	
	public int winner() {
		if (standing[0] > standing[1])
			return 0;
		else if (standing[1] > standing[2])
			return 1;
		else
			return -1;
	}
	
	public String getTeamName(int id) {
		return teamList[id].toString();
	}
	
	public void addAction(int id, int team, Action action) {
		Player p = teamList[team-1].getPlayerNumber(id);
		action.setPlayer(p);
		
		if (action instanceof Goal) {
			standing[team-1] += 1;	
		}
		
		actions.add(action);
	}
}
