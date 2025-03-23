package q5568;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static int n,k,arr[];
	static HashSet<String>card = new HashSet<>();
	static boolean visit[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		arr = new int[n];
		visit = new boolean[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		pickCards(0, "");
		System.out.println(card.size());
		

	}
	public static void pickCards(int depth, String num) {
		if(depth == k) {
			card.add(num);
			return;
		}
		else {
			for(int i=0; i<n; i++) {
				if(!visit[i]) {
					visit[i] = true;
					pickCards(depth+1, num + arr[i]);
					visit[i] = false;
				}
			}
		}
	}
	
//	1️. 입력 받기
//	n : 카드 개수
//	k : 선택할 카드 개수
//	arr[] : 카드 숫자 저장
//	visit[] : 사용 여부 체크

//	2️. pickCards(int depth, String num) 함수 동작
//	종료 조건
//
//	depth == k (선택 개수 k개 도달) → Set에 숫자 추가 & 함수 종료
//
//	백트래킹 실행
//
//	for문으로 n개의 카드 중에서 하나씩 선택
//
//	방문하지 않은 카드만 선택
//
//	선택한 카드를 num에 이어 붙이고 재귀 호출 (depth + 1)
//
//	재귀 종료 후 방문 체크 해제 (백트래킹)
	


}
