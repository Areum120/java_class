package Condition.test;

import java.util.Scanner;

public class SwitchGradeTest4 {
	public static void main(String[] args) {
		//local Variable... 메소드 안에 선언된 변수..기본값이 없다...값을 할당해야된다.
		//메소드 밖에서는 사용할수 없다...사용하면 에러
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요");
		String name=sc.nextLine();//이름
		
		System.out.println("당신의 등급을 입력하세요");
		String grade=sc.nextLine();//등급		
		
		String message=""; //초기화		
		switch(grade) {
			case "A" :
				message = name+"님, 당신의 성적은 90~100점입니다.";
				//break;
			case "B" :
				message = name+"님, 당신의 성적은 80~89점입니다.";
				//break;
			case "C" :
				message = name+"님, 당신의 성적은 70~79점입니다.";
				//break;
			default:
				message = name+"님, Try Again!!";
				//break;
		}//		
		System.out.println(message);
	}	
}









