package com.encore.oop;
//����� ���� ������ �����ϴ� Ŭ����...
/*
 * Ŭ������ ����...����
 * ������Ҵ� 
 * 1)�ʵ� ::���� ����Ǵ� ����
 * 2)�޼ҵ�
 */
public class Person {
	//�ʵ� ���� : ����Ÿ Ÿ�� + �ʵ��;
	//�ʵ�� ��ġ�� �Ǵܵȴ�. Ŭ���� �ٷ� �Ʒ��� ����
	//== �޼ҵ�{} �ٱ��� ����ȴ�.
	public String name;
	public int age;
	public String address;
	
	//�޼ҵ� ���� : ����� + ������
	public void getPersonInfo() {//�����
		System.out.println(name+","+age+","+address);//������
	}
	
	//�ʵ忡 ���� �Ҵ��ϴ� ����� �߰��� ����...simple < detail
	//���ú����� �ʵ��� �̸��� �����Ҷ� �ʵ�տ� this�� �ٿ��� �������ش�.
	//
	public void setPersonInfo(String name, int age, String address) {//���ú���
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	
}//class



