package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService /*extends Student*/ {
//	public ClsService() {}
	
	public void ex1() {
		Student std = new Student();
//		TestVo tv = new TestVo(); //default 외부 패키지에서 접근 불가

		
//
		System.out.println(std.num1);
//		System.out.println(std.num2);
//		System.out.println(std.num3);
//		System.out.println(std.num4);
		
		
/*
		System.out.println(num1);
		System.out.println(num2); //protected extends 상속 하면 ㄱㄴ
//		System.out.println(num3); //(default) 다른 패키지라 안됨
//		System.out.println(num4); //private 해당클래스 외부라 안됨
*/
	}

	public void ex2() {
		//STATIC 전역변수
//		Student std1 = new Student();
//		Student std2 = new Student();
		
		System.out.println(Student.schoolName);
//		System.out.println(std1.schoolName);
//		System.out.println(std2.schoolName);
		
		Student.schoolName = "정보교육원";
		System.out.println(Student.schoolName);
		
	}
	
	public void ex3() {
		User u1 = new User();
		System.out.println(u1.getUserID());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		
		User u2 = new User();
		System.out.println(u2.getUserID());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		System.out.println();
		u2.setUserID("setuser02");
		u2.setUserPw("setpw02");
		u2.setUserName("setname02");
		u2.setUserAge(22);
		u2.setUserGender('무');
		System.out.println(u2.getUserID());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		String ID3="user03";
		String Pw3="pass03";
		String Name3="동길홍";
		int Age3=999;
		char Gender3='여';

		System.out.println();
		User u3 = new User(ID3,Pw3,Name3,Age3,Gender3);
		System.out.println(u3.getUserID());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
			}

	public void ex4() {
		User u1 = new User();
		User u2 = new User("user02","pass02");
		User u3 = new User("user03","pass03","999",10,'여');
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n",
				u1.getUserID(),u1.getUserPw(),u1.getUserName(),u1.getUserAge(),u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n",
				u2.getUserID(),u2.getUserPw(),u2.getUserName(),u2.getUserAge(),u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n",
				u3.getUserID(),u3.getUserPw(),u3.getUserName(),u3.getUserAge(),u3.getUserGender());
	}
}
