package q1269;

import java.util.HashSet;
import java.util.Scanner;

//자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오. 
//두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
//예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  
//A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 대칭 차집합의 원소의 개수는 1 + 3 = 4개이다
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
