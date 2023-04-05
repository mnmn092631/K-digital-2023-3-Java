package chapter4;

public class Mission1 {

	public static void main(String[] args) {
		int [][] arr1 = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 } };
		int [][] arr2 = { { 3, 4, 5 },
						{ 6, 7, 8 },
						{ 9, 3, 1 },
						{ 2, 3, 4 } };
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				int temp = 0;
				for(int k = 0; k < arr2.length; k++) {
					temp += (arr1[i][k] * arr2[k][j]);
				}
				System.out.print(temp);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}

}
