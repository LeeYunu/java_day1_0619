package Day03;

import java.util.Scanner;


public class Day03_test8 { //cs

	public static void main (String[] args) { //ws
	
		 Scanner 입력객체 = new Scanner(System.in);

		 
		// 키오스크 프로그램 [무인 프로그램]
		 	// 판매제품 : 1. 콜라 [500] 2. 커피[600] 3. 스무디[700] 4. 결제		 
		 		// 선택한 제품을 장바구니에 담기		 
		 			// 결제 여부 물어보고 결제시 현금 입력받기 [ 잔돈 출력 후 종료]
		 	// 제품 재고 : 콜라[10개]	커피[10개]	스무디[10개]
		 		// 재고가 없을 경우 구매불가
		 
		 
		 int 콜라개수 = 0;
		 int 커피개수 = 0;
		 int 스무디개수 = 0;
		 
		 int 콜라잔고 = 10;
		 int 커피잔고 = 10;
		 int 스무디잔고 = 10;
		 
		 int 결제금 = 0;
		 int 금액 = 5000;
		 
		 while(true) { //while1 s
			 
			 
			 System.out.println("프로그램 실행 중");
		
			 System.out.println(" - - - - > 키오스크 메뉴");
			 System.out.println("장바구니 현황: ");
			 System.out.println("콜라:" + 콜라개수 + "커피: " + 커피개수 + "스무디: " + 스무디개수);
			 System.out.println("1. 콜라 [500] 2. 커피[600] 3. 스무디[700] 4. 결제"); int 선택 = 입력객체 .nextInt();
			 
			 if (선택 == 1) { 
				 if (콜라잔고 < 0) System.out.println("콜라잔고가 없습니다.");
				 else System.out.println("콜라를 담았습니다."); 콜라개수++; 콜라잔고--;
				
			 }
			 if (선택 == 2) { 
				 if (커피잔고 < 0) System.out.println("커피잔고가 없습니다.");
				 else System.out.println("커피를 담았습니다."); 커피개수++; 커피잔고--;
				 
			 }
			 if (선택 == 3) { 
				 if (스무디잔고 < 0) System.out.println("스무디잔고가 없습니다.");
				 else System.out.println("스무디를 담았습니다."); 스무디개수++; 스무디잔고--;
				
			 }			 
			 if (선택 == 4) { //if4 s

				 System.out.println("결제창으로 이동합니다");
				 System.out.println("결제를 하시겠습니까? [Y/N]"); String 결제 = 입력객체 .next();		 
				 if (결제.equals("Y")) 	{//if Y s
				 
				 System.out.println("최종 키오스크 현황:");
				 if (콜라개수 != 0) System.out.println("콜라개수:" + 콜라개수 + "\t" + "금액:" + (콜라개수 * 500));
				 if (커피개수 != 0) System.out.println("커피개수:" + 커피개수 + "\t" + "금액:" + (커피개수 * 600));
				 if (스무디개수 != 0) System.out.println("스무디개수:" + 스무디개수 + "\t" + "금액:" + (스무디개수 * 700));
				 if (콜라개수 == 0 && 커피개수 ==0 && 스무디개수 ==0) System.out.println("장바구니에 담긴 것이 없습니다.");
				 
				 int 결제금액 = 콜라개수*500 + 커피개수*600 + 스무디개수*700;
					 
				 if ( (금액 - 결제금액) >= 0) {//if 금액 s
				 System.out.println("총 결재금액: " + 결제금액);
				 System.out.println("남은 금액: " + (금액 - 결제금액));
				 
				 }//if 금액 e
				 else System.out.println("한도초과");
				 break;
				 } //if Y e
				 				
				
				 	else System.out.println("결제를 취소합니다.");				 
			 break;
			 } //if4 e
			 
		 } //while1 e
		 
	 
		 
	} //we
} //ce
	