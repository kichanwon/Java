package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	Scanner sc = new Scanner(System.in);
	
	public void ex() {
		System.out.printf("달 입력 : ");
		int month = sc.nextInt();
		String season;
		
		if (month==1||month==2||month==12) {
			season="겨울";
			System.out.printf("기온 입력 : ");
			int temp = sc.nextInt();
			
			if (temp <= -15) {
				season += " 한파 경보";
			}else if (temp <= -12) {
				season += " 한파 주의보";
			}
				
		}else if (month>=3&&month<=5) {
			season="봄";
			
		}else if (month>=6&&month<=8) {
			season="여름";
			System.out.printf("기온 입력 : ");
			int temp = sc.nextInt();
			
			if (temp >= 35) {
				season += " 폭염 경보";
			}else if (temp >= 33) {
				season += " 폭염 주의보";
			}
			
		}else if (month>=9&&month<=11) {
			season="가을";
			
		}else {
			season="해당하는 계절이 없습니다.";
		}

		System.out.printf("계절 : %s\n",season);
	}
	
	public void ex5() {
		System.out.printf("나이 입력 : ");
		int age = sc.nextInt();
		
		if (age<=13)System.out.println("어린이 입니다.");
		else if (age<=19)System.out.println("청소년 입니다.");			
		else System.out.println("성인 입니다.");	
	}
	
	public void ex6() {
		System.out.printf("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score>100||score<0)System.out.println("잘못 입력하셨습니다.");
		else if (score>=90)System.out.println("A");			
		else if (score>=80)System.out.println("B");			
		else if (score>=70)System.out.println("C");			
		else if (score>=60)System.out.println("D");			
		else if (score<60)System.out.println("F");			
		else System.out.println("Error.");	
	}

	
	public void ex7() {
		System.out.printf("나이 입력 : ");
		int age = sc.nextInt();
		
		if (age>100||age<0)System.out.println("잘못 입력하셨습니다.");
		else {
			System.out.printf("키 입력 : ");
			int height = sc.nextInt();
			if (age<12) {
				 System.out.println("적정 연령이 아닙니다.");				
			}else if (height>=140) {
				System.out.println("탑승가능");
			}else System.out.println("적정 키가 아닙니다.");
		}	
	}	
	
	public void ex8() {
		System.out.printf("나이 입력 : ");
		int age = sc.nextInt();
		
		if (age>100||age<0) {System.out.println("잘못 입력하셨습니다.");}
		else {
			System.out.printf("키 입력 : ");
			int height = sc.nextInt();
			if (height>255||height<0) {System.out.println("키를 잘못 입력하셨습니다.");}
			else {
				if (age<12&&height<140) {
					System.out.printf("나이와 키 모두 적절치 않음");
				}else if(age<12||height<140) {
					if(age<12) {
						System.out.printf("키는 적절하나, 나이가 적절치 않음");
					}else System.out.printf("나이는 적절하나, 키가 적절치 않음");
				}else{
					System.out.printf("탑승 가능!!");
				}
			}
		}	
	}	
	

//	public void ex9() {
//	
//		
//		System.out.println("점수 입력 :");
//
//		switch (score/10) {
//		case 10: System.out.printf("탑승 가능!!");
//		case 9: System.out.printf("탑승 가능!!");
//		case 8: System.out.printf("탑승 가능!!");
//		case 7: System.out.printf("탑승 가능!!");
//		case 6: System.out.printf("탑승 가능!!");
//		default:System.out.printf("탑승 가능!!");
//		}
//	}
	
	
	
	
	
	
	
}

