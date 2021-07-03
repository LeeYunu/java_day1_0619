package Day05;

public class Day05_04 {

	public static void main(String[] args) {//ms
		
		// 2차원 배열 [행인덱스][열인덱스]
		
			// 행 : 가로 : row
			// 열 : 세로 : column
			
		
		
		int [][] 배열2 = new int[2][3];
		int [][] 배열3 = { {10, 20 , 30} , {40, 50 ,60}};
		
		배열2[0][0] = 80;
		배열2[0][1] = 90;
		배열2[0][2] = 100;
		
		배열2[1][0]= 40;
		배열2[1][1]= 50;
		배열2[1][2]= 60;
		
		System.out.println("2차원 배열 호출: " + 배열2[0][0]);
		System.out.println("2차원 배열 호출: " + 배열2[1][0]);
		System.out.println("2차원 배열 호출: " + 배열2[0][1]);
		System.out.println("2차원 배열 호출: " + 배열2[0][2]);
		System.out.println("2차원 배열 호출: " + 배열2[1][1]);
		
	
		// 문제2 : 0~49 까지 첫번째 행 저장 50~99 까지는 두번째 행 저장하는 2차원 배열 선언하고 출력		
		
		
		int [][] 배열4 = new int [2][50];
		
		for (int i=0; i<100; i++) {
	
			if (i < 50) 배열4[0][i] = i;
			else 배열4[1][i-50] = i;

		}
		
		for (int i=0; i<100; i++) {
			if  (i < 50) System.out.print(배열4[0][i]+"\t");
			else System.out.print(배열4[1][i-50]+ "\t");
			
			if ( i == 49 ) System.out.println();
		}
		
		
		
		
		
	}//me
	
}
