/*
 * PersonTest  Ŭ������ Person Ŭ������ �����ϴ� ����Ŭ����
 * �����ϱ� ���ؼ��� Person �� �޸𸮿� �÷����Ѵ� == ��ü����
 * ������ ����� �ʵ�� �޼ҵ��̴�.
 * 1) �ʵ� --> ���� �Ҵ�
 * 2) �޼ҵ� --> �޼ҵ带 ȣ��
 */
package com.encore.oop.test;

import com.encore.oop.Person;

/*
 * step1.
 * �ش� �ڵ��� ������
 * ��ü�� �����Ҷ����� ������ �ʵ忡 ���� ���� �Ҵ��ϰԵǸ�
 * �ڵ������ �ʹ� ��������.
 * 
 * �ذ�å
 * ������ �ʵ忡 ���� �Ҵ��ϴ� �޼ҵ带 �ϳ� �����ϰ�
 * �� �޼ҵ带 ����ؼ� ���Ҵ�����.
 */
public class PersonTest {
	public static void main(String[] args) {
		//1.��ü����
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		//2. ���Ҵ�....field�� ���� ���� ����...���α׷��� �ƴϴ�.
		p1.name = "��ȣ��";
		p1.age = 44;
		p1.address = "�Ż絿";
		
		p2.name = "�̼���";
		p2.age = 40;
		p2.address = "���ǵ�";
		
		
		p1 = p2;  //200  200--p2
		
		System.out.println(p1); 
		System.out.println(p2);
		
		//3. �޼ҵ� ȣ��
		p1.getPersonInfo();
		p2.getPersonInfo();
	}
}






