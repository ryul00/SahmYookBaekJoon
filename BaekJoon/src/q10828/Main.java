package q10828;

import java.util.Scanner;

import javax.swing.Popup;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		MyStack stack = new MyStack(10000);
		
		for(int i=0;i<N;i++) {
			String cmd = sc.next();
			
			switch (cmd){
			case "push": 
				int n = sc.nextInt();
				stack.push(n);
				break;
			
			case "pop":
				stack.pop();
				break;
		
			case "empty":
				stack.empty();
				break;
		
			case "size":
				stack.size();
				break;
				
			case "top":
				stack.top();
				break;
			}
		}
		

	}

}
// * 배열 범위 초과 오류 이유 *
// size(인덱스 번호)를 0으로 설정했으나, push할때 size를 먼저 증가시키므로 size가 0일땐 0을 건너뛰고 인덱스1부터 추가 시켜버림
// 따라서 먼저 값을 추가한뒤 size를 증가시켜야함
// 또한 pop,top에서 stack[size]로 설정했지만, size는 스택 내 원소의 개수를 의미한다. 반면 인덱스 번호는 0부터 시작하므로
// 실제 가장 위 값은 size-1에 존재한다. ex: size = 1일 떄 실제 값은 index0번에 저장되어있음
// 따라서 스택의 가장 위에 값을 선택하려면 [size-1]을 해줘야한다.

class MyStack{
	private int[] stack;
	private int size;
	
	public MyStack(int n) {
		stack = new int[n];
		size = 0; // 인덱스 번호 = 스택의 포인터 역할 
	}
	
	public void push(int num) {
		stack[size] = num;
		size++;
		
	} 
	
	public void pop() {
		if(size == 0) {
			System.out.println(-1);
		}else {
			System.out.println(stack[size-1]);
			size--;
		}
	}
	
	public void size() {
		System.out.println(size);
	}
	
	public void empty() {
		if(size == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void top() {
		if(size == 0) {
			System.out.println(-1);
		}else {
			System.out.println(stack[size-1]);
		}
	}
	
	
	
}


