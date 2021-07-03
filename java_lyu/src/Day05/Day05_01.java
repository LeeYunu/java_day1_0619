package Day05;

public class Day05_01 {

	public static void main(String[] args) { //m s
		
		// 제어문 : if[논리(t/f)제어] , switch[ 데이터 검사]
			// if : 경우의수가 정해져있지 않은 경우
				// true 이면 모든 실행문이 종료
			// switch: 경우의 수가 정해져있는 경우 [ 속도 빠름]
				// case를 검사 후 아래 모든 case를 처리한다 => break 사용; [ 반복문 혹은 switch 탈출 ]

		switch (5) { // sw s
		
		case 5 : System.out.println("5입니다");
		case 3 : System.out.println("3입니다");
			} //sw e
		
		
		///////////////////////////////////////////////////////////////
		
		
		int 번호 = 3;
		if (번호 == 1) System.out.println("1입니다");
		else if (번호 ==2 ) System.out.println("2입니다");
		else if (번호 ==3 ) System.out.println("3입니다");
		
		
		
		switch (번호) { //sw2 s
		case 1 : System.out.println("1입니다");
		case 2 : System.out.println("2입니다");
		case 3 : System.out.println("3입니다");
		}//sw 2 e
		
///////////////////////////////////////////////////////////////////////////////////////		
		
		
		int 점수 = 80;
		switch(점수) {
			case 90 : System.out.println("A Grade"); break;
			case 80 : System.out.println("B Grade"); break;
			case 70 : System.out.println("C Grade"); break;
			default : System.out.println("탈락"); break;
		}
		
///////////////////////////////////////////////////////////////////////////////////////
		int 점수1 = 80; int 점수2 = 90; int 점수3 = 100;
		
		 // 세 점수 의 평균을 계산 후: 90 점이상이면 A등급 80점 이상이면 B 등급 70점 이상이면 C등급 그 외 탈락
		
		int 평균;
		
		평균 = (점수1 + 점수2 + 점수3)/3;
		
		switch(평균/10){
			case 9 : System.out.println("A Grade"); break;
			case 8 : System.out.println("B Grade"); break;
			case 7 : System.out.println("C Grade"); break;
			default : System.out.println("탈락"); break;
	
		}
		
///////////////////////////////////////////////////////////////////////////////////////

	

		
	} //m e
	
	
}
