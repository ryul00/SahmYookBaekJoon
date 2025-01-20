package q1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rgbs[][] = new int[N][3]; 
		int dp[][] = new int[N][3];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++) {
				rgbs[i][j] = sc.nextInt();	
			}
			for(int j=0; j<3; j++) {
				if(i == 0) {
					dp[i][j] = rgbs[i][j];
				}
			}
		}
		
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<3; j++) {
				dp[i][0] = rgbs[i][0] + Math.min(dp[i-1][1], dp[i-1][2]); 
				dp[i][1] = rgbs[i][1] + Math.min(dp[i-1][0], dp[i-1][2]); 
				dp[i][2] = rgbs[i][2] + Math.min(dp[i-1][0], dp[i-1][1]); 
			}
		}
		int result1 = Math.min(dp[N-1][0], dp[N-1][1]);
		int result2 = Math.min(result1, dp[N-1][2]);
		System.out.println(result2);
		
	
		
		

	}

}
