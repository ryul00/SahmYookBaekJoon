package q1269;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		HashSet<Integer>Set_A = new HashSet<>();
		HashSet<Integer>Set_B = new HashSet<>();
		HashSet<Integer>Set_C = new HashSet<>();
		for(int i=0; i<a; i++) {
			int countA = sc.nextInt();
			Set_A.add(countA);
		}
		
		for(int i=0; i<b; i++) {
			int countB = sc.nextInt();
			Set_B.add(countB);
		}
		
		sc.close();
		
		for(Integer elementB : Set_B) {
			if(Set_A.contains(elementB)) {
				Set_A.remove(elementB); // 1만남음
			}else {
				Set_A.add(elementB);
			}
		}
		

		
		System.out.println(Set_A.size());

	}

}
