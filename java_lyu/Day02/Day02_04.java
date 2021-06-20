package Day02;

import java.util.Scanner;

public class Day02_04 { //cs
	
	public static void main (String[] args) { //me
	
	Scanner 입력객체 = new Scanner (System.in);
		
	System.out.println(">>>>>회원가입을 진행하세요>>>>>>>");
		System.out.println("아이디:"); String 아이디 = 입력객체.next();
		System.out.println("비밀번호:"); int 비밀번호 = 입력객체.nextInt();
		System.out.println("이름:"); String 이름 = 입력객체.next();
		System.out.println("이메일:"); String 이메일 = 입력객체.next();
	
	System.out.println(">>>>>>아래 정보를 확인해보세요 >>>>>");
	System.out.println("");
	}//e
	
} //ce
