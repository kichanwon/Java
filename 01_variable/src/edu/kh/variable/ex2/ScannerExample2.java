package edu.kh.variable.ex2;

import java.util.Scanner;

<<<<<<< HEAD
// ctrl + shift + o : 현재 파일에서 import 되지 않은 클래스 모두 import 단축키

public class ScannerExample2 {

	public static void main(String[] args) {
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 2째 자리까지만 표현
		// 입력받아 : Scanner 필요!
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 : sc.nextInt();
		// 실수 : sc.nextDouble();
		
		System.out.print("첫번째 실수 입력 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("두번째 실수 입력 : ");
		double input2 = sc.nextDouble();
		
		// + - * /
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2 );
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2 );
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2 );
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2 );
		
		
		
		
		
		
		

	}

}
=======
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

>>>>>>> ca370efb7f5870e64410c0c03377818e84e4232b
