package Day04;

import java.util.Random;
import java.util.Scanner;


public class Day04_09 { //cs

	public static void main(String[] args) { //ws
		
		
		// ���������� ����
			// 1. ���� ���� �� �� �ϳ��� �Է¹޾� ���� ����
			// 2.  ��ǻ�ʹ� ���� ���
			// 3. ���� ������ �����ؼ� ���� �¸���
		
		
		Scanner �Է°�ü = new Scanner(System.in);
		
		System.out.println("------���� [0] . ���� [1] . �� [2]-------");
		
		
		int �¸��� = 0;
		int �й�� = 0;
		int ���ºμ� = 0;
		int ��Ƚ�� = 0;
		
		
		while (true) { //���ѷ��� while s
			
			System.out.print("::����[0], ���� [1], �� [2]:: \n����: "); int �÷��̾� = �Է°�ü.nextInt();
			if ( �÷��̾� == 0) System.out.println("����� ������ �½��ϴ�");
			else if ( �÷��̾�==1) System.out.println("����� ������ �½��ϴ�");
			else if ( �÷��̾�==2) System.out.println("����� ���� �½��ϴ�");
			else System.out.println("�� �� ���� ����Դϴ�");
		
			// ��ǻ�� => ���� �̿��� �������� [ Random : ���� ���õ� �޼ҵ� ����]
			Random random = new Random(); //������ü			
			int ��ǻ�� = random.nextInt(3); // ������ü���� ������������ [ .nextInt(����) 0~����(�̸�)������ ��������]
			if ( ��ǻ�� == 0) System.err.println("��ǻ�Ͱ� ������ �½��ϴ�");
			else if ( ��ǻ�� == 1) System.err.println("��ǻ�Ͱ� ������ �½��ϴ�");
			else if ( ��ǻ�� == 2) System.err.println("��ǻ�Ͱ� ���� �½��ϴ�");
			
			
			// ����
			
			if ((�÷��̾�==0 && ��ǻ��==2) || (�÷��̾�==1 && ��ǻ��==0)||(�÷��̾�==2 && ��ǻ��==1)) {
				System.out.println(":::�÷��̾ �¸��߽��ϴ�:::"); 
				�¸���++;
			}
			else if ((�÷��̾�==2 && ��ǻ��==0) || (�÷��̾�==0 && ��ǻ��==1) || (�÷��̾�==1 && ��ǻ��==2)) {
				System.err.println(":::��ǻ�Ͱ� �¸��߽��ϴ�:::");
				�й��++;
			}
			else {
				System.out.println(":::�����ϴ�:::");
				���ºμ�++;
			}
			
			
			
			
			��Ƚ��++;
			System.out.println("��Ƚ��:" + ��Ƚ�� + "\t�¸�: "+ �¸��� + "\t�й�: "+ �й�� + "\t���º�: "+ ���ºμ�+ "\n");

			if (��Ƚ�� == 10) {
				System.out.println("------��������------");
				System.out.println("��������::" + �¸��� + "��\t"+ �й�� + "��\t"+ ���ºμ� + "��");
			
			
			if (�¸��� > �й��) System.out.println("�÷��̾� �¸�!");

			else if(�¸��� < �й��) System.err.println("�÷��̾� �й�..");
			
			else System.out.println("���º�");
				
			
				break;
			}
		
		}//while e 
		
		
		
		
		
		
		
		
		
		
		
	}//we	
}//ce
