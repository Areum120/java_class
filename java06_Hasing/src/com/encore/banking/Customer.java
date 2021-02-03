package com.encore.banking;
/*
 * ������ �����ϴ� ���� ������ ��� �ִ� Ŭ����
 * Account �� Customer�� Hasing �Ѵ�
 * �̷� Ŭ���� ���� ���踦 Has a Relation �̶� �Ѵ�.
 * has a ����� �ٸ� ��ü�� �޾Ƶ鿩�� �� ����� ����ϴ� ���̴�.
 * �ٸ� ��ü�� ����� ����ϰ� �ͱ� ����
 * 1. �ʵ忡 �������� �ϴ� Ŭ������ ����
 *    Account a;
 * 2. ���� -- setter
 */
public class Customer {
	
	public String name;
	public int ssn;	
	public Account account;	//�������� �ϴ� Ŭ���� ���� ����
	
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}	
	//���� �Է�
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
