package play;

import jalgpall.*;
import java.util.Scanner;
import java.sql.*;

public class Peaklass {
	public static Game soccerGame;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Sisesta poolaja pikkus minutites: ");
		int length = scan.nextInt();
		soccerGame = new Game(length); // Tehakse uus m�ngu objekt vastavalt
										// kasutaja sisestatud poolaja
										// pikkusele.

		System.out.println("Sisesta esimese meeskonna nimi: ");
		String firstTeam = scan.next().trim();

		System.out.println("Sisesta teise meeskonna nimi: ");
		String secondTeam = scan.next().trim();

		System.out.println(firstTeam + " " + secondTeam);
		soccerGame.createTeams(firstTeam, secondTeam);
		
		System.out.println(soccerGame.getTeamList());

		while (true) {

			String action = scan.nextLine().trim().toLowerCase();

			if (action.equals("s")) {
				soccerGame.startGame(); // "s" sisestamisel pannakse m�ng k�ima.
			}
			if (action.equals("g")) {
				soccerGame.goal(); // "g" sisestamisel registreeritakse v�rav.
			}

			if (action.equals("q")) { // "q" sisestamisel l�petatakse m�ng.
				break;
			}

			if (action.equals("f")) { // "f" sisestamisel registreeritakse viga.
				soccerGame.foul();
			}

			if (action.equals("v�ravad")) { // "v�ravad" sisestamisel v�ljastab
											// programm k�ikide v�ravate listi.
				System.out.println(soccerGame.getGoalList());
			}
		}
	}
}
