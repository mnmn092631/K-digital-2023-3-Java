package chapter7.abstraction;

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman("홍길동", 200, 300);
		Consultant c = new Consultant("김푸름", 100, 200);
		Manager m = new Manager("김유빈", 150, 250);
		
		s.calcSalary();
		System.out.println("----------------");
		s.calcBonus();
		System.out.println("----------------");
		c.calcSalary();
		System.out.println("----------------");
		c.calcBonus();
		System.out.println("----------------");
		m.calcSalary();
		System.out.println("----------------");
		m.calcBonus();
	}

}
