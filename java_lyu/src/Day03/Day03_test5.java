package Day03;

import java.util.Scanner;


public class Day03_test5 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);

		 
		 // 문제 7. 4개의 정수를 입력받아 오름차순으로 정렬
		 
	
	
		 
		 System.out.println("첫번째 정수를 입력하세요: "); int 정수1 = 입력객체 .nextInt();
		 System.out.println("두번째 정수를 입력하세요: "); int 정수2 = 입력객체 .nextInt();
		 System.out.println("세번째 정수를 입력하세요: "); int 정수3 = 입력객체 .nextInt();
		 System.out.println("네번째 정수를 입력하세요: "); int 정수4 = 입력객체 .nextInt();
		 
		int temp;
		
		 System.out.printf (" 정렬 전: %d %d %d %d", 정수1, 정수2, 정수3, 정수4);
	
		 if (정수1 > 정수2) 
		 { temp = 정수1;
			정수1 = 정수2;
		 	정수2 = temp;
		 }
		 
		 if (정수1 > 정수3)
		 { temp = 정수1;
			정수1 = 정수3;
		 	정수3 = temp;			 
		 }
		 
		 if (정수1 > 정수4)
		 { temp = 정수1;
			정수1 = 정수4;
		 	정수4 = temp;			 
		 }
		 
		 if (정수2 > 정수3)
		 {  temp = 정수2;
			정수2 = 정수3;
		 	정수3 = temp;				 	 
		 }
		 
		 if (정수2 > 정수4)
		 {  temp = 정수2;
			정수2 = 정수4;
		 	정수4 = temp;				 	 
		 }
		 
		 if (정수3 > 정수4)
		 {  temp = 정수3;
			정수3 = 정수4;
		 	정수4 = temp;				 	 
		 }
		 
		 System.out.printf (" 정렬 후: %d %d %d %d", 정수1, 정수2, 정수3, 정수4);

		 
	} // we
} //ce