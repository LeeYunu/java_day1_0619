package Day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Member {

	// �ʵ�
	
	String ���̵�;
	String ��й�ȣ;
	String �̸�;
	int ����;
	int �޴���ȭ;
	String �̸���;
	int ����Ʈ;
	String ���;
	
	//������
	
	public Member() {
	}
	
	// 2. ��ü �ʵ带 ���� ������
		// ������ Ŭ�� => source => generate constructors
	public Member(String ���̵�, String ��й�ȣ, String �̸�, int ����, int �޴���ȭ, String �̸���, int ����Ʈ, String ���) {
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.���� = ����;
		this.�޴���ȭ = �޴���ȭ;
		this.�̸��� = �̸���;
		this.����Ʈ = ����Ʈ;
		this.��� = ���;
	}
	// 3. ȸ������ �ʼ��� ���� ������

	public Member(String ���̵�, String ��й�ȣ, String �̸�, int ����, int �޴���ȭ) {
		super();
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.���� = ����;
		this.�޴���ȭ = �޴���ȭ;
		this.����Ʈ = 0;
		this.��� = "�Ϲ�";
	}
	
	
	// �޼ҵ� [�ൿ]
	
	//1. ȸ������ �޼ҵ�
	public void ȸ������() {
		
		System.out.println(" ȸ������ ȭ��");
		System.out.println("���̵�: "); String ���̵� = Day07_02_start.scanner.next();
			//���̵� �ߺ� üũ
			for (int i = 0; i <Day07_02_start.members.size(); i++) {
				Member temp = Day07_02_start.members.get(i);
						//i��° ȸ���� temp�� �ӽ� ����
				if (temp.���̵�.equals(���̵�)){
					System.out.println("���̵� �̹� �����մϴ�");
					return; //�޼ҵ� ���� : �޼ҵ� ��ȯ : ��ȯ ������ ����
				}//if e
			}// for e
			
		
		System.out.println("��й�ȣ: "); String ��й�ȣ = Day07_02_start.scanner.next();
		System.out.println("�̸�: "); String �̸� = Day07_02_start.scanner.next();
		System.out.println("����/ ����:1 ����:2 ���þ���:3 "); int ���� = Day07_02_start.scanner.nextInt();
		System.out.println("�޴���ȭ: [-] ���� "); int �޴���ȭ = Day07_02_start.scanner.nextInt();
		
		// ��ü �����
		Member member = new Member(���̵�, ��й�ȣ, �̸�, ����, �޴���ȭ); 
		// ����Ʈ Ȥ�� �迭 ����
		Day07_02_start.members.add(member);
		System.out.println("ȸ������ ����");
		//����ó��
		try {
			FileOutputStream fileOutputSteram = new FileOutputStream("c:/java/memberlist.txt");
			// ����Ʈ �� ��� ȸ���� ���Ͽ� ����
			// ����Ʈ�� for�� Ȱ��
			for (Member temp : Day07_02_start.members ) {
				// for ( �ӽ� ��ü�� : ����Ʈ��) : ����Ʈ�� ��� ��ü�� �ӽð�ü
				// ȸ�������� �ϳ��� ���ڿ� ��ȯ [ �ʵ� ����, // ȸ�� [��ü] ���� \n]
				String ȸ������ = temp.���̵�+","+temp.��й�ȣ+","
				+temp.�̸�+","+temp.����+","+temp.�̸���+","+temp.����Ʈ+","+temp.���+"\n";
				
				fileOutputSteram.write(ȸ������.getBytes());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}//p ȸ������ e
	
	//2. �α��� �޼ҵ�
	public void �α���() {}
	//3. ���̵� ã�� �޼ҵ�
	public void ���̵�ã��() {}
	//4. ��й�ȣ ã�� �޼ҵ�
	public void ��й�ȣã��() {}
	//5. ����Ʈ ���� �޼ҵ�
	public void ����Ʈ����() {}
	//6. ��� ���� �޼ҵ�
	public void �������() {}
	//7. ȸ��Ż�� �޼ҵ�
	public void ȸ��Ż��() {}
	//8. ȸ������ �޼ҵ�
	public void ȸ������() {}
	
}
