package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// num2의 각 자리수 계산
		int unit = num2 % 10;
		int hundred = (num2 % 100) / 10;
		int thousand = num2 / 100; 
		
		// num1과 num2의 각 자릿수의 곱 계산 -> (3),(4),(5)
		int three = num1 * unit; // (3)
		int four = num1 * hundred; // (4)
		int five = num1 * thousand; // (5)
		
		// 최종 곱 계산 -> (6)
		int six = three + (four * 10) + (five * 100);
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		
	}

}
