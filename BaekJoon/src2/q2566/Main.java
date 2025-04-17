package q2566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[][] = new int[9][9];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
//			System.out.println();
		}
		sc.close();
		int max = Integer.MIN_VALUE;
		int maxRow = 0;
		int maxCol = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					maxRow = i+1;
					maxCol = j+1;
				}
			}
//			System.out.println();
		}
		
		System.out.println(max);
		System.out.println(maxRow + " " +  maxCol);
		
		

	}

}
