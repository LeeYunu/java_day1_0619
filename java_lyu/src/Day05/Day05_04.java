package Day05;

public class Day05_04 {

	public static void main(String[] args) {//ms
		
		// 2���� �迭 [���ε���][���ε���]
		
			// �� : ���� : row
			// �� : ���� : column
			
		
		
		int [][] �迭2 = new int[2][3];
		int [][] �迭3 = { {10, 20 , 30} , {40, 50 ,60}};
		
		�迭2[0][0] = 80;
		�迭2[0][1] = 90;
		�迭2[0][2] = 100;
		
		�迭2[1][0]= 40;
		�迭2[1][1]= 50;
		�迭2[1][2]= 60;
		
		System.out.println("2���� �迭 ȣ��: " + �迭2[0][0]);
		System.out.println("2���� �迭 ȣ��: " + �迭2[1][0]);
		System.out.println("2���� �迭 ȣ��: " + �迭2[0][1]);
		System.out.println("2���� �迭 ȣ��: " + �迭2[0][2]);
		System.out.println("2���� �迭 ȣ��: " + �迭2[1][1]);
		
	
		// ����2 : 0~49 ���� ù��° �� ���� 50~99 ������ �ι�° �� �����ϴ� 2���� �迭 �����ϰ� ���		
		
		
		int [][] �迭4 = new int [2][50];
		
		for (int i=0; i<100; i++) {
	
			if (i < 50) �迭4[0][i] = i;
			else �迭4[1][i-50] = i;

		}
		
		for (int i=0; i<100; i++) {
			if  (i < 50) System.out.print(�迭4[0][i]+"\t");
			else System.out.print(�迭4[1][i-50]+ "\t");
			
			if ( i == 49 ) System.out.println();
		}
		
		
		
		
		
	}//me
	
}
