package Day06;

public class Day06_03 {

	public static void main(String[] args) {
		
		// 예1) 회원가입 => 한명당 5개 변수 => 1000명, 5천개 변수 => 관리 X
		
		String 아이디 = "qwe";
		String 비밀번호 = "qwe";
		String 성명 = "qwe";
		String 이메일 = "qwe";
		String 전화번호 = "qwe";
		
		// 예2) 회원가입 => 배열사용시 => 동일한 자료형/ 클래스 가능
		
		String[][] 회원목록 = new String[1000][5];
		회원목록 [0][0]="qwe";
		회원목록 [0][1]="qwe";
		회원목록 [0][2]="qwe";
		회원목록 [0][3]="qwe";
		회원목록 [0][4]="qwe";
		
		// 예3) 회원가입 클래스 [설계] => 대량의 서로다른 객체
		
		회원 temp = new 회원(); // 1. 회원 객체 만들기

		// 1. 회원 : 클래스명
			// 2. temp : 객체명 => 임의값
				//3. new : 객체 생성시 필수 사용 [ 객체에 메모리 할당 ]
					//4. 회원() : 생성자 [객체 생성시 초기값]
		
		temp.아이디 = "qwe";
		temp.비밀번호 = "qwe";
		temp.성명 = "qwe";
		temp.이메일 = "qwe";
		temp.전화번호 =1234;
			//객체명. 멤버
		
		//회원 2
		
		회원 temp2 = new 회원("asd","asd","asd","asd",1234);
		
		// 회원3
		
		회원 temp3 = new 회원 ("zxc", "zxc");
		
		
		
	}//m e	
}
