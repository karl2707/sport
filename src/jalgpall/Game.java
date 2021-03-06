package jalgpall;

import java.util.ArrayList;
import java.sql.*;

public class Game {
	//Isendiv�ljad
	
	/**
	 * T�ev��rtus, mis n�itab, kas m�ng k�ib v�i mitte
	 */
	private boolean gameRunning;
	/**
	 * M�ngu alguse aeg. V�imaldab arvutada mitmendal minutil miski oimus. 
	 */
	private Time gameStartTime;
	/**
	 * List k�ikidest m�ngus toimunud tegevustest. Sinna alla k�ivad v�ravad, vead ja kaardid.
	 */
	private ArrayList<Action> actions = new ArrayList<Action>();
	/**
	 * M�ngus olevate meeskondade arv. J�rjend, kuna meeskondade arv m�ngu kestel ei muutu. 
	 */
	private Team[]  teamList;
	/**
	 * Kuigi k�ikide v�ravate on registreeritud tegevuste listis on ka eraldi j�rjend, et saaks
	 * kiiresti ja lihtsalt k�tte m�ngu hetkeseisu. 
	 */
	private int[] standing = {0, 0};

	
	//Konstruktorid
	
	/**
	 * M�ngu loomise konstruktor
	 * @param t1 Esimese meeskonna isend
	 * @param t2 Teise meeskonna isend
	 */
	public Game(Team t1, Team t2) {
		//Meeskonnad sisestatakse j�rjendisse
		teamList = new Team[] {t1, t2};
	}

	
	//Setterid
	
	public void addAction(int id, int team, Action action) {
		//Otsitakse vastava tegevuse sooritanud m�ngija isendi viit ning m��ratakse tegevusele
		Player p = teamList[team-1].getPlayerNumber(id);
		action.setPlayer(p);
		
		//Kui on tehtud v�rav suurendatakse seisu vastavalt
		if (action instanceof Goal) {
			standing[team-1] += 1;	
		}
		
		//Tegevus lisatakse listi
		actions.add(action);
	}
	
	
	//Getterid
	
	public ArrayList<Action> getActions() {
		return actions;
	}


	/**
	 * 
	 * @return
	 */
	public String getGameStartTime() {
		return gameStartTime.toString();
	}
	
	public String getGameRunningTime() {
		return null;
	}
	
	public String getTeamList() {
		return "[1] " + teamList[0] + " [2] " + teamList[1];
	}

	/**
	 * V�imaldab vajadusel n�ha m�ngu seisu. 
	 * @return Kahe elemendiline t�isarvude j�rjend, kus on meeskondade hetkeseis
	 */
	public int[] getStanding() {
		return standing;
	}
	
	public String getTeamName(int id) {
		return teamList[id].toString();
	}
	
	
	//Meetodid
	
	public boolean isRunning() {
		return gameRunning;
	}


	/**
	 * Alustab m�ngu. Paneb paika m�ngu algushetke.
	 */
	public void startGame() {
		this.gameRunning = true;
		this.gameStartTime = new Time(System.currentTimeMillis());
	}

	public void endGame() {
		this.gameRunning = false;
	}
	
	
	/**
	 * Tagastab, mis seisus on m�ng. 
	 * @return V�itnud meekonna indeksi j�rjendis. Kui on viik tagastab -1.
	 */
	public int winner() {
		if (standing[0] > standing[1])
			return 0;
		else if (standing[1] > standing[0])
			return 1;
		else
			//M�ng on j��nud viiki
			return -1;
	}
}
