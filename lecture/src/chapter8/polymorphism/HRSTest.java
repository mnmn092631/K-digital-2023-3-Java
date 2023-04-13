package chapter8.polymorphism;

import chapter7.abstraction.Employee;
import chapter7.abstraction.Consultant;
import chapter7.abstraction.Manager;
import chapter7.abstraction.Salesman;

public class HRSTest {
	
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}
	
	public static void main(String[] args) {
//		Salesman s = new Salesman("홍길동", 200, 300);
//		Consultant c = new Consultant("김푸름", 100, 200);
//		Manager m = new Manager("김유빈", 150, 250);
		
//		calcTax(s);
//		calcTax(c);
//		calcTax(m);
		
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(m.toString());
//		
//		Salesman s2 = s;
//		System.out.println(s2.toString());
//		
//		if(s.equals(s2)) {
//			System.out.println("동일한 객체입니다.");
//		} else {
//			System.out.println("서로 다른 객체입니다.");
//		}
		
		Salesman s1 = new Salesman(null, 0, 0);
		Employee s2 = new Salesman(null, 0, 0);
		Object s3 = new Salesman(null, 0, 0);
		
		Object m1 = new Manager(null, 0, 0);
		Employee m2 = new Manager(null, 0, 0);
		Manager m3 = new Manager(null, 0, 0);
//		Director m4 = new Manager(null, 0, 0);
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
