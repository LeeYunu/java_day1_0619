package Day05;

public class Day05_03 {
	public static void main(String[] args) {//m s
		
		
		
	// 변수 : 데이터를 저장하는 메모리
			// 컴퓨터: 메모리 주소값, 용량단위, 데이터
			// 사람: 변수명, 자료형, 값

	int 정수1; //4바이트 변수	
	int 정수2; //4바이트 변수	
	int 정수3; //4바이트 변수	
	
	// 배열 :  특정 기준으로 나열 
		// [인덱스]: 배열에 저장된 요소들의 순서 번호 ( 0: 시작)
		// 동일한 자료형의 여러 변수를 관리 => 서로 다른 자료형 불가
		// 클래스를 이용한 배열 선언
		// 선언과 동시에 메모리 할당 [ 메모리 효율성]
	
	
	
	
	int [] 정수배열 =new int[3]; //int 형 3개 저장할 수 있는 배열
	int [] 정수배열2 = {3,4,5} ; //선언과 동시에 초기값
	// 배열 호출 
	System.out.println("배열: " + 정수배열2); // 배열의 주소값
	System.out.println(" 배열의 0인덱스:"+ 정수배열2[0]); //인덱스 위치의 값
	System.out.println(" 배열의 1인덱스:"+ 정수배열2[1]); //인덱스 위치의 값
	System.out.println(" 배열의 2인덱스:"+ 정수배열2[2]); //인덱스 위치의 값
	// 배열 호출 = 인덱스 번호 사용
	
	System.out.println("배열 : " + 정수배열2.length); // 배열 내 요수 개수 [배열의 길이]
	System.out.println("배열 : " + 정수배열2.toString()); //배열의 주소값
	
	// 문제: 반복문을 이용한 0~99까지 int형 배열에 각 인덕스에 저장하고 출력
	
	
	int [] 배열1 = new int [100];
	
	for ( int i = 0; i < 100; i++) {
		배열1 [i]=i; //i번째 인덱스에 i 를 대입
	}
	for( int i = 0; i < 100; i++) {
		System.out.print("\t" + 배열1[i]); // i번째 인덱스 출력
	}
	
	System.out.println();
	
	int i = 0;

	while (true) {
		
		System.out.print("\t" + i);
		if ( i == 99) break;
		i++;
	}

	
	
	
	
	
	
	
	
	} // m e
}
