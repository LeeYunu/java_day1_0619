package Day05;

import java.util.Scanner;
import java.util.Random;

public class Day05_�ζ� {

	public static void main(String[] args) {// ms
		
		
		// 1. 6�� ���� �Է¹޾� �迭 ����
		// 2. 6�� ���ڸ� ���� �����ؼ� �迭 ����
		// 3. �� �迭�� ���ؼ� ������ ���� ����
		
		
		// 1. �ζ� ��ȣ �迭
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int [] ��÷ = new int [6];

		
		int [] �ζ� = new int [6];
	
		
		for (int i = 0 ; i < 6 ; i ++) { // for s
			System.out.println((i+1) + "��° ���� �Է� : ");
			
			int ��ȣ = scanner.nextInt();
			if ( ��ȣ <= 0 || ��ȣ > 45) {
				System.out.println("���ڸ� �ٽ� �Է��ϼ���");
				i--; //������ �����ϹǷ� ���� �ʿ�
			}
			else { // else s
				int �ߺ�üũ = 0; // for �� �� �ߺ�üũ /���ҽÿ� ���� �߻�
				for (int j=0; j < 6; j++) { // else for s
					if (�ζ�[j] == ��ȣ) {//else if s
						System.out.println("�ߺ��� �����Դϴ�");
						i--;
						
						�ߺ�üũ = 1; 
						
					} // else if e
					
				} // else for e
							
				if ( �ߺ�üũ == 0 ) �ζ�[i] = ��ȣ;
				
			} // else e
		
		}// for e
		
		
		System.out.print("��÷��ȣ: ");
		
		for (int i = 0; i <6; i++) {//for s
			int ��÷�� = random.nextInt(45)+1;
			int �ߺ�üũ = 0; // for �� �� �ߺ�üũ /���ҽÿ� ���� �߻�
			for (int j=0; j < 6; j++) { //  for2 s
				if (��÷[j] == ��÷��) {// if2 s
					�ߺ�üũ = 1;
					i--;
				} // if 2 e
			}//  for2 e
			
			if (�ߺ�üũ == 0) {//�ߺ� if s
			��÷ [i] = ��÷��;
			}//�ߺ� if e
			
			System.out.print(��÷�� + " ");
		}//for e
		
		int ��÷���� = 0;
		
		for (int i = 0 ; i<6 ; i++) {// for i s
				for (int j = 0 ; j<6 ; j++) { // for j s 
				if (��÷[j] == �ζ�[j]) {// if s
					��÷����++;
				}// if e
			}//for j e
			
		}//for i e 
		System.out.println("��÷���� : " + ��÷����);
		
		if (��÷���� == 6) {
			System.out.println("1�� ��÷�Դϴ�.");
		}

		else if (��÷���� ==5) {
			System.out.println("2�� ��÷�Դϴ�.");
					}
		
	}//m e
}
