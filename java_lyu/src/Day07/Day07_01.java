package Day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Day07_01 {

	// �޸� ���� ���
		// 1. ���� : �ڷ��� [ �޸� ũ�Ⱑ ������] �� �̿��� �޸� �Ҵ�
			// �޸� ������ �ֱ� ������ new ������ X
			//int ������ = 30;
		// 2. ��ü : Ŭ����[���赵]�� �̿��� �޸� �Ҵ�
			// �޸��� ũ�Ⱑ ������ ���� �ʱ� ������ new ������ O
		//	Scanner ��ü = new Scanner();
	
	// �޸� ���� ���	
		// 1. �迭 : ������ �ڷ���/Ŭ������ ������ �޸� ����/ ����
			//int [] �迭 = new int[30];
		// 2. ����Ʈ: ������ �ڷ��� / Ŭ������ ������ �޸𸮸� ������ �� �ִ� ��ü
			// ArrayList<Integer> ����Ʈ = new ArrayList <> ();
				// <���׸�>
	// �޸� ���� ���� ��� => �޸�(�ֱ����ġ) => ������ġ
		
	
	// Ŭ���� [ java 100% ��ü���� ]
		// 1. �ֻ��� Ŭ������ object Ŭ������ ����
			// ��� Ŭ������ object ����� �޴´�
		// ����� Ŭ���� �����
			// ��� : 1. �ʵ� 2. ������ 3. �޼ҵ�
	
	public static void main(String[] args) {
		
	// �迭[�ε���]
		String[] �迭 = new String [3];
		�迭[0] = "���缮";	 System.out.println(�迭[0]);
		�迭[1] = "��ȣ��"; System.out.println(�迭[1]);
		�迭[2] = "�ŵ���"; System.out.println(�迭[2]);
			
	// ����Ʈ
		ArrayList<String> ����Ʈ = new ArrayList<>();
		����Ʈ.add("���缮"); System.out.println(����Ʈ.get(0));
		����Ʈ.add("��ȣ��"); System.out.println(����Ʈ.get(1));
		����Ʈ.add("�ŵ���"); System.out.println(����Ʈ.get(2));
		
		
		//��ü ����� [������ �̿�]
			//1. Ŭ������ [��ü ���赵]
			//2. ��ü�� [������ ��]
			//3. new [��ü �޸� �Ҵ�] �ʼ�
			//4. ������
			// ��ü�� Ŭ������ ���[�ʵ�, �޼ҵ�]�� �����ϴ� ��� [ . ������ ]
		// 1. ������ڸ� �̿��� ��ü
		�л� temp1 = new �л�(); // ���빰 ����
		temp1.�̸� = "��ȣ��";
		temp1.���� = 30;
		// 2. ��� �ʵ带 ���� �����ڸ� �̿��� ��ü
		�л� temp2 = new �л�("���缮", 20); //���빰 ����
		
		// �޼ҵ� ȣ��
		System.out.println(temp1.�̸����());
		System.out.println(temp1.�������());
		
		//temp1.ȸ������();		
		System.out.println( temp1.�л�����(20));
		
		temp1.�л�����(20);
		
		temp1.���̾�����Ʈ(40);
		System.out.println(temp1.����);
		
		// ���� ó�� 
			// ��Ʈ�� : �ܺ���ġ�� ������ ���
				// !!! : ������ ��� ���� : ����Ʈ
					// bit [0,1] => 8bit => 1 byte
			// 1. �������� [ FileOutputStream Ŭ����]
		
		try { // try �ȿ��� ����[����] �߻��� => catch �̵� ]
				// try �ȿ��� ���ܰ����� ���� �״�� ����		
			FileOutputStream fileOutputStream = new FileOutputStream("c:/java/test.txt");
		
			String ���ڿ� = "java �Դϴ�.";
			
			fileOutputStream.write(���ڿ�.getBytes());
			//write ( ����Ʈ ) : ��� (��������) :
				// ���ڿ�.getBytes() : ���ڿ� => ����Ʈ
		} catch (Exception e) { // Exception : ��� ���� ó��
			System.out.println("���� ��ΰ� �������� �ʽ��ϴ�.");			
	
		}
				// ����ó�� : ���� �߻��� => ���� ó�� ����� ��
				
		
		
			// 2. �о����
		try {
			FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");
			byte[] ����Ʈ = new byte[1024]; // 1024 byte = > 1kbyte
			fileInputStream.read(����Ʈ); // 
			// read: ���� ��Ʈ�� �о���� => ����Ʈ �迭�� ����
			
			System.out.println( new String(����Ʈ));
				//new String (����Ʈ) = ����Ʈ => ���ڿ�
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		// ��Ʈ���� �̵����� ����Ʈ
		
		
	}// me
				
}
