package Condition.test;

import java.util.Scanner;

public class SwitchGradeTest4 {
	public static void main(String[] args) {
		//local Variable... �޼ҵ� �ȿ� ����� ����..�⺻���� ����...���� �Ҵ��ؾߵȴ�.
		//�޼ҵ� �ۿ����� ����Ҽ� ����...����ϸ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �̸��� �Է��ϼ���");
		String name=sc.nextLine();//�̸�
		
		System.out.println("����� ����� �Է��ϼ���");
		String grade=sc.nextLine();//���		
		
		String message=""; //�ʱ�ȭ		
		switch(grade) {
			case "A" :
				message = name+"��, ����� ������ 90~100���Դϴ�.";
				//break;
			case "B" :
				message = name+"��, ����� ������ 80~89���Դϴ�.";
				//break;
			case "C" :
				message = name+"��, ����� ������ 70~79���Դϴ�.";
				//break;
			default:
				message = name+"��, Try Again!!";
				//break;
		}//		
		System.out.println(message);
	}	
}









