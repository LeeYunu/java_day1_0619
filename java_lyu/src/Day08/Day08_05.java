package Day08;

public class Day08_05 {

	
	// 상속 : 클래스가 다른 클래스에게 메모리 주기
		// 1. 클래스[설계]을 다른클래스 이어쓰기 [extends]
		// 2. extend : 연장 [ 설계 이어쓰기 ]
			// 장점: 여러 클래스에 공통 멤버를 슈퍼클래스에 미리 설계하면 빠른 설계 가능
		// 3. 사용을 받을 클래스명 옆에 extends
			// 서브클래스 extends 슈퍼클래스
		// 4. 상속받은 서브클래스에 슈퍼클래스 내 멤버 이름
			//@Override : 이미 생성된 메소드를 재정의
		// 5. 상속받은 서브클래스에서 슈퍼클래스 호출 시
			// super() : 슈퍼클래스 생성자
			// super.멤버 : 슈퍼클래스 내 필드, 메소드 호출
	
	public static void main(String[] args) {
		
		//사람 클래스를 이용한 사람1 객체 생성 [ 모든 필드 생성자]
		사람 사람1 = new 사람("유재석",30);
		
		
		// 서브클래스 이용한 살마2 객체 생성
		학생 사람2 = new 학생("강호동",20,3);
		
		
		// 메소드 호출
		사람1.정보();
		사람2.정보();
		
		
		
	}			
}
