package edu.kh.op.ex;

import java.util.Scanner;


//tried to make looped Example Compilation but became out of interest

public class ExampleRun {
	public static void main(String[] args) {

		//‘opEx는 객체’ ‘opEx는 OpExample의 인스턴스’
		OpExample opEx = new OpExample();
		
		Scanner sc = new Scanner(System.in);
int num;
do {
	System.out.printf(""
			+ "Arithmetic	method : 1\n"
			+ "Comparison	method : 2\n"
			+ "Logical		method : 3\n"
			+ "Ternary		method : 4\n"
			+ "Practice	method : 5\n"
			+ "Exit	>>>	0\n"
			+ "Choose Your Method :");		
	
	num = sc.nextInt();
	
	switch (num) {
		case 1: {
			opEx.Arithmetic();
			break;
		}
		case 2: {
			opEx.Comparison();
			break;
		}
		case 3: {
			opEx.Logical();
			break;
		}
		case 4: {
			opEx.Ternary();
			break;
		}
		case 5: {
			opEx.prac();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
	}
} while (num !=0);

	}
}

