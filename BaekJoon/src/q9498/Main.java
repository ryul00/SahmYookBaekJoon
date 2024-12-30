package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 선언 시 끝에 close()메서드로 종료 필요
	       int score = sc.nextInt();
	       
	       sc.close();

	       // if문
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
	       
	       
	       // switch-case문
	       switch(score) {
	       case 90,91,92,93,94,95,96,97,98,99,100:
	    	   System.out.println('A');
	    	   break;
	      
	       case 80,81,82,83,84,85,86,87,88,89:
	    	   System.out.println('B');
	       	   break;
	       	   
	       case 70,71,72,73,74,75,76,77,78,79:
	    	   System.out.println('c');
	       	   break;
	       	   
	       case 60,61,62,63,64,65,66,67,68,69:
	    	   System.out.println('d');
	       	   break;
	       	   
	       default:
	    	   System.out.println('F'); 
	       }
	       
	       

	}

}
