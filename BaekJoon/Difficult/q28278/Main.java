package q28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
            int cmd = Integer.parseInt(input[0]);
			switch (cmd) {
			case 1: {
				int x = Integer.parseInt(input[1]);
				stack.push(x);
				break;
			}
			case 2: {
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
				break;
			}
			case 3: {
				System.out.println(stack.size());
				break;
			}
			case 4: {
				System.out.println(stack.isEmpty()? 1 : 0);
				break;
			}
			case 5: {

				System.out.println(stack.isEmpty() ? -1 : stack.peek());
				break;
			}


			}
		}
		br.close();
	}

}
