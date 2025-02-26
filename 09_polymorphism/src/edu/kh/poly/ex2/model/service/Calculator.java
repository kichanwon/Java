package edu.kh.poly.ex2.model.service;

public interface Calculator {
/*
		인터페이스	== 추상클래스의 변형체 (추상클래스보다 추상도 높음)
		추상클래스	: 일부만 추상 Method (0개 이상)
		인터페이스	: 모두 추상 Method
 */

	
//	Field
// 	public	static	final	dataType name = Value; <- 기본형

	public	static	final	double	PI		= 3.14;
	static			final	int		MAX_NUM = 1000000;
	public					int		MIN_NUM = -1000000;
							int		ZERO	= 0;



//	Method
//	public	abstract	dataType name (~); <-기본형

	public	abstract	int	plus	(int num1, int num2);
	public				int minus	(int num1, int num2);
			abstract	int multiple(int num1, int num2);
	public	abstract	int divide	(int num1, int num2);
						
						
}
