package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
//		String 타입으로 Box 객체 생성
		Box<String> stringBox = new Box<String>();
//		Box.java  T <- String 으로 대체
	
//		stringBox.setItem(999);					//	cause error type missmatch
		stringBox.setItem("this is Generic");
		System.out.println(stringBox.getItem());

//		Box<int> intBox = new Box<int>();		//	Syntax error, insert "Dimensions" to complete ReferenceType
		Box<Integer> intBox = new Box<Integer>();
//		Java 7 이상 우변 타입 생략 가능
		Box<Double> doubleBox = new Box<>();
		
		intBox.setItem(123);
		System.out.println(intBox.getItem());
		
		int num = 10;
		System.out.println(((Object)num).getClass().getSimpleName());

		Integer num1 = num;
//		Auto-Boxing		기본형 -> Wrapper class 자동변환
		System.out.println(((Object)num).getClass().getSimpleName());
		
		int num2 = num1;
//		Auto-Unboxing	Wrapper class -> 기본형 자동변환
		System.out.println(((Object)num).getClass().getSimpleName());
	}
}
