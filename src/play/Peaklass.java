package play;

import jalgpall.*;
import java.util.Scanner;
import java.sql.*;

public class Peaklass {
	public static Game soccerGame;

	public static String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Sisesta poolaja pikkus minutites: ");
		int length = scan.nextInt();
		soccerGame = new Game(length); // Tehakse uus m�ngu objekt vastavalt
										// kasutaja sisestatud poolaja
										// pikkusele.

		System.out.println("Sisesta esimese meeskonna nimi: ");
		String firstTeam = getInput().trim();

		System.out.println("Sisesta teise meeskonna nimi: ");
		String secondTeam = getInput().trim();

		soccerGame.createTeams(firstTeam, secondTeam);

		System.out.println("Alusta m�ngu vajutades 's' ");

		while (true) {

			String action = getInput().trim().toLowerCase();

			if (action.equals("s")) {
				soccerGame.startGame(); // "s" sisestamisel pannakse m�ng k�ima.
			}
			if (action.equals("g")) {
				soccerGame.goal(); // "g" sisestamisel registreeritakse v�rav.
			}

			if (action.equals("f")) { // "f" sisestamisel registreeritakse viga.
				soccerGame.foul();
			}

			if (action.equals("v�ravad")) { // "v�ravad" sisestamisel v�ljastab
											// programm k�ikide v�ravate listi.
				System.out.println(soccerGame.getGoalList());
			}

			if (action.equals("vead")) {
				System.out.println(soccerGame.getFoulList());
			}

			if (action.equals("q")) { // "q" sisestamisel l�petatakse m�ng.
				break;
			}
		}
	}
}
