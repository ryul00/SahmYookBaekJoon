package q11507;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Set<Integer>> map = new HashMap<String, Set<Integer>>();
		map.put("P", new HashSet<Integer>());
		map.put("K", new HashSet<Integer>());
		map.put("H", new HashSet<Integer>());
		map.put("T", new HashSet<Integer>());
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		// 인덱스 3개씩 탐색하므로 i+=3
		for(int i=0; i<S.length(); i+=3) {
			String card = S.substring(i, i+3);
			// 이미 자른 문자열 card는 인덱스가 무조건 0,1,2
			char ch  = card.charAt(0);
			int num = Integer.parseInt(card.substring(1, 3));
			//특정키(문자)에 대한 중복 값 입력 시 "GRESKA" 출력 후 반복문 종료
			if(map.get(String.valueOf(ch)).contains(num)==true) {
				System.out.println("GRESKA");
				return;
			}else {
				// 중복 없을 시 해당 문자에 대한 숫자Set에 넣음
				map.get(String.valueOf(ch)).add(num);
			}
			
		}
		sc.close();
		// 총 숫자 수가 13이므로 각 문자에 대한 숫자 개수 계산
		System.out.print(13 - map.get("P").size() + " ");
		System.out.print(13 - map.get("K").size() + " ");
		System.out.print(13 - map.get("H").size() + " ");
		System.out.print(13 - map.get("T").size() + " ");

	}

}
