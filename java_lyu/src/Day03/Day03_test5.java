package Day03;

import java.util.Scanner;


public class Day03_test5 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner �Է°�ü = new Scanner(System.in);

		 
		 // ���� 7. 4���� ������ �Է¹޾� ������������ ����
		 
	
	
		 
		 System.out.println("ù��° ������ �Է��ϼ���: "); int ����1 = �Է°�ü .nextInt();
		 System.out.println("�ι�° ������ �Է��ϼ���: "); int ����2 = �Է°�ü .nextInt();
		 System.out.println("����° ������ �Է��ϼ���: "); int ����3 = �Է°�ü .nextInt();
		 System.out.println("�׹�° ������ �Է��ϼ���: "); int ����4 = �Է°�ü .nextInt();
		 
		int temp;
		
		 System.out.printf (" ���� ��: %d %d %d %d", ����1, ����2, ����3, ����4);
	
		 if (����1 > ����2) 
		 { temp = ����1;
			����1 = ����2;
		 	����2 = temp;
		 }
		 
		 if (����1 > ����3)
		 { temp = ����1;
			����1 = ����3;
		 	����3 = temp;			 
		 }
		 
		 if (����1 > ����4)
		 { temp = ����1;
			����1 = ����4;
		 	����4 = temp;			 
		 }
		 
		 if (����2 > ����3)
		 {  temp = ����2;
			����2 = ����3;
		 	����3 = temp;				 	 
		 }
		 
		 if (����2 > ����4)
		 {  temp = ����2;
			����2 = ����4;
		 	����4 = temp;				 	 
		 }
		 
		 if (����3 > ����4)
		 {  temp = ����3;
			����3 = ����4;
		 	����4 = temp;				 	 
		 }
		 
		 System.out.printf (" ���� ��: %d %d %d %d", ����1, ����2, ����3, ����4);

		 
	} // we
} //ce