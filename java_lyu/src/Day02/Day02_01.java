package Day02;

public class Day02_01 { // cs

	public static void main(String[] args) { //main
		
		//������
		 //1. ���������
		// ���ϱ�, ���� ���ϱ� ������ ������
		// ����+���� : ���Ῥ����
		System.out.println("���ϱ�:"+(3+5));
		System.out.println("����:"+(5-3));
		System.out.println("���ϱ�:" + (5*3));
		System.out.println("������:"+5/3);
		System.out.println("������"+(5%3));
		
		
		// 2. �񱳿����� [��� : true / false]
		// > : �ʰ�
		// => (x)
		// >= �̻�
		System.out.println("�ʰ�:" + (5>3));
		System.out.println("�̻�:" + (5>=3));
		System.out.println("�̸�:" + (5<3));
		System.out.println("����:" + (5<=3));
		System.out.println("����:" + (5==3));
		System.out.println("�����ʴ�:" + (5!=3));
		
		
		System.out.println(3 + "�� Ȧ���̴�" + ((3%2) == 1) );
		System.out.println(3 + "�� ¦���̴�" + ((3%2) != 1) );
		
		
		System.out.println(36 + "��" + 3 + "�� ����̴�" + ((36%3) ==  0));
		
		
		// Ȧ��/¦�� �Ǵ�
			// �� % 2 == 0 : ������ 0�̸� ���� ¦��
			// �� % 2 == 1 : ������ 1�̸� ���� Ȧ��
		// ��� �Ǵ�
			// �� % �� == 0 : �������� 0�̸� �ش� ���� �� ���� ���
		
		// 3. �� ������ 2�� �̻��� ���
		//system.out~~ ( 1 < 3 < 5) = X
		
		
		// ���� ������ [ �� �������� 2�� �̻��� ��쿡]
		//System.out.println("and:" + (1<3 %% 3<5));
		// and : && : �ѱ۵� �Ҿ���� �����
		//System.out.println("and :") +(1<3 && 3<5);
		//System.out.println("or", (1<3 || 3<2); );
		//System.out.println(����:!:true => false);
		
		// 4. ���Կ�����
			// = ���� [ �����ʰ� => �������� ����
			// += [������ ���� ���ʿ� ���� �Ŀ� ���ʿ� ����
			// -= *= /= ���
		
	//	int a = 10;
	//	a +=10;
	
		//5. ���������� 
		// ++ : 1����  -> ++���� ��������:�ܵ��� ��
		// -- : 1����
		
		//System.out.println(++a ); //��� �� ����
		//System.out.println(a++ ); //��� �� ����
	
		//System.out.println( -- a ); //����� ����

		
		
		// * ����3  3. 365,420���� ���� �� ����
		
		
		
		//���� : �޸� [������ �����]
		int �ݾ� = 365420;
	
		System.out.println("�ʸ���:"+ (�ݾ�/100000) + "��");
		System.out.println("����:" + ((�ݾ�%100000)/10000) + "��");
		System.out.println("õ��:" + ((�ݾ�%10000)/1000) + "��");
		System.out.println("���:" + ((�ݾ�%1000)/100) + "��");
		
		
	} // me
	
	
} // ce
