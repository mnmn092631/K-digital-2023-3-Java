package chapter7;

public class Employee extends Person implements EmployeeInterface {
	private String dept;

	public Employee() {
		System.out.println("Employee 생성자가 호출되었습니다.");
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	@Override
	public String getDept() {
		return dept;
	}

	@Override
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", age=" + getAge() + ", dept=" + dept + "]";
	}
}
