package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 선언 시 끝에 close()메서드로 종료 필요
	       int score = sc.nextInt();
	       
	       sc.close();

	       // if-else문
	       if (90 <= score && score <= 100) {
	    	    System.out.println("A");
	    	} else if (80 <= score && score <= 89) {
	    	    System.out.println("B");
	    	} else if (70 <= score && score <= 79) {
	    	    System.out.println("C");
	    	} else if (60 <= score && score <= 69) {
	    	    System.out.println("D");
	    	} else {
	    	    System.out.println("F");
	    	}
	       
	       
	       // switch-case문 -> 범위 체크x 특정 값 비교 O
	       switch(score/10) {
	       case 10:
	       case 9:
	    	   System.out.println('A');
	    	   break;
	      
	       case 8:
	    	   System.out.println('B');
	       	   break;
	       	   
	       case 7:
	    	   System.out.println('C');
	       	   break;
	       	   
	       case 6:
	    	   System.out.println('D');
	       	   break;
	       	   
	       default:
	    	   System.out.println('F'); 
	       }
	       
	       

	}

}
