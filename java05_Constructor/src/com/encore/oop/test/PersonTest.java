package com.encore.oop.test;

import com.encore.oop.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();//�⺻ ������ ȣ��..null, 0, null���� ����� ����	
		Person p2 = new Person("ȣȣ",22,"��赿");//����� ������,,���ڰ��� �ִ�.
		
		
		p.setPersonInfo("����", 33, "�Ŵ絿");//�׸��� ���� ���ο� ���� ����
		p.getPersonInfo();
		
		p2.getPersonInfo();	

	}
}
