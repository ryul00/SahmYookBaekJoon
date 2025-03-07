package q2745;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String N = sc.next();
	      int B = sc.nextInt();
	      sc.close();
	      int s = 0;
	      for (int i = 0; i < N.length(); i++) {
	         if (N.charAt(i) >= 65) s = s + (N.charAt(i) - 55) * (int) Math.pow(B, N.length() - i - 1);
	         else s = s + (N.charAt(i) - '0') * (int) Math.pow(B, N.length() - i - 1);
	      }
	      System.out.println(s);

	}

}
