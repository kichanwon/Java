package edu.kh.op.ex;

import java.util.Random;
import java.util.Scanner;


public class OpExample {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);

	//Arithmetic method
	public void Arithmetic() {
		int a = 5;
		int b = 5;
		int c = a++ + --b;
		System.out.printf("%d %d %d",a,b,c);
		
		// try to make random arithmetic quiz
		
//		int a = rand.nextInt(10);
//		int b = rand.nextInt(10);
//		int c = a++ + --b;
//		System.out.printf(""
//				+ "c = a++ + --b\n"
//				+ "%d = %d++ + --%d\n"
//				+ "guess a,b,c\n->",a,b,c);
//		String numStr = sc.nextLine();
//		//split input 
//		String[] numArr = numStr.split(" ");
//
//		System.out.printf("you:\n");
//		for(int i=0; i<numArr.length; i++) {
//			System.out.printf("%s ",numArr[i]);
//		}
//		System.out.printf("\ncom:\n");
//		System.out.printf("%d %d %d",a,b,c);

	}

	//Comparison method
	public void Comparison() {
		System.out.printf("need edit\n");

	}
	
	//Logical method
	public void Logical() {
		System.out.printf("need edit\n");
		
	}
	
	//Ternary method
	public void Ternary() {
		int num1 = rand.nextInt(100);
		int num2 = rand.nextInt(100);
		String res = num1 > num2 ? "True":"False";
		System.out.printf("%d > %d ? ___\nTrue or False : ",num1,num2);
		String answer = sc.next();
		
		System.out.printf("you: %s\ncom: %s",answer,res);
	}
	
	//Practice
	public void prac() {
		System.out.printf("Input a integer number : ");
		int inputNum = sc.nextInt();
		String answer = inputNum >= 0 ? "양수입니다.":"음수입니다.";
		
		System.out.printf("%s",answer);
	}
}
