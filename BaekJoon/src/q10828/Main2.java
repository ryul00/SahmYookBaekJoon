package q10828;

//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();

		for(int i=0; i<N; i++) {
			String cmd = sc.next();
			switch (cmd) {
			case "push": 
					int n = sc.nextInt();
					stack.push(n);
					break;
			
			case "pop":
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				}
				break;
				
			case "size":
				System.out.println(stack.size());
				break;
			
			case "empty": 
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}break;
			
			case "top":
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
				break;
			
			
			}
		}
	}
	

}


