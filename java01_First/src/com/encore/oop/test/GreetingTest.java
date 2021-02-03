package com.encore.oop.test;
import com.encore.oop.Greeting;
/*
 * 값을 저장하고
 * 기능이 정의되어져 있는 클래스
 * 
 * 값을 할당해서 기능을 호출하는...실행(테스트) 클래스
 */
public class GreetingTest {
	public static void main(String[] args) {
		Greeting g = new Greeting();
		g.greet = "안녕?";
		g.toYou = "구동매";
		g.sayHello();
	}
}
