package q1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word = word.toUpperCase();
		int arr[] = new int[26];
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			arr[ch-'A']++;
		}
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < arr.length; i++) {
		    if(arr[i] > max) {  
		        max = arr[i];
		        maxIndex = i;   
		    }
		}
		
		char maxChar = (char) (maxIndex + 'A');
		

		// 복수 정답 시 예외처리 => 중요!!!!!!!!!
		int maxcnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				maxcnt++;
			}
		}
		if(maxcnt>1) {
			System.out.println("?");
		}else {
			System.out.println(maxChar);
		}
		
		
		//return 사용
//		for(int i = 0; i < arr.length; i++) {
//	    if(arr[i] == max && i != maxIndex) {
//	        System.out.println("?");
//	        return; // 프로그램 자체를 종료함
//	    }
//	}
//	System.out.println(maxChar);
		
		

	}

}
