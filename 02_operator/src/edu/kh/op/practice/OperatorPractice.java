package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.printf("인원 수 : ");
		int numPeople = sc.nextInt();
		System.out.printf("사탕 개수 : ");
		int numCandy = sc.nextInt();
		
		System.out.printf("\n"
				+ "1인당 사탕 개수 : %d\n"
				+ "남는 사탕 개수 : %d",numCandy/numPeople,numCandy%numPeople);
	}
	
	public void practice2() {
		System.out.printf("이름 : ");
		String name = sc.next();
		System.out.printf("학년(정수만) : ");
		int numGrade = sc.nextInt();
		System.out.printf("반(정수만) : ");
		int numClass = sc.nextInt();
		System.out.printf("번호(정수만) : ");
		int numNum = sc.nextInt();
		System.out.printf("성별(남학생/여학생) : ");
		String strSex = sc.next();
		System.out.printf("성적(소수점 아래 둘째 자리까지) : ");
		float degree = sc.nextFloat();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",numGrade,numClass,numNum,name,strSex,degree);
	}
	
	public void practice3() {

//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

		System.out.printf("국어 : ");
		int kor = sc.nextInt();
		System.out.printf("영어 : ");
		int eng = sc.nextInt();
		System.out.printf("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		
		System.out.printf("\n"
				+ "합계 : %d\n"
				+ "평균 : %.1f",sum,sum/3.0);
		
		System.out.println(kor>=40 && eng>=40 && math>=40 && sum/3>=60 ? "합격입니다.":"불합격입니다.");
	}
}
