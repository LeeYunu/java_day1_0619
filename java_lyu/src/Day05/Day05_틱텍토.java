package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_틱텍토 {

	public static void main(String[] args) { //m s

	
		Scanner scanner = new Scanner(System.in);
		

		//판 생성 = 문자 9개를 저장할 수 있는 배열
		String [] 게임판 = { "[ ]" , "[ ]" , "[ ]" , 
							"[ ]", "[ ]" , "[ ]" , 
							"[ ]" , "[ ]" , "[ ]" };
		
		String 승리자 = " "; // 승리 알을 저장하기 위한 변수 
		
		
		while (true) {//while s 게임 전체의 무한루프 [ 모든 알을 두었을 때. 승리자가 나왔을 경우 종료가 되야함]
		// 게임판 출력
			for (int i = 0 ; i< 게임판.length ; i++) {
			// 3개씩 출력 
			System.out.print(게임판[i]);
			if (i%3 == 2) System.out.println();
		}
			
			if (승리자.equals("[O]")) {
				System.out.println("\n플레이어가 승리했습니다.");
				break;
			}
			if (승리자.equals("[X]")) {
				System.err.println("\n컴퓨터가 승리했습니다.");
				break;
			}

	
		// 플레이어 = O , 컴퓨터 = X / 플레이어에 입력받아 해당 위치에 알 두기
		
		
		System.out.println("[선택] 위치 : ");
		
		//종료
		
		
		
		
		while (true) { // while 2 s
			int 플레이어 = scanner.nextInt(); //인덱스 
				if (플레이어 < 0 || 플레이어 > 8 ) System.out.println("[경고] 다시 입력하세요.");
				else if ( !게임판 [플레이어].equals("[ ]")) {//else if s
						System.out.println("이미 칸이 채워져있습니다.");
						System.out.println("[재선택] 위치: ");
				} //else if e
				else { //else s
						게임판[플레이어] = "[O]";  // 입력받은 인덱스에 알 바꾸기
						break;
				} // else e
				
				
		} // while 2 e
		
		

		int 현재알수 = 0;
		for ( int i = 0; i<9; i++) {
			if (!게임판[i].equals("[ ]")) 현재알수++;
		}
		if ( 현재알수 == 9) {
			for (int i = 0 ; i< 게임판.length ; i++) {
				// 3개씩 출력 
				System.out.print(게임판[i]);
				if (i%3 == 2) System.out.println();
			}
			
			System.out.println("[게임종료] : 무승부");
			break;
			
		}
		
		
		// 컴퓨터 [ 난수 생성해서 알 두기]
			// 난수 생성 클라스 = Random
			
		while (true) {//Random while s
		Random random = new Random();
			int 컴퓨터 = random.nextInt(9);
				// random.nextInt(); : 0~20억
				// random.nextInt(10); : 0~9
				// random.nextInt(마지막번호)+시작번호;
				// random.nextInt(10)+10; : 10~19
			if (게임판[컴퓨터].equals("[ ]")) { 게임판[컴퓨터]= "[X]"; break; }
	
		}//Random while e
		
		
		// 승패 
			// 가로로 이기는 수 = [0 1 2 , 3 4 5 , 6 7 8]
		for ( int i = 0; i<=6; i+=3) {//for s
			if (게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
				if (!게임판[i].equals("[ ]")) 승리자 = 게임판[i];
			}
			
		}// for e 
		

			// 세로로 이기는 수 = [0 3 6 , 1 4 7 , 2 5 8]
		for ( int i = 0; i<=2; i++ ) {//for s
			if (게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
				if (!게임판[i].equals("[ ]")) 승리자 = 게임판[i];
			}
		}//for e
			
			// 대각선으로 이기는 수 = [0 4 8 , 2 4 6 ]
	
			if (게임판 [0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
				if (!게임판[0].equals("[ ]")) 승리자 = 게임판[0];			
			}
			if (게임판 [2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
				if (!게임판[2].equals("[ ]")) 승리자 = 게임판[2];			
			}
			

		
		} //while e
	} // m e
	
}
