package Day02;

import java.util.Scanner;

public class Day02_03 { // cs
	
	public static void main (String[] args) { //me
	
	//�Է¹ޱ�
		//1. �Է¹ޱ� => ������ ���� => ���
	
	
	Scanner scan = new Scanner (System.in);
			// Scanner : �Է� ���� Ŭ����
				//Scan : ��ü�� vs ������
					// New : ��ü�� �޸� �Ҵ� ������
							// Scanner (system.in) Ŭ����
				
	
	System.out.println("�����Է�:");
	int �Է����� = scan.nextInt();
	System.out.println("���� �Է��� ������ :" + �Է�����);
	
	System.out.println("���ڿ� �Է�:");
	String �Է¹��ڿ� = �Է°�ü.next();
			//next() : �Է°�ü�� �Էµ� ���ڿ� ��������
	System.out.println("���� �Է��� ���ڿ���:"+ �Է¹��ڿ�);
	
	} //me
} //ce
