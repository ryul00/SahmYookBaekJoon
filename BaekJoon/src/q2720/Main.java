package q2720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int C = sc.nextInt();
			int Q = C / 25;
			int D = (C % 25) / 10;
			int N = (C % 25 % 10) / 5;
			int P = (C % 25 % 10 % 5) / 1;
			System.out.println(Q + " " + D + " " + N + " " + P);
			
			
			
		}
		sc.close();
		

	}

}
