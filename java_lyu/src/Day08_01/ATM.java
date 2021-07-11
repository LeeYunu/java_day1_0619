package Day08_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

	public static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		start();
	}
	public static ArrayList<계좌> 계좌목록 = new ArrayList<>();
			
	
	public static void start() {
		
		while(true) {
			System.out.println(" ATM ");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.계좌찾기 6.종료");
			int 선택 = scanner.nextInt();
			if( 선택 ==1 ) {
				
				System.out.println("1.신한은행  2.국민은행");
				int 선택2 = scanner.nextInt();
				
				if (선택2 == 1) {
					신한은행 신한은행 = new 신한은행();
					신한은행.계좌등록();					
				}//if 선택-1-2 e
				
			}//if 선택-1 e
			else if ( 선택==2 ) {
				System.out.println("1.신한은행  2.국민은행");
				int 선택2 = scanner.nextInt();
				
				if (선택2 == 1) {
					신한은행 신한은행 = new 신한은행();
					신한은행.입금();
				}
			}
			else if ( 선택==3 ) {
				System.out.println("1.신한은행  2.국민은행");
				int 선택2 = scanner.nextInt();
				
				if (선택2 == 1) {
					신한은행 신한은행 = new 신한은행();
					신한은행.출금();
				}
			}
			else if ( 선택==4 ) {
				System.out.println("1.신한은행  2.국민은행");
				int 선택2 = scanner.nextInt();
				
				if (선택2 == 1) {
					신한은행 신한은행 = new 신한은행();
					신한은행.이체();
				}
				
			}
			else if ( 선택==5 ) {}
			else if ( 선택==6 ) {
				System.err.println("[[[[종료]]]]");
				break;
			}
			else {
				System.out.println("알 수 없는 명령입니다.");
				
			}
			
		}//while e
	}//start e	
}// class e
