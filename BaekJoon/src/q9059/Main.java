package q9059;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			for(int p=1;p<=i;p++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
