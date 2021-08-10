package geometry;

import java.util.Scanner;

public class PlayGround {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		double pi = 3.141592;
		 
		double round = 2 * d1 + 2 * d2 * pi;
		
		System.out.println(round);
	}
	
}
