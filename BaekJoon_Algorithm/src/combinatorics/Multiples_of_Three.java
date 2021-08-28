package combinatorics;

import java.util.Scanner;

public class Multiples_of_Three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 15			// 333
		int  k = num / 3 - 3;   // 2			// 108
		
//		System.out.println(k);   //3H2 = 4C2 	// 3H108 = 110C108
		
		// (k+2) C k ==  (k+2) C 2 == (k+2)(k+1) / 2
		
		System.out.println((k+2)*(k+1) / 2);
	}
}
