package jalgpall;

import java.sql.Time;

public class RedCard extends Action {
	
	RedCard(Time time, Player palyer, Team team) {
		super(time, palyer, team);
	}

	public String toString() {
		return "Punane kaart: " + super.toString();
	}
}
