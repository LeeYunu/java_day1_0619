package Day04;

import java.util.Scanner;


public class Day04_06 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner 입력객체 = new Scanner(System.in);
		 
		// 문제7 : 입력한 줄 만큼 별삼각형 출력 
					/*  예 ) 5 
					 		*
					 	   ***
					 	  *****
					 	 *******
					 	*********
					 */

		 System.out.println("별의 개수 입력:"); int 별 = 입력객체.nextInt();
		for (int i = 1; i <= 별 ; i ++ ){//fori s	
			System.out.print("\n");
			for (int j = 1; j <= 별-i ; j++) {//forj s
			System.out.print(" ");}
			for ( int k = 1; k <= i*2-1 ; k++) {
			System.out.print("*");
					}
					
		}
			
			
			


		
		
	} //we	
}//ce