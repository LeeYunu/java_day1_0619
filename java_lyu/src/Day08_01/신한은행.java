package Day08_01;

public class 신한은행 extends 계좌 {

	public 신한은행() {
	}

	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		super(계좌번호, 비밀번호, 계좌주, 금액);		
	}

	
	
	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주) {
		super(계좌번호, 비밀번호, 계좌주);		
	}

	
	public void 계좌등록() {
		System.out.println("신한은행");
		System.out.println("계좌 등록 화면");
		System.out.println("계좌 번호 : "); //제어 : 중복제거
			String 계좌번호 = ATM.scanner.next();
			for (계좌 temp : ATM.계좌목록) {
				// for(임시객체 : 리스트명) 리스트 내 모든 객체를 하나씩 임시객체에 대입
				if (temp.get계좌번호().equals(계좌번호)) {
					System.err.println("중복된 번호");
					return;
				}//if e
			}// for e
			
			
		System.out.println("비밀번호: "); //제어 : 4글자 숫자
			int 비밀번호 = ATM.scanner.nextInt();
			String s비밀번호 = Integer.toString(비밀번호);
							//Integer.toString(숫자) => 숫자열을 문자열로
			if(s비밀번호.length() != 4) {
				System.err.println("4자리를 입력하세요");
				return;
			}
			
			
		System.out.println("계좌주: ");	
			String 계좌주 = ATM.scanner.next();
			
			신한은행 temp = new 신한은행(계좌번호, 비밀번호, 계좌주);
		
			ATM.계좌목록.add(temp);
		
	}
	
	@Override
	public void 입금() {
		System.out.println("신한은행 입금 화면");
		super.입금();
	}

	@Override
	public void 출금() {
		System.out.println("신한은행 출금 화면");
		super.출금();
	}
	
	
	
}
