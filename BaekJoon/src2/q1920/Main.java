package q1920;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			set.add(num);
		}
		int M = sc.nextInt();
		int arr[] = new int[M];
		
		for(int i=0; i<M; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int checkNum : arr) {
			if(set.contains(checkNum)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}

	}

}
