package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] score = new int[5]; // 점수 배열 생성
		Scanner sc = new Scanner(System.in);
		int idx = 0; // 배열의 인덱스, 점수 합, 평균 변수 초기화
		int sum = 0;
		int avg = 0;
		for(int i=0; i<score.length; i++) { // 배열 순회 반복문
			score[idx] = sc.nextInt(); 
			if (score[idx] < 40) { // 40점 미만은 40으로 판단하는 조건문
				score[idx] = 40;
			}
			sum += score[idx]; // 총합 계산
		}
		avg = sum / score.length; // 평균 계산
		System.out.println(avg);


	}

}
