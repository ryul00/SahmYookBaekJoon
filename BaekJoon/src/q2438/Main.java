package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=1; i <= N; i++) { // 줄반복 -> N만큼
			for(int j=1; j<=i; j++) { // 별반복 -> i만큼
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
