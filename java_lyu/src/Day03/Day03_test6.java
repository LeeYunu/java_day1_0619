package Day03;

import java.util.Scanner;


public class Day03_test6 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);

		 
		 // 문제 8. 4개의 정수를 입력받아 내림차순 정렬 후 출력
		 
	
	
		 
		 System.out.println("첫번째 정수를 입력하세요: "); int 정수1 = 입력객체 .nextInt();
		 System.out.println("두번째 정수를 입력하세요: "); int 정수2 = 입력객체 .nextInt();
		 System.out.println("세번째 정수를 입력하세요: "); int 정수3 = 입력객체 .nextInt();

		 
		int temp;
		
		 System.out.printf (" 정렬 전: %d %d %d", 정수3, 정수2, 정수1);
	
		 if (정수1 > 정수2)
		 { temp = 정수1; 정수1 = 정수2; 정수2 = temp; }
		 if (정수1 > 정수3)
		 { temp = 정수1; 정수1 = 정수3; 정수3 = temp; }
		 if (정수2 > 정수3)
		 { temp = 정수2; 정수2 = 정수3; 정수3 = temp; }
		 
		 System.out.printf(" 정렬후: %d %d %d", 정수3, 정수2, 정수1);
		 
	} //we
} //ce
