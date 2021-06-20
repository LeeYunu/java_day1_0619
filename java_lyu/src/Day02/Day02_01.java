package Day02;

public class Day02_01 { // cs

	public static void main(String[] args) { //main
		
		//연산자
		 //1. 산술연산자
		// 더하기, 빼기 곱하기 나누기 나머지
		// 문자+문자 : 연결연산자
		System.out.println("더하기:"+(3+5));
		System.out.println("빼기:"+(5-3));
		System.out.println("곱하기:" + (5*3));
		System.out.println("나누기:"+5/3);
		System.out.println("나머지"+(5%3));
		
		
		// 2. 비교연산자 [결과 : true / false]
		// > : 초과
		// => (x)
		// >= 이상
		System.out.println("초과:" + (5>3));
		System.out.println("이상:" + (5>=3));
		System.out.println("미만:" + (5<3));
		System.out.println("이하:" + (5<=3));
		System.out.println("같다:" + (5==3));
		System.out.println("같지않다:" + (5!=3));
		
		
		System.out.println(3 + "은 홀수이다" + ((3%2) == 1) );
		System.out.println(3 + "은 짝수이다" + ((3%2) != 1) );
		
		
		System.out.println(36 + "은" + 3 + "의 배수이다" + ((36%3) ==  0));
		
		
		// 홀수/짝수 판단
			// 값 % 2 == 0 : 나머지 0이면 값은 짝수
			// 값 % 2 == 1 : 나머지 1이면 값은 홀수
		// 배수 판단
			// 값 % 수 == 0 : 나머지가 0이면 해당 값은 그 수의 배수
		
		// 3. 비교 연산자 2개 이상일 경우
		//system.out~~ ( 1 < 3 < 5) = X
		
		
		// 관계 연산자 [ 비교 연ㅅ나자 2개 이상일 경우에]
		//System.out.println("and:" + (1<3 %% 3<5));
		// and : && : 한글도 잃어버린 사람들
		//System.out.println("and :") +(1<3 && 3<5);
		//System.out.println("or", (1<3 || 3<2); );
		//System.out.println(부정:!:true => false);
		
		// 4. 대입연산자
			// = 대입 [ 오른쪽값 => 왼쪽으로 대입
			// += [오른쪽 값을 왼쪽에 더한 후에 외쪽에 대입
			// -= *= /= 등등
		
	//	int a = 10;
	//	a +=10;
	
		//5. 증감연산자 
		// ++ : 1증가  -> ++변수 선의증가:단둘이 오
		// -- : 1감소
		
		//System.out.println(++a ); //출력 전 증가
		//System.out.println(a++ ); //출력 후 증가
	
		//System.out.println( -- a ); //출력전 감소

		
		
		// * 문제3  3. 365,420원의 지폐 수 새기
		
		
		
		//변수 : 메모리 [데이터 저장소]
		int 금액 = 365420;
	
		System.out.println("십만원:"+ (금액/100000) + "장");
		System.out.println("만원:" + ((금액%100000)/10000) + "장");
		System.out.println("천원:" + ((금액%10000)/1000) + "장");
		System.out.println("백원:" + ((금액%1000)/100) + "장");
		
		
	} // me
	
	
} // ce
