package Day05;

public class Day05_02 {

	
	public static void main(String[] args) { //m s
		
		// �ݺ��� : while, for 
			//for: �ڵ� ����
			// while : ���ѷ��� => while(true) {} => [���ѷ���]
		for (int i = 0; i<10; i++) { System.out.print( i + "\t");};
		System.out.println();
	////////////////////////////////////////////////////////////////////////////////////////	
		
			int i =0;
			while  ( i <10) {  // while s
				System.out.print( i + "\t");
				i++;
			}// while e
				
		int j = 0;
		while (true) { // while (���ǹ�)
		System.out.println("���ѹݺ�" + j );
		if ( j == 10 ) break;
		j++;
		}
		
	} // m e
	
}
