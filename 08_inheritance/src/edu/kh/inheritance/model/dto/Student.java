package edu.kh.inheritance.model.dto;

public class Student extends Person{
//	private String name;
//	private int age;
//	private String nationality;
	private int grade;
	private int classRoom;
	
	public Student() {}
	public Student(int grade, int classRoom) {
		super();
		this.grade = grade;
		this.classRoom = classRoom;
	}
	public Student(String name, int age, String nationality, int grade, int classRoom) {
		super(name,age,nationality);
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationality() {
//		return nationality;
//	}
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return super.toString()+" / "+ grade +" / "+ classRoom;
	}
}
