package mathematics;

import java.util.Scanner;

public class Add_calculation {
	public static void main(String[] args) {
		
		// 테스트케이스 개수 입력 받기
		Scanner sc = new Scanner(System.in);
		int numOftestCase = sc.nextInt();
		
		// 테스트케이스 개수만큼 숫자 입력 받기
		for(int testCase = 0; testCase < numOftestCase; testCase++) {
			//
			int numOfnumber = sc.nextInt();
			
			// 입력받을 숫자의 배열 및 sum 변수 선언
			int[] arr = new int[numOfnumber];
			int sum = 0;
			
			// 숫자 개수 만큼  
			for(int num = 0; num < numOfnumber; num++) {
				arr[num] = sc.nextInt();
				sum += arr[num];
			} System.out.println(sum);
		}
	}
}
