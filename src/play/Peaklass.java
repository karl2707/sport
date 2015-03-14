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
		soccerGame = new Game(length);

		while (true) {
			String action = scan.nextLine().trim().toLowerCase();
			
			System.out.println(action);

			if (action.equals("s")) {
				System.out.println("Mäng läks lahti!");
				soccerGame.startGame();
			}
			if (action.equals("g")) {
				soccerGame.goal();
			}

			if (action.equals("q")) {
				break;
			}

		}
	}
}
