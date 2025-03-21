package q1254;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		sc.close();
		int idx = word.length()-1;
		
		for(int i=0; i<idx; i++) {
			if(ispalin(word.substring(i))) {
				idx = i;
				break;
			}
		}
		
		System.out.println(word.length() + idx);

	}
	
	public static boolean ispalin(String word) {
		int start = 0;
		int end = word.length()-1;
		while(start < end) { // while의 종료조건은 명시한 조건과 반대되는 조건이 되었을 때!!!!!!!!!!!!!!
			if(word.charAt(start) != word.charAt(end)) return false;
			start++;
			end--;
			
		}
		return true;
	}

}
