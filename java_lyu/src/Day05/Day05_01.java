package Day05;

public class Day05_01 {

	public static void main(String[] args) { //m s
		
		// ��� : if[��(t/f)����] , switch[ ������ �˻�]
			// if : ����Ǽ��� ���������� ���� ���
				// true �̸� ��� ���๮�� ����
			// switch: ����� ���� �������ִ� ��� [ �ӵ� ����]
				// case�� �˻� �� �Ʒ� ��� case�� ó���Ѵ� => break ���; [ �ݺ��� Ȥ�� switch Ż�� ]

		switch (5) { // sw s
		
		case 5 : System.out.println("5�Դϴ�");
		case 3 : System.out.println("3�Դϴ�");
			} //sw e
		
		
		///////////////////////////////////////////////////////////////
		
		
		int ��ȣ = 3;
		if (��ȣ == 1) System.out.println("1�Դϴ�");
		else if (��ȣ ==2 ) System.out.println("2�Դϴ�");
		else if (��ȣ ==3 ) System.out.println("3�Դϴ�");
		
		
		
		switch (��ȣ) { //sw2 s
		case 1 : System.out.println("1�Դϴ�");
		case 2 : System.out.println("2�Դϴ�");
		case 3 : System.out.println("3�Դϴ�");
		}//sw 2 e
		
///////////////////////////////////////////////////////////////////////////////////////		
		
		
		int ���� = 80;
		switch(����) {
			case 90 : System.out.println("A Grade"); break;
			case 80 : System.out.println("B Grade"); break;
			case 70 : System.out.println("C Grade"); break;
			default : System.out.println("Ż��"); break;
		}
		
///////////////////////////////////////////////////////////////////////////////////////
		int ����1 = 80; int ����2 = 90; int ����3 = 100;
		
		 // �� ���� �� ����� ��� ��: 90 ���̻��̸� A��� 80�� �̻��̸� B ��� 70�� �̻��̸� C��� �� �� Ż��
		
		int ���;
		
		��� = (����1 + ����2 + ����3)/3;
		
		switch(���/10){
			case 9 : System.out.println("A Grade"); break;
			case 8 : System.out.println("B Grade"); break;
			case 7 : System.out.println("C Grade"); break;
			default : System.out.println("Ż��"); break;
	
		}
		
///////////////////////////////////////////////////////////////////////////////////////

	

		
	} //m e
	
	
}
