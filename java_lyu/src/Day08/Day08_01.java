package Day08;

public class Day08_01 {

	
	// 접근 제한자
		// 1. 데이터 보호 [필드 보호]	= private
		// 2. private 필드에 접근할 경우 => 메소드 사용
			// get 메소드, set 메소드
	
	
	
	public int 정수 =10;
	protected int 정수2 = 20;
	int 정수3 = 30;
	private int 정수4 = 40;
	
	
	
	public static void main(String[] args) {
		
		// public        : 프로젝트 내 모든 곳에서 호출 가능
		// protected     : 동일한 패키지 내에서만 접근 가능
						// 서브클래스가 다른클래스의 부모클래스가 있는 경우 가능
		// default[생략]   : 동일한 패키지내에서만 접근 가능
		// private       : 현재 클래스에서만 접근 가능
		
		Day08_01 day08_01 = new Day08_01();
		System.out.println( day08_01.정수 );
		System.out.println( day08_01.정수2 );
		System.out.println( day08_01.정수3 );
		System.out.println( day08_01.정수4 );
		
		
		
	}
	
}
