package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name=name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f / 급여 : %d / 부서 : %s",
				name,super.getAge(),super.getHeight(),super.getWeight(),salary,dept);	}
}
