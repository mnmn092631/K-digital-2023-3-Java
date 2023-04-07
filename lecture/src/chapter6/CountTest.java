package chapter6;

class Count {
	public static int totalCount;
	private int num;
	
	public void setNum(int n) {
		num = n;
	}
	
	public int getNum() {
		return num;
	}
}

public class CountTest {
	
	public static void main(String[] args) {
		int num = 0;
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

//		c1.num++;
		c1.setNum(num++);
		Count.totalCount++;
//		c2.num++;
		c2.setNum(num++);
		Count.totalCount++;
//		c3.num++;
		c3.setNum(num++);
		Count.totalCount++;

		System.out.println(Count.totalCount + " : " + c1.getNum());
		System.out.println(Count.totalCount + " : " + c2.getNum());
		System.out.println(Count.totalCount + " : " + c3.getNum());
	}
	
}