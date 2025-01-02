package q1913_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		// 배열 생성
		int ar[][] = new int[N][N];
		
		// 중앙 좌표 설정
		int x = N / 2;
		int y = N / 2;
		int num = 1;
		int s = 1;
		
		ar[x][y] = num++; // 중앙 좌표에 1을 넣은 후 반복문을 통해 값을 증가하여 채우기 위해 후위 증감연산자 사용
		
		// 나선형 배열 생성
		do {
			// UP
			for(int i=0;i<s;i++) {
				if(x == 0 && y == 0) { // 상 이동중 좌표가 (0,0)이 되면 이동 종료
					break;
				}
				x = x - 1;
				ar[x][y]=num++;	// 배열 요소의 값 num은 계속 증가함
			}
			
			// if(ar[x][y] == ar[0][0])
			// -> 내가 틀린 부분 : 해당 코드는 (x,y)의 좌표 값이 (0,0)좌표의 값과 같냐는 것이므로 값의 비교이므로 틀림 
			
			if(x == 0 && y == 0) { // 상 이동중 좌표가 (0,0)이 되면 이동 종료
				break;
			}
			
			// Right
			for(int i=0;i<s;i++) {
				y = y + 1;
				ar[x][y] = num++;
			}
			
			// Down
			for(int i=0;i<=s;i++) { // 하,좌는 2칸씩 이동하므로 반복 범위 수정 
				x = x + 1;
				ar[x][y] = num++;
			}
			
			//Left
			for(int i=0;i<=s;i++) {
				y = y - 1;
				ar[x][y] = num++;
			}
			s = s + 2;
			
			
		} while (true);
		
		// 배열 출력
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
		// 좌표 출력
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				if(ar[i][j] == M) {
					System.out.println((i+1) + " " + (j+1));
					
				}
			}
		}
		

	}

}
