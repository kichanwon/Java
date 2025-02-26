package com.hw1.model.dto;

public class Poetry extends Book{
	private int numberOfPoem;

	public Poetry() {}
	public Poetry(String title, String author, int numberOfPoem) {
		super(title, author);
		this.numberOfPoem = numberOfPoem;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %d\n",getTitle(),getAuthor(),numberOfPoem);		
	}
	
	
	public int getNumberOfPoem() {
		return numberOfPoem;
	}
	public void setNumberOfPoem(int numberOfPoem) {
		this.numberOfPoem = numberOfPoem;
	}
	
}
