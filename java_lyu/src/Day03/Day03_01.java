package Day03;

import java.util.Scanner;

public class Day03_01 { //cs
	
	public static void main(String[] args) { //ws

	// ��� : ��쿡 ���� �Ǵܷ�
		// if[���˻�], switch[���˻� X / �� �˻�],
	
	// if ����
		//���࿡ ~�̸�
		//1. if  (T / F) ���๮;
		//2. if  (T / F) T���๮;
		//   else F ���๮
		//3. if (T/F) { ���๮; ���๮2;}
		//   else {���๮; ���๮2;}
		//4. if (T/F)
		//	else if (T/F) ���๮[T2];
		//  else
		
		
		//��1
		if (5>3) System.out.println("5�� ũ��");
		if(5>10) System.out.println("5�� ũ��");
		
		//��2
		if (5>3) System.out.println("5�� ũ��");
		else System.out.println("5�� �� �۴�");
		
		//��3	
		 if (5>3) { System.out.println("true"); System.out.println("5�� ũ��"); }
		else { System.out.println("false"); System.out.println("5�� �۴�"); }
		
		//��4
		 if (5>10) System.out.println("5�� ũ��1");
		 else if(5>6) System.out.println("5�� ũ��2");
		 else if(5>8) System.out.println("5�� ũ��3");
		 else if(5>4) System.out.println("5�� ũ��4");
		 else System.out.println("5���� ���� �����Ͱ� ����");
		 
		 
		 
		 // ����1: �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ�
		 
		 Scanner �Է°�ü = new Scanner(System.in);
		 
		 
		System.out.println("1. ������ �Է��Ͻÿ�: "); int ���� = �Է°�ü .nextInt();
		
		if (����>=80) System.out.println("�հ�");
		else System.out.println("���հ�");
		 
		 
		 // ����2: �ϳ��� ������ �Է¹޾� 90�� �̻��̸� A 80���̻��̸� B �׿� Ż��
		 
		 System.out.println("2. ������ �Է��ϼ���: "); int ���� = �Է°�ü .nextInt();
		 
		 if (���� >= 90) System.out.println("A���� �Դϴ�.");
		 else if (���� >= 80) System.out.println("B���� �Դϴ�.");
		 else System.out.println("���հ��Դϴ�.");
		
		// ����3: �ϳ��� ������ ������ �Է¹޾�
			// �����̸鼭 90�� �̻��̸� A-1 Ŭ���� ���
			// �����̸鼭 90�� �̻��̸� A-2 Ŭ���� ���
				// �����̸鼭 80�� �̻��̸� B-1 Ŭ���� ���
				// �����̸鼭 80�� �̻��̸� B-2 Ŭ���� ���
					// �׿� CŬ����
		
		 
		 System.out.println("3. ������ �Է����ּ���:"); int ������ = �Է°�ü .nextInt();
		 System.out.println("[��/��]������ �Է����ּ���."); String ���� = �Է°�ü .next();
		 
		 if (����.equals("��") && ������ >= 90) System.out.println("A-1");
		 else if (����.equals("��") && ������ >= 80) System.out.println("B-1");
		 else if (����.equals("��") && ������ >= 90) System.out.println("A-2");
		 else if (����.equals("��") && ������ >= 80) System.out.println("B-2");
		 else System.out.println("CŬ����");
		 
		 
		 // String : ���ڿ� Ŭ����
		 	// ���ڿ�.equals("��") ���ڿ� �� [ ��ȯ = T/F]
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
	} //we
} //cs
