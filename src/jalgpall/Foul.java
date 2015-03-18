package jalgpall;

public class Foul {
	private Player foulCommitter;
	private Player foulRecipient;
	private String card;
	private long foulTime;

	/**
	 * Konstruktor olukorraks, kui veaga kaasnes kaart.
	 * 
	 * @param foulCommitter Vea tegija.
	 * @param foulRecipient Vea saaja.
	 * @param card Kaart (punane/kollane)
	 * @param foulTime Vea tegemise aeg.
	 */
	Foul(Player foulCommitter, Player foulRecipient, String card, long foulTime) {
		super();
		this.foulCommitter = foulCommitter;
		this.foulRecipient = foulRecipient;
		this.card = card;
		this.foulTime = foulTime;
	}

	/**
	 * Konstruktor olukorraks, kui kaarti ei kaasnenud. Kaart seatakse null'iks.
	 */
	Foul(Player foulCommitter, Player foulRecipient, long foulTime) {
		super();
		this.foulCommitter = foulCommitter;
		this.foulRecipient = foulRecipient;
		this.foulTime = foulTime;
		this.card = "NoCard";
	}

	public String toString() {
		return "Vea teinud mängija: " + foulCommitter + " \nVea saanud mängija: " + foulRecipient + "\nKaart: " + card + "\nVea aeg: "
				+ foulTime + ". minut.";
	}

}
