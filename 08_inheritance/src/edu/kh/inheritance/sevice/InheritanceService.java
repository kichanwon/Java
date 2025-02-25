package edu.kh.inheritance.sevice;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("======================");
		
		Student std = new Student();
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("미국");
		std.setGrade(2);
		std.setClassRoom(5);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade()+"학년");
		System.out.println(std.getClassRoom()+"반");
		
		System.out.println("======================");
		Employee emp = new Employee();
		
		emp.setName("조미현");
		emp.setAge(25);
		emp.setNationality("대한민국");
		emp.setCompany("kh정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		emp.breath();
		emp.move();
	}

	public void ex2() {
		Student std = new Student("조미현",20,"한국",1,1);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade()+"학년");
		System.out.println(std.getClassRoom()+"반");	
		
		std.breath();
		std.move();
	}
	
	public void prac() {
		Employee emp = new Employee("김노동",30,"한국","KH정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
		emp.move();
	}
	
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move();
		emp.move();
	}
	
	public void ex4() {
		Person p =new Person("김철수",19,"한국");
		Student std = new Student("조미현",19,"한국",2,1);
		Employee emp = new Employee("조미현",19,"한국","KH정보교육원");
		
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(std);
		System.out.println(emp);
	}
}
