package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_ƽ���� {

	public static void main(String[] args) { //m s

	
		Scanner scanner = new Scanner(System.in);
		

		//�� ���� = ���� 9���� ������ �� �ִ� �迭
		String [] ������ = { "[ ]" , "[ ]" , "[ ]" , 
							"[ ]", "[ ]" , "[ ]" , 
							"[ ]" , "[ ]" , "[ ]" };
		
		String �¸��� = " "; // �¸� ���� �����ϱ� ���� ���� 
		
		
		while (true) {//while s ���� ��ü�� ���ѷ��� [ ��� ���� �ξ��� ��. �¸��ڰ� ������ ��� ���ᰡ �Ǿ���]
		// ������ ���
			for (int i = 0 ; i< ������.length ; i++) {
			// 3���� ��� 
			System.out.print(������[i]);
			if (i%3 == 2) System.out.println();
		}
			
			if (�¸���.equals("[O]")) {
				System.out.println("\n�÷��̾ �¸��߽��ϴ�.");
				break;
			}
			if (�¸���.equals("[X]")) {
				System.err.println("\n��ǻ�Ͱ� �¸��߽��ϴ�.");
				break;
			}

	
		// �÷��̾� = O , ��ǻ�� = X / �÷��̾ �Է¹޾� �ش� ��ġ�� �� �α�
		
		
		System.out.println("[����] ��ġ : ");
		
		//����
		
		
		
		
		while (true) { // while 2 s
			int �÷��̾� = scanner.nextInt(); //�ε��� 
				if (�÷��̾� < 0 || �÷��̾� > 8 ) System.out.println("[���] �ٽ� �Է��ϼ���.");
				else if ( !������ [�÷��̾�].equals("[ ]")) {//else if s
						System.out.println("�̹� ĭ�� ä�����ֽ��ϴ�.");
						System.out.println("[�缱��] ��ġ: ");
				} //else if e
				else { //else s
						������[�÷��̾�] = "[O]";  // �Է¹��� �ε����� �� �ٲٱ�
						break;
				} // else e
				
				
		} // while 2 e
		
		

		int ����˼� = 0;
		for ( int i = 0; i<9; i++) {
			if (!������[i].equals("[ ]")) ����˼�++;
		}
		if ( ����˼� == 9) {
			for (int i = 0 ; i< ������.length ; i++) {
				// 3���� ��� 
				System.out.print(������[i]);
				if (i%3 == 2) System.out.println();
			}
			
			System.out.println("[��������] : ���º�");
			break;
			
		}
		
		
		// ��ǻ�� [ ���� �����ؼ� �� �α�]
			// ���� ���� Ŭ�� = Random
			
		while (true) {//Random while s
		Random random = new Random();
			int ��ǻ�� = random.nextInt(9);
				// random.nextInt(); : 0~20��
				// random.nextInt(10); : 0~9
				// random.nextInt(��������ȣ)+���۹�ȣ;
				// random.nextInt(10)+10; : 10~19
			if (������[��ǻ��].equals("[ ]")) { ������[��ǻ��]= "[X]"; break; }
	
		}//Random while e
		
		
		// ���� 
			// ���η� �̱�� �� = [0 1 2 , 3 4 5 , 6 7 8]
		for ( int i = 0; i<=6; i+=3) {//for s
			if (������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2])) {
				if (!������[i].equals("[ ]")) �¸��� = ������[i];
			}
			
		}// for e 
		

			// ���η� �̱�� �� = [0 3 6 , 1 4 7 , 2 5 8]
		for ( int i = 0; i<=2; i++ ) {//for s
			if (������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6])) {
				if (!������[i].equals("[ ]")) �¸��� = ������[i];
			}
		}//for e
			
			// �밢������ �̱�� �� = [0 4 8 , 2 4 6 ]
	
			if (������ [0].equals(������[4]) && ������[4].equals(������[8])) {
				if (!������[0].equals("[ ]")) �¸��� = ������[0];			
			}
			if (������ [2].equals(������[4]) && ������[4].equals(������[6])) {
				if (!������[2].equals("[ ]")) �¸��� = ������[2];			
			}
			

		
		} //while e
	} // m e
	
}
