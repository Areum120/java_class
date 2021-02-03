package com.encore.oop.test;

import com.encore.oop.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();//기본 생성자 호출..null, 0, null값인 사람이 생성	
		Person p2 = new Person("호호",22,"방배동");//명시적 생성자,,인자값이 있다.
		
		
		p.setPersonInfo("하하", 33, "신당동");//그리고 나서 새로운 값을 주입
		p.getPersonInfo();
		
		p2.getPersonInfo();	

	}
}
