package q26069;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		HashSet<String> Dance = new HashSet<>();
		Dance.add("ChongChong");
		
		// A,B를 문자열로 입력받으므로 입력과 동시에, 춤을 추고 있는지 검사한 뒤 set에 추가해야 함
		for(int i=0; i<N; i++) {
			String A = sc.next();
			String B = sc.next();
			if(Dance.contains(B) || Dance.contains(A)) {
				Dance.add(B);
				Dance.add(A);
			}
		}
		
		sc.close();
		
		System.out.println(Dance.size());
		

	}

}
