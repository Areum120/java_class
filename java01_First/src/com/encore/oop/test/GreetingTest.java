package com.encore.oop.test;
import com.encore.oop.Greeting;
/*
 * ���� �����ϰ�
 * ����� ���ǵǾ��� �ִ� Ŭ����
 * 
 * ���� �Ҵ��ؼ� ����� ȣ���ϴ�...����(�׽�Ʈ) Ŭ����
 */
public class GreetingTest {
	public static void main(String[] args) {
		Greeting g = new Greeting();
		g.greet = "�ȳ�?";
		g.toYou = "������";
		g.sayHello();
	}
}
