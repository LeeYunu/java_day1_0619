package Day08_01;

public class ���� {

	private String ���¹�ȣ;
	private int ��й�ȣ;
	private String ������;
	private int �ݾ�;
	
	
	public ����() {
	}


	public ����(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = �ݾ�;
	}
	
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = 0;
	}
	
	
	//0. get, set �޼ҵ� - �ߺ�üũ�� ���ؼ�
	public String get���¹�ȣ() {
		return this.���¹�ȣ;
	}
	
	public int get��й�ȣ() {
		return this.��й�ȣ;
	}
	public void �Ա�ó��(int �Աݾ�) {
		this.�ݾ� += �Աݾ�;
		System.err.println("�ԱݿϷ�");
	}
	public void ���ó��(int ��ݾ�) {
		if(this.�ݾ� < ��ݾ�) {
			System.err.println("�ܾ׺���");
			return;
		}
		
		this.�ݾ� -= ��ݾ�;
		System.err.println("��ݿϷ�");
	}

	
	
	//1. ���µ�� �޼ҵ�
	public void ���µ��() {
		
		System.out.println("���� ��� ȭ��");
		System.out.println("���� ��ȣ : ");
			String ���¹�ȣ = ATM.scanner.next();
		System.out.println("��й�ȣ: ");
			int ��й�ȣ = ATM.scanner.nextInt();
		System.out.println("���º�: ");
			String ������ = ATM.scanner.next();
			
			���� ���� = new ����(���¹�ȣ, ��й�ȣ, ������);
		
			ATM.���¸��.add(����);
	}

	
	//2. �Ա� �޼ҵ�
	public void �Ա�() {
		
		System.out.println("�Ա� ��� ȭ��");
		System.out.println("���� ��ȣ : ");
			String ���¹�ȣ = ATM.scanner.next();
		System.out.println("��й�ȣ: ");
			int ��й�ȣ = ATM.scanner.nextInt();
		System.out.println("�Աݾ�: ");
			int �Աݾ� = ATM.scanner.nextInt();
	
			for ( ���� temp : ATM.���¸��) {
				if ( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
					temp.�Ա�ó��(�Աݾ�);
					return;
				}
			}
			System.err.println("������ ���� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
			
	}
	
	//3. ��� �޼ҵ�
		public void ���() {
			
			System.out.println("�Ա� ��� ȭ��");
			System.out.println("���� ��ȣ : ");
				String ���¹�ȣ = ATM.scanner.next();
			System.out.println("��й�ȣ: ");
				int ��й�ȣ = ATM.scanner.nextInt();
			System.out.println("��ݾ�: ");
				int ��ݾ� = ATM.scanner.nextInt();
		
			for ( ���� temp : ATM.���¸��) {
				if ( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
					temp.���ó��(��ݾ�);
					return;
				}
			}	
			System.err.println("������ ���� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
			
		}
		

		//4. ��ü �޼ҵ�
			public void ��ü() {
				
				System.out.println("�Ա� ��� ȭ��");
				System.out.println("���� ��ȣ : ");
					String ���¹�ȣ = ATM.scanner.next();
				System.out.println("��й�ȣ: ");
					int ��й�ȣ = ATM.scanner.nextInt();
					for ( ���� temp : ATM.���¸��) {
						if ( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
					
							System.out.println("��ü��: ");
							int ��ü�� = ATM.scanner.nextInt();
							if(temp.�ݾ� < ��ü��) {
								System.err.println("�ݾ��� �����մϴ�");
								return;
							}
				System.out.println("�޴� ��� ���¹�ȣ:");
				String ���¹�ȣ2 = ATM.scanner.next();
							for(���� temp2: ATM.���¸��) {
								if (temp2.���¹�ȣ.equals(���¹�ȣ2)) {
										System.out.println("Ȯ��: �޴»��" + temp2.������);
										temp.�ݾ� += ��ü��;
										System.out.println("��üó�� �Ϸ�");
										return;
								}
							}
						}
					}
				System.err.println("������ ���� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
				
			}
}
