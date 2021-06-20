package Day02;

import java.util.Scanner;

public class Day02_03 { // cs
	
	public static void main (String[] args) { //me
	
	//입력받기
		//1. 입력받기 => 변수에 저장 => 사용
	
	
	Scanner scan = new Scanner (System.in);
			// Scanner : 입력 관련 클래스
				//Scan : 객체명 vs 변수명
					// New : 객체의 메모리 할다 여난자
							// Scanner (system.in) 클래스
				
	
	System.out.println("정수입력:");
	int 입력정수 = scan.nextInt();
	System.out.println("현재 입력한 정수는 :" + 입력정수);
	
	System.out.println("문자열 입력:");
	String 입력문자열 = 입력객체.next();
			//next() : 입력객체의 입력된 문자열 가져오기
	System.out.println("현재 입력한 문자열은:"+ 입력문자열);
	
	} //me
} //ce
