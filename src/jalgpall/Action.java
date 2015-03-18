package jalgpall;

import java.sql.Time;

public class Action implements Actionable {
	protected Time time;
	protected Player player;
	protected Team team;
	
	Action(Time time, Player player, Team team) {
		this.time = time;
		this.player = player;
		this.team = team;
	}
	
	@Override
	public Player getCommiter() {
		return player;
	}
	
	@Override
	public String getTime() {
		return time.toString();
	}
	
	public String toString() {
		return player + " @ " + time;
	}
}
