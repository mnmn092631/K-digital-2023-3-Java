package chapter13;

class Bag2<T extends Solid> {
	private T thing;
	private String owner;

	public Bag2(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	boolean isSameOwner(Bag2<?> obj) {
		if (this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Solid {
}

class Liquid {
}

class Book2 extends Solid {
}

class PencilCase2 extends Solid {
}

class Notebook2 extends Solid {
}

class Water extends Liquid {
}

class Coffee extends Liquid {
}

public class BagTest_2 {

	public static void main(String[] args) {
		Bag2<Book2> bag = new Bag2<>(new Book2());
		Bag2<PencilCase2> bag2 = new Bag2<>(new PencilCase2());
		Bag2<Notebook2> bag3 = new Bag2<>(new Notebook2());

//		Bag2<Water> bag4 = new Bag2<>(new Water()); 오류 발생
		
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		
		boolean result = bag2.isSameOwner(bag);
		System.out.println(result);
	}

}
