package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		String[] str = new String[N];  배열로 할때는 테스트케이스 개수(배열수)로 설정해주기
		
		
		
		for(int i=0; i<N; i++) {
			String score = sc.next();
			int sum = 0;
			int count = 0;
			for(int j=0; j<score.length(); j++) {
				if(score.charAt(j) == 'O') {
					count++;
					sum += count;
				}else if (score.charAt(j)=='X') {
					count = 0;
					sum += count;
				}
			}
			System.out.println(sum);
		}
		
		
			
		}
		
	

	}


