package com.hw1.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f / 학년 : %d / 전공 : %s",
				name,super.getAge(),super.getHeight(),super.getWeight(),grade,major);
	}
}
