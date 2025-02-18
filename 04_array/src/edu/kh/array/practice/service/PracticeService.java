package edu.kh.array.practice.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.type.NullType;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[9];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.printf("%d ",arr[i]);
			if(i%2==0) sum+=arr[i];
		}
		System.out.println("\n짝수 번째 인덱스 합 : "+sum);
	}

	public void practice2() {
		int[] arr = new int[9];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.printf("%d ",arr[i]);
			if(i%2!=0) sum+=arr[i];
		}
		System.out.println("\n홀수 번째 인덱스 합 : "+sum);
	}
	
	public void practice3() {
		System.out.printf("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.printf("%d ",arr[i]);
		}
	}

	public void practice4() {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("입력 %d : ",i);
			arr[i] = sc.nextInt();
		}
		System.out.printf("검색할 값 : ");
		int search = sc.nextInt();
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.printf("인덱스 : %d ",i);
				flag=true;
			}
		}
		if(flag==false) System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	

	public void practice5() {
		System.out.printf("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
			
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}

		System.out.printf("문자 : ");
		char search = sc.next().charAt(0);
		int count=0;
		
		System.out.printf(str+"에 "+search+"가 존재하는 위치(인덱스) : ");		
		for(int i=0;i<str.length();i++) {			
			if(arr[i]==search) {
				System.out.printf("%d ",i);
				count++; 
			}
		}
		System.out.println("\ni 개수 : "+count);
	}
	

	public void practice6() {
		System.out.printf("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum=0;
		
		for(int i=0;i<num;i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println("\n총 합 : "+sum);
	}
	
	
	public void practice7() {
		System.out.printf("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] arr=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i<=7)System.out.printf("%c",arr[i]);
			else System.out.printf("*");
		}
		
	}


	public void practice8() {

		int num;
		
		do {
			System.out.printf("정수 : ");
			num = sc.nextInt();
		
			if (num%2==0||num<3) System.out.println("다시 입력하세요.");
			
		} while (num%2==0||num<3);
		
		for(int i=0;i<num/2+1;i++) {
			System.out.printf("%d, ",i+1);
		}
		for(int i=num/2;i>0;i--) {
			if(i!=1)System.out.printf("%d, ",i);
			else System.out.printf("%d", i);
		}
	}
	

	public void practice9() {
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
//			int random =(int)(Math.random()*10+1);
			arr[i]=(int)(Math.random()*10+1);
		}
		
		System.out.printf("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
	

	public void practice10() {
		int[] arr=new int[10];
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
//			int random =(int)(Math.random()*10+1);
			arr[i]=(int)(Math.random()*10+1);
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		
		System.out.printf("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
		
		System.out.println("");
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	

	public void practice11() {
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int random =(int)(Math.random()*10+1);
			arr[i]=random;
			
			for(int j=0;j<i;j++) {
				if(random==arr[j]) {i--; break;}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
	

	public void practice12() {
		int[] arr=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			int random =(int)(Math.random()*45+1);
			arr[i]=random;
			
			for(int j=0;j<i;j++) {
				if(random==arr[j]) {i--; break;}
			}
		}
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
	

	public void practice13() {
		System.out.printf("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		int count = 1;
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=' ';
				} 
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if (i==0)System.out.printf("%c",arr[i]);
			if(arr[i]!=' '&&i!=0) {
				System.out.printf(", %c",arr[i]);
				count++;
			}
		}
		System.out.printf("\n문자 개수 : %d ",count);
	}


	public void practice14() {
		System.out.printf("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];

		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d번째 문자열 : ",i+1);
			arr[i] = sc.nextLine();
		}
		String[] plusArr = null;
		while(true) {
			char input;
			System.out.printf("더 값을 입력하시겠습니까?(Y/N) : ");
			input = sc.next().charAt(0);
			sc.nextLine();

			if (input=='n') break;
			
			System.out.printf("더 입력하고 싶은 개수 : ");
			int plus = sc.nextInt();
			sc.nextLine();
			plusArr = Arrays.copyOf(arr, num+plus);
			
			for(int i=arr.length;i<plusArr.length;i++) {
				System.out.printf("%d번째 문자열 : ",i+1);
				plusArr[i] = sc.nextLine();
			}
			arr=plusArr;
		}	
		System.out.println(Arrays.toString(arr));
	}
/*
	public void practice14_1() {
		System.out.printf("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d번째 문자열 : ",i+1);
			arr[i] = sc.nextLine();
		}
		while(true) {
			char input;
			System.out.printf("더 값을 입력하시겠습니까?(Y/N) : ");
			input = sc.next().charAt(0);
			sc.nextLine();
			
			if (input=='y'||input=='Y') {
				System.out.printf("더 입력하고 싶은 개수 : ");
				int plus = sc.nextInt();
				sc.nextLine();
				String[] plusArr = new String[arr.length+plus];

				
				for(int i=0;i<plusArr.length;i++) {
					plusArr[i] = arr[i];
				}
				
				for(int i=num;i<plusArr.length;i++) {
					System.out.printf("%d번째 문자열 : ",i+1);
					plusArr[i] = sc.nextLine();
				}
			}else if(input=='n'||input=='N') {
				break;
			}else System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		}	
		System.out.println(Arrays.toString(plusArr));
	}
	
*/
	
}
