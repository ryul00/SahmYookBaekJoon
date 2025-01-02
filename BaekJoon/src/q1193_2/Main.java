package q1193_2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int x = 1;
		int y = 1;
		
		int ldc = 1;
		int ruc = 2;
		
		// 헷갈리는 부분 : 종료 조건
		// for문 내부 : ld,ru 반복 수행 시 X==0이되면 for문 탈출 
		// for문 외부 : for문 탈출 후 X==0 확인 후 While문 까지 탈출 
		// 결론 : 각 단계 수행 전 X==0 확인 + for,while은 독립적이므로 for탈출해도 while자체를 탈출한 건 아님!
		// Down,Right전에 X==0을 확인 하는 것은 X값을 먼저 감소시킨 후 X==0을 확인하는 것이므로  
		// LeftDown, RightUp 종료 후 X==0 확인과는 중복이 아니다.
		while(true) {
			if(--X == 0) {
				break;
			}
			// Right
			y++;
			
			// LeftDown
			for(int i=0;i<ldc;i++) {
				if(--X == 0) {
					break;
				}
				x++;
				y--;
			}
			if(X==0) {
				break;
			}
			ldc += 2;
			
			if(--X == 0) {
				break;
			}
			// Down
			x++;
			
			// RightUp
			for(int j=0; j<ruc;j++) {
				if(--X==0) {
					break;
				}
				x--;
				y++;
			}
			if(X==0) {
				break;
			}
			ruc += 2;
			
		}
		System.out.println(x + "/" + y);
		
		
	}

}
