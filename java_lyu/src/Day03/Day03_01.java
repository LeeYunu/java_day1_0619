package Day03;

import java.util.Scanner;

public class Day03_01 { //cs
	
	public static void main(String[] args) { //ws

	// 제어문 : 경우에 따른 판단력
		// if[논리검사], switch[논리검사 X / 값 검사],
	
	// if 형태
		//만약에 ~이면
		//1. if  (T / F) 실행문;
		//2. if  (T / F) T실행문;
		//   else F 실행문
		//3. if (T/F) { 실행문; 실행문2;}
		//   else {실행문; 실행문2;}
		//4. if (T/F)
		//	else if (T/F) 실행문[T2];
		//  else
		
		
		//예1
		if (5>3) System.out.println("5가 크다");
		if(5>10) System.out.println("5가 크다");
		
		//예2
		if (5>3) System.out.println("5가 크다");
		else System.out.println("5가 더 작다");
		
		//예3	
		 if (5>3) { System.out.println("true"); System.out.println("5가 크다"); }
		else { System.out.println("false"); System.out.println("5가 작다"); }
		
		//예4
		 if (5>10) System.out.println("5가 크다1");
		 else if(5>6) System.out.println("5가 크다2");
		 else if(5>8) System.out.println("5가 크다3");
		 else if(5>4) System.out.println("5가 크다4");
		 else System.out.println("5보다 작은 데이터가 없다");
		 
		 
		 
		 // 문제1: 하나의 정수를 입력받아 80점 이상이면 합격 아니면 불합격
		 
		 Scanner 입력객체 = new Scanner(System.in);
		 
		 
		System.out.println("1. 정수를 입력하시오: "); int 정수 = 입력객체 .nextInt();
		
		if (정수>=80) System.out.println("합격");
		else System.out.println("불합격");
		 
		 
		 // 문제2: 하나의 점수를 입력받아 90점 이상이면 A 80점이상이면 B 그외 탈락
		 
		 System.out.println("2. 점수를 입력하세요: "); int 점수 = 입력객체 .nextInt();
		 
		 if (점수 >= 90) System.out.println("A학점 입니다.");
		 else if (점수 >= 80) System.out.println("B학점 입니다.");
		 else System.out.println("불합격입니다.");
		
		// 문제3: 하나의 점수와 성별을 입력받아
			// 남자이면서 90점 이상이면 A-1 클래스 출력
			// 여자이면서 90점 이상이면 A-2 클래스 출력
				// 남자이면서 80점 이상이면 B-1 클래스 출력
				// 여자이면서 80점 이상이면 B-2 클래스 출력
					// 그외 C클래스
		
		 
		 System.out.println("3. 점수를 입력해주세요:"); int 삼점수 = 입력객체 .nextInt();
		 System.out.println("[남/여]성별을 입력해주세요."); String 성별 = 입력객체 .next();
		 
		 if (성별.equals("남") && 삼점수 >= 90) System.out.println("A-1");
		 else if (성별.equals("남") && 삼점수 >= 80) System.out.println("B-1");
		 else if (성별.equals("여") && 삼점수 >= 90) System.out.println("A-2");
		 else if (성별.equals("여") && 삼점수 >= 80) System.out.println("B-2");
		 else System.out.println("C클래스");
		 
		 
		 // String : 문자열 클래스
		 	// 문자열.equals("남") 문자열 비교 [ 반환 = T/F]
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
	} //we
} //cs
