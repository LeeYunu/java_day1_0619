package Day04;

import java.util.Scanner;


public class Day04_03 {//cs

	public static void main(String[] args) {//ws
		
		 Scanner 입력객체 = new Scanner(System.in);
		 
		 // 입력한 줄만큼 별 출력

		 System.out.println("별의 개수 입력:"); int 별 = 입력객체.nextInt();
		for (int i = 1; i <= 별 ; i++){ 
			 System.out.print("\n");
			for (int j = 1 ; j <= i ; j ++)
			
				System.out.print("*"); 
				
		} 	 System.out.print("\n");

		//반대로
		
		 System.out.println("별의 개수 입력:"); int 별2 = 입력객체.nextInt();
			for (int i = 1; i <= 별2 ; i++){ 
				 System.out.print("\n");
				for (int j = 별2 ; j >= i ; j--)
					System.out.print("*"); 	
			} 

		
		
		
		
	} //we	
}//ce