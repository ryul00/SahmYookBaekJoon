package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int layer = 1;
		int layer_max = 1;
		
		
		
		// while( ) -> 괄호 내 조건이 참일 떄만 반복 , 거짓이 되는 순간 반복 종료 
		// 종료 시점 : N <= layer_max
		while(N > layer_max) {
			layer_max += (6*layer);
			layer++;
//			System.out.println(layer_max);
			
		}
		System.out.println(layer);
		
		

	}

}
