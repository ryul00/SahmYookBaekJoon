package q10871;

import java.util.Scanner;

//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] arr = new int[N];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
		

	}

}
