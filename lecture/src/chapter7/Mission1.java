package chapter7;

public class Mission1 {
	
	public static void sum() {
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) evenSum += i;
			else oddSum += i;
		}
		
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("총계 : " + (evenSum + oddSum));
	}

	public static void main(String[] args) {
		sum();
	}

}
