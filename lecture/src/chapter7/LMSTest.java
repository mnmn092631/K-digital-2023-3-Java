package chapter7;

public class LMSTest {

	public static void main(String[] args) {
//		Employee e = new Employee();
//		System.out.println(e);
		
		Employee e1 = new Employee("홍길동", 20, "입학처");
		System.out.println(e1);
		
		Professor p = new Professor("김푸름", 52, "빅데이터");
		System.out.println(p);
		
		Student s = new Student("김유빈", 20, "컴퓨터과학");
		System.out.println(s);
		
//		Professor p = new Professor();
//		Student s = new Student();
//
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
//
//		s.setName("김유빈");
//		s.setAge(20);
//		s.setMajor("컴퓨터과학");
//
//		System.out.println(e.toString());
//		System.out.println(p.toString());
//		System.out.println(s.toString());
	}

}
