package Day03;

import java.util.Scanner;


public class Day03_test { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);
		
		//문제4. 두개 정수를 입력받아 더 큰 수 출력
	 
		 System.out.println("첫번째 정수를 입력하세요: "); int 정수1 = 입력객체 .nextInt();
		 System.out.println("두번째 정수를 입력하세요: "); int 정수2 = 입력객체 .nextInt();
		 
		 
		 if  (정수1 > 정수2) System.out.println(정수1 + "이(가) 더 큽니다.");
		 else if (정수2 > 정수1) System.out.println(정수2 + "이(가) 더 큽니다.");
		 else System.out.println("동일한 정수입니다.");
		 
		 
		 
		 
		 
		 
	} // we
} //ce