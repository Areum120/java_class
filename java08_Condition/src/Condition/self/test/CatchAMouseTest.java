package Condition.self.test;
import java.util.Scanner;

/*
 * package
 * static---��ü������ �ʿ���� �̸� �� �κ��� �޸𸮰� �ö� �ִ�
 * Scanner
 * abs()
 * if
 * Array �����ϱ� ���� 
 */
//static ���� �޼ҵ�� ���߾���. ���θ޼ҵ�� ���� ������ �Ǿ�� �Ǳ� ������ static�� �׻� �ö� ����. new�� �������� �ʱ� ���� static�� ����� ����.
public class CatchAMouseTest {
	public static String solv(int x, int y, int z) {
//		x���� z�� �� �Ÿ�:CatB, y���� z ���� �Ÿ�:CatA 
		if(Math.abs(x-z)> Math.abs(y-z)) return "CatB Catch a Mouse!!";
		else if(Math.abs(x-z)< Math.abs(y-z)) return "CatA Catch a Mouse!!";
//		�� ���̿� �ִ� ���
		else return "Mouse Escapes!!!";
								
	}
//	Scanner �Լ��� �� ���� �ɱ�??
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//������� ���� �Է¹޴´�..
		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouse = sc.nextInt();
		
		//CatchMouseTest t = new CatchMouseTest();
		String result = CatchAMouseTest.solv(catA, catB, mouse);//calling
		System.out.println("Result : "+result);
		
	}

}
