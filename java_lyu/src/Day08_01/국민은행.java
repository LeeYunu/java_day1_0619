package Day08_01;

public class �������� extends ���� {

	private final int �����ڵ� = 20;
	
	public ��������() {
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		super(���¹�ȣ, ��й�ȣ, ������, �ݾ�);		
	}

	
	
	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������) {
		super(���¹�ȣ, ��й�ȣ, ������);		
	}

	
	public void ���µ��(int �����ڵ�) {
		System.out.println("��������");
		System.out.println("���� ��� ȭ��");
		System.out.println("���� ��ȣ : ");
			String ���¹�ȣ = ATM.scanner.next();
		System.out.println("��й�ȣ: ");
			int ��й�ȣ = ATM.scanner.nextInt();
		System.out.println("���º�: ");
			String ������ = ATM.scanner.next();
			
			�������� temp = new ��������(���¹�ȣ, ��й�ȣ, ������);
		
			ATM.���¸��.add(temp);
	}
	
	
	
	
}
