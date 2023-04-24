package chapter11;

public class Test05 {

	public class NagativeNumberException extends Exception {
		public NagativeNumberException() {
			super("음수는 허용하지 않습니다");
		}
	}

	int battery = 0;

	public void charge(int time) {
		if (time < 0) {
			time = 0;
			try {
				throw new NagativeNumberException();
			} catch (NagativeNumberException e) {
				e.printStackTrace();
			}
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}

	public static void main(String[] args) {
		Test05 test = new Test05();
		test.charge(30);
		test.charge(20);
		test.charge(-10);
	}

}
