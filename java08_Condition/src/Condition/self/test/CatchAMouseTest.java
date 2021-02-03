package Condition.self.test;
import java.util.Scanner;

/*
 * package
 * static---객체생성할 필요없이 미리 이 부분은 메모리가 올라가 있다
 * Scanner
 * abs()
 * if
 * Array 공부하기 위한 
 */
//static 메인 메소드로 맞추었음. 메인메소드는 먼저 실행이 되어야 되기 때문에 static이 항상 올라가 있음. new를 생성하지 않기 위해 static을 사용한 것임.
public class CatchAMouseTest {
	public static String solv(int x, int y, int z) {
//		x에서 z를 뺀 거리:CatB, y에서 z 사이 거리:CatA 
		if(Math.abs(x-z)> Math.abs(y-z)) return "CatB Catch a Mouse!!";
		else if(Math.abs(x-z)< Math.abs(y-z)) return "CatA Catch a Mouse!!";
//		둘 사이에 있는 경우
		else return "Mouse Escapes!!!";
								
	}
//	Scanner 함수를 왜 쓰는 걸까??
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//순서대로 값을 입력받는다..
		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouse = sc.nextInt();
		
		//CatchMouseTest t = new CatchMouseTest();
		String result = CatchAMouseTest.solv(catA, catB, mouse);//calling
		System.out.println("Result : "+result);
		
	}

}
