package chapter3;

import java.util.Scanner;

public class Test22_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = 12;
//		int b = 2;
		while(true) {
			System.out.println("op[+, -, *, /]:");
			String op = sc.next();
			
			int a = 0;
			int b = 0;
			
			if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
				System.out.println("첫번째 숫자를 입력하세요: ");
				a = sc.nextInt();
				
				System.out.println("두번째 숫자를 입력하세요: ");
				b = sc.nextInt();	
			}
			
			switch(op) {
			case "+":
				System.out.println("+: " + (a + b));
				break;
			case "-":
				System.out.println("-: " + (a - b));
				break;
			case "*":
				System.out.println("*: " + (a * b));
				break;
			case "/":
				System.out.println("/: " + (a / b));
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
				return;
			}
		}
	}

}
