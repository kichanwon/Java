package edu.kh.inheritance.model.dto;

public final class Employee extends Person{
	private String company;
	
	public Employee() {}
	public Employee(String name, int age, String nationality, String company) {
		super(name,age,nationality);
		this.company = company;
	}



	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public void move() {
		System.out.println("overrided move()");
		System.out.println("work efficiently and get back home");
	}
	
	@Override
	public String toString() {
		return super.toString()+" / "+ company;
	}

}
