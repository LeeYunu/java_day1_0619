package Day04;

import java.util.Scanner;


public class Day04_08 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner �Է°�ü = new Scanner(System.in);
		 
		// ����10 : X ��� ��� 
					/*  �� ) 5 
					 	
					 	  *   *
					       * *
					        *
					 	   * *
					 	  *   *
					 	
					 */

		 System.out.println("���� ���� �Է�:"); int �� = �Է°�ü.nextInt();
		for (int i = 1; i <= �� ; i++){ //for i s
			System.out.print("\n");  
			for (int j = 1 ; j<=��; j++ ) {
				if ( i == j) System.out.print("*");
				else if ((i+j) == ��+1) System.out.print("*");
				else System.out.print(" ");
			}
			
			
			
			
		}     //for i e

		
		
	} //we	
}//ce