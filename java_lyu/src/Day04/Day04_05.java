package Day04;

import java.util.Scanner;


public class Day04_05 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner �Է°�ü = new Scanner(System.in);
		 
		// ����6 : �Է��� �� ��ŭ ���ﰢ�� ��� 
					/*  �� ) 5 
					 	 *****
					 	  ****
					 	   ***
					 	    **
					 	     *
					 */

		 System.out.println("���� ���� �Է�:"); int �� = �Է°�ü.nextInt();
			for (int i = 1; i <= �� ; i++){ 
				System.out.print("\n");
				for (int k = 1 ; k <= i ; k++)
					System.out.print(" "); 
				for (int j = �� ; j >= i ; j--)
					System.out.print("*");
			} 
		
			
			 
			
			
			
	} //we	
}//ce