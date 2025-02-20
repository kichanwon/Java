package edu.kh.op.practice;
<<<<<<< HEAD

import java.util.Scanner;

public class OperatorPractice2 {

	/*
	 * 키보드로 나이를 입력받아 
	20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
	입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
	입력받은 값이 65세 이상이거나, 12세 이하면 
	"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
			
	[실행화면]
			
	당신의 나이는 ? : 20
	저는 성인입니다
	청소년 입니까? false
	노인이거나 어린이 입니까? false
	-----------------------------------------
	당신의 나이는 ? : 13
	저는 미성년입니다
	청소년 입니까? true
	노인이거나 어린이 입니까? false
	*/
	public void ex() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		
		String personType = (age >= 20) ? "성인" : "미성년";
		System.out.println("저는 " + personType + "입니다");
		
		boolean isTeenager = (age >= 13) && (age <= 19);
		System.out.println("청소년 입니까? " + isTeenager);
		
		boolean isSeniorOrChild = (age >= 65) || (age <= 12);
		System.out.println("노인이거나 어린이입니까? " + isSeniorOrChild);
		
	
		
	}
}
=======
import java.util.Scanner;

//키보드로 나이를 입력받아 
//20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
//입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
//입력받은 값이 65세 이상이거나, 12세 이하면 
//"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		
public class OperatorPractice2 {
	Scanner sc = new Scanner(System.in);

	public void practice() {
		System.out.printf("당신의 나이는 ? : ");
		int age = sc.nextInt();
	
		System.out.println(age>=20 ? "저는 성인입니다.":"저는 미성년입니다.");
		
		System.out.printf("청소년입니까? ");
		System.out.printf(age>=13 && age<=19 ? "true":"false"+"\n");
		
		System.out.printf("노인이거나 어린이 입니까?");
		System.out.printf(age>=65 || age<=12 ? "true":"false"+"\n");
		
		
	}	
}

>>>>>>> ca370efb7f5870e64410c0c03377818e84e4232b
