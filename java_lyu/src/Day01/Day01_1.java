package Day01;

public class Day01_1 {// c s

		//Object Ŭ�����κ��� ������ ���� ����
			// ��� Ŭ������ object�κ��� ���۵ȴ�
				// 100% Ŭ���� ����̴� ==100% ��ü���� ���
	
	
		// {} �ȿ� ���Ե� �ڵ� tab [�鿩����]
		//main �Լ�(�޼ҵ�)
			// ctrl + �����̽���: �ڵ��ϼ�
	public static void main(String[] args) { // m s
		
				// main �޼ҵ�: main �����带 ������ ����
		 			// ������: ���μ����� �ڵ带 �о��ִ� ������ ����
						// main {} �ۿ� �ڵ�� ����X
		// ���
			// 1. Ŭ������ ù���� "������" �빮��
			// 2. �޴� => run => run [ Crtl+F11 ]
		System.out.println("java");
			// System : �ý��� ���� [ ����� ] Ŭ����
				// . : Ŭ���� �� �ɹ� ���� ������ [ + - * / = Ư������]
					// out:  ��� ���� ��Ʈ��
						//println("��³���") : ��� �޼ҵ�(�Լ�)
							// ; : �ڵ� ������ ��
		
		// ����1 : println [�ڵ� �ٹٲ� ����]
			// " " => ? 
				// ��ǻ�� ���� : 0,1 [����]
				// " " ����ó�� : Ű����[�̸� ������� �ܾ�/����]�� ������ ��� ����
		System.out.println(7); // ������ ���� ó�� X
		System.out.println("java"); // ���ڿ��� ����ó��O
		System.out.println("java7"); // ���ڼ��� ����ó��O
		
		// ����2 : print [�ڵ� �ٹٲ� ���� X ]
		System.out.print(7);
		System.out.print("java");
		System.out.println("java7");
		
		// ����3 : printf [ ����=����=���²ٹ̱�=format ��� ]
		System.out.printf("%d", 7);
		System.out.printf("%s", "java");
		System.out.printf("%s", "java7");
			//���� ����
				// %d : ����
				// %f : �Ǽ�
				// %s : ���ڿ�
				// %c : ����
		
		// ���� 4 : print, printf ����
		System.out.println("java"+7+"�Դϴ�");
				// + ���ϱ� ������ : ���� + ���� ���
				// + ���� ������ : ���� + ���� ��� Ȥ�� ���� + ����
		System.out.printf("%s%d%s", "java", 7 , "�Դϴ�");
		System.out.printf("java%d�Դϴ�", 7);
			// ���� ����
				// \: ��ȭ��ȣ
				// \n : �ٹٲ�
				// \t : �鿩����
				// \r : ���� [�����ΰ���]
				// \\ : \
				// \" : "
		
		// ���� 5 : �����
		System.out.print("\n7"+"\n"+"java\njava7");
		System.out.println("\t"+7+"\t"+"java\tjava7\n\n");
		
		
		// ���� 1: println
		// ��°��
		/*  
				==================�⼮��==================
				�̸�			1����			2����			3����
				���缮		�⼮			�⼮			�⼮
				��ȣ��		�⼮			�⼮			�⼮
		 */
		
		System.out.println("\t=============�⼮��=============");
		System.out.println("\t�̸�\t1����\t2����\t3����");
		System.out.println("\t���缮\t�⼮\t�Ἦ\t�⼮");
		System.out.println("\t��ȣ��\t�Ἦ\t�⼮\t�⼮");
		System.out.println("\t===============================");
		
		// ��Ŭ������ ȭ�� Ȯ��/��� : ctrl + shift + "+" or "-"
		// ȭ����� : crtl + [
		
		
		//���� 2: ����1���� printf ��
			
		System.out.printf("=============%s=============\n", "�⼮��");
		System.out.printf("%s\t%s\t%s\t%s\n", "�̸�", "1����", "2����", "3����");
		System.out.printf("%s\t%s\t%s\t%s\n", "���缮", "�⼮", "�Ἦ", "�⼮");
		System.out.printf("%s\t%s\t%s\t%s\n", "��ȣ��", "�⼮", "�Ἦ", "�⼮");
		System.out.printf("===============================");
		
		
		
		
		
	} // m e
	
} // c e
