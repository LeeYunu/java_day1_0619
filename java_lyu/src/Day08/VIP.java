package Day08;

public class VIP extends ȸ�� {

	String ȸ�����;
	
	
	
	public VIP() {
		super();
	}



	public VIP(String ���̵�, String ��й�ȣ, String ȸ�����) {
		super(���̵�, ��й�ȣ);
		this.ȸ����� = ȸ�����;
	}
	
	@Override
	public void ȸ������() {
		super.ȸ������();
		System.out.println("ȸ������� " + this.ȸ����� + "�Դϴ�.");
	}
	
	
}
