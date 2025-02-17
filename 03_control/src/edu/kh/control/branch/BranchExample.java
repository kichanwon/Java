package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc=new Scanner(System.in);
	
	public void ex1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" ");

			if(i==5) break;
		}
	}

	public void ex2() {
		System.out.println("문자열 입력 ");
		String str="";
		String input;
		
		do {
			System.out.println(str);
			input = sc.nextLine();
			str += input;
		}while(!(input.equals("exit@")));
	}
	
	public void ex3() {
		for (int i=1;i<=10;i++) {
			if(i%3==0) continue;

			System.out.printf("%d ",i);
		}
	}

	public void ex4() {
		for (int i=1;i<=100;i++) {
			if(i==40) break;
			if(i%5==0) continue;
			System.out.printf("%d ",i);
		}
	}
	
	public void RSPGame() {

		System.out.println("[가위 바위 보 게임 ~!!]");
		System.out.printf("판 수 입력 : ");
		int round = sc.nextInt();
		
		int win=0;
		int draw=0;
		int lose=0;
		
			for(int i=1;i<=round;i++) {
				System.out.printf(""
						+ "\n%d번째 게임"
						+ "\n가위/바위/보 중 하나 입력 : ",i);
				String input =sc.next();
	
	//			int random = (int)(Math.random()*3+1);
				int random = (int) Math.ceil(Math.random()*3);
				String com = null;
				
				switch (random) {
				case 1: com="가위"; break;
				case 2: com="바위"; break;
				case 3: com="보"; break;
				}
				System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n",com);

				if(input.equals(com)) {
					draw++;
					System.out.println("비겼습니다.");
				}else {
					boolean win1 = input.equals("가위")&&com.equals("보");
					boolean win2 = input.equals("바위")&&com.equals("가위");
					boolean win3 = input.equals("보")&&com.equals("바위");
					
					if(win1||win2||win3) {
						System.out.println("플레이어 승");
						win++;
					}else {
						System.out.println("졌습니다ㅠㅠ");
						lose++;
					}
				}
				
				if(i==round)break;
				System.out.printf("현재 기록: %d승 %d무 %d패\n",win,draw,lose);
				System.out.println(random);
			}
			System.out.printf("\n최종 기록 :%d승 %d무 %d패\n",win,draw,lose);
			
	}

	
}
