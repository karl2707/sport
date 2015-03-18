package jalgpall;

import java.sql.Time;

public class RedCard extends Action {
	
	RedCard(Time time, Player palyer, Team team) {
		super(palyer, team);
	}

	public RedCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Punane kaart: " + super.toString();
	}
}
