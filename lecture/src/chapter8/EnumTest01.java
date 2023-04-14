package chapter8;

enum Status {
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest01 {
	public static void main(String[] args) {
		Status work = null;
		int n = 2;

		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
		}
		System.out.println("현재 작업 상태 : " + work);
		System.out.println("이름 : " + work.name());
		System.out.println("위치 : " + work.ordinal());
		System.out.println("READY와의 상대 위치 : " + work.compareTo(Status.READY));
//		String name = "hello";
//		String sname = "good";
////		if(name > sname) {}
//		if(name.compareTo(sname) > 0) {}
	}
}
