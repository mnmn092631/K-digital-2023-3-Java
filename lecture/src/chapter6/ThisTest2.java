package chapter6;

public class ThisTest2 {
	private String name;
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		ThisTest2 exam = new ThisTest2();
		exam.SetName("Amy");
		
		System.out.println(exam.getName());
	}

}
