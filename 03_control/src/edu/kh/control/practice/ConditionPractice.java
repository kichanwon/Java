package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.printf("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num<0) {
			System.out.println("양수만 입력해주세요");
		}else {
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}
	}
	
	
	
	public void practice2() {
		System.out.printf("국어점수 : ");
		int kor = sc.nextInt();
		System.out.printf("수학점수 : ");
		int math = sc.nextInt();
		System.out.printf("영어점수 : ");
		int eng = sc.nextInt();
		
		float avg = (kor+math+eng)/3;
		
		if (kor>=40&&math>=40&&eng>=40&&avg>=60) {
			System.out.printf("국어 : %d",kor);
			System.out.printf("수학 : %d",math);
			System.out.printf("영어 : %d",eng);
			System.out.printf("합계 : %d",(kor+math+eng));
			System.out.printf("평균 : %.1f",avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	
//using if	
//	public void practice3() {
//		System.out.printf("1~12 사이의 정수 입력 : ");
//		int month = sc.nextInt();
//		
//		if (month<1||month>12) {
//			System.out.printf("%d월은 잘못 입력된 달입니다.\n",month);
//		}else {
//			if(month==2) {
//				System.out.printf("%d월은 28일까지 있습니다.\n",month);			
//			}else {
//				if(month<=7) {
//					if(month%2==0) {
//						System.out.printf("%d월은 30일까지 있습니다.\n",month);				
//					}else System.out.printf("%d월은 31일까지 있습니다.\n",month);		
//				}else {
//					if(month%2!=0) {
//						System.out.printf("%d월은 30일까지 있습니다.\n",month);				
//					}else System.out.printf("%d월은 31일까지 있습니다.\n",month);	
//				}
//			}
//		}
//	}
	
	
// using switch case
	public void practice3() {
		System.out.printf("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

			switch (month) {
			case 2: System.out.printf("%d월은 28일까지 있습니다.\n",month);
					break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.printf("%d월은 31일까지 있습니다.\n",month);
					break;
			case 4:
			case 6:
			case 9:
			case 11:System.out.printf("%d월은 30일까지 있습니다.\n",month);
					break;
			default:
				System.out.printf("%d월은 잘못 입력된 달입니다.\n",month);
		}
	}
	
	
	
	
	public void practice4() {
		System.out.printf("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.printf("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.printf("BMI 지수 : %ld\n",bmi);
		
		if (bmi<18.5) System.out.println("저체중");
		else if(bmi<23) System.out.println("정상체중");
		else if(bmi<25) System.out.println("과체중");
		else if(bmi<30) System.out.println("비만");
		else System.out.println("고도비만");
	}
	
	
	
	
	public void practice5() {
		System.out.printf("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.printf("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.printf("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.printf("출석 횟수 : ");
		int attendence = sc.nextInt();
		
		float midPoint = mid*0.2f;
		float finPoint = fin*0.3f;
		float hwPoint = hw*0.3f;
		float attendencPoint = attendence*1.0f;
		float totalPoint = midPoint+finPoint+hwPoint+attendencPoint;

		
		System.out.println("================= 결과 =================");

		
		if(totalPoint<=70||attendence*1.0<20-20*0.3) {
			if(attendence*1.0<20-20*0.3) {
				System.out.printf("Fail [출석 횟수 부족(%d/20)]",attendence);
			}else {
				System.out.printf("중간 고사 점수(20) : %.1f\n",midPoint);
				System.out.printf("기말 고사 점수(30) : %.1f\n",finPoint);
				System.out.printf("과제 점수\t(30) : %.1f\n",hwPoint);
				System.out.printf("출석 점수\t(20) : %.1f\n",attendencPoint);
				System.out.printf("총점: %.1f\n",totalPoint);
				System.out.printf("Fail [점수 미달]");
			}
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n",midPoint);
			System.out.printf("기말 고사 점수(30) : %.1f\n",finPoint);
			System.out.printf("과제 점수\t(30) : %.1f\n",hwPoint);
			System.out.printf("출석 점수\t(20) : %.1f\n",attendencPoint);
			System.out.printf("총점: %.1f\n",totalPoint);
			System.out.printf("PASS");
		}
	}
	
	
}
