package chapter5;

public class Mission2 {
	
	public void leapYear() {
		int[] leapYears = new int[40];
		
		int year = 2023;
		int i = 0;
		
		while(i < 40) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				leapYears[i++] = year;
			}
			year++;
		}
		
		
		for(int y : leapYears) {
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		Mission2 m = new Mission2();
		m.leapYear();
	}

}
