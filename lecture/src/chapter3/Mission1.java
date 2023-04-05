package chapter3;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			String result = "과락";
			
			System.out.println("국어 성적을 입력해주세요 : ");
			int kor = sc.nextInt();
			if(kor < 0 || kor > 100) break;
			
			System.out.println("영어 성적을 입력해주세요 : ");
			int eng = sc.nextInt();
			if(eng < 0 || eng > 100) break;
			
			System.out.println("수학 성적을 입력해주세요 : ");
			int math = sc.nextInt();
			if(math < 0 || math > 100) break;
			
			int sum = kor + eng + math;
			float avg = (float)(sum / 3.0);
			
//			if(avg >= 70.0 && kor >= 60 && eng >= 60 && math >=60) {
//				result = "통과";
//			}
			
			String result = (avg >= 70.0 && kor >= 60 && eng >= 60 && math >=60) ? "통과" : "과락";
			
			System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
			System.out.println("총계 : " + sum);
			System.out.println("평균 : " + String.format("%.2f", avg));
			System.out.println("결과 : " + result);
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
