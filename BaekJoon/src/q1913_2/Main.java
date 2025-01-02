package q1913_2;

import java.util.Scanner;

public class Main {
	static int[][] ar;

	public static void print() {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p = sc.nextInt();
		sc.close();


		ar = new int[N][N];

		int cx = N / 2, cy = N / 2;

		int num = 1;
		ar[cy][cx] = num++; // 중앙 좌표에 1을 넣은 후 반복문을 통해 값을 증가하여 채우기 위해 후위 증감연산자 사용
		int d = 1;

		// UP - RIGHT - DOWN - LEFT
		do {

			// UP
			for (int i = 1; i <= d; i++) {
				if (cx == 0 && cy == 0)
					break;
				cy = cy - 1;
				ar[cy][cx] = num++;
			}
			
			if (cx == 0 && cy == 0) {
				print();
				break;
			}
				
			// RIGHT
			for (int i = 1; i <= d; i++) {
				cx = cx + 1;
				ar[cy][cx] = num++;
			}


			// DOWN
			for (int i = 0; i <= d; i++) {
				cy = cy + 1;
				ar[cy][cx] = num++;
			}

			// LEFT
			for (int i = 0; i <= d; i++) {
				cx = cx - 1;
				ar[cy][cx] = num++;
			}

			d = d + 2;
		} while (true);

		// sequence search
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == p) {
					System.out.println((i + 1) + " " + (j + 1));
				}
			}
		}
	}
}