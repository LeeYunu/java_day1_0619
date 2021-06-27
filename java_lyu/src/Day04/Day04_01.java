package Day04;

import java.util.Scanner;


public class Day04_01 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);
		
	
		 
		 // 제어문 = if
		 
		 // 반복문 = for , while , do ~ while
		 	// 어디서부터 어디까지 반복 
		 // for 형태
		 	// for ( 초기값 ; 조건문 ; 증감식 ) {실행문;}
		 	// for ( 어디서부터 ; 어디까지 ; 이동단위){실행코드;}
		 		// 초기값 : 반복의 시작값 [for 시작할 때 1번 검사]
		 		// 조건문 : 반복실행의 조건 [비교연산자, 실행코드 실행 전 검사]
		 		// 증감식 : 실행코드 실행 후 초기값 증감단위
		 
		 //예1
		 
		 for (int 변수 = 0; 변수 <10; 변수++) {
		 // 변수는 0부터 10미만까지 1씩 증가하면서 반복
		 	 System.out.println(변수);
		 	 	//반복문 실행순서
		 	 	// 변수 =0 => 변수<10 => T => 코드실행
		 	 	// 변수++ => 변수=1 => 변수 <10 => T => 코드실행
		 	 	// ......
		 	 	// 변수 ++ => 변수 10 => 변수 <10 => F => 반복문 종료
		 }
		 
		
		 // 예 2 1~50 ㅊㄹ
		 
		 
		 for (int i = 0 ; i <= 50; i++) {
			 
			 System.out.print(i);
		 }
		 
		 System.out.print("\n");
		 
		 // 예 3 1~50 3배수
		 
		 
		 for (int i = 3; i <=50; i +=3) {
			 
			 System.out.print(i); 
		 }
		 System.out.print("\n");
		 //or
		 
		 for (int i = 3; i <=50; i +=3) {
			 if (i%3 == 0) System.out.print(i); 
		 
		 }
		 System.out.print("\n");
		 
		 
		 // 예 4 1~50 누적 합계
		 
		 
		 int a=0;
		 
		for (int i = 0 ; i <= 50; i++) {
			a += i;
		}System.out.println(a);
		 
		 // 예5 1~50 3배수 누적 합계	
			int b =0;
			for (int i = 3; i <=50; i +=3) {
			if (i%3 == 0) b += i;
			} System.out.println(b);
			
		 
		 // 예6 구구단 만들기 (2단)
		 
		 
			for ( int i =1; i<10 ; i++) {
				System.out.println(2*i);
			} System.out.println("\n");
			
			
			
			
		 // 예7 구구단 만들기 (1~9)
		 for (int i = 1; i<10; i++) { //for 1 s
			 System.out.println(i + "단");
			 for (int j=1; j<10 ; j++) { // for 2 s
				 System.out.println(i + "X" + j + "=" + i * j); 
			 } //for 2 e
			 System.out.println("\n");
		 } //for 2 s
		 
		 
		 
		 
		 
		 
		 
	} // we
} //ce