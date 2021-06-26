package Day03;

import java.util.Scanner;


public class Day03_test2 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);
		
		 // 문제5. 3개의 정수를 입력받아 가장 큰수 출력

		 
		 System.out.println("첫번째 정수를 입력하세요: "); int 정수1 = 입력객체 .nextInt();
		 System.out.println("두번째 정수를 입력하세요: "); int 정수2 = 입력객체 .nextInt();
		 System.out.println("세번째 정수를 입력하세요: "); int 정수3 = 입력객체 .nextInt();
		 
		
		 int max = 정수1;
		 if (max < 정수2) max = 정수2;
		 if (max < 정수3) max = 정수3;
		 System.out.println(" 가장 큰수는 " + max);
		 
		 
	} // we
} //ce