package com.encore.banking;
/*
 * 통장을 개설하는 고객의 정보를 담고 있는 클래스
 * Account 를 Customer가 Hasing 한다
 * 이런 클래스 간의 관계를 Has a Relation 이라 한다.
 * has a 관계는 다른 객체를 받아들여서 그 기능을 사용하는 것이다.
 * 다른 객체의 기능을 사용하고 싶기 때문
 * 1. 필드에 가지고자 하는 클래스를 선언
 *    Account a;
 * 2. 주입 -- setter
 */
public class Customer {
	
	public String name;
	public int ssn;	
	public Account account;	//가지고자 하는 클래스 변수 선언
	
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}	
	//값을 입력
	public void setAccount(Account account) {
		this.account = account;
	}	
	public String getName() {
		return name;
	}
	public int getSsn() {
		return ssn;
	}	
	public Account getAccount() {
		return account;
	}	
}
