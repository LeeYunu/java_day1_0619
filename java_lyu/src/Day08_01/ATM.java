package Day08_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

	public static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		start();
	}
	public static ArrayList<����> ���¸�� = new ArrayList<>();
			
	
	public static void start() {
		
		while(true) {
			System.out.println(" ATM ");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.����ã�� 6.����");
			int ���� = scanner.nextInt();
			if( ���� ==1 ) {
				
				System.out.println("1.��������  2.��������");
				int ����2 = scanner.nextInt();
				
				if (����2 == 1) {
					�������� �������� = new ��������();
					��������.���µ��();					
				}//if ����-1-2 e
				
			}//if ����-1 e
			else if ( ����==2 ) {
				System.out.println("1.��������  2.��������");
				int ����2 = scanner.nextInt();
				
				if (����2 == 1) {
					�������� �������� = new ��������();
					��������.�Ա�();
				}
			}
			else if ( ����==3 ) {
				System.out.println("1.��������  2.��������");
				int ����2 = scanner.nextInt();
				
				if (����2 == 1) {
					�������� �������� = new ��������();
					��������.���();
				}
			}
			else if ( ����==4 ) {
				System.out.println("1.��������  2.��������");
				int ����2 = scanner.nextInt();
				
				if (����2 == 1) {
					�������� �������� = new ��������();
					��������.��ü();
				}
				
			}
			else if ( ����==5 ) {}
			else if ( ����==6 ) {
				System.err.println("[[[[����]]]]");
				break;
			}
			else {
				System.out.println("�� �� ���� ����Դϴ�.");
				
			}
			
		}//while e
	}//start e	
}// class e
