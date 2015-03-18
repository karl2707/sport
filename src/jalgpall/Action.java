package jalgpall;

import java.sql.Time;

public abstract class Action{
	protected Time time;
	protected Player player;
	protected Team team;
	
	Action(Time time, Player player, Team team) {
		this.time = time;
		this.player = player;
		this.team = team;
	}
	
	public Player getCommiter() {
		return player;
	}
	
	public String getTime() {
		return time.toString();
	}
	
	public String toString() {
		return player + " @ " + time;
	}
}
