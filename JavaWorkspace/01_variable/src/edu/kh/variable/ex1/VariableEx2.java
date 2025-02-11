package edu.kh.variable.ex1;

import java.util.Scanner;

public class VariableEx2 {
	public static void main(String[] args) {
		/*
		 * 자바 기본 자료형 8가지
		 * 논리형: Boolean (1byte)
		 * 정수형: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형: float(4byte), double(8byte)
		 * 문자형: char(2byte, 유니코드)
		 * 참조형 - 문자열 String
		 */
		
		boolean booleanData = true;
		System.out.printf("booleanData is %b\n",booleanData);
	
//		long longNumber = 100000000000l;
//		float floatNumber = 1.23456f;
//		char ch = 'A';
//		final int CONST=100;
		
		int i = 2_100_000_000;
		long l= 10_000_000_000l;
		
		long result = i+l;
		System.out.println(result);
		
		char gak = '각';
		System.out.println((int)gak);
	}
}
