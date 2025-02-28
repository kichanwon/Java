package com.hw3.model.dto;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	private int bookNum;
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private String bookPublisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookNum, String bookTitle, String bookAuthor, int bookPrice, String bookPublisher) {
		super();
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return String.format("%d번 도서 :[도서제목 : %s / 도서저자 : %s / 도서가격 : %d원 / 출판사 : %s]", 
				bookNum, bookTitle, bookAuthor, bookPrice, bookPublisher);
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bookNum - o.bookNum;
	}	
	
	
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}	
}
