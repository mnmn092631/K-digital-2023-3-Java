package chapter7.abstraction;

abstract class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {
	int sale;
	
	public Salesman(String name, int salary, int sale) {
		super(name, salary);
		this.sale = sale;
	}
	
	public void calcSalary() {
		System.out.println("Salesman " + getName() + " 급여" + "\n기본급 : " + getSalary() + "\n판매수당 : " + sale + "\n총계 : " + (getSalary() + sale));
	}
	
	public void calcBonus() {
		System.out.println("Salesman 보너스 = " + (getSalary() * 12 * 4));
	}
}

class Consultant extends Employee {
	int consult;
	
	public Consultant(String name, int salary, int consult) {
		super(name, salary);
		this.consult = consult;
	}
	
	public void calcSalary() {
		System.out.println("Consultant " + getName() + " 급여" + "\n기본급 : " + getSalary() + "\n컨설팅 특별 수당 : " + consult + "\n총계 : " + (getSalary() + consult));
	}
	
	public void calcBonus() {
		System.out.println("Consultant 보너스 = " + (getSalary() * 12 * 2));
	}
}

class Manager extends Employee {
	int manage;
	
	public Manager(String name, int salary, int manage) {
		super(name, salary);
		this.manage = manage;
	}
	
	public void calcSalary() {
		System.out.println("Manager " + getName() + " 급여" + "\n기본급 : " + getSalary() + "\n팀 성과 수당 : " + manage + "\n총계 : " + (getSalary() + manage));
	}
	
	public void calcBonus() {
		System.out.println("Manager 보너스 = " + (getSalary() * 12 * 6));
	}
}

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
