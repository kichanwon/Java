package edu.kh.op.practice;
import java.util.Scanner;


		
public class OperatorPractice3 {
	Scanner sc = new Scanner(System.in);

	
	public void practice1() {
//	문제1) 
//	마트에서 고객에게 할인 혜택을 제공하려고 한다
//	물건의 총 가격과 회원 여부를 입력받아, 
//	회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라

//	[실행화면]
//	가격을 입력 하세요 : 10000
//	멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
//	할인을 포함한 최종금액 : 9000.0원

		System.out.printf("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		
		System.out.printf("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		boolean member = sc.nextBoolean();
	
		System.out.printf("할인을 포함한 최종금액 : ");
	
//		int total =(member==true ? price*9/10:price);
//		System.out.print(total);		
		
		System.out.printf(member==true ? "%.1f":"%.1f"+"\n",price*0.9,price*1.0);		
	}	
	
	
	public void practice2() {
//	문제2)
//	ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
//	ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
//
//	메서드 : public void practice2() {}
//
//	[실행화면]
//	출금할 금액 입력 : 123000
//	50000원: 2
//	10000원: 2
//	5000원: 0
//	1000원: 3

			System.out.printf("출금할 금액 입력 : ");
			int money = sc.nextInt();
			
			System.out.println("50000원: " + money/50000);
			System.out.println("10000원: " + ((money/50000)/10000)  );
			System.out.println("5000원: " + (((money/50000)/10000)/5000)  );
			System.out.println("1000원: " + ((((money/50000)/10000)/5000)/1000)  );	
		}	
	
	
	public void practice3() {
//문제3)
//사용자로부터 두 개의 정수를 입력받아, 
//첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
//만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
//
//메서드 : public void practice3() {}
//
//[실행화면]
//첫 번째 수 : 100
//두 번째 수 : 5
//배수입니다
//
//첫 번째 수 : 200
//두 번째 수 : 7
//배수가 아닙니다

				System.out.printf("가격을 입력 하세요 : ");
				int price = sc.nextInt();
				
				System.out.printf("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
				boolean member = sc.nextBoolean();
			
				System.out.printf("할인을 포함한 최종금액 : ");
			
				System.out.printf(member==true ? "%.1f":"%.1f"+"\n",price*0.9,price*1.0);		
			}	
}

/*


 */