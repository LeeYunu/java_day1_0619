package Day02;

import java.util.Scanner;


public class Day02_과제08 { //cs

	public static void main (String[] args) { //ws
	
		Scanner 입력객체 = new Scanner (System .in);
		
		System.out.println("첫번째 정수를 입력하시오"); double 앞정수 = 입력객체 .nextDouble();
		System.out.println("두번째 정수를 입력하시오"); double 뒤정수 = 입력객체 .nextDouble();
		
		System.out.println((앞정수/뒤정수)*100 + "%");
	
	
	
	} // we
} //ce