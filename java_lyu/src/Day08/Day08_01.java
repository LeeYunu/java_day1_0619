package Day08;

public class Day08_01 {

	
	// ���� ������
		// 1. ������ ��ȣ [�ʵ� ��ȣ]	= private
		// 2. private �ʵ忡 ������ ��� => �޼ҵ� ���
			// get �޼ҵ�, set �޼ҵ�
	
	
	
	public int ���� =10;
	protected int ����2 = 20;
	int ����3 = 30;
	private int ����4 = 40;
	
	
	
	public static void main(String[] args) {
		
		// public        : ������Ʈ �� ��� ������ ȣ�� ����
		// protected     : ������ ��Ű�� �������� ���� ����
						// ����Ŭ������ �ٸ�Ŭ������ �θ�Ŭ������ �ִ� ��� ����
		// default[����]   : ������ ��Ű���������� ���� ����
		// private       : ���� Ŭ���������� ���� ����
		
		Day08_01 day08_01 = new Day08_01();
		System.out.println( day08_01.���� );
		System.out.println( day08_01.����2 );
		System.out.println( day08_01.����3 );
		System.out.println( day08_01.����4 );
		
		
		
	}
	
}
