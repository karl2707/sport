package jalgpall;

import java.sql.Time;

public class Card implements Actionable {
	protected Time time;
	protected Player player;
	
	Card(Time time, Player player) {
		this.time = time;
		this.player = player;
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
