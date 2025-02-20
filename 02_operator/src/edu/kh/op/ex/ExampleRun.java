package edu.kh.op.ex;

<<<<<<< HEAD
// 실행용 클래스 (메인메서드 존재)
public class ExampleRun {

	// 메인 메서드 필수 작성
	public static void main(String[] args) {
		
		// OpExample 생성
		OpExample opEx = new OpExample();
		// -> OpExample이라는 클래스(설계도)를 이용해서
		//		객체를 생성하는데, 그 객체 이름이 opEx 다
		// -> 같은 패키지 (edu.kh.op.ex) 안에 있는 클래스는
		// import 하지 않아도 자유롭게 불러다 쓸 수 있다!
		opEx.ex4(); 
		// opEx가 가지고있는 기능(메서드) 중 ex1 이름의 메서드를 호출(실행)
		
		
		
		
		
	}

}
=======
import java.util.Scanner;


//tried to make looped Example Compilation but became out of interest

public class ExampleRun {
	public static void main(String[] args) {

		//‘opEx는 객체’ ‘opEx는 OpExample의 인스턴스’
		OpExample opEx = new OpExample();
		
		Scanner sc = new Scanner(System.in);
int num;
do {
	System.out.printf(""
			+ "Arithmetic	method : 1\n"
			+ "Comparison	method : 2\n"
			+ "Logical		method : 3\n"
			+ "Ternary		method : 4\n"
			+ "Practice	method : 5\n"
			+ "Exit	>>>	0\n"
			+ "Choose Your Method :");		
	
	num = sc.nextInt();
	
	switch (num) {
		case 1: {
			opEx.Arithmetic();
			break;
		}
		case 2: {
			opEx.Comparison();
			break;
		}
		case 3: {
			opEx.Logical();
			break;
		}
		case 4: {
			opEx.Ternary();
			break;
		}
		case 5: {
			opEx.prac();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
	}
} while (num !=0);

	}
}

>>>>>>> ca370efb7f5870e64410c0c03377818e84e4232b
