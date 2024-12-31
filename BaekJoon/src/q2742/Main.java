package q2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int i = N;
		while(i >= 1 && i <= N) {
			System.out.println(i);
			i--;
		}

	}

}
