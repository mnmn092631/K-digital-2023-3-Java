package chapter8;

import java.util.Scanner;

public class Mission2 {
	
	public static int getGCD(int max, int min) {
		if(max % min == 0) return min;
		else return getGCD(min, max % min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("숫자를 입력해주세요 : ");
		int b = sc.nextInt();

		int max = Math.max(a, b);
		int min = Math.min(a, b);

		System.out.println("최대공약수 : " + getGCD(max, min));
		System.out.println("최소공배수 : " + (a * b) / getGCD(max, min));
	}

}
