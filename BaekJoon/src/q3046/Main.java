package q3046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int R1 = sc.nextInt();
		int S = sc.nextInt();
		
		sc.close();
		
		int R2 = 2*S - R1;
		
		System.out.println(R2);
	}

}
