package q18185;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cost = 0;
		for(int i=0; i<N; i++) {
			if(arr[i] == 0) {
				continue;
			}
			while(arr[i] > 0) { // 구매해야할 라면이 남아있으면 계속 구매(반복) 진행 
				// 3중 구매 + 반레 (1211..)
				if(i+2 < N && arr[i+1] > 0 && arr[i+2] > 0) {
					if(arr[i+1] > arr[i+2]) {
						arr[i]--; 
						arr[i+1]--;
						cost += 5;
					}else {
						arr[i]--;
						arr[i+1]--;
						arr[i+2]--;
						cost += 7;
					}
				}
				// 2중 구매
				else if (i+1 < N && arr[i+1] > 0) {
					arr[i]--;
					arr[i+1]--;
					cost += 5;
				}
				// 단일 구매
				else {
					arr[i]--;
					cost += 3;
				}
			}
		}
		
		System.out.println(cost);
		
		

	}

}
