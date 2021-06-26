package Day03;

import java.util.Scanner;


public class Day03_test7 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);

		 
		 // 게임에서 상점 이용하기 프로그램
		 	//조건1: 한명회원 [ 아이디: qwe 비밀번호 1234]
		 		// 로그인창 만들어서 아이디와 비밀번호를 입력받아 동일한 경우 상점 이용하기
		 			// 동일하지 않으면 로그인 실패
		 	//조건2: 기존 5000원 가지고 있음
		 		//상품 : 1. 물약[100원] 2. 과일[200원] 3.장신구[300원]
		 			// 장바구니: 상품번호를 입력받아 장바구니 담기
		 //결제		
		 while(true) { //while s
		 System.out.println(">>>로그인창>>>>");
		 System.out.println("아이디: "); String ID = 입력객체 .next();
		 System.out.println("비밀번호:"); short PW = 입력객체 .nextShort();
	
		
		 if (ID.equals("qwe") && PW == 1234 ) { //if s
			 System.out.println("로그인 성공");
			 
			 
			 int 금액 = 5000;
			 int 물약개수 = 0;
			 int 과일개수 = 0;
			 int 장신구개수 = 0;
			 
			 System.out.println(">>>상점 쇼핑>>>");

			 while(true) { //while2 s
				 System.out.println("1. 물약[100원] 2. 과일[200원] 3.장신구[800원] 4.[결제]"); 
				 int 선택 = 입력객체 .nextInt();
				 
				 if ( 선택 == 1 ) { 
					 System.out.println("물약을 담았습니다.");
					 물약개수++; 
				}
				
				 if ( 선택 == 2 ) {
					 System.out.println("과일을 담았습니다.");
					 과일개수++;
				}
				 
				 if ( 선택 == 3 ) { System.out.println("장신구를 담았습니다.");
				 장신구개수++;}
				 
				 if ( 선택 == 4 ) {  
					System.out.println("결제창으로 이동합니다.");
				 	System.out.println("장신구 현황:");
				 	if( 물약개수 != 0) System.out.println("물약 \t " + 물약개수 + "\t" + 물약개수*100);	
				 	if( 과일개수 != 0) System.out.println("과일 \t " + 과일개수 + "\t" + 과일개수*200);
				 	if( 장신구개수 != 0) System.out.println("장신구 \t " + 장신구개수 + "\t" + 장신구개수*800);
				 	if( 물약개수 == 0 && 과일개수 ==0 && 장신구개수==0) System.out.println("장바구니에 담긴 것이 없습니다.");
				 	
				 	if (금액 - (물약개수*100+과일개수*200+장신구개수*800) < 0) System.out.println("한도초과");
				 		
				 	else {
				 	System.out.println("총 결제액: "+ (물약개수*100+과일개수*200+장신구개수*800));
				 	System.out.println("남은 금액: "+ (금액 - (물약개수*100+과일개수*200+장신구개수*800)));
				 	}
				 	break;
				 	
				 }
			 } //while2 e
			 
			 
			 
		 } //if e
			
			 else   System.out.println("로그인 실패");
	
		 } //while e 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	} //we
} //ce
