package q10039;

import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<40) {
				arr[i] = 40;
			}
			sum += arr[i];
			avg = sum / arr.length;
	
		}
		
		System.out.println(avg);
	}

}
