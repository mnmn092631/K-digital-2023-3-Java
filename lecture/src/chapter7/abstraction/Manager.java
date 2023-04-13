package chapter7.abstraction;

public class Manager extends Employee {
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
