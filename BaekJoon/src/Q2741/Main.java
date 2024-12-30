package Q2741;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // scanner 선언 시 끝에 close()메서드로 종료 필요
       int N = sc.nextInt();
       
       sc.close();

       
       for(int i = 1; i<=N; i++ ) {
    	   System.out.println(i);
    	   
       }
       
    }
}

