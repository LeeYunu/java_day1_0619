package Day02;

import java.util.Scanner;


public class Day02_과제10 { //cs

	public static void main (String[] args) { //ws
	
		Scanner 입력객체 = new Scanner (System .in);
		
		System.out.println("키를 입력하시오"); double 키 = 입력객체 .nextDouble();

		double 표준체중 = (키 - 100) * 0.9;
		
		System.out.println("표준체중은" + 표준체중 + "입니다.");
	
	
	
	} // we
} //ce