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
		soccerGame = new Game(length); // Tehakse uus mängu objekt vastavalt
										// kasutaja sisestatud poolaja
										// pikkusele.

		System.out.println("Sisesta esimese meeskonna nimi: ");
		String firstTeam = getInput().trim();

		System.out.println("Sisesta teise meeskonna nimi: ");
		String secondTeam = getInput().trim();

		soccerGame.createTeams(firstTeam, secondTeam);

		System.out.println("Alusta mängu vajutades 's' ");

		while (true) {

			String action = getInput().trim().toLowerCase();

			if (action.equals("s")) {
				soccerGame.startGame(); // "s" sisestamisel pannakse mäng käima.
			}
			if (action.equals("g")) {
				soccerGame.goal(); // "g" sisestamisel registreeritakse värav.
			}

			if (action.equals("f")) { // "f" sisestamisel registreeritakse viga.
				soccerGame.foul();
			}

			if (action.equals("väravad")) { // "väravad" sisestamisel väljastab
											// programm kõikide väravate listi.
				System.out.println(soccerGame.getGoalList());
			}

			if (action.equals("vead")) {
				System.out.println(soccerGame.getFoulList());
			}

			if (action.equals("q")) { // "q" sisestamisel lõpetatakse mäng.
				break;
			}
		}
	}
}
