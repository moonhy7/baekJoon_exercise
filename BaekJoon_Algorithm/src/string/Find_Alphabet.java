package string;

import java.util.Scanner;

public class Find_Alphabet {
	public static void main(String[] args) {
		
		// 알파벳 배열 생성
		int[] alphabet = new int[26];
		
		// 알파벳 배열의 원소 초기값 -1로 지정
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1; 
		}
		
		// 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 입력받은 문자열을 배열에 담기
		for(char ch : str.toCharArray()) {
			alphabet[ch - 'a'] = str.indexOf(ch);
		}
		
		// 배열 출력
		for(int a : alphabet) {
			System.out.print(a + " ");
		}

	}
}
