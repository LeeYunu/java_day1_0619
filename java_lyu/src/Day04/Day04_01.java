package Day04;

import java.util.Scanner;


public class Day04_01 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner �Է°�ü = new Scanner(System.in);
		
	
		 
		 // ��� = if
		 
		 // �ݺ��� = for , while , do ~ while
		 	// ��𼭺��� ������ �ݺ� 
		 // for ����
		 	// for ( �ʱⰪ ; ���ǹ� ; ������ ) {���๮;}
		 	// for ( ��𼭺��� ; ������ ; �̵�����){�����ڵ�;}
		 		// �ʱⰪ : �ݺ��� ���۰� [for ������ �� 1�� �˻�]
		 		// ���ǹ� : �ݺ������� ���� [�񱳿�����, �����ڵ� ���� �� �˻�]
		 		// ������ : �����ڵ� ���� �� �ʱⰪ ��������
		 
		 //��1
		 
		 for (int ���� = 0; ���� <10; ����++) {
		 // ������ 0���� 10�̸����� 1�� �����ϸ鼭 �ݺ�
		 	 System.out.println(����);
		 	 	//�ݺ��� �������
		 	 	// ���� =0 => ����<10 => T => �ڵ����
		 	 	// ����++ => ����=1 => ���� <10 => T => �ڵ����
		 	 	// ......
		 	 	// ���� ++ => ���� 10 => ���� <10 => F => �ݺ��� ����
		 }
		 
		
		 // �� 2 1~50 ����
		 
		 
		 for (int i = 0 ; i <= 50; i++) {
			 
			 System.out.print(i);
		 }
		 
		 System.out.print("\n");
		 
		 // �� 3 1~50 3���
		 
		 
		 for (int i = 3; i <=50; i +=3) {
			 
			 System.out.print(i); 
		 }
		 System.out.print("\n");
		 //or
		 
		 for (int i = 3; i <=50; i +=3) {
			 if (i%3 == 0) System.out.print(i); 
		 
		 }
		 System.out.print("\n");
		 
		 
		 // �� 4 1~50 ���� �հ�
		 
		 
		 int a=0;
		 
		for (int i = 0 ; i <= 50; i++) {
			a += i;
		}System.out.println(a);
		 
		 // ��5 1~50 3��� ���� �հ�	
			int b =0;
			for (int i = 3; i <=50; i +=3) {
			if (i%3 == 0) b += i;
			} System.out.println(b);
			
		 
		 // ��6 ������ ����� (2��)
		 
		 
			for ( int i =1; i<10 ; i++) {
				System.out.println(2*i);
			} System.out.println("\n");
			
			
			
			
		 // ��7 ������ ����� (1~9)
		 for (int i = 1; i<10; i++) { //for 1 s
			 System.out.println(i + "��");
			 for (int j=1; j<10 ; j++) { // for 2 s
				 System.out.println(i + "X" + j + "=" + i * j); 
			 } //for 2 e
			 System.out.println("\n");
		 } //for 2 s
		 
		 
		 
		 
		 
		 
		 
	} // we
} //ce