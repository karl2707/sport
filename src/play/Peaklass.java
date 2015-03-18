package play;

import jalgpall.*;
import java.util.*;

public class Peaklass {
	public static Game soccerGame;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		soccerGame = doGame(scanner);
		
		while (soccerGame.isRunning()) {
			String input = scanner.nextLine().toLowerCase();
			
			switch (input) {
			case("g"):
				break;
			case("q"):
				System.out.println("Are you sure you want to end the game? [y] yes [n] no");
				String i = scanner.nextLine().toLowerCase();
				if (i.equals("y"))
					soccerGame.endGame();
			}
		}
		
		for (Actionable a: soccerGame.getActions()) {
			System.out.println(a);
		}
		
		scanner.close();
	}
	
	/**
	 * Teahakse Game klassi objekt
	 * @param scanner Scanneri objekt
	 * @return Game klassi objekt
	 */
	public static Game doGame(Scanner scanner) {
		Team t1 = doTeam(scanner);
		Team t2 = doTeam(scanner);
		
		System.out.println("Sisesta poolaja pikkus");
		int time = Integer.parseInt(scanner.nextLine());
		
		return new Game(time, t1, t2);
	}
	
	/**
	 * Tekitab võistkonna isendi
	 * @param scanner
	 * @return Team isend
	 */
	public static Team doTeam(Scanner scanner) {
		System.out.println("Meeskonna sisestamine.");
		System.out.println("Meeskonna nimi: ");
		String name = scanner.nextLine();
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		System.out.print("Mängijate arv meeskonnas: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i<num; i++) {
			players.add(doPlayer(scanner));
		}
		
		return new Team(name, players);
	}
	
	/**
	 * 
	 * @param scanner Scanneri isend
	 * @return Player objekt isend
	 */
	public static Player doPlayer(Scanner scanner) {
		System.out.println("Mängija sisestamine.");
		System.out.println("Mängija number: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.println("Mänigja nimi");
		String name = scanner.nextLine();
		
		return new Player(name, number);
	}
}
