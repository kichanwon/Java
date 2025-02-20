package edu.kh.control.practice;

<<<<<<< HEAD
public class Run1 {

	public static void main(String[] args) {
		ConditionPractice cp = new ConditionPractice();
		//cp.practice1();
		//cp.practice2();
		//cp.practice3();
		//cp.practice4();
		cp.practice5();
	}

=======
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
>>>>>>> ca370efb7f5870e64410c0c03377818e84e4232b
}
