package jalgpall;

import java.sql.Time;

public class Goal extends Action {
	
	Goal(Time time, Player player, Team team) {
		super(time, player, team);
	}

	public String toString() {
		return "Värav " + super.toString();
	}
}
