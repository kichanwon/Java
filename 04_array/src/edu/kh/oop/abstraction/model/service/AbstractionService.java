package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

/*
 * Service : 특정 기능 (비즈니스 로직)을 제공하는 패키지 or 서비스
 */

public class AbstractionService {
	public void ex1() {
		People p1=new People(); //p1은 객체, People 의 인스턴스
		
		System.out.println("p1 name : "+p1.getName());
		System.out.println("p1 gender : "+p1.getGender());
		System.out.println("p1 age : "+p1.getAge());
		System.out.println();

		//set elements
		p1.setName("이름");
		p1.setGender('남');
		p1.setAge(19);
		
		System.out.println("p1 name : "+p1.getName());
		System.out.println("p1 gender : "+p1.getGender());
		System.out.println("p1 age : "+p1.getAge());
		p1.tax();

	}
	
	
	public void ex2() {
		People 기찬 = new People();

		//set elements
		기찬.setName("원기찬");
		기찬.setGender('남');
		기찬.setpNo("011225-3******");
		기찬.setAddress("논현로 160길 20");
		기찬.setPhone("010-2292-0815");
		기찬.setAge(19);
		
		System.out.println("기찬 name : "+기찬.getName());
		System.out.println("기찬 gender : "+기찬.getGender());
		System.out.println("기찬 pNo : "+기찬.getpNo());
		System.out.println("기찬 address : "+기찬.getAddress());
		System.out.println("기찬 gender : "+기찬.getPhone());
		System.out.println("기찬 phone : "+기찬.getAge());
		System.out.println(""+기찬);
	}
	
}
