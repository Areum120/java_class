package com.encore.oop;
/*
 * ---  Identifier Rule or Convention (이름 짓는 방법) ---
 * 1.클래스 이름은 대문자로 시작해야 한다.
 * 설사 소문자로 시작하더라도 에러를 도출하진 않는다.
 * 2.변수 이름은 반드시 소문자로 시작해야 한다.
 *   숫자가 첫번째 나오면 안된다. 두번째 문자부터는 가능
 * 3.문자와 문자가 조합되었을때 2번째 문자의 첫번째 글자는 대문자로 한다.---Camel Case
 * 
 * 
 * Rule                | Convention(manner)
 * 안지키면 에러난다                  설사 안지키더라도 에러가 발생하진 않는다.
 * -----------------------------------------------------------------------
 * Greeting 클래스는 인사말을 콘솔창에 출력하는 클래스....
 * 
 */

public class Greeting {
	//인삿말을 저장할수 있는 공간을 하나 만들어준다...변수...
	//변수는 값이 저장되는 공간
	public String greet;
	public String toYou;
	
	public void sayHello() {
		// Ctrl +  Shift + /  --> 주석
		// Ctrl +  Shift + \ --> 주석 해제
		System.out.println(toYou+", "+greet);	
	}	
}




