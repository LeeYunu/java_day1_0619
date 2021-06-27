package Day04;

import java.util.Scanner;


public class Day04_05 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner 입력객체 = new Scanner(System.in);
		 
		// 문제6 : 입력한 줄 만큼 별삼각형 출력 
					/*  예 ) 5 
					 	 *****
					 	  ****
					 	   ***
					 	    **
					 	     *
					 */

		 System.out.println("별의 개수 입력:"); int 별 = 입력객체.nextInt();
			for (int i = 1; i <= 별 ; i++){ 
				System.out.print("\n");
				for (int k = 1 ; k <= i ; k++)
					System.out.print(" "); 
				for (int j = 별 ; j >= i ; j--)
					System.out.print("*");
			} 
		
			
			 
			
			
			
	} //we	
}//ce