package jalgpall;

import java.sql.Time;

public abstract class Action{
	protected Time time;
	protected Player player;
	protected Team team;
	
	Action() {
		this.time = new Time(System.currentTimeMillis());
	}
	
	Action(Player player, Team team) {
		this();
		this.player = player;
		this.team = team;
	}
	
	public void setPlayer(Player player)  {
		this.player = player;
	}
	
	public void setTeam(Team team) {
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
