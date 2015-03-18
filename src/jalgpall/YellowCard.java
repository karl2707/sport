package jalgpall;

import java.sql.Time;

public class YellowCard extends Card {

	YellowCard(Time time, Player palyer) {
		super(time, palyer);
	}
	
	public String toString() {
		return "Kollane kaart " + super.toString();
	}

}
