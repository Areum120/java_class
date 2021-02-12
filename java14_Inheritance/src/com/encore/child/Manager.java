package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Manager extends Employee{
	private String dept;

	public Manager(String name, MyDate birthDate, double salary, String dept) {
		super(name, birthDate, salary);//super 는 부모를 의미하는 키워드, 
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [dept=" + dept + "]";
	}		
	
	//getDetails() 를 쓸수 있지만....자식의 기능이 아니라 부모의 기능을 사용하게 된다.
	//물려받되 기능을 자신에게 맞는 것으로 다시 고쳐써야 한다.
	//Method Overriding
	
	/* 
	 * 반드시 상속관계에 있는 2개의 클래스에서 발생하는 성질이다.
	 * 1) 부모가 가진 것을 그대로 물려받는다.
	 * 2) 그걸 다시 고친다.
	 * 
	 * <<Syntax>>
	 *  선언부는 같지만
	 *  구현부가 달리짐으로
	 *  매소드의 기능을 다시 정의할때 사용한다.
	 *  1. 메소드 선언부는 모두 일치한다.
	 *  2. 메소드의 구현부는 반드시 달라진다.
	 *  --> 메소드의 하는일이 달라진다...새로운 메소드가 다시 만들어진다...는 의미로 메소드 재정의
	 */
//	public String getDetails() {
//		return super.getDetails()+" , "+dept;
//	}
	
}









