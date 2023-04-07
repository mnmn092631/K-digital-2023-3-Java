package chapter6;

public class Student {
	private int sid;
	private String name;
	private String dept;
	
	public Student() {}
	
	public Student(int sid, String name, String dept) {
		this.sid = sid;
		this.name = name;
		this.dept = dept;
	}
	
	public static void main(String[] args) {
		System.out.println("6장 시작");
		int n = 10;
		Student s = null;
		s = new Student(2023, "홍길동", "컴퓨터");
		System.out.println(s.sid);
		System.out.println("student 객체 = " + s);
	}
	
}
