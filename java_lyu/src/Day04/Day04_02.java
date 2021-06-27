package Day04;

import java.util.Scanner;


public class Day04_02 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner 입력객체 = new Scanner(System.in);
		 
		// 반복문을 이용한 별 출력
		// 문제1: 입력한 개수만큼 별 출력
		

		 System.out.println("별의 개수 입력:"); int 별 = 입력객체.nextInt();
		for (int i = 1; i <= 별 ; i++){
			System.out.print("*");  
		}    System.out.println("\n");
		
		//문제 2: 입력한 개수만큼 별[*] 출력 / 단 5개마다 줄바꿈
		
		
		 System.out.println("별의 개수 입력:"); int 별2 = 입력객체.nextInt();
			for (int i = 1; i <= 별 ; i++){
				System.out.print("*");  
				
				if ( i%5 == 0) System.out.println("\n");
			}
		
		
	} //we	
}//ce
