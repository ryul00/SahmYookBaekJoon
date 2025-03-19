package q14425;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashSet<String>setN = new HashSet<>();

		
		for(int i=0; i<N; i++) {
			String wordN = sc.next();
			setN.add(wordN);
		}
		int count = 0;
		for(int i=0; i<M; i++) {
			String wordM = sc.next();
			if(setN.contains(wordM)) {
				count++;
			}
			
		}
		sc.close();
		
		System.out.println(count);
		
		

	}

}
