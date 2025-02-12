package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter num1 : ");			
		double Input1 = sc.nextDouble();

		System.out.printf("Enter operator : ");			
		String s = sc.next();
		char Op = s.charAt(0);	
		
		System.out.printf("Enter num2 : ");			
		double Input2 = sc.nextDouble();
			
		double res;
		
		switch (Op) {
		case '+': {
			res = Input1+Input2;
			break;
		}
		case '-': {
			res = Input1-Input2;
			break;
		}
		case '*': {
			res = Input1*Input2;
			break;
		}
		case '/': {
			res = Input1/Input2;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
		System.out.printf("%.2f %c %.2f = %.2f",Input1,Op,Input2,res);
	}
}
