package q2588_2;

import java.util.Scanner;

public class Main {
	// Case2 String타입으로 풀어보기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		
		// 각 자료형을 객체화 시켜서 타입을 변경하여 사용
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		// charAt(0) -> 문자열에서 인덱스 번호0번 해당 문자 분리
		// - '0' = 문자열 '3' 분리 후 ASCII 값 0과 뺄셈하여 정수형태로 완성
		int num21 = str2.charAt(0) - '0';
		int num22 = str2.charAt(1) - '0';
		int num23 = str2.charAt(2) - '0';
//		System.out.println(num21);
//		System.out.println(num22);
//		System.out.println(num23);
		
		
		System.out.println(num1 * num23);
		System.out.println(num1 * num22);
		System.out.println(num1 * num21);
		System.out.println(num1*num2);
	}

}
