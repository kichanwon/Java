package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//한 줄 입력 계산기 / 소수점 둘째 자리까지
		
		System.out.printf("Enter num1,operator,num2\n-> ");			
		double Input1 = sc.nextDouble();
		String s = sc.next();
		char Op = s.charAt(0);		
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
		case '%': {
			res = Input1%Input2;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
		System.out.printf("%.2f %c %.2f = %.2f",Input1,Op,Input2,res);
	}
}

