package jalgpall;

import java.sql.Time;

public class YellowCard extends Action {

	public YellowCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	YellowCard(Player player, Team team) {
		super(player, team);
	}
	
	public String toString() {
		return "Kollane kaart " + super.toString();
	}

}
