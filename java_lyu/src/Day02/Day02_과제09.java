package Day02;

import java.util.Scanner;


public class Day02_과제09 { //cs

	public static void main (String[] args) { //ws
	
		Scanner 입력객체 = new Scanner (System .in);
		
		System.out.println("윗변을 입력하시오"); double 윗변 = 입력객체 .nextDouble();
		System.out.println("밑변을 입력하시오"); double 밑변 = 입력객체 .nextDouble();
		System.out.println("높이을 입력하시오"); double 높이 = 입력객체 .nextDouble();
	 
		double 넓이 = (윗변 * 밑변) * 높이 / 2;
		
		System.out.println(넓이);
	
	
	
	} // we
} //ce