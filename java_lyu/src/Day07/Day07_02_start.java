package Day07;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Day07_02_start {

	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Member> members = new ArrayList<>();
	
	public static void main(String[] args) {
		
		���α׷�����();
		
	} // m e
	
	public static void ���α׷�����() {
		// static : �������� : ���α׷� ���۽� �޸� �Ҵ�ǰ� ��� ���α׷� ����� �޸� �ʱ�ȭ
		 	// ���� : �޸� ȿ�� ���� [ ��� Ŭ������ ���Ǵ� �޸� ����]
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:/java/memberlist.txt");
			byte[] ����Ʈ = new byte[10000]; // ��ü �Ѹ�� 100����Ʈ ����
			
			fileInputStream.read(����Ʈ);		
			String ���ȸ�� = new String(����Ʈ); // ����Ʈ => ���ڿ�
			// ȸ���� ����
			String[] ȸ�� = ���ȸ��.split("\n");
				// ���ڿ�.split("��ȣ") : �ش� ��ȣ�� ����
			// ȸ�� ������ ����
			for (int i = 0; i < ȸ��.length-1 ; i ++) {
				
				String[] ���� = ȸ��[i].split(",");
				Member member = new Member(����[0], ����[1], ����[2], Integer.parseInt(����[3]), 
						 Integer.parseInt(����[4]),  ����[5],  Integer.parseInt(����[6]), ����[7]);
					//���ڿ� String => ������ int 
					//Integer.parseInt(���ڿ�)
				
				
			}
			
			
			System.out.println( new String(����Ʈ));	
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		while (true) {
			System.out.println("ȸ�� Ŀ�´�Ƽ");
			System.out.println("1.�α��� 2.ȸ������ 3. ���̵�ã�� 4. ��й�ȣã�� 5. ���α׷� ����");
			System.out.println(" ����: "); int ���� = scanner.nextInt();
			
			Member member = new Member();
			
			if (����==1) {}
			else if (���� == 2) {
				member.ȸ������();
				
			}
			else if (���� == 3) {}
			else if (���� == 4) {}
			else if (���� ==5) {
				System.out.println("\n [����] �̿����ּż� �����մϴ�");
			}
			else {}
			
			
		}
		
	} // ���� e

}
