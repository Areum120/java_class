package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.util.MyDate;
/*
 * 1. 생년월일이 아니라 주소값이 출력
 * 2. Manager 정보중에서 dept 정보 출력이 안된다.
 */
public class InheritanceTest {
	public static void main(String[] args) {
		
		Manager m1 = new Manager("James", new MyDate(1965, 2, 12), 300000.0, "IT");
		Engineer eg1 = new Engineer("Gosling", new MyDate(1999, 3, 12), 350000.0, "Java",1000.0);
		Secretary s1 = new Secretary("Juliet", new MyDate(2000, 7, 12), 250000.0, "James");
			
		System.out.println(m1);//주소값
		System.out.println(eg1);
		System.out.println(s1);		
	}
}
