package Day07;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Day07_02_start {

	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Member> members = new ArrayList<>();
	
	public static void main(String[] args) {
		
		프로그램시작();
		
	} // m e
	
	public static void 프로그램시작() {
		// static : 정적변수 : 프로그램 시작시 메모리 할당되고 모든 프로그램 종료시 메모리 초기화
		 	// 단점 : 메모리 효율 감소 [ 모든 클래스에 사용되는 메모리 선언]
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:/java/memberlist.txt");
			byte[] 바이트 = new byte[10000]; // 객체 한명당 100바이트 정도
			
			fileInputStream.read(바이트);		
			String 모든회원 = new String(바이트); // 바이트 => 문자열
			// 회원별 구분
			String[] 회원 = 모든회원.split("\n");
				// 문자열.split("기호") : 해당 기호로 구분
			// 회원 정보별 구분
			for (int i = 0; i < 회원.length-1 ; i ++) {
				
				String[] 정보 = 회원[i].split(",");
				Member member = new Member(정보[0], 정보[1], 정보[2], Integer.parseInt(정보[3]), 
						 Integer.parseInt(정보[4]),  정보[5],  Integer.parseInt(정보[6]), 정보[7]);
					//문자열 String => 정수형 int 
					//Integer.parseInt(문자열)
				
				
			}
			
			
			System.out.println( new String(바이트));	
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		while (true) {
			System.out.println("회원 커뮤니티");
			System.out.println("1.로그인 2.회원가입 3. 아이디찾기 4. 비밀번호찾기 5. 프로그램 종료");
			System.out.println(" 선택: "); int 선택 = scanner.nextInt();
			
			Member member = new Member();
			
			if (선택==1) {}
			else if (선택 == 2) {
				member.회원가입();
				
			}
			else if (선택 == 3) {}
			else if (선택 == 4) {}
			else if (선택 ==5) {
				System.out.println("\n [종료] 이용해주셔서 감사합니다");
			}
			else {}
			
			
		}
		
	} // 프시 e

}
