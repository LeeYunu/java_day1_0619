package Day08_01;

public class 국민은행 extends 계좌 {

	private final int 은행코드 = 20;
	
	public 국민은행() {
	}

	public 국민은행(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		super(계좌번호, 비밀번호, 계좌주, 금액);		
	}

	
	
	public 국민은행(String 계좌번호, int 비밀번호, String 계좌주) {
		super(계좌번호, 비밀번호, 계좌주);		
	}

	
	public void 계좌등록(int 은행코드) {
		System.out.println("국민은행");
		System.out.println("계좌 등록 화면");
		System.out.println("계좌 번호 : ");
			String 계좌번호 = ATM.scanner.next();
		System.out.println("비밀번호: ");
			int 비밀번호 = ATM.scanner.nextInt();
		System.out.println("계좌부: ");
			String 계좌주 = ATM.scanner.next();
			
			국민은행 temp = new 국민은행(계좌번호, 비밀번호, 계좌주);
		
			ATM.계좌목록.add(temp);
	}
	
	
	
	
}
