package Day04;

import java.util.Scanner;


public class Day04_06 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner �Է°�ü = new Scanner(System.in);
		 
		// ����7 : �Է��� �� ��ŭ ���ﰢ�� ��� 
					/*  �� ) 5 
					 		*
					 	   ***
					 	  *****
					 	 *******
					 	*********
					 */

		 System.out.println("���� ���� �Է�:"); int �� = �Է°�ü.nextInt();
		for (int i = 1; i <= �� ; i ++ ){//fori s	
			System.out.print("\n");
			for (int j = 1; j <= ��-i ; j++) {//forj s
			System.out.print(" ");}
			for ( int k = 1; k <= i*2-1 ; k++) {
			System.out.print("*");
					}
					
		}
			
			
			


		
		
	} //we	
}//ce