package jalgpall;

public class Foul {
	private String foulCommitter;
	private String foulRecipient;
	private String card;
	private long foulTime;

	/**
	 * Konstruktor olukorraks, kui veaga kaasnes kaart.
	 * 
	 * @param foulCommitter
	 *            Vea tegija.
	 * @param foulRecipient
	 *            Vea saaja.
	 * @param card
	 *            Kaart (punane/kollane)
	 * @param foulTime
	 *            Vea tegemise aeg.
	 */
	Foul(String foulCommitter, String foulRecipient, String card, long foulTime) {
		super();
		this.foulCommitter = foulCommitter;
		this.foulRecipient = foulRecipient;
		this.card = card;
		this.foulTime = foulTime;
	}

	/**
	 * Konstruktor olukorraks, kui kaarti ei kaasnenud. Kaart seatakse null'iks.
	 */
	Foul(String foulCommitter, String foulRecipient, long foulTime) {
		super();
		this.foulCommitter = foulCommitter;
		this.foulRecipient = foulRecipient;
		this.foulTime = foulTime;
		this.card = null;
	}

	public String toString() {
		return foulCommitter + " " + foulRecipient + " " + card + " "
				+ foulTime;
	}

}
