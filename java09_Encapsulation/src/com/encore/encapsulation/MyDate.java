package com.encore.encapsulation;

/* 2021_0104_Workshop
 * Encapsulation 작성하는 패턴
 * 1. Field - private 지정
 * 2. setter() / getter() - public 지정
 * 3. setter() 메소드 구현부 첫라인에서 (필드 초기화 하기 직전에) 제어문을 달아서 타당한 값만 할당 되도록 한다. 
 */

public class MyDate {
	private int month;//13
	private int day;//33
	
	public int getMonth() {
		return month;
	}
	//값을 주입하는 기능...
	//void setmonth(o){}
	public void setMonth(int month) {
		if(month>=1 && month <=12) {
			this.month = month;
		}else {//필드는 로컬변수와 다르게 무조건 값이 들어감. 디폴트로 0이 들어감, 초기화가 안되면 0임
			System.out.println("Invalid Month Value!!");
			System.exit(0); //정상종료. -1(음수)값을 넣으면 문제가 있어서 비정상 종료하겠다는 것.
		}
		//값을 필드에 입력, 필드초기화 하기 직전에 인자값으로 받은값이 타당한지 여부를 검사하고 타당한 값만 필드에 할당, 이 때 제어문을 쓰는 것임
		
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//필드초기화 하기 직전에 인자값으로 받은값이 타당한지 여부를 검사하고 타당한 값만 필드에 할당
		//흐름이 달라질 때 switch를 씀
		//String이 아닌 void로 가야함, main을 따라 가야 함
		switch(month) {//setmonth()를 통한 초기화가 이미 되어져 있는 상태이다.
		case 2://2월달인 경우
			if(day>=1 && day<=28) {
				this.day = day;
			}else {
				System.out.println("Invalid Day!!");
				System.exit(0); 
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>=1 && day<=30) {
				this.day = day;
			}else {
				System.out.println("Invalid Day!!");
				System.exit(0); 
			}
		break;
		
		default:
			if(day>=1 && day<=31) {
				this.day = day;//5
			}else {
				System.out.println("Invalid Day!!");
		
			}
		}
	
	}
}
//스르륵 코드 보면 남는게 없다..끝가지 스르륵 봄. 메소드 별 어떻게 작동하는지 한땀한땀 봐야 함
