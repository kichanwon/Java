package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		System.out.printf("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<21;i++) {
			if(i%input==0) {
				System.out.printf("(%d)",i);
			}else {
				System.out.printf("%d",i);
			}
			System.out.printf(" ");
		}
	}
	
	
	public void ex2() {
		System.out.printf("단 입력 : ");
		int input = sc.nextInt();
		
		if(input>9||input<2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i=1; i<10;i++) {
				System.out.printf("%d X %d = %d\n",input,i,input*i);
			}			
		}
	}
	
	
	public void ex3() {
		System.out.printf("배수 입력 : ");
		int input = sc.nextInt();
		int count=0;
		int sum=0;
		String strNum="";
		
		for(int i=1; i<21;i++) {
			if(i%input==0) {
				strNum += i+" ";
				count += 1;
				sum+=i;
			}
		}
		System.out.printf("%s: %d개\n",strNum,count);
		System.out.printf("%d의 배수 합계 : %d",input,sum);
	}
	
//	public void ex3() {
//		System.out.printf("배수 입력 : ");
//		int input = sc.nextInt();
//		int count=0;
//		int sum=0;
//		
//		for(int i=1; i<21;i++) {
//			if(i%input==0) {
//				System.out.printf("%d ",i);
//				count += 1;
//				sum+=i;
//			}
//		}
//		System.out.printf(": %d\n",count);
//		System.out.printf("3의 배수 합계 : %d",sum);
//	}
//	
	/*
	 * 1 2 3
	 * 4 5 
	 * 
	 */
	
	
	public void ex4() {
		System.out.printf("단 입력 : ");
		int inputDan = sc.nextInt();
		System.out.printf("열 입력 : ");
		int inputRow = sc.nextInt();
		int bundle=0;
		
		bundle = (int)Math.ceil((double)inputDan/inputRow);
		System.out.println(bundle);

		for(int i=0;i<bundle;i++) {
			
			for(int j=1;j<10;j++) {
				for(int dan=1+i*inputRow,lineCount=0;
						lineCount<inputRow && dan<=inputDan;
						dan++,lineCount++) {
					System.out.printf("%d X %d = %d\t",dan,j,dan*j);
				}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}

}

}
