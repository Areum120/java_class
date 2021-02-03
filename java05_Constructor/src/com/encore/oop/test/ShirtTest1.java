package com.encore.oop.test;

import com.encore.oop.Shirt;

/*
 * Test 클래스가 하는일
 * 실행하는 클래스...main()
 * 1. 메모리에 올린다.== 객체생성(new) == Shirt의 식구들이 메모리에 올라간다.
 * 2. 접근..메소드 호출..이때 객체를 가리키는 변수(참조변수)를 통해서 작업을 진행한다.
 */
public class ShirtTest1 {
	public static void main(String[] args) {
		//1. Shirt의 식구를 메모리에 올린다.==객체생성
		Shirt shirt  = new Shirt();
		
		//2. 사용(접근,호출)
		shirt.setShirt("나이키", true, 'W', 23.7F);
		
		System.out.println("========== Shirt Information===========");
		System.out.println(shirt.getShirt());//반환만 된다.
		shirt.printShirtInfo();
	}
}





