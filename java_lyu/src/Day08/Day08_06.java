package Day08;

import java.util.ArrayList;

public class Day08_06 {

	public static void main(String[] args) {
		
		ȸ�� ����1 = new ȸ��("qwe", "qwe");
		VIP ����2 = new VIP("ads", "asd", "���");
		������ ����3 = new ������("eee", "eee", "�븮");
		
		����1.ȸ������();
		System.out.println("--------");
		����2.ȸ������();
		System.out.println("--------");
		����3.ȸ������();
		
		// ����Ʈ��
		ArrayList<ȸ��> ȸ����� = new ArrayList<>(); // ����Ŭ���� ����Ʈ
		ArrayList<VIP> VIP��� = new ArrayList<>(); // ����Ŭ���� ����Ʈ
		ArrayList<������> �����ڸ�� = new ArrayList<>(); // ����Ŭ���� ����Ʈ
		
		ȸ�����.add(����1);
		ȸ�����.add(����2);
		ȸ�����.add(����3);
			ȸ�����.get(0).ȸ������();
			ȸ�����.get(1).ȸ������();
			ȸ�����.get(2).ȸ������();
		System.out.println("========");
			// vip���.add(����1); ����Ŭ������ ���� ���� ����
		VIP���.add(����2);
			// vip���.add(����3); �ٸ� ����Ŭ������ ���� �� ����
		System.out.println("========");
		�����ڸ��.add(����3);
		
		// * ��ӹ޾��� �� ����Ʈ
			// 1. ����Ʈ�� ���� ����Ŭ������ ����� ����Ʈ�� ����Ŭ������ ���� �� �ִ�
			// 2. ����Ŭ���� ����� ����Ʈ�� ����Ŭ������ ���� �� ����
			// 
		
		
	}// main e
	
}// class e
