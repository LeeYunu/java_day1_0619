package Day02;

import java.util.Scanner;


public class Day02_과제11 { //cs

	public static void main (String[] args) { //ws
	
		Scanner 입력객체 = new Scanner (System .in);
		
		System.out.println("키를 입력하시오"); double 키 = 입력객체 .nextDouble();
		System.out.println("몸무게를 입력하시오"); double 몸무게 = 입력객체 .nextDouble();

	 
		double BMI = 몸무게 / ((키/100) * (키/100));
		
		System.out.println("BMI 수치는 " + BMI + "입니다.");
	
	
	
	} // we
} //ce