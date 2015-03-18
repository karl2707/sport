package jalgpall;

import java.sql.Time;

public class RedCard extends Card {
	
	RedCard(Time time, Player palyer) {
		super(time, palyer);
	}

	public String toString() {
		return "Punane kaart: " + super.toString();
	}
}
