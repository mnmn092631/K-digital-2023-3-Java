package chapter4;

import java.util.Scanner;

public class Test37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력해주세요 : ");
			score[i] = sc.nextInt();
		}
		
		for(int num : score) {
			sum += num;
			if(max < num) max = num;
			if(min > num) min = num;
		}
		
		avg = (double) sum / score.length;
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + String.format("%.2f", avg));
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
	}

}
