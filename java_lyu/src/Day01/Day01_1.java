package Day01;

public class Day01_1 {// c s

		//Object 클래스로부터 데이터 제공 받음
			// 모든 클래스는 object로부터 시작된다
				// 100% 클래스 언어이다 ==100% 객체지향 언어
	
	
		// {} 안에 포함된 코드 tab [들여쓰기]
		//main 함수(메소드)
			// ctrl + 스페이스바: 자동완성
	public static void main(String[] args) { // m s
		
				// main 메소드: main 스레드를 가지고 있음
		 			// 스레드: 프로세스에 코드를 읽어주는 역할이 있음
						// main {} 밖에 코드는 실행X
		// 출력
			// 1. 클래스의 첫글자 "무조건" 대문자
			// 2. 메뉴 => run => run [ Crtl+F11 ]
		System.out.println("java");
			// System : 시스템 관련 [ 입출력 ] 클래스
				// . : 클래스 내 맴버 접근 연산자 [ + - * / = 특수문자]
					// out:  출력 관련 스트림
						//println("출력내용") : 출력 메소드(함수)
							// ; : 코드 한줄의 끝
		
		// 예제1 : println [자동 줄바꿈 포함]
			// " " => ? 
				// 컴퓨터 기계어 : 0,1 [숫자]
				// " " 문자처리 : 키워드[미리 만들어진 단어/문법]를 제외한 모든 문자
		System.out.println(7); // 수에는 문제 처리 X
		System.out.println("java"); // 문자에는 문자처리O
		System.out.println("java7"); // 문자숫자 문자처리O
		
		// 예제2 : print [자동 줄바꿈 포함 X ]
		System.out.print(7);
		System.out.print("java");
		System.out.println("java7");
		
		// 예제3 : printf [ 형식=서식=형태꾸미기=format 출력 ]
		System.out.printf("%d", 7);
		System.out.printf("%s", "java");
		System.out.printf("%s", "java7");
			//형식 문자
				// %d : 정수
				// %f : 실수
				// %s : 문자열
				// %c : 문자
		
		// 예제 4 : print, printf 차이
		System.out.println("java"+7+"입니다");
				// + 더하기 연산자 : 숫자 + 숫자 경우
				// + 연결 연산자 : 문자 + 숫자 경우 혹은 문자 + 문자
		System.out.printf("%s%d%s", "java", 7 , "입니다");
		System.out.printf("java%d입니다", 7);
			// 제어 문자
				// \: 원화기호
				// \n : 줄바꿈
				// \t : 들여쓰기
				// \r : 개행 [앞으로가기]
				// \\ : \
				// \" : "
		
		// 예제 5 : 제어문자
		System.out.print("\n7"+"\n"+"java\njava7");
		System.out.println("\t"+7+"\t"+"java\tjava7\n\n");
		
		
		// 문제 1: println
		// 출력결과
		/*  
				==================출석부==================
				이름			1교시			2교시			3교시
				유재석		출석			출석			출석
				강호동		출석			출석			출석
		 */
		
		System.out.println("\t=============출석부=============");
		System.out.println("\t이름\t1교시\t2교시\t3교시");
		System.out.println("\t유재석\t출석\t결석\t출석");
		System.out.println("\t강호동\t결석\t출석\t출석");
		System.out.println("\t===============================");
		
		// 이클립스내 화면 확대/축소 : ctrl + shift + "+" or "-"
		// 화면분할 : crtl + [
		
		
		//문제 2: 문제1번을 printf 로
			
		System.out.printf("=============%s=============\n", "출석부");
		System.out.printf("%s\t%s\t%s\t%s\n", "이름", "1교시", "2교시", "3교시");
		System.out.printf("%s\t%s\t%s\t%s\n", "유재석", "출석", "결석", "출석");
		System.out.printf("%s\t%s\t%s\t%s\n", "강호동", "출석", "결석", "출석");
		System.out.printf("===============================");
		
		
		
		
		
	} // m e
	
} // c e
