package Condition.test;

import java.util.Scanner;

/*
 * step2
 * 실행시 값을 받아서 처리하도록 로직을 작성
 * Scanner 객체를 생성
 */

public class IfGradeTest2 {
public static void main(String[] args) {
		//java.lang이 아닌 다른 패키지에 있는 클래스를 사용할 때는
		//반드시 import해서 써야 함
		//int grade = 87;
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 성적을 입력하세요...\n");
		int grade = sc.nextInt();
		
		if(grade>=90 && grade<=100) System.out.println("A grade...");
		else if(grade>=80 && grade<90) System.out.println("B Grade...");
		else if(grade>=70 && grade<80) System.out.println("C Grade...");
		else System.out.println("Try Again..");
		
	
	}
	
}
