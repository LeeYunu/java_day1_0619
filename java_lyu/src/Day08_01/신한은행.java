package Day08_01;

public class �������� extends ���� {

	public ��������() {
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		super(���¹�ȣ, ��й�ȣ, ������, �ݾ�);		
	}

	
	
	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������) {
		super(���¹�ȣ, ��й�ȣ, ������);		
	}

	
	public void ���µ��() {
		System.out.println("��������");
		System.out.println("���� ��� ȭ��");
		System.out.println("���� ��ȣ : "); //���� : �ߺ�����
			String ���¹�ȣ = ATM.scanner.next();
			for (���� temp : ATM.���¸��) {
				// for(�ӽð�ü : ����Ʈ��) ����Ʈ �� ��� ��ü�� �ϳ��� �ӽð�ü�� ����
				if (temp.get���¹�ȣ().equals(���¹�ȣ)) {
					System.err.println("�ߺ��� ��ȣ");
					return;
				}//if e
			}// for e
			
			
		System.out.println("��й�ȣ: "); //���� : 4���� ����
			int ��й�ȣ = ATM.scanner.nextInt();
			String s��й�ȣ = Integer.toString(��й�ȣ);
							//Integer.toString(����) => ���ڿ��� ���ڿ���
			if(s��й�ȣ.length() != 4) {
				System.err.println("4�ڸ��� �Է��ϼ���");
				return;
			}
			
			
		System.out.println("������: ");	
			String ������ = ATM.scanner.next();
			
			�������� temp = new ��������(���¹�ȣ, ��й�ȣ, ������);
		
			ATM.���¸��.add(temp);
		
	}
	
	@Override
	public void �Ա�() {
		System.out.println("�������� �Ա� ȭ��");
		super.�Ա�();
	}

	@Override
	public void ���() {
		System.out.println("�������� ��� ȭ��");
		super.���();
	}
	
	
	
}
