package Day03;

import java.util.Scanner;


public class Day03_test8 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner �Է°�ü = new Scanner(System.in);

		 
		// Ű����ũ ���α׷� [���� ���α׷�]
		 	// �Ǹ���ǰ : 1. �ݶ� [500] 2. Ŀ��[600] 3. ������[700] 4. ����		 
		 		// ������ ��ǰ�� ��ٱ��Ͽ� ���		 
		 			// ���� ���� ����� ������ ���� �Է¹ޱ� [ �ܵ� ��� �� ����]
		 	// ��ǰ ��� : �ݶ�[10��]	Ŀ��[10��]	������[10��]
		 		// ��� ���� ��� ���źҰ�
		 
		 
		 int �ݶ󰳼� = 0;
		 int Ŀ�ǰ��� = 0;
		 int �����𰳼� = 0;
		 
		 int �ݶ��ܰ� = 10;
		 int Ŀ���ܰ� = 10;
		 int �������ܰ� = 10;
		 
		 int ������ = 0;
		 int �ݾ� = 5000;
		 
		 while(true) { //while1 s
			 
			 
			 System.out.println("���α׷� ���� ��");
		
			 System.out.println(" - - - - > Ű����ũ �޴�");
			 System.out.println("��ٱ��� ��Ȳ: ");
			 System.out.println("�ݶ�:" + �ݶ󰳼� + "Ŀ��: " + Ŀ�ǰ��� + "������: " + �����𰳼�);
			 System.out.println("1. �ݶ� [500] 2. Ŀ��[600] 3. ������[700] 4. ����"); int ���� = �Է°�ü .nextInt();
			 
			 if (���� == 1) { 
				 if (�ݶ��ܰ� < 0) System.out.println("�ݶ��ܰ� �����ϴ�.");
				 else System.out.println("�ݶ� ��ҽ��ϴ�."); �ݶ󰳼�++; �ݶ��ܰ�--;
				
			 }
			 if (���� == 2) { 
				 if (Ŀ���ܰ� < 0) System.out.println("Ŀ���ܰ� �����ϴ�.");
				 else System.out.println("Ŀ�Ǹ� ��ҽ��ϴ�."); Ŀ�ǰ���++; Ŀ���ܰ�--;
				 
			 }
			 if (���� == 3) { 
				 if (�������ܰ� < 0) System.out.println("�������ܰ� �����ϴ�.");
				 else System.out.println("������ ��ҽ��ϴ�."); �����𰳼�++; �������ܰ�--;
				
			 }			 
			 if (���� == 4) { //if4 s

				 System.out.println("����â���� �̵��մϴ�");
				 System.out.println("������ �Ͻðڽ��ϱ�? [Y/N]"); String ���� = �Է°�ü .next();		 
				 if (����.equals("Y")) 	{//if Y s
				 
				 System.out.println("���� Ű����ũ ��Ȳ:");
				 if (�ݶ󰳼� != 0) System.out.println("�ݶ󰳼�:" + �ݶ󰳼� + "\t" + "�ݾ�:" + (�ݶ󰳼� * 500));
				 if (Ŀ�ǰ��� != 0) System.out.println("Ŀ�ǰ���:" + Ŀ�ǰ��� + "\t" + "�ݾ�:" + (Ŀ�ǰ��� * 600));
				 if (�����𰳼� != 0) System.out.println("�����𰳼�:" + �����𰳼� + "\t" + "�ݾ�:" + (�����𰳼� * 700));
				 if (�ݶ󰳼� == 0 && Ŀ�ǰ��� ==0 && �����𰳼� ==0) System.out.println("��ٱ��Ͽ� ��� ���� �����ϴ�.");
				 
				 int �����ݾ� = �ݶ󰳼�*500 + Ŀ�ǰ���*600 + �����𰳼�*700;
					 
				 if ( (�ݾ� - �����ݾ�) >= 0) {//if �ݾ� s
				 System.out.println("�� ����ݾ�: " + �����ݾ�);
				 System.out.println("���� �ݾ�: " + (�ݾ� - �����ݾ�));
				 
				 }//if �ݾ� e
				 else System.out.println("�ѵ��ʰ�");
				 break;
				 } //if Y e
				 				
				
				 	else System.out.println("������ ����մϴ�.");				 
			 break;
			 } //if4 e
			 
		 } //while1 e
		 
	 
		 
	} //we
} //ce
	