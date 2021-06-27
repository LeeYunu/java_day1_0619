package Day04;

import java.util.Random;
import java.util.Scanner;


public class Day04_09 { //cs

	public static void main(String[] args) { //ws
		
		
		// 가위바위보 게임
			// 1. 가위 바위 보 중 하나를 입력받아 승패 결정
			// 2.  컴퓨터는 랜덤 사용
			// 3. 게임 여러번 진행해서 최종 승리자
		
		
		Scanner 입력객체 = new Scanner(System.in);
		
		System.out.println("------가위 [0] . 바위 [1] . 보 [2]-------");
		
		
		int 승리수 = 0;
		int 패배수 = 0;
		int 무승부수 = 0;
		int 총횟수 = 0;
		
		
		while (true) { //무한루프 while s
			
			System.out.print("::가위[0], 바위 [1], 보 [2]:: \n선택: "); int 플레이어 = 입력객체.nextInt();
			if ( 플레이어 == 0) System.out.println("당신은 가위를 냈습니다");
			else if ( 플레이어==1) System.out.println("당신은 바위를 냈습니다");
			else if ( 플레이어==2) System.out.println("당신은 보를 냈습니다");
			else System.out.println("알 수 없는 명령입니다");
		
			// 컴퓨터 => 랜덤 이용한 난수생성 [ Random : 랜덤 관련된 메소드 제공]
			Random random = new Random(); //랜덤객체			
			int 컴퓨터 = random.nextInt(3); // 랜덤객체에서 난수가져오기 [ .nextInt(숫자) 0~숫자(미만)전까지 난수생성]
			if ( 컴퓨터 == 0) System.err.println("컴퓨터가 가위를 냈습니다");
			else if ( 컴퓨터 == 1) System.err.println("컴퓨터가 바위를 냈습니다");
			else if ( 컴퓨터 == 2) System.err.println("컴퓨터가 보를 냈습니다");
			
			
			// 승패
			
			if ((플레이어==0 && 컴퓨터==2) || (플레이어==1 && 컴퓨터==0)||(플레이어==2 && 컴퓨터==1)) {
				System.out.println(":::플레이어가 승리했습니다:::"); 
				승리수++;
			}
			else if ((플레이어==2 && 컴퓨터==0) || (플레이어==0 && 컴퓨터==1) || (플레이어==1 && 컴퓨터==2)) {
				System.err.println(":::컴퓨터가 승리했습니다:::");
				패배수++;
			}
			else {
				System.out.println(":::비겼습니다:::");
				무승부수++;
			}
			
			
			
			
			총횟수++;
			System.out.println("총횟수:" + 총횟수 + "\t승리: "+ 승리수 + "\t패배: "+ 패배수 + "\t무승부: "+ 무승부수+ "\n");

			if (총횟수 == 10) {
				System.out.println("------게임종료------");
				System.out.println("최종전적::" + 승리수 + "승\t"+ 패배수 + "패\t"+ 무승부수 + "무");
			
			
			if (승리수 > 패배수) System.out.println("플레이어 승리!");

			else if(승리수 < 패배수) System.err.println("플레이어 패배..");
			
			else System.out.println("무승부");
				
			
				break;
			}
		
		}//while e 
		
		
		
		
		
		
		
		
		
		
		
	}//we	
}//ce
