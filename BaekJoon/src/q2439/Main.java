package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=N; i++) { // 줄 반복
			for(int j=N-1; j>=i; j--) { // 공백 추가
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) { // 별 추가
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
