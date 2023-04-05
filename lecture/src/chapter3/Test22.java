package chapter3;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 12;
		int b = 2;
		System.out.println("op[+, -, *, /]:");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("+: " + (a + b));
			break;
		case '-':
			System.out.println("-: " + (a - b));
			break;
		case '*':
			System.out.println("*: " + (a * b));
			break;
		case '/':
			System.out.println("/: " + (a / b));
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
	}

}
