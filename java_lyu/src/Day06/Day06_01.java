package Day06;

import java.util.Arrays;
import java.util.Scanner;

public class Day06_01 {

	public static void main(String[] args) { // ms 
		
		// �л����� �Է¹޾� �л�����ŭ �迭ũ�� 
		
		Scanner scanner = new Scanner(System.in);
		
		int[] �л����� = null;//���� �޸𸮰� null�� �迭 ����
		int �ο��� =0;
		
		while (true) {// while 1 s
		System.err.println("---�л����� ���α׷� ---");
		System.out.println("1.�л� �� 2.���� 3.��� 4.����"); 
		int ���� = scanner.nextInt();
		
		if(���� == 1) { 
			//System.out.println(" ---> �л��� : "); int �ο��� = scanner.nextInt();
			�л����� = new int[�ο���]; // �ڷ��� �迭�� = new �ڷ���[����] 
			System.out.println(�ο��� + "��ŭ �л������� ���尡���մϴ�");
		}
		else if (���� == 2) {//else i2 s
			for (int i =0;i<�л�����.length;i++) {// f2 s
				System.out.println((i+1)+"��° �л����� �Է�:");
				�л�����[i]=scanner.nextInt();
			}//f2 e
		}// else i2 e
		else if (���� == 3) { // [�ε���]: �迭�� ����Ǵ� ���� ��ȣ // �پ��� �޼ҵ�[�̸��ۼ��ڵ�] => Arrays Ŭ���� ���
			//���� = sort() ���
			Arrays.sort(�л�����); // ��������
			for (int i =0; i<�л�����.length; i++) {
				System.out.println((i+1)+"��° �л��� ����"+ �л�����[i]);
			}
		
		// ���� ���� ���� ���
			int max = 0;
			int sum = 0;
			for (int i = 0 ;i<�л�����.length;i++) {
				//�ִ�
				if(max<�л�����[i]) max = �л�����[i];
				//�����հ�
				sum += �л�����[i];
			}
		System.out.println("���� ���� ������: "+ max + "�Դϴ�"); 
		System.out.println("�л����� �����:" + sum/�ο��� + "�Դϴ�");
		
		}//else 3 e
		
		/*
		  //�������� : �⺻�ڷ��� X 
			���� int [] �л����� = null -> Integer[] �� ����
		   * int : ���� �ڷ��� [new X] => ����
		   * Integer : ���� Ŭ���� [ new ���] => ��ü
		  Arrays.sort(�л�����, Collections.reverseOrder());
		  		// �÷��� : �迭, ����Ʈ
	
				*/
		
		else if (���� == 4) {
			System.err.println("�л����� ���α׷��� �����մϴ�.");
			break;
		}
		else {
			System.out.println("�Է°��� �ƴմϴ�.");
		}
		
			
			
			
			
		}// while 1 e
		
	} // m e	
}	 
