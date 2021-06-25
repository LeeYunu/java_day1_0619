package Day02;

import java.util.Scanner;


public class Day02_과제13 { //cs

	public static void main (String[] args) { //ws
	
		Scanner 입력객체 = new Scanner (System .in);
		
		System.out.println("중간고사 점수를 입력하시오"); int 중간고사 = 입력객체 .nextInt();
		System.out.println("기말고사 점수를 입력하시오"); int 기말고사 = 입력객체 .nextInt();
		System.out.println("수행평가 점수를 입력하시오"); int 수행평가 = 입력객체 .nextInt();
	 		
		double 평균 = (0.3 * 중간고사) + (0.3 * 기말고사) + (0.4 * 수행평가);
		
		System.out.println( "반영점수는 " + 평균 + "입니다.");
	
	
	
	} // we
} //ce