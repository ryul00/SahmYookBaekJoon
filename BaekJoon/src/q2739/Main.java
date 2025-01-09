package q2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=9; i++) {
			if(N > 9 || N < 1) {
				break;
			}
			System.out.printf("%d * %d = %d\n", N,i,N*i);
			
		}

	}

}
