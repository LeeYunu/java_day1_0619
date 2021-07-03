package Day05;

import java.util.Scanner;
import java.util.Random;

public class Day05_로또 {

	public static void main(String[] args) {// ms
		
		
		// 1. 6개 숫자 입력받아 배열 저장
		// 2. 6개 숫자를 난수 생성해서 배열 저장
		// 3. 두 배열을 비교해서 동일한 숫자 개수
		
		
		// 1. 로또 번호 배열
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int [] 당첨 = new int [6];

		
		int [] 로또 = new int [6];
	
		
		for (int i = 0 ; i < 6 ; i ++) { // for s
			System.out.println((i+1) + "번째 숫자 입력 : ");
			
			int 번호 = scanner.nextInt();
			if ( 번호 <= 0 || 번호 > 45) {
				System.out.println("숫자를 다시 입력하세요");
				i--; //무조건 증가하므로 감소 필요
			}
			else { // else s
				int 중복체크 = 0; // for 문 밖 중복체크 /안할시에 오류 발생
				for (int j=0; j < 6; j++) { // else for s
					if (로또[j] == 번호) {//else if s
						System.out.println("중복된 숫자입니다");
						i--;
						
						중복체크 = 1; 
						
					} // else if e
					
				} // else for e
							
				if ( 중복체크 == 0 ) 로또[i] = 번호;
				
			} // else e
		
		}// for e
		
		
		System.out.print("당첨번호: ");
		
		for (int i = 0; i <6; i++) {//for s
			int 당첨값 = random.nextInt(45)+1;
			int 중복체크 = 0; // for 문 밖 중복체크 /안할시에 오류 발생
			for (int j=0; j < 6; j++) { //  for2 s
				if (당첨[j] == 당첨값) {// if2 s
					중복체크 = 1;
					i--;
				} // if 2 e
			}//  for2 e
			
			if (중복체크 == 0) {//중복 if s
			당첨 [i] = 당첨값;
			}//중복 if e
			
			System.out.print(당첨값 + " ");
		}//for e
		
		int 당첨개수 = 0;
		
		for (int i = 0 ; i<6 ; i++) {// for i s
				for (int j = 0 ; j<6 ; j++) { // for j s 
				if (당첨[j] == 로또[j]) {// if s
					당첨개수++;
				}// if e
			}//for j e
			
		}//for i e 
		System.out.println("당첨개수 : " + 당첨개수);
		
		if (당첨개수 == 6) {
			System.out.println("1등 당첨입니다.");
		}

		else if (당첨개수 ==5) {
			System.out.println("2등 당첨입니다.");
					}
		
	}//m e
}
