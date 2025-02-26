package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.AbstractService;
import edu.kh.poly.ex2.model.service.Calculator;
import edu.kh.poly.ex2.model.service.WKC_Calculator;

public class AbstractRun {
	public static void main(String[] args) {
		
		AbstractService as = new AbstractService();
		
//		as.ex1();
		
		Calculator cal = new WKC_Calculator();
		System.out.println("합 : "+cal.plus(10, 20));
		System.out.println("차 : "+cal.minus(10, 20));
		System.out.println("곱 : "+cal.multiple(10, 20));
		System.out.println("몫 : "+cal.divide(10, 20));
	}
}
