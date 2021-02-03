package com.encore.banking.test;

import com.encore.banking.Account;
import com.encore.banking.Customer;

//1.객체 생성
//2.james라는 고객이 잔액이 1만원인 통장을 개설
//3.james가 개설한 통장을 받아와서
//4.7천원을 입금, 2000원을 입금, 5천원을 출금
//5.최종적인 잔액을 확인...14,000원이 맞는지를 출력

public class BankingTest1 {
	public static void main(String[] args) {
		//1.
		Customer c1 = new Customer("James", 1111);	
		//2.
		c1.setAccount(new Account(10000.0));//생성과 동시에 주입한다.
		//3.
		Account jamesAcc=c1.getAccount();		
		//4.
		jamesAcc.deposit(7000.0);
		jamesAcc.deposit(2000.0);
		jamesAcc.withdraw(5000.0);
		//5.
		System.out.println("James Account Balance :: "+jamesAcc.getBalance());		
	}
}
