package q4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String test = sc.nextLine();
			if(test.equals(".")) {
				break;
			}
			Stack<Character> stack = new Stack<Character>();
			boolean isBalanced = true; 
			for(int i=0; i<test.length(); i++) {
				char ch = test.charAt(i);
				if(ch == '(' || ch == '[') {
					stack.push(ch);
				}
				else if (ch == ')') {
					if(!stack.isEmpty() && stack.peek() == '(') { //peek()는 스택이 비어있지 않아야 사용가능 
						stack.pop();
					}else {
						isBalanced = false; // 스택이 비어있거나 스택 top에 여는 괄호가 없을 때 균형이 깨짐  
						break;
					}
				}
				else if (ch == ']' ) {
					if(!stack.isEmpty() && stack.peek() == '[' ) {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
			}
			
			if(isBalanced && stack.isEmpty()) { // 균형여부가 true이고 스택이 비어있어야 yes임 -> 스택이 비어있지 않다는건 닫히지 않은 괄호가 존재한다는 뜻
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		sc.close();
			

	}

}
