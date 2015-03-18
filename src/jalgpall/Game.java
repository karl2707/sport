package jalgpall;

import java.util.ArrayList;
import java.sql.*;

public class Game {
	private boolean gameRunning;
	private int numPeriod;
	private Time gameStartTime;
	private ArrayList<Action> actions = new ArrayList<Action>();
	private Team[]  teamList;

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
	
	public ArrayList<Action> getActions() {
		return actions;
	}
	
	public void addAction(Action action) {
		actions.add(action);
	}
}
