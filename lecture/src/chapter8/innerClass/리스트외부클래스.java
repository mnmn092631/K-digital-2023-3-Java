package chapter8.innerClass;

class MyLinkedList {
	Node head;

	class Node {
		String data;
		Node link;

		public Node(String data) {
			this.data = data;
		}

		public String toString() {
			return "data : " + data;
		}
	}

	void add(String name) {
		Node temp = new Node(name);
		if (head == null)
			head = temp;
		else {
			temp.link = head;
			head = temp;
		}
	}

	void show() {
		Node p = head;
		while (p != null) {
			System.out.println(p.toString());
			p = p.link;
		}
	}
}

public class 리스트외부클래스 {
	public static void main(String[] args) {
		MyLinkedList my = new MyLinkedList();
		my.add("hong");
		my.add("kim");
		my.add("lee");
		my.add("park");
		my.add("kang");
		my.show();
	}
}
