package chapter8;

import java.util.Scanner;

public class Mission1 {
	
	public static void binary(int num) {
		if(num == 0) return;
		else {
			binary(num / 2);
			System.out.print(num % 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print(num + " -> ");
		binary(num);
	}

}
