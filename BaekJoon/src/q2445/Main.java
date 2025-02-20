package q2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=1; i <= (2*N)-1; i++) { // 줄반복 -> N만큼
			if(i <= N) { //상단
				for(int j=1; j<=i; j++) { // 상단 좌측 별 출력
					System.out.print("*");
				}
//				좌/우측 별을 모두 출력한 뒤 줄바꿈 해야함 
//				System.out.println();
				for(int c=N-1; c>=i; c--) { // 공백 2칸씩 추가(최 하단 인덱스부터 추가 , 2-4-6-8)
					System.out.print("  ");
				}
				for(int k=1; k<=i; k++) { // 상단 우측 별 출력
					System.out.print("*");
				}
				System.out.println();
			}
			else { //하단
				for(int j=(2*N)-1; j>=i; j--) { // 하단 좌측 별 추가(최 하단 인덱스부터 추가)
					System.out.print("*");
				}
//				좌/우측 별을 모두 출력한 뒤 줄바꿈 해야함 
//				System.out.println(); 
				for(int d=N+1; d<=i; d++) { // 공백 2칸씩 추가 (2 - 4 - 6 - 8)
					System.out.print("  ");
				}
				for(int f=(2*N)-1; f>=i; f--) { // 하단 우측 별 추가(최 하단 인덱스부터 추가)
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

	}

}
