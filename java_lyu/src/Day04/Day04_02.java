package Day04;

import java.util.Scanner;


public class Day04_02 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner �Է°�ü = new Scanner(System.in);
		 
		// �ݺ����� �̿��� �� ���
		// ����1: �Է��� ������ŭ �� ���
		

		 System.out.println("���� ���� �Է�:"); int �� = �Է°�ü.nextInt();
		for (int i = 1; i <= �� ; i++){
			System.out.print("*");  
		}    System.out.println("\n");
		
		//���� 2: �Է��� ������ŭ ��[*] ��� / �� 5������ �ٹٲ�
		
		
		 System.out.println("���� ���� �Է�:"); int ��2 = �Է°�ü.nextInt();
			for (int i = 1; i <= �� ; i++){
				System.out.print("*");  
				
				if ( i%5 == 0) System.out.println("\n");
			}
		
		
	} //we	
}//ce
