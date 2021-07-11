package Day08_01;

public class 계좌 {

	private String 계좌번호;
	private int 비밀번호;
	private String 계좌주;
	private int 금액;
	
	
	public 계좌() {
	}


	public 계좌(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 금액;
	}
	
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 0;
	}
	
	
	//0. get, set 메소드 - 중복체크를 위해서
	public String get계좌번호() {
		return this.계좌번호;
	}
	
	public int get비밀번호() {
		return this.비밀번호;
	}
	public void 입금처리(int 입금액) {
		this.금액 += 입금액;
		System.err.println("입금완료");
	}
	public void 출금처리(int 출금액) {
		if(this.금액 < 출금액) {
			System.err.println("잔액부족");
			return;
		}
		
		this.금액 -= 출금액;
		System.err.println("출금완료");
	}

	
	
	//1. 계좌등록 메소드
	public void 계좌등록() {
		
		System.out.println("계좌 등록 화면");
		System.out.println("계좌 번호 : ");
			String 계좌번호 = ATM.scanner.next();
		System.out.println("비밀번호: ");
			int 비밀번호 = ATM.scanner.nextInt();
		System.out.println("계좌부: ");
			String 계좌주 = ATM.scanner.next();
			
			계좌 계좌 = new 계좌(계좌번호, 비밀번호, 계좌주);
		
			ATM.계좌목록.add(계좌);
	}

	
	//2. 입금 메소드
	public void 입금() {
		
		System.out.println("입금 등록 화면");
		System.out.println("계좌 번호 : ");
			String 계좌번호 = ATM.scanner.next();
		System.out.println("비밀번호: ");
			int 비밀번호 = ATM.scanner.nextInt();
		System.out.println("입금액: ");
			int 입금액 = ATM.scanner.nextInt();
	
			for ( 계좌 temp : ATM.계좌목록) {
				if ( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
					temp.입금처리(입금액);
					return;
				}
			}
			System.err.println("동일한 계좌 혹은 비밀번호가 다릅니다.");
			
	}
	
	//3. 출금 메소드
		public void 출금() {
			
			System.out.println("입금 등록 화면");
			System.out.println("계좌 번호 : ");
				String 계좌번호 = ATM.scanner.next();
			System.out.println("비밀번호: ");
				int 비밀번호 = ATM.scanner.nextInt();
			System.out.println("출금액: ");
				int 출금액 = ATM.scanner.nextInt();
		
			for ( 계좌 temp : ATM.계좌목록) {
				if ( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
					temp.출금처리(출금액);
					return;
				}
			}	
			System.err.println("동일한 계좌 혹은 비밀번호가 다릅니다.");
			
		}
		

		//4. 이체 메소드
			public void 이체() {
				
				System.out.println("입금 등록 화면");
				System.out.println("계좌 번호 : ");
					String 계좌번호 = ATM.scanner.next();
				System.out.println("비밀번호: ");
					int 비밀번호 = ATM.scanner.nextInt();
					for ( 계좌 temp : ATM.계좌목록) {
						if ( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
					
							System.out.println("이체액: ");
							int 이체액 = ATM.scanner.nextInt();
							if(temp.금액 < 이체액) {
								System.err.println("금액이 부족합니다");
								return;
							}
				System.out.println("받는 사람 계좌번호:");
				String 계좌번호2 = ATM.scanner.next();
							for(계좌 temp2: ATM.계좌목록) {
								if (temp2.계좌번호.equals(계좌번호2)) {
										System.out.println("확인: 받는사람" + temp2.계좌주);
										temp.금액 += 이체액;
										System.out.println("이체처리 완료");
										return;
								}
							}
						}
					}
				System.err.println("동일한 계좌 혹은 비밀번호가 다릅니다.");
				
			}
}
