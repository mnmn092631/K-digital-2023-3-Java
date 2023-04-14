package chapter8;

import java.util.Scanner;

public class Mission4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		while (true) {
			System.out.println("10~100 사이의 정수를 입력해주세요 : ");
			num = sc.nextInt();
			if (num >= 10 && num <= 100)
				break;
		}

		int count = 0;
		
		for (int i = Math.min(num / 5, 10); i >= 1; i--) {
			int remain = num - 5 * i;
			for (int j = 10; j >= 1; j--) {
				int remain2 = remain - 3 * j;
				if (remain2 % 2 == 0 && remain2 >= 2 && remain2 <= 20) {
					System.out.print("(" + remain2 / 2 + "," + j + "," + i + ")");
					count++;
				}
			}
		}

		if (count > 0)
			System.out.print(": " + count);
		else
			System.out.println("경우의 수가 없습니다.");
	}

}
