package Condition.test;

import java.util.Scanner;

/*
 * step2
 * ����� ���� �޾Ƽ� ó���ϵ��� ������ �ۼ�
 * Scanner ��ü�� ����
 */

public class IfGradeTest2 {
public static void main(String[] args) {
		//java.lang�� �ƴ� �ٸ� ��Ű���� �ִ� Ŭ������ ����� ����
		//�ݵ�� import�ؼ� ��� ��
		//int grade = 87;
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���...\n");
		int grade = sc.nextInt();
		
		if(grade>=90 && grade<=100) System.out.println("A grade...");
		else if(grade>=80 && grade<90) System.out.println("B Grade...");
		else if(grade>=70 && grade<80) System.out.println("C Grade...");
		else System.out.println("Try Again..");
		
	
	}
	
}
