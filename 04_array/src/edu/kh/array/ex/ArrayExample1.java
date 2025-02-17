package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.printf("배열의 크기 : ");
		int num = sc.nextInt();
		
		//INT Array
		System.out.println("int arr");
		int intArr[]=new int[num];
		System.out.println(intArr);
//		[ I ---> 배열 정수형을 의미
//		@2353b3e6 ------> 16진수 주소 표시입니다.
		for(int i=0; i<num;i++) {
			intArr[i]=i+1;
			System.out.printf("arr[%d]=%d\n",i,intArr[i]);
		}
		
		//CHAR Array
		System.out.println("\nchar arr");
		char charArr[]=new char[num];
		System.out.println(charArr);
		for(int i=0; i<num;i++) {
			charArr[i]=(char) ('a'+i);
			System.out.printf("arr[%d]=%c\n",i,charArr[i]);
		}
		
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(charArr));
		
		//Array Address test
		System.out.println("\narr");
		int arr1[]=new int[1];
		char arr2[]=new char['a'];
		double arr3[]=new double[1];
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}
	
	
	public void ex2() {
		System.out.printf("배열의 크기 : ");
		int num = sc.nextInt();

		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		System.out.println("Array length : "+arr.length);
		

	}


	public void ex3() {
		System.out.printf("인원 수 : ");
		int num = sc.nextInt();
		
		double[] height = new double[num];
		
		for(int i=0;i<height.length;i++) {
			System.out.printf("%d번 키 입력 : ",i+1);
			height[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i=0;i<height.length;i++) {
			sum += height[i];
		}
		
		System.out.printf("평균 : %.2f",sum/height.length);
	}
	
	public void ex4() {
		System.out.printf("입력받을 인원 수 : ");
		int num = sc.nextInt();
		int[] score = new int[num];

		//입력
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번 점수 입력 : ",i+1);
			score[i] = sc.nextInt();
		}
		
		double sum = 0;
		int max=score[0];
		int min=score[0];
		
		//계산
		for(int i=0;i<score.length;i++) {
			sum += score[i];			
			if(score[i]>max) max = score[i];
			if(score[i]<min) min = score[i];
		}
		
		//출력
		System.out.printf("\n"
				+ "합계 : %d\n"
				+ "평균 : %.1f\n"
				+ "최고점 : %d\n"
				+ "최저점 : %d\n"
				,(int)sum,sum/score.length,max,min);
	}

	public void ex5() {
		String[] arr= {"김밥","서브웨이","햄버거","백반","국밥","짜장면"};
		
		System.out.println("오늘 점심 메뉴 : "+arr[(int)(Math.random()*6)]);
	}

	public void ex6() {

		int[] arr= {100,200,300,400,500,600,700,800,900,1000};
		
		System.out.printf("정수 입력 : ");
		int num =sc.nextInt();
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.printf("%d번째 인덱스에 존재",i);
				flag=true;
			}
		}
		if(!flag) System.out.println("존재하지 않음");

//		for(int i=0;i<arr.length;i++) {
//			if(num==arr[i]) System.out.printf("%d번째 인덱스에 존재",i); 
//			else System.out.println("존재하지 않음"); break;
//		}

	}
	
	public void ex7() {
		String[] arr= {"사과","딸기","바나나","키위","멜론","아보카도"};
		boolean flag=false;

		System.out.printf("과일 입력 : ");
		String food =sc.next();
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(food)) {
				System.out.printf("%d번째 인덱스에 존재",i);
				flag=true;
			}
		}
		if(!flag) System.out.println("존재하지 않음");
		
	}
	
	
	public void ex8() {
		
		//String Constant Pool 저장
		String str ="가나다";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println(""+str);
		
		//Heap 새 객체 저장
		String str2 = new String("가나다");
		System.out.println(str2.toString());
		System.out.println(System.identityHashCode(str2));
		System.out.println(""+str2);
		
		//String Constant Pool 저장 > 같은 주소 참조
		String str3 = "가나다";
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		System.out.println(""+str3);
		
		//Heap 새 객체 저장 > 새로운 주소 생성 저장
		String str4 = new String("가나다");
		System.out.println(str4.toString());
		System.out.println(System.identityHashCode(str4));
		System.out.println(""+str4);
	}
	
	public void ex9() {
		System.out.printf("문자열 입력 : ");
		String str = sc.nextLine();
		char[] arr=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		int count =0;
		System.out.printf("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(ch==arr[i]) count++;
		}
		
		System.out.println("\n입력한 문자열: "+str.toString());
		if(count>0) System.out.println(count+"개 있음");
		else System.out.println("일치하는 값 없음");
	}
	

/////////////////////////////////////////////////////////////
/*
 * 	문자형 + 배열 = 문자열
 * 	문자열 + 배열 = 문자열 배열
 * 
 */
	public void b() {
		String[] strArr = {"사과","바나나","딸기"};
		
		System.out.printf("%s\n",strArr);
		System.out.println(strArr);
		System.out.println(""+strArr);
	}
	
	
/////////////////////////////////////////////////////////////
	public void a() {		
		//Array Address test
		System.out.println("Arr Address Test");
		
		int intArr[]=new int[1];
		System.out.println(intArr);

		
		char charArr[]=new char[1];
		System.out.println(charArr); // char[] = str string 자체가 char 배열 편하게 쓰려고 만든거
		System.out.println("" + charArr);// C에서 char[] 배열 만들어서 쓰는 

		double doubleArr[]=new double[1];
		System.out.println(doubleArr);

		String[] strArr= new String[1];
		System.out.println(strArr);

		String str = "1";
		System.out.println(str);
		System.out.println(""+str);
		
		char[][] arr = {{'a','b','c'},
				{'ㄱ','ㄴ','ㄷ'}};

		System.out.println(arr);
	}
/////////////////////////////////////////////////////////////

}
