package play;

import jalgpall.*;

import java.io.ObjectInputStream.GetField;
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
				doAction(scanner, "g");
				break;
			case("q"):
				System.out.println("Kas sa soovid lõpetada mängu? [j] jah [e] ei");
				i = scanner.nextLine().toLowerCase();
				if (i.equals("j"))
					soccerGame.endGame();
				break;
			case("r"):
				doAction(scanner, "r");
				break;
			case("y"):
				doAction(scanner, "y");
				break;
			case("f"):
				doAction(scanner, "f");
				break;
			case("b"):
				System.out.println("Kas soovid alustada vaheaega? [j] jah [e] ei");
				i = scanner.nextLine().toLowerCase();
				if (i.equals("j"))
					System.out.println("Jätka mängu");
				break;
			}
		}
		
		if (soccerGame.winner() >= 0) {
			System.out.println("Mängu võitis " + soccerGame.getTeamName(soccerGame.winner()));
		} else {
			System.out.println("Mäng jäi viiki!");
		}
		
		listActions(soccerGame.getActions());
		
		scanner.close();
	}
	
	public static void listActions(ArrayList<Action> actions) {
		for (Action a: actions) {
			System.out.println(a);
		}
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
		System.out.print("Mängija nimi: ");
		String name = scanner.nextLine();
		
		return new Player(name, number);
	}
	
	public static void doAction (Scanner scanner, String type) {
		System.out.println("Sisesta meeskonna number.");
		System.out.println(soccerGame.getTeamList());
		int team = scanner.nextInt();
		System.out.print("Sisesta mängija number: ");
		int num = scanner.nextInt();
		
		Action a = null;

		switch (type) {
		case("g"):
			a = new Goal();
		break;
		case("f"):
			a = new Foul();
		break;
		case("y"):
			a = new YellowCard();
		break;
		case("r"):
			a = new RedCard();
		break;
		}

		soccerGame.addAction(num, team, a);
		
		System.out.println("Seis on");
		
		System.out.println(soccerGame.getStanding()[0] + " : " + soccerGame.getStanding()[1]);
	}
	
}
