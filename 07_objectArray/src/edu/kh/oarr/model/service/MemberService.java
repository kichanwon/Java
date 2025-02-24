package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;
import edu.kh.oarr.model.vo.Member;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	
	private Member[] memberArr = new Member[5];
	private Member loginMember = null;
/*
	public MemberService() {
		memberArr[0]=new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1]=new Member("user02","pass02","아무개",20,"경기");
		memberArr[2]=new Member("user03","pass03","고길동",10,"강원");
	}
	*/
	
	public void displayMenu() {
		int menuNum=0;
				
		do {
			System.out.println("\n=====회원 정보 관리 프로그램 v2=====");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원 정보 조회");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.로그아웃");
			System.out.println("6.회원검색(지역)");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum=Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1: System.out.println(signup()); break;
			case 2: System.out.println(login()); break;
			case 3: System.out.println(selectMember()); break;
			case 4: 
				if(updateMember()==1) {
					System.out.println("회원정보가 수정되었습니다! :)");
				}else if(updateMember()==1) {
					System.out.println("회원정보 수정 실패(비밀번호 불일치");
				}else System.out.println("로그인 후 이용바람");break;
			case 5: System.out.println(logout()); break;
			case 6: System.out.println(region()); break;
			case 0: System.out.println("프로그램 종료..."); break;
			default:System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 입력해주세요");
			}	
		} while (menuNum!=0);
	}
	
////////////////////////////////////////////////
	
	
	

	public int emptyIndex() {
		for(int i=0;i<memberArr.length;i++) {
			if(memberArr[i]==null) return i;
		}
		return -1;
	}
	
	
	public String signup() {
		int index = emptyIndex();
		if(index==-1) return "회원 수가 가득 찼습니다.";

		
		System.out.println("\n=====회원 가입 =====");
		
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String memberPw = sc.nextLine();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.nextLine();
		System.out.print("이름 : ");
		String memberName = sc.nextLine();
		System.out.print("나이 : ");
		int memberAge = Integer.parseInt(sc.nextLine());
		System.out.print("지역 : ");
		String region = sc.nextLine();
		
		if(memberPw.equals(memberPw2)) {
			memberArr[index] = new Member(memberId,memberPw,memberName,memberAge,region);
			return "회원가입 성공";
		}else return "회원가입 실패 / 비밀번호를 확인하세요";
		
	}

	
	public String login() {
		
		if(emptyIndex()<=0) return "회원가입부터 진행해주세요";

		System.out.println("\n=====로그인=====");

		if(loginMember!=null) return loginMember.getMemberId()+"계정으로 로그인 되어있습니다.";
		
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String memberPW = sc.nextLine();
		
		for(int i=0;i<memberArr.length;i++) {
			if (memberArr[i]==null)return "오류가 생겼습니다.";
			if(memberId.equals(memberArr[i].getMemberId()) && memberPW.equals(memberArr[i].getMemberPw())) {
				loginMember=memberArr[i];
				return loginMember.getMemberName()+"님 환영합니다.";
			}
		}
		return "아이디 또는 비밀번호가 일치하지 않습니다.";
	}

	
	public String logout() {
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
	
////////////////////////////////////////////////

	public String selectMember() {
		if(loginMember==null) return "로그인후 이용해주세요";
		System.out.println("\n=====회원 정보 조회=====");

		return "이름 : "+loginMember.getMemberName()+
				"\n아이디 : "+loginMember.getMemberId()+
				"\n나이 : "+loginMember.getMemberAge()+
				"\n지역 : "+loginMember.getRegion();
	}
	


	public int updateMember() {
		if(loginMember==null) return -1;
		System.out.println("\n=====회원 정보 수정=====");

		System.out.printf("이름 : "+loginMember.getMemberName()+
				"\n나이 : "+loginMember.getMemberAge()+
				"\n지역 : "+loginMember.getRegion()+"\n"
				); 
		
		System.out.print("수정하고 싶은 이름 : ");
		String updateName =sc.nextLine();
		System.out.print("수정하고 싶은 나이 : ");
		int updateAge =Integer.parseInt(sc.nextLine());
		System.out.print("수정하고 싶은 지역 : ");
		String updateRegion =sc.nextLine();

		System.out.println("비밀번호 : ");
		String memberPW = sc.nextLine();
		
		if(loginMember.getMemberPw().equals(memberPW)) {
			loginMember.setMemberName(updateName);
			loginMember.setMemberAge(updateAge);
			loginMember.setRegion(updateRegion);
			return 1;
		}else return 0;
	}
	
	public String region() {
		if(loginMember==null) return "로그인후 이용해주세요";
		System.out.println("회원 검색(지역)");
		System.out.print("검색할 지역 : ");
		String searchRegion=sc.nextLine();
		
		for(int i=0;i<memberArr.length;i++) {
			if(memberArr[i]==null) {
				
			}else if(searchRegion.equals(memberArr[i].getRegion())) {
				System.out.printf("%s : %s",memberArr[i].getMemberName(),memberArr[i].getRegion());
			}
		}
		return "";
	}

}