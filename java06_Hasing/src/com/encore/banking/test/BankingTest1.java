package com.encore.banking.test;

import com.encore.banking.Account;
import com.encore.banking.Customer;

//1.��ü ����
//2.james��� ���� �ܾ��� 1������ ������ ����
//3.james�� ������ ������ �޾ƿͼ�
//4.7õ���� �Ա�, 2000���� �Ա�, 5õ���� ���
//5.�������� �ܾ��� Ȯ��...14,000���� �´����� ���

public class BankingTest1 {
	public static void main(String[] args) {
		//1.
		Customer c1 = new Customer("James", 1111);	
		//2.
		c1.setAccount(new Account(10000.0));//������ ���ÿ� �����Ѵ�.
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
