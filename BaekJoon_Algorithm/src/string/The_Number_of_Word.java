package string;

import java.util.Scanner;

public class The_Number_of_Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		
		int leng = strArr.length;
		
		for(String s : strArr) {
			if(s.isEmpty()) {
				leng = strArr.length - 1;
			}
		}
		
		System.out.println(leng);
		
		
	}
}
