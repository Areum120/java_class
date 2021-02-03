package com.encore.encapsulation.test;


/*
1. Scanner를 이용해서 month, day에 해당하는 값을 받는다.
2. month에 해당하는 값은 1~12사이의 값만 받고 나머지는 에러 메세지를 출력
	day는
	1,3,5,7,8,10,12월은 1~31
	4,6,9,11월은 1~30일
	2월은 1~28일 까지의 값을 갖도록
	--> if, switch문 둘다 사용하세요.
3.  "해당하는 월이 아닙니다"
	"해당하는 날짜가 아닙니다"
	"오늘은 1월 4일 입니다."
	"오늘은 0월 4일 입니다."-->x
	"오늘은 1월 0일 입니다."-->x
*/
import java.util.Scanner;	

import com.encore.encapsulation.MyDate;


public class MyDateTest {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	MyDate md = new MyDate();
	System.out.println("월입력>>");
	int month = sc.nextInt();
	System.out.println("날짜입력>>");
	int day = sc.nextInt();
	
	md.setMonth(month);//calling 인자값이 passing
	md.setDay(day); //calling 인자값이 passing into

//	if(md.getMonth()!=0 && md.getDay()!=0)//92%의 개발자가 이렇게 알고리즘 한줄 추가해서 처리
	System.out.println("오늘은"+md.getMonth()+"월"+md.getDay()+"일 입니다.");
	
	}
	
}