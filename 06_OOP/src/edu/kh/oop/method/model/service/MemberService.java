package edu.kh.oop.method.model.service;

import java.util.Scanner;
import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	
	private Scanner sc = new Scanner(System.in);
	private Member memberInfo=null;
	private Member loginMember=null;
	
	public void displayMenu() {
		int menuNum=0;
				
		do {
			System.out.println("\n=====회원 정보 관리 프로그램 =====");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			
			if(loginMember!=null) {
				System.out.println("3.회원 정보 조회");
				System.out.println("4.회원 정보 수정");
				System.out.println("5.로그아웃");
			}
			
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum=Integer.parseInt(sc.nextLine());
//			menuNum=sc.nextInt();
//			sc.nextLine();
			
			switch (menuNum) {
			case 1: System.out.println(signup()); break;
			case 2: System.out.println(login()); break;
			case 3: System.out.println(selectMember()); break;
			case 4: /*int result = */updateMember(); break;
			case 5: System.out.println(logout()); break;
			case 0: System.out.println("프로그램 종료..."); break;
			default:System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 입력해주세요");
			}	
			
		} while (menuNum!=0);
		
	}
	
	
	public String signup() {
		System.out.println("\n=====회원 가입 =====");
		
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String memberPW = sc.nextLine();
		System.out.print("비밀번호 확인 : ");
		String memberPW2 = sc.nextLine();
		System.out.print("이름 : ");
		String memberName = sc.nextLine();
		System.out.print("나이 : ");
		int memberAge = Integer.parseInt(sc.nextLine());
		
		if(memberPW.equals(memberPW2)) {
			memberInfo=new Member(memberId,memberPW,memberName,memberAge);
			return "회원가입 성공";
		}else return "회원가입 실패 / 비밀번호를 확인하세요";
		
	}

	public String login() {
		if(memberInfo==null) return "회원가입부터 진행해주세요";

		System.out.println("\n=====로그인=====");

		if(loginMember!=null) return loginMember.getMemberID()+"계정으로 로그인 되어있습니다.";
		
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String memberPW = sc.nextLine();
		
		if(memberId.equals(memberInfo.getMemberID())&&memberPW.equals(memberInfo.getMemberPW())) {
			loginMember=memberInfo;
			return loginMember.getMemberName()+"님 환영합니다.";
		}else return "아이디 또는 비밀번호가 일치하지 않습니다.";
	}
	
	
	public String logout() {
		if(memberInfo==null) return "회원가입부터 진행해주세요";
		if(loginMember==null) return "로그인후 이용해주세요";

		System.out.print("로그아웃하시겠습니까? y/n :");
		char input = sc.nextLine().charAt(0);
		String logout = String.format("%s님 로그아웃되었습니다.",loginMember.getMemberName());
		String logoutFail = String.format("현재 %s계정으로 로그인 되어있습니다.",loginMember.getMemberName());
		String error = "잘못된 입력입니다.";
		
		while(true) {
			if(input=='y'||input=='Y') {
				loginMember=null;
				return logout;
			}else if(input=='n'||input=='N') {
				return logoutFail;
			}else System.out.println(error);			
		}
	}
	
	
	public String selectMember() {
		if(memberInfo==null) return "회원가입부터 진행해주세요";
		if(loginMember==null) return "로그인후 이용해주세요";
		System.out.println("\n=====회원 정보 조회=====");

		return "이름 : "+loginMember.getMemberName()+
				"\n아이디 : "+loginMember.getMemberID()+
				"\n나이 : "+loginMember.getMemberAge();
	}

	public int updateMember() {
		if(memberInfo==null) {System.out.println("회원가입부터 진행해주세요" ); return 0;}
		if(loginMember==null) {System.out.println("로그인후 이용해주세요"); return 0;}
		System.out.println("\n=====회원 정보 수정=====");

		System.out.printf("이름 : "+loginMember.getMemberName()+
				"\n나이 : "+loginMember.getMemberAge()+"\n"
				); 
		
		System.out.print("수정하고 싶은 이름 : ");
		String updateName =sc.nextLine();
		System.out.print("수정하고 싶은 나이 : ");
		int updateAge =Integer.parseInt(sc.nextLine());

		System.out.println("비밀번호 : ");
		String memberPW = sc.nextLine();
		
		if(loginMember.getMemberPW().equals(memberPW)) {
			loginMember.setMemberName(updateName);
			loginMember.setMemberAge(updateAge);
			System.out.println("성공적으로 변경되었습니다.");
			return 1;
		}else System.out.println("오류가 발생했습니다.");return 0;
	}

}
