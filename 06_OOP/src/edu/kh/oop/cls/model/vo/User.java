package edu.kh.oop.cls.model.vo;

public class User {
	private String userID;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	public User() {
		System.out.println("this is default constructor");
		
		userID="user01";
		userPw="pass01";
		userName="홍길동";
		userAge=20;
		userGender='남';
	}
	
	public User(String userID,String userPw) {
		System.out.println("매개변수 생성자로 User객체 생성");
		this.userID=userID;
		this.userPw=userPw;
	}

	public User(String userID,String userPw,String userName,
			int userAge,char userGender){
		this(userID,userPw);

		System.out.println("매개변수 생성자로 User객체 생성");
//		this.userID=userID;
//		this.userPw=userPw;
		this.userName=userName;
		this.userAge=userAge;
		this.userGender=userGender;
	}
	
	
//GET&SET
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
}
