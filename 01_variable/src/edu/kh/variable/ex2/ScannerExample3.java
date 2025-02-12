package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.printf("String next Line :");			
		String S1 = sc.nextLine();
		System.out.printf("%s\n",S1);

		System.out.printf("String next :");			
		String S2 = sc.next();
		System.out.printf("%s\n",S2);
	}
}

