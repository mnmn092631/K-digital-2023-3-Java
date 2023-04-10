package mission1;

public class Student {
	static int countStudents;
	int sid;
	String sname;
	String city;
	
	public Student() {
		this(202300);
	}
	
	public Student(int sid) {
		this(sid, "없음");
	}
	
	public Student(int sid, String sname) {
		this(sid, sname, "없음");
	}
	
	public Student(int sid, String sname, String city) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		countStudents++;
	}
	
	public String toString() {
		return "학번 - " + sid + " | 이름 - " + sname + " | 도시 - " + city;
	}

	void showStudent() {
		System.out.print("객체: ");
		System.out.println(this.toString());
	}

	static void showNumberObjects() {
		System.out.println("생성된 객체수 : " + countStudents + "개");
	}

	public static void main(String[] args) {
		 Student arry[] = new Student[5];
		 showNumberObjects();
		 arry[0] = new Student();
		 arry[1] = new Student(202301);
		 arry[2] = new Student(202302, "Hong");
		 arry[3] = new Student(202303, "Lee", "Busan");
		 arry[4] = new Student(202304, "Na", "jeju");
		 showNumberObjects();
		 
		 for(int i = 0; i < arry.length; i++){
			arry[i].showStudent();
		}
	}
 

}

