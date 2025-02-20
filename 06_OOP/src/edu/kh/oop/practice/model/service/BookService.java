package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	public void practice() {
		Book Book1 = new Book();
		Book Book2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		System.out.println(Book1.toString());
		System.out.println(Book2.toString());
		System.out.println("=============================");
		
		Book1.setTitle("C언어");
		Book1.setPrice(30000);
		Book1.setDiscountRate(0.1);
		Book1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(Book1.toString());
		System.out.println("=============================");
		
		System.out.printf("도서명 = %s\n",Book1.getTitle());
		System.out.printf("할인된 가격 = %d원\n",
				(int)(Book1.getPrice()-Book1.getPrice()*Book1.getDiscountRate()) );
		
		System.out.printf("도서명 = %s\n",Book2.getTitle());
		System.out.printf("할인된 가격 = %d원\n",
				(int)(Book2.getPrice()-Book2.getPrice()*Book2.getDiscountRate()) );		
	
	}
}	
