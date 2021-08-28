package geometry;

import java.util.Scanner;

public class RightTryangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(x >= y && x >= z) {
			max = x;
			if (y >= z) {
				mid = y;
				min = z;
			} else {
				mid = z;
				min = y;
			}
		} 
		
		else if (y >= x && y >= z) {
			max = y;
			if (x >= z) {
				mid = x;
				min = z;
			} else {
				mid = z;
				min = x;
			}
		} 
		
		else if (z > x && z > y) {
			max = z;
			if (x >= y) {
				mid = x;
				min = y;
			} else {
				mid = y;
				min = x;
			}
		}

		int result =  mid * mid + min * min;
		
		if (max==0 && mid==0 && min==0) {
			return;
		}
		else if(result == max * max) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}		
	}
}
