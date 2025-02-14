package q3052_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		HashSet<Integer> intp = new HashSet<Integer>();
		
		for(int i=0; i< arr.length; i++) {
			intp.add(arr[i] % 42);
		}
		
		System.out.println(intp.size());
	}

}
