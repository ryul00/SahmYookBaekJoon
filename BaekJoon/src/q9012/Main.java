package q9012;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      sc.nextLine();
      String[] str = new String[N];

      for (int i = 0; i < N; i++) {
         int count = 0;
         str[i] = sc.next();
         for (int j = 0; j < str[i].length(); j++) {
            if(count < 0) {
               break;
            }
            else if (str[i].charAt(j) == '(') {
               count++;
            } else if (str[i].charAt(j) == ')') {
               count--;
            }
         }
         if(count == 0) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}
