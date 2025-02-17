package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

		Scanner sc = new Scanner(System.in);

		public void ex1() {
			int input = 1;
			
			while (input!=0) {
				System.out.println("=====메뉴 선택=====");
				System.out.println("1. 떡볶이");				
				System.out.println("2. 쫄면");				
				System.out.println("3. 김밥");				
				System.out.println("0. 종료");				

				System.out.println("메뉴 선택 >>");				
				input = sc.nextInt();
				
			}
		}

		
		public void ex2() {
			int input;
			int sum = 0;
			
			do {
				System.out.printf("숫자를 입력하세요 : ");
				input =sc.nextInt();
				sum+=input;
			}
			while (input!=0);
			System.out.printf("합계는 %d",sum);
		}
		
		
		
}
