package q10845;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/



// 풀이 : queue는 FIFO 방식
// offer(): 큐의 뒤에 요소를 추가하는 메서드입니다 (같은 역할을 하는 메서드는 offerLast()).
// poll(): 큐의 앞에서 요소를 제거하고 반환하는 메서드입니다 (같은 역할을 하는 메서드는 pollFirst()).
// peek(): 큐의 앞에 있는 요소를 반환하는 메서드입니다 (같은 역할을 하는 메서드는 peekFirst()).
// peekLast(): 큐의 뒤에 있는 요소를 반환하는 메서드입니다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Deque<Integer> myQueue = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			String cmd = sc.next();
			if(cmd.equals("push")) {
				int num = sc.nextInt();
				myQueue.offer(num);
			}
			
			else if (cmd.equals("pop") ) {
				if (myQueue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(myQueue.poll()); 
				}
			}
			
			else if (cmd.equals("size")) {
				System.out.println(myQueue.size());
			}
			
			else if (cmd.equals("empty")) {
				if (myQueue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
			
			else if (cmd.equals("front")) {
				if (myQueue.isEmpty()) {
					System.out.println(-1);
				}else {
					int a = myQueue.peek();
					System.out.println(a);
				}
			}
			
			else if (cmd.equals("back")) {
				if (myQueue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(myQueue.peekLast());
				}
			}
			
		}
		
		
		
		
		

	}

}
