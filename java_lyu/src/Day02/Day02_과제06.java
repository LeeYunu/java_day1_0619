package Day02;

import java.util.Scanner;


public class Day02_����06 { //cs

	public static void main (String[] args) { //ws
	
		Scanner �Է°�ü = new Scanner (System .in);
		
		System.out.println("ù��° ������ �Է��Ͻÿ�"); int ù��°���� = �Է°�ü .nextInt();
		System.out.println("�ι�° ������ �Է��Ͻÿ�"); int �ι�°���� = �Է°�ü .nextInt();

		if (ù��°���� > �ι�°����) {
		System.out.println( ù��°���� + "�� �� Ů�ϴ�.");
		}
		else if (�ι�°���� > ù��°����) {
			System.out.println(�ι�°���� + "�� �� Ů�ϴ�.");
			
		}
		else {
			System.out.println("�������� �����ϴ�");
		}
	
	} // we
} //ce