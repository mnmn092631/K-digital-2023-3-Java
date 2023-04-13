package chapter7.abstraction;

public class Consultant extends Employee {
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
