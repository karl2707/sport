package play;

import jalgpall.*;
import java.util.*;

public class Peaklass {
	public static Game soccerGame;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		soccerGame = doGame(scanner);
		
		System.out.println("Alusta m�nguga!");
		scanner.hasNext();
		
		soccerGame.startGame();
		
		while (soccerGame.isRunning()) {
			String input = scanner.nextLine().toLowerCase();
			String i;
			
			switch (input) {
			case("g"):
				break;
			case("q"):
				System.out.println("Kas sa soovid l�petada m�ngu? [j] jah [e] ei");
				i = scanner.nextLine().toLowerCase();
				if (i.equals("j"))
					soccerGame.endGame();
			case("b"):
				System.out.println("Kas soovid alustada vaheaega? [j] jah [e] ei");
				i = scanner.nextLine().toLowerCase();
				if (i.equals("j"))
					System.out.println("J�tka m�ngu");
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
	 * Tekitab v�istkonna isendi
	 * @param scanner
	 * @return Team isend
	 */
	public static Team doTeam(Scanner scanner) {
		System.out.println("Meeskonna sisestamine.");
		System.out.print("Meeskonna nimi: ");
		String name = scanner.nextLine();
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		System.out.print("M�ngijate arv meeskonnas: ");
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
		System.out.println("M�ngija sisestamine.");
		System.out.print("M�ngija number: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.print("M�ngija nimi");
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
