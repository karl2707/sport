package jalgpall;

import java.sql.Time;

public class Foul extends Action {
	
	Foul(Time time, Player player, Team team) {
		super(time, player, team);
	}

	public String toString() {
		return "Viga " + super.toString();
	}

}
