package Day03;

import java.util.Scanner;


public class Day03_test7 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner �Է°�ü = new Scanner(System.in);

		 
		 // ���ӿ��� ���� �̿��ϱ� ���α׷�
		 	//����1: �Ѹ�ȸ�� [ ���̵�: qwe ��й�ȣ 1234]
		 		// �α���â ���� ���̵�� ��й�ȣ�� �Է¹޾� ������ ��� ���� �̿��ϱ�
		 			// �������� ������ �α��� ����
		 	//����2: ���� 5000�� ������ ����
		 		//��ǰ : 1. ����[100��] 2. ����[200��] 3.��ű�[300��]
		 			// ��ٱ���: ��ǰ��ȣ�� �Է¹޾� ��ٱ��� ���
		 //����		
		 while(true) { //while s
		 System.out.println(">>>�α���â>>>>");
		 System.out.println("���̵�: "); String ID = �Է°�ü .next();
		 System.out.println("��й�ȣ:"); short PW = �Է°�ü .nextShort();
	
		
		 if (ID.equals("qwe") && PW == 1234 ) { //if s
			 System.out.println("�α��� ����");
			 
			 
			 int �ݾ� = 5000;
			 int ���ళ�� = 0;
			 int ���ϰ��� = 0;
			 int ��ű����� = 0;
			 
			 System.out.println(">>>���� ����>>>");

			 while(true) { //while2 s
				 System.out.println("1. ����[100��] 2. ����[200��] 3.��ű�[800��] 4.[����]"); 
				 int ���� = �Է°�ü .nextInt();
				 
				 if ( ���� == 1 ) { 
					 System.out.println("������ ��ҽ��ϴ�.");
					 ���ళ��++; 
				}
				
				 if ( ���� == 2 ) {
					 System.out.println("������ ��ҽ��ϴ�.");
					 ���ϰ���++;
				}
				 
				 if ( ���� == 3 ) { System.out.println("��ű��� ��ҽ��ϴ�.");
				 ��ű�����++;}
				 
				 if ( ���� == 4 ) {  
					System.out.println("����â���� �̵��մϴ�.");
				 	System.out.println("��ű� ��Ȳ:");
				 	if( ���ళ�� != 0) System.out.println("���� \t " + ���ళ�� + "\t" + ���ళ��*100);	
				 	if( ���ϰ��� != 0) System.out.println("���� \t " + ���ϰ��� + "\t" + ���ϰ���*200);
				 	if( ��ű����� != 0) System.out.println("��ű� \t " + ��ű����� + "\t" + ��ű�����*800);
				 	if( ���ళ�� == 0 && ���ϰ��� ==0 && ��ű�����==0) System.out.println("��ٱ��Ͽ� ��� ���� �����ϴ�.");
				 	
				 	if (�ݾ� - (���ళ��*100+���ϰ���*200+��ű�����*800) < 0) System.out.println("�ѵ��ʰ�");
				 		
				 	else {
				 	System.out.println("�� ������: "+ (���ళ��*100+���ϰ���*200+��ű�����*800));
				 	System.out.println("���� �ݾ�: "+ (�ݾ� - (���ళ��*100+���ϰ���*200+��ű�����*800)));
				 	}
				 	break;
				 	
				 }
			 } //while2 e
			 
			 
			 
		 } //if e
			
			 else   System.out.println("�α��� ����");
	
		 } //while e 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	} //we
} //ce
