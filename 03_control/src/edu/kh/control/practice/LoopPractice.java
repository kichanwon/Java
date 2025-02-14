package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.printf("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for(int i=1;i<=num;i++) {
				System.out.printf("%d ",i);
			}
		}	
	}
	
	
	public void practice2() {
		System.out.printf("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for(int i=num;i>0;i--) {
				System.out.printf("%d ",i);
			}
		}	
	}
	
	
	public void practice3() {
		System.out.printf("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<num;i++) {
				System.out.printf("%d + ",i);
				sum+=i;		
		}
		System.out.printf("%d ",num);
		sum+=num;	
		System.out.printf("= %d",sum);
	}
	
	
	public void practice4() {
		System.out.printf("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.printf("두번째 숫자 : ");
		int num2 = sc.nextInt();
		int start,end;
		
		if(num1==0||num2==0) System.out.printf("1 이상의 숫자를 입력해주세요.\n");
		else {
			if(num1>num2) {
				start = num2;
				end = num1;
			}else {
				start = num1;
				end = num2;
			}
			for(int i=start;i<=end;i++) {
				System.out.printf("%d ",i);
			}
		}
	}
	
	public void practice5() {
		System.out.printf("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2||num>9) System.out.println("2~9 사이 숫자만 입력해주세요.");
		else {				
			for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %d\n",num,i,num*i);
			}		
		}

	}
	
	
	public void practice6() {
		System.out.printf("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2||num>9) System.out.println("2~9 사이 숫자만 입력해주세요.");
		else {				
			for(int j=num;j<=9;j++) {
				System.out.printf("===== %d단 =====\n",j);
				for(int i=1;i<=9;i++) {
					System.out.printf("%d X %d = %d\n",j,i,j*i);
				}		
				System.out.printf("\n");
			}
		}
		
	}
	
	public void practice7() {
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int k=0;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
	
	
	public void practice8() {
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}

	
	public void practice9() {
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.printf(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}		
	}
	
	public void practice10() {
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num-1;i++) {
			for(int k=0;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
	
	public void practice11() {
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.printf(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.printf("*");
			}
			
			for(int k=0;k<i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
			
		}		
	}
	
	public void practice12() {
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
					for(int j=0;j<num;j++) {	
						if(i==0 || i==num-1 || j==0 || j==num-1) {
							System.out.printf("*");
						}else {
							System.out.printf(" ");					
						}
					}
		System.out.printf("\n");
		}
		
	}
/*
 * 0 01234
 * 
 * 1 0   4
 * 2 0   4
 * 3 0   4
 * 4 01234
 * 
 * 
 * 
 * 0 
 * 1  123
 * 2  123
 * 3  123
 * 4 

 */
	
	public void practice13() {
		System.out.printf("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if (i%2==0 || i%3==0) {
				System.out.printf("%d ",i);
				if (i%2==0 && i%3==0)count+=1;
			}
		}
		System.out.printf("\ncount : %d",count);
	}
	
}
