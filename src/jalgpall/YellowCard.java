package jalgpall;

import java.sql.Time;

public class YellowCard extends Action {

	YellowCard(Time time, Player palyer, Team team) {
		super(time, palyer, team);
	}
	
	public String toString() {
		return "Kollane kaart " + super.toString();
	}

}
