package q25757;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String game = sc.next();
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			String person = sc.next();
			set.add(person);
		}
		sc.close();
		
		int player = set.size();
		
		int maxGames = 0;
		
		if(game.equals("Y")) {
			maxGames = player / 1;
		}
		else if (game.equals("F")) {
			maxGames = player / 2;
		}
		else {
			maxGames = player/3;
		}
		
		System.out.println(maxGames);
		
		

	}

}
