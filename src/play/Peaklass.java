package play;

import jalgpall.*;
import java.util.*;
import java.sql.*;

public class Peaklass {
	public static Game soccerGame;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Team t1 = doTeam(scanner);
		Team t2 = doTeam(scanner);
		
		System.out.println("Sisesta poolaja pikkus");
		int time = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		soccerGame = new Game(time, t1, t2);
	}
	
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
	
	public static Player doPlayer(Scanner scanner) {
		System.out.println("Mängija sisestamine.");
		System.out.println("Mängija number: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.println("Mänigja nimi");
		String name = scanner.nextLine();
		
		return new Player(name, number);
	}
}
