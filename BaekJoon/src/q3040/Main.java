package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1-100까지 자연수
		// 전체 : 100보다 작은 양의 정수
		// 출력값 : 9개 중 7개의 합이 100이 되도록.
		Scanner sc = new Scanner(System.in);
		int[]ar = new int[9]; 
		int sum = 0;
		
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		
		boolean found  = false;
		for(int n=0;n<ar.length;n++) {
			for(int j=n+1;j<ar.length;j++) {
				int p = ar[n]+ar[j];
				if(sum - p == 100) {
					ar[n] = 0;
					ar[j] = 0;
					found = true;
				break;
			}
				if (found) break;
					
		}
		}
		
		for(int k=0; k<ar.length; k++) {
			if(ar[k]!= 0) {
				System.out.println(ar[k]);
			}
		}
		
		
		
		
		sc.close();
	
	}

}
