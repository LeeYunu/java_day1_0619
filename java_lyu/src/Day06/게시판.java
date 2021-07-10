package Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class 게시판 {
		

	//
	static Scanner 입력객체 = new Scanner(System.in);
	//리스트
			
	
	// 필드
		String 제목;
		String 내용;
		String 작성자;
		int 조회수;
		
		
	// 생성자
		// 1. crl + space = 깡통 생성 [빈생성자]
		public 게시판() {	}
		
		//2. 풀생성자
		public 게시판(String 제목 , String 내용 , String 작성자 , int 조회수) {
			this.제목 = 제목;
			this.내용 = 내용;
			this.작성자 = 작성자;
			this.조회수 = 조회수;
		}
		
	// 메소드 [미리 작성된 코드]
		
		//1. 게시물 등록
	/*	public static void 게시물등록() {
			System.out.println("----> 게시물 등록 화면");
			System.out.println("제목: "); 
				String 제목 = Day06_04.입력객체.next();
			System.out.println("내용: "); 
				String 내용 = Day06_04.입력객체.next();
			System.out.println("작성자: "); 
				String 작성자 = Day06_04.입력객체.next();
			//입력받은 객체 생성[생성자]
			
			게시판 temp = new 게시판(제목, 내용, 작성자, 0);
			Day06_04.게시물목록.add(temp);
				//리스트명.add(객체명): 리스트 내 객체명 추가
		}
		
		//2. 게시물 출력
	//	for (int i =0; i < 게시물목록.size(); i++);{
	//		System.out.println(i+"\t"+게시물목록.get(i).제목 + "\t\t\t"+게시물목록.get(i).내용
			 					"\t\t\t"+게시물목록.get(i).작성자 + "\t\t\t"+게시물목록.get(i).조회수);
		}
		//3. 게시물 삭제
		//4. 조회수 증가
		//5. 해당게시물 상세보기
		
		public void 게시물상세보기 (int 번호) {
									// 보고자하는 게시물의 번호
			게시판 temp =Day06_04.게시물목록.get(번호);
	*/
}
