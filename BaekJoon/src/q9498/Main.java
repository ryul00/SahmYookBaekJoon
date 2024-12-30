package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 선언 시 끝에 close()메서드로 종료 필요
	       int score = sc.nextInt();
	       
	       sc.close();

	       
	       if (score >= 90) {
	    	    System.out.println("A");
	    	} else if (score >= 80) {
	    	    System.out.println("B");
	    	} else if (score >= 70) {
	    	    System.out.println("C");
	    	} else if (score >= 60) {
	    	    System.out.println("D");
	    	} else {
	    	    System.out.println("F");
	    	}

	}

}
