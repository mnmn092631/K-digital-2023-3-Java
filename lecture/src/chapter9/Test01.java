package chapter9;

public class Test01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println("hashCode : " + obj1.hashCode());
		System.out.println("toString : " + obj1.toString());
		System.out.println("== : " + (obj1 == obj2));
		System.out.println("equals : " + obj1.equals(obj2));
	}
}
