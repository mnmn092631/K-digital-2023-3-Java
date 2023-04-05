package chapter3;

public class Gugudan {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("구구단 " + i + "단");
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j)+"\t");
				if(i==1) {
					System.out.print("\n");
				}
				if((i==2 && j%2==0)||(i==2 && j==9)) {
					System.out.print("\n");
				}
				if(i==3 && j%3==0) {
					System.out.print("\n");
				}
			}
			System.out.println("------------------------");
		}

	}

}
