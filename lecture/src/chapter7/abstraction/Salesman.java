package chapter7.abstraction;

public class Salesman extends Employee{
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
