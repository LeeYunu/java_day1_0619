package Day06;

import java.util.Scanner;

public class Day06_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String [][] 회원목록 = new String[100][2];			
		
		while (true) {//while s
			
			System.out.println("=== 메인 메뉴===");
			System.out.println("1.회원가입 2.로그인 3.종료"); int 선택 = scanner.nextInt();
			
			if (선택 == 1) {//if s
				// System.out.println(회원목록[0][0]); => null 값이 나옴 그러므로 Null에 저장해야함
				System.out.println("--회원가입--");
				System.out.println("-> ID: "); String 아이디 = scanner.next();
				int 중복체크 = 0;
				for (int i=0; i<회원목록.length; i++) {//for2 s
					if (아이디 == 회원목록[i][0]) {//if2 s
						System.err.println("중복된 아이디가 존재합니다.");
						중복체크 = 1;
						break;
					}//if2 e
				}//for2 e
	
				if(중복체크 == 0) {//if3 s
				System.out.println("-> PW: "); String 비밀번호 = scanner.next();				
					for ( int i =0; i<회원목록.length; i++) {//for3 s
						if (회원목록[i][0] == null) {
							회원목록[i][0] = 아이디;
							회원목록[i][1]	= 비밀번호;							
						}
						System.err.println( "[회원가입 완료]");
						break;
					
					}//for3 e
				}//if3 e
			}//if e
			
		else if (선택 == 2) {
			System.out.println("--로그인 화면--");
			System.out.println("ID: "); String 아이디 = scanner.next();
			System.out.println("PW: "); String 비밀번호 = scanner.next();
			
			int 로그인여부 =0;
			for ( int i=0; i<회원목록.length; i++) {	// for3 s
				if ( 회원목록[i][0] !=null && 회원목록[i][0].equals(아이디) && 회원목록[i][1].equals(비밀번호)) {//if 3 s
					System.err.println("[로그인 성공]");
					로그인여부 = 1;
				
				
					
					while (true) {
						System.out.println("---------------------------- ");
						System.out.println("\t 아이디 \t 비밀번호");
							for ( int j =0; j<회원목록.length;j++) {//for4 s
								if (회원목록[j][0] !=null) {
									System.out.println("\t "+ 회원목록[j][0] + "\t " + 회원목록[j][1]);
									System.out.println("---------------------------- ");
								}
							}//for4 e
						
						System.out.println("1.회원탈퇴 2.패스워드변경 3.로그아웃"); int 선택2 = scanner.nextInt();
						if (선택2 == 3) {//if4 s
							System.err.println("[로그아웃 완료]");
							break;
						}//if4 e
						
						else if (선택2 == 2) {//else 선택2 s
							
							System.out.println("새로운 비밀번호 입력: "); String 비밀번호2 = scanner.next();
							회원목록 [i][1] = 비밀번호2;
							System.out.println("재접속을 시작합니다");
							break;
						}//else 선택2 2 e
						
						else if (선택2 == 1) {
							회원목록[i][0]= null;
							회원목록[i][1]= null;
							
							//탈퇴한 회원들 기준으로 뒤에있는 회원들은 한칸씩 이동
							
							for (int h = i ; h<회원목록.length; h++) {//for5 s
								
								if(회원목록[h+1][0] !=null) {//if5 s
									회원목록 [h][0] = 회원목록[h+1][0];
									회원목록 [h][1] = 회원목록[h+1][1];
								}//if5 e
								else {//else s
									회원목록 [h][0] = null;
									회원목록 [h][1] = null;
									break;
								}//else5 e								
							}//for5 e
							System.err.println("[회원 탈퇴]");	
							break;
							
						}//else 선택2 1 e
						
						else System.out.println("입력값이 아닙니다.");
					}//while 2 e
					
				}// if 3 e
				else System.err.println("[로그인 실패]");
				break;
			} //for3 e
		} //else 선택 2 e
			
			
			else if (선택 == 3) {
				System.err.println("종료");
				break;
			}
			else {
				System.err.println("[선택이 잘못되었습니다]");
			}
				
			
		}//while e
		
		
		
		
		
		
		
		
		
	} //m e
	
} // ce
