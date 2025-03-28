package q11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	private static Class<int[]> Comparator;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr[][] = new int[N][2];
		
		for(int i=0; i<N; i++) {
			
		}
		
		
		// 입력 
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
//		// 람다식 사용 정렬
//		Arrays.sort(arr, (e1, e2) -> {
//			if(e1[0] == e2[0]) {
//				return e1[1] - e2[1];
//			}
//			else {
//				return e1[0] - e2[0];
//			}
//		});
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] e1, int[] e2) {
				// 계산 결과(음수,0,양수)에 따라 정렬 
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];
				}else {
					return e1[0] - e2[0];
				}
			}
		});
			
		
		sc.close();
		
		// 출력
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
	}


}
