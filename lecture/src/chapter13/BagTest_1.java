package chapter13;

class Bag1<T, N> {
	private T thing;
	private N name;

	public Bag1(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
		System.out.println("N의 타입은 " + name.getClass().getName());
	}
}

class Book1 {
	public String toString() {
		return "책";
	}
}

class PencilCase1 {
}

class Notebook1 {
}

public class BagTest_1 {

	public static void main(String[] args) {
		Bag1<Book1, String> bag = new Bag1<Book1, String>(new Book1(), "과학");
		bag.showType();

		Book1 book = bag.getThing();
		String name = bag.getName();

		System.out.println("Thing is : " + book);
		System.out.println("Name is : " + name);
	}

}
