package step08_basicMath;

import java.util.Scanner;

public class Snail_goUp {
	public static void main(String[] args) {
		
		// 값 입력 받기
		Scanner sc = new Scanner(System.in);
		int afternoon = sc.nextInt(); // 낮에 올라가는 길이
		int midnight = sc.nextInt(); // 밤에 미끄러지는 길이
		int height = sc.nextInt(); // 나무의 높이
		
		int new_height = height - midnight; // 마지막 날 계산 때문에 마지막 날 이전까지만 계산 위해
		int diff = afternoon - midnight; // 달팽이가 올라가고 내려온 후 토탈 길이
		int count; // 날짜 계산
		
		if(height % diff != 0) {
			count = new_height / diff + 1;
		} else {
			count = new_height / diff;
		}
		
		
		
		
		
		
		
		
	
//		int snail = 0;
//		
//		while(snail < height) {
//			count++;
//			snail += afternoon;
//			if(snail >= height) {
//				break;
//			}
//			snail -= midnight;
//		}
		
		System.out.println(count);
	}
}
