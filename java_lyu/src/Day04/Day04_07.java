package Day04;

import java.util.Scanner;


public class Day04_07 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner �Է°�ü = new Scanner(System.in);
		 
			// ����9 : �Է��� �� ��ŭ ���ﰢ�� ��� 
			/*  �� ) 5 
			 	*********
			 	 *******
			 	  *****
			 	   ***
			 	    *
			 */

		 System.out.println("���� ���� �Է�:"); int �� = �Է°�ü.nextInt();
			for (int i = 1; i <= �� ; i ++ ){//fori s	
				System.out.print("\n");
				for (int j = ��; j >= ��-i +1 ; j--) {//forj s
				System.out.print(" ");}//forj e
				for ( int k = 1; k <= 2*(��-i)-1 ; k++) {//fork s
				System.out.print("*");	}//fork e
					}//for i e
		
		
	} //we	
}//ce