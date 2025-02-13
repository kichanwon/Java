package edu.kh.op.practice.run;

import java.util.Scanner;

import edu.kh.op.practice.OperatorPractice;
import edu.kh.op.practice.OperatorPractice2;
import edu.kh.op.practice.OperatorPractice3;


public class PracticeRun {
	public static void main(String[] args) {
		OperatorPractice op = new OperatorPractice();
		OperatorPractice2 op2 = new OperatorPractice2();
		OperatorPractice3 op3 = new OperatorPractice3();
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.printf("\n\n"
					+ "op1 1~3\n"
					+ "op2 4\n"
					+ "op3 5~7\n"
					+ "0 to exit\n->");
			num = sc.nextInt();
			switch (num) {
			case 0: {
				break;
			}
			case 1: {
				op.practice1();
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				op.practice3();
				break;
			}
			case 4: {
				op2.practice();
				break;
			}
			case 5: {
				op3.practice1();
				break;
			}
			case 6: {
				op3.practice2();
				break;
			}
			case 7: {
				op3.practice3();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}
		} while (num!=0);
		System.out.println("\nEnd...\n");
	}
}
