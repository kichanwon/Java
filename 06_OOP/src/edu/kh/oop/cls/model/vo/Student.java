package edu.kh.oop.cls.model.vo;

public class Student {
// [접근제한자] [예약어] 클래스 
	
	public void ex() {
		TestVo tv = new TestVo();
		//같은 패키지 내에서 사용 가능	
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
/*		private final int TEMP1 = 100;
Java에서는 메서드 내부의 로컬 변수와 함께 비공개 액세스 수정자를 사용할 수 없습니다. 
비공개 수정자는 클래스 외부에서 클래스 멤버(필드, 메서드)에 대한 액세스를 제한하는 데 사용됩니다. 
그러나 메서드 내부의 로컬 변수는 이미 본질적으로 메서드의 범위로 제한되어 있으므로 private을 지정하는 것은 불필요하며 컴파일 오류가 발생합니다.

다음은 무엇이 잘못되었는지에 대한 분석입니다:
로컬 변수: 메서드 내부에 선언된 변수는 로컬 범위를 가지므로 해당 메서드 내에서만 액세스할 수 있습니다. 
Java는 메서드에 대한 액세스를 자동으로 제한하므로 비공개 수정자를 추가하는 것은 의미가 없으며 오류가 발생합니다.
*/
	}

// 필드 == 멤버변수
//	[접근제한자] [예약어] 자료형 변수명 [= 초기값];
	public int num1=10;		//
	protected int num2 =20;	// 자식 클래스
	int num3=30;			// (default) 같은 패키지 내
	private int num4 =40;	//

	
	public static String schoolName="고등학교";
	
	
	// FINAL
	private final int TEMP1 = 100;
	
	public int getTEMP1() {
		return TEMP1;
	}
}
