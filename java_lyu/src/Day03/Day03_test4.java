package Day03;

import java.util.Scanner;


public class Day03_test4 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner �Է°�ü = new Scanner(System.in);
		 

		 // ���� 6. 4���� ������ �Է¹޾� ���� ū�� ���
		 

		 
		 System.out.println("ù��° ������ �Է��ϼ���: "); int ����1 = �Է°�ü .nextInt();
		 System.out.println("�ι�° ������ �Է��ϼ���: "); int ����2 = �Է°�ü .nextInt();
		 System.out.println("����° ������ �Է��ϼ���: "); int ����3 = �Է°�ü .nextInt();
		 System.out.println("�׹�° ������ �Է��ϼ���: "); int ����4 = �Է°�ü .nextInt();
		 
		
		 int max = ����1;
		 if (max < ����2) max = ����2;
		 if (max < ����3) max = ����3;
		 if (max < ����4) max = ����4;
		 System.out.println(" ���� ū���� " + max);
		 
		 
		 
		 
	} // we
} //ce