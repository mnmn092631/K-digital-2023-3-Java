package chapter7;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
			
		int[] arr = { 50000, 10000, 5000, 1000 };
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "원 : " + price / arr[i] + "장");
			count += price / arr[i];
			price %= arr[i];
		}
		
		System.out.println("최소 지폐 수 : " + count + "장");
	}

}
