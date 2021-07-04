package Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06_04 {
	
	// main 밖에 선언하는 이유 : 다른 클래스에서 해당 메모리 [변수/객체] 접근하기 위해
		// 단점: main 실행되게 때문에 main 메소드가 해당 메모리 인식 X
			// static : main 메소드보다 메모리 우선 할당
				// 프로그램종료시까지 메모리 할당
				// 전반적인 모든 코드에 사용되는 메모리 할당시
	static Scanner 입력객체 = new Scanner(System.in);
		//리스트
	static ArrayList<게시판> 게시물목록 = new ArrayList<>();
		// ArrayList<리스트에 담을 클래스> 객체명 = new ArrayList<>();
	
	//게시판 프로그램
	public static void main(String[] args) {

		
		
		
		while (true) {//while 1 s
		System.out.println("=====커뮤니티 게시판=====");
		System.out.println("번호\t제목\t\t\t작성자\t조회수");
			//모든게시물 출력
		
		System.out.println("1.글쓰기 2.게시물보기 3.게시물삭제");
		int 선택 = 입력객체.nextInt();		
		if (선택 == 1) {}
		if (선택 == 2) {}
		if (선택 == 3) {}
		
		
		
		}//while1 e
	}//m e
}
