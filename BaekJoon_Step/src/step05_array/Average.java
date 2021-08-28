package step05_array;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int The_num = sc.nextInt();
		double[] scores = new double[The_num];
		
		double max = 0;
		for(int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt();
			if(scores[i]>max) {
				max = scores[i];
			}
		}
		
		double sum = 0;
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i]/max *100;
			sum += scores[i];
		}
		
		double avr = sum / The_num;
		System.out.println(avr);

	}
}
