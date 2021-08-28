package step08_basicMath;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Snail_goUp {
	public static void main(String[] args) throws IOException {
		
		// 값 입력 받기
//		Scanner sc = new Scanner(System.in);
//		int afternoon = sc.nextInt(); // 낮에 올라가는 길이
//		int midnight = sc.nextInt(); // 밤에 미끄러지는 길이
//		int height = sc.nextInt(); // 나무의 높이
		
		
		
//		시간 초과 나온 풀이 1 (while문 이용)
//		int count = 0;
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
	
		

//		시간 초과 나온 풀이 2 (Scanner 이용)
//		int day = (height - midnight) / (afternoon - midnight);
//		if((height - midnight) % (afternoon - midnight) != 0) {
//			day++;
//		} System.out.println(day);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int afternoon = Integer.parseInt(st.nextToken()); // 낮에 올라가는 길이
		int midnight = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 길이
		int height = Integer.parseInt(st.nextToken()); // 나무의 높이
		
		int day = (height - midnight) / (afternoon - midnight);
		if((height - midnight) % (afternoon - midnight) != 0) {
			day++;
		}	System.out.println(day);
	}
}
