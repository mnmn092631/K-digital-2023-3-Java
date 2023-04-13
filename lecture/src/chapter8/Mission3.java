package chapter8;

import java.util.Scanner;

public class Mission3 {	
	public static int factorial(int n) {
		if(n == 1) {
			System.out.print(n + " = ");
			return 1;
		} else {
			System.out.print(n + " * ");
			return (n * factorial(n-1));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print(num + "! = ");
		System.out.print(factorial(num));
	}

}
