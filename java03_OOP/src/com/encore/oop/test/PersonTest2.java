package com.encore.oop.test;

import com.encore.oop.Person;

/*
 * step1.
 * 해당 코드의 문제점
 * 객체를 생성할때마다 각각의 필드에 직접 값을 할당하게되면
 * 코드라인이 너무 많아진다.
 * 
 * 해결책
 * 각각의 필드에 값을 할당하는 메소드를 하나 정의하고
 * 그 메소드를 사용해서 값할당하자.
 */
public class PersonTest2 {
	public static void main(String[] args) {
		//1.객체생성
		Person p1 = new Person();
		Person p2 = new Person();
		
		//2. 값할당
		p1.setPersonInfo("강호동", 44, "신사동");
		p2.setPersonInfo("이수근", 40, "여의도");		
	
		
		//3. 메소드 호출
		p1.getPersonInfo();
		p2.getPersonInfo();
	}
}






