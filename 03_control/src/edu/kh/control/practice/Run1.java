package edu.kh.control.practice;

import java.util.Scanner;

public class Run1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ConditionPractice cp = new ConditionPractice();
		int num;
		
		do {
			System.out.printf("\n\n"
					+ "method\t1~5\n"
					+ "Exit\t0\n"
					+ "Choose Your Method :");
			num = sc.nextInt();
			switch (num) {
				case 0: {
					break;
				}
				case 1: {
					System.out.println("\n");
					cp.practice1();
					break;
				}
				case 2: {
					System.out.println("\n");
					cp.practice2();
					break;
				}
				case 3: {
					System.out.println("\n");
					cp.practice3();
					break;
				}
				case 4: {
					System.out.println("\n");
					cp.practice4();
					break;
				}
				case 5: {
					System.out.println("\n");
					cp.practice5();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value");
			}
		} while (num !=0);
		System.out.println("End of Program...");
	}
}
