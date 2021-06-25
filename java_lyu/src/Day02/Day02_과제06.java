package Day02;

import java.util.Scanner;


public class Day02_과제06 { //cs

	public static void main (String[] args) { //ws
	
		Scanner 입력객체 = new Scanner (System .in);
		
		System.out.println("첫번째 정수를 입력하시오"); int 첫번째정수 = 입력객체 .nextInt();
		System.out.println("두번째 정수를 입력하시오"); int 두번째정수 = 입력객체 .nextInt();

		if (첫번째정수 > 두번째정수) {
		System.out.println( 첫번째정수 + "이 더 큽니다.");
		}
		else if (두번째정수 > 첫번째정수) {
			System.out.println(두번째정수 + "이 더 큽니다.");
			
		}
		else {
			System.out.println("두정수는 같습니다");
		}
	
	} // we
} //ce