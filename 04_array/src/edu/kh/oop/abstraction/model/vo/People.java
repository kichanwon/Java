package edu.kh.oop.abstraction.model.vo;

/*
 * MVC pattern
 * Model		: 데이터와 비즈니스 로직을 처리	(DB,서비스,객체)
 * View			: 사용자에게 보이는 화면		(UI-HTML,JSP,React)
 * Controller	: 사용자의 요청을 받고, 모델과 뷰를 연결 (백엔드(?))
 * ^ application 의 역할을 세가지로 분리하는 설계 패턴
 * 
 * Value Object
 * 값 객체 불변성을 가지며 주로 비즈니스 로직에서 사용
 * VO는 주로 비즈니스 로직에서 사용되며, 불변성을 가지기 때문에 값이 변경되지 않습니다.
 * 
 * Data Transfer Object
 * 데이터 전송 객체 주로 데이터베이스와 애플리케이션 간의 데이터 전송을 위해 사용
 * DTO는 주로 데이터 전송을 목적으로 하며, 데이터베이스의 엔터티와 매우 유사한 구조를 가집니다. 
 * 데이터 전송을 목적으로 하여 데이터베이스의 엔터티와 유사한 구조
 */

public class People {
	private String name;
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;

	//alt + shift + s 
	//getter
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getpNo() {
		return pNo;
	}
	public String getPhone() {
		return phone;
	}


	//setter
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public void tax() {
		System.out.println("세금을 냅니다.");
	}
}
