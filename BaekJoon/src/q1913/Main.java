package q1913;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
        int search = sc.nextInt();  
        sc.close();

        int[][] array = new int[num][num];
        int x = num / 2;  
        int y = num / 2;  
        int dir = 0;  // 방향 (0: 위, 1: 오른쪽, 2: 아래, 3: 왼쪽)
        int steps = 1;  
        int value = 1;  

        array[x][y] = value;

        while (value < num * num) {
            for (int i = 0; i < 2; i++) {  
                for (int j = 0; j < steps; j++) { 
                    if (value == num * num) break; // 종료 조건 설정

                    value++;
                    switch (dir) { // 각 방향에 따른 좌표 변화 설정
                        case 0: x--; break; 
                        case 1: y++; break;  
                        case 2: x++; break;  
                        case 3: y--; break; 
                    }
                    array[x][y] = value;
                }
                dir = (dir + 1) % 4;  
            }
            steps++;  
        }

        int searchX = -1, searchY = -1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] == search) {
                    searchX = i + 1; 
                    searchY = j + 1;
                }
            }
            System.out.println();
        }

        System.out.println(searchX + " " + searchY);
    }
}
