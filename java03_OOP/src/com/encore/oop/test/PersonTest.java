/*
 * PersonTest  클래스는 Person 클래스에 접근하는 실행클래스
 * 접근하기 위해서는 Person 을 메모리에 올려야한다 == 객체생성
 * 접근의 대상은 필드와 메소드이다.
 * 1) 필드 --> 값을 할당
 * 2) 메소드 --> 메소드를 호출
 */
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
public class PersonTest {
	public static void main(String[] args) {
		//1.객체생성
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		//2. 값할당....field에 직접 값을 주입...프로그램이 아니다.
		p1.name = "강호동";
		p1.age = 44;
		p1.address = "신사동";
		
		p2.name = "이수근";
		p2.age = 40;
		p2.address = "여의도";
		
		
		p1 = p2;  //200  200--p2
		
		System.out.println(p1); 
		System.out.println(p2);
		
		//3. 메소드 호출
		p1.getPersonInfo();
		p2.getPersonInfo();
	}
}






