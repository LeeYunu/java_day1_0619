package Day04;

import java.util.Scanner;


public class Day04_03 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner �Է°�ü = new Scanner(System.in);
		 
		 // �Է��� �ٸ�ŭ �� ���

		 System.out.println("���� ���� �Է�:"); int �� = �Է°�ü.nextInt();
		for (int i = 1; i <= �� ; i++){ 
			 System.out.print("\n");
			for (int j = 1 ; j <= i ; j ++)
			
				System.out.print("*"); 
				
		} 	 System.out.print("\n");

		//�ݴ��
		
		 System.out.println("���� ���� �Է�:"); int ��2 = �Է°�ü.nextInt();
			for (int i = 1; i <= ��2 ; i++){ 
				 System.out.print("\n");
				for (int j = ��2 ; j >= i ; j--)
					System.out.print("*"); 	
			} 

		
		
		
		
	} //we	
}//ce