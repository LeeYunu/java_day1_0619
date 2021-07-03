package Day05;

public class Day05_02 {

	
	public static void main(String[] args) { //m s
		
		// 반복문 : while, for 
			//for: 코드 간결
			// while : 무한루프 => while(true) {} => [무한루프]
		for (int i = 0; i<10; i++) { System.out.print( i + "\t");};
		System.out.println();
	////////////////////////////////////////////////////////////////////////////////////////	
		
			int i =0;
			while  ( i <10) {  // while s
				System.out.print( i + "\t");
				i++;
			}// while e
				
		int j = 0;
		while (true) { // while (조건문)
		System.out.println("무한반복" + j );
		if ( j == 10 ) break;
		j++;
		}
		
	} // m e
	
}
