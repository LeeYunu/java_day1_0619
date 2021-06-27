package Day04;

import java.util.Scanner;


public class Day04_08 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner 입력객체 = new Scanner(System.in);
		 
		// 문제10 : X 모양 출력 
					/*  예 ) 5 
					 	
					 	  *   *
					       * *
					        *
					 	   * *
					 	  *   *
					 	
					 */

		 System.out.println("별의 개수 입력:"); int 별 = 입력객체.nextInt();
		for (int i = 1; i <= 별 ; i++){ //for i s
			System.out.print("\n");  
			for (int j = 1 ; j<=별; j++ ) {
				if ( i == j) System.out.print("*");
				else if ((i+j) == 별+1) System.out.print("*");
				else System.out.print(" ");
			}
			
			
			
			
		}     //for i e

		
		
	} //we	
}//ce