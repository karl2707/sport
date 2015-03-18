package play;

import jalgpall.*;
import java.util.*;

public class Peaklass {
	public static Game soccerGame;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		soccerGame = doGame(scanner);
		
		System.out.println("Alusta mänguga!");
		scanner.hasNext();
		
		soccerGame.startGame();
		
		while (soccerGame.isRunning()) {
			String input = scanner.nextLine().toLowerCase();
			String i;
			
			switch (input) {
			case("g"):
				break;
			case("q"):
				System.out.println("Kas sa soovid lõpetada mängu? [j] jah [e] ei");
				i = scanner.nextLine().toLowerCase();
				if (i.equals("j"))
					soccerGame.endGame();
			case("b"):
				System.out.println("Kas soovid alustada vaheaega? [j] jah [e] ei");
				i = scanner.nextLine().toLowerCase();
				if (i.equals("j"))
					System.out.println("Jätka mängu");
			}
		}
		
		for (Action a: soccerGame.getActions()) {
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
		
		return new Game(t1, t2);
	}
	
	/**
	 * Tekitab võistkonna isendi
	 * @param scanner
	 * @return Team isend
	 */
	public static Team doTeam(Scanner scanner) {
		System.out.println("Meeskonna sisestamine.");
		System.out.print("Meeskonna nimi: ");
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
		System.out.print("Mängija number: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.print("Mängija nimi");
		String name = scanner.nextLine();
		
		return new Player(name, number);
	}
	
	public static YellowCard doYellowCard() {
		return null;
	}
	
	public static RedCard doRedCard() {
		return null;
	}
	
	public static Foul doFoul() {
		return null;
	}
	
	public static Goal doGoal() {
		return null;
	}
}
