package Day06;

import java.util.Arrays;
import java.util.Scanner;

public class Day06_01 {

	public static void main(String[] args) { // ms 
		
		// 학생수를 입력받아 학생수만큼 배열크기 
		
		Scanner scanner = new Scanner(System.in);
		
		int[] 학생점수 = null;//현재 메모리가 null인 배열 선언
		int 인원수 =0;
		
		while (true) {// while 1 s
		System.err.println("---학생관리 프로그램 ---");
		System.out.println("1.학생 수 2.점수 3.통계 4.종료"); 
		int 선택 = scanner.nextInt();
		
		if(선택 == 1) { 
			//System.out.println(" ---> 학생수 : "); int 인원수 = scanner.nextInt();
			학생점수 = new int[인원수]; // 자료형 배열명 = new 자료형[개수] 
			System.out.println(인원수 + "만큼 학생점수를 저장가능합니다");
		}
		else if (선택 == 2) {//else i2 s
			for (int i =0;i<학생점수.length;i++) {// f2 s
				System.out.println((i+1)+"번째 학생점수 입력:");
				학생점수[i]=scanner.nextInt();
			}//f2 e
		}// else i2 e
		else if (선택 == 3) { // [인덱스]: 배열에 저장되는 순서 번호 // 다양한 메소드[미리작성코드] => Arrays 클래스 사용
			//정렬 = sort() 사용
			Arrays.sort(학생점수); // 오름차순
			for (int i =0; i<학생점수.length; i++) {
				System.out.println((i+1)+"번째 학생의 점수"+ 학생점수[i]);
			}
		
		// 가장 높은 점수 출력
			int max = 0;
			int sum = 0;
			for (int i = 0 ;i<학생점수.length;i++) {
				//최댓값
				if(max<학생점수[i]) max = 학생점수[i];
				//누적합계
				sum += 학생점수[i];
			}
		System.out.println("가장 높은 점수는: "+ max + "입니다"); 
		System.out.println("학생들의 평균은:" + sum/인원수 + "입니다");
		
		}//else 3 e
		
		/*
		  //내림차순 : 기본자료형 X 
			따라서 int [] 학생점수 = null -> Integer[] 로 변경
		   * int : 정수 자료형 [new X] => 변수
		   * Integer : 정수 클래스 [ new 사용] => 객체
		  Arrays.sort(학생점수, Collections.reverseOrder());
		  		// 컬렉션 : 배열, 리스트
	
				*/
		
		else if (선택 == 4) {
			System.err.println("학생관리 프로그램을 종료합니다.");
			break;
		}
		else {
			System.out.println("입력값이 아닙니다.");
		}
		
			
			
			
			
		}// while 1 e
		
	} // m e	
}	 
