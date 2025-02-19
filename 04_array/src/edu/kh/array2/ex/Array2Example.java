package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {

	public void ex1() {
			int[][] arr = { {1,2,3},
						 	{4,5,6},
							{7,8,9}};

			
			for (int row=0;row<arr.length;row++) {
				int sum=0;
				for (int col=0;col<arr[row].length;col++) {
				sum+=arr[row][col];
				}
				System.out.printf("%d행의 합 : %d\n",row,sum);
			}
		}
		
	
	public void ex2() {
		int[][] arr = { {1,2,3},
					 	{4,5,6},
						{7,8,9}};

		for (int col=0;col<arr[0].length;col++) {
			int sum=0;
				for (int row=0;row<arr.length;row++) {
					sum+=arr[row][col];
				}
				System.out.printf("%d행의 합 : %d\n",col,sum);		
			}
		}	
		
	public void ex3() {
		char[][] arr = new char[4][];

		arr[0] = new char[3];
		arr[1] = new char[4];
		arr[2] = new char[5];
		arr[3] = new char[2];

		char ch = 'a';
		
		for (int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++) {
				arr[row][col]=ch++;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
		
		
		
		
		
}
