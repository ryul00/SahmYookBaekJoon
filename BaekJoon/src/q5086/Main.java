package q5086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			if(first == 0 && second == 0) {
				break;
			}
			
			// 첫수가 두번째 수의 약수
			if(second % first == 0) {
				System.out.println("factor");
			}
			
			// 첫수가 두번째 수의 배수
			else if(first % second == 0) {
				System.out.println("multiple");
			}
			// 둘다 아닐 때
			else {
				System.out.println("neither");
			}
		}
	}

}
