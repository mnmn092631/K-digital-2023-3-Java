package chapter11;

public class Test01 {

	public static void main(String[] args) {
		try {
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("잘못된 배열의 인덱스 사용!");
			System.out.println(e1.getMessage());
		} catch (NullPointerException e2) {
			System.out.println("잘못된 참조!");
			e2.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("GOOD");
	}

}
