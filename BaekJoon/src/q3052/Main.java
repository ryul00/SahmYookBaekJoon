package q3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr2[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i] % 42; 
		}
		
		arr2 = Arrays.stream(arr2).distinct().toArray(); // 중복 제거
		
		System.out.println(arr2.length);
		


	}

}
