package operator.test;
//자바에서 사용하는 기본적인 연산자를 알아보자.
public class OperatorTest1 {
	public static void main(String[] args) {
		Operator op1 = new Operator();
		Operator op2 = new Operator();
		
		op1 = op2; //주소값이 같아진다...op2로
		System.out.println(op1==op2); //true
		
		//short Circuit
		System.out.println(op1.test1() || op1.test2()); //true + false(뒤는 건너뛴다)
		System.out.println(op1.test2() && op1.test1()); //false +true(뒤는 건너뛴다)
		
		//로컬 변수를 선언과 초기화
		int i=5;
		int j=3;
		
		System.out.println(i==j);//false
		System.out.println(i!=j);//true
		System.out.println("연산자 % :: "+i % j);//2
		
		boolean flag = false;
		System.out.println(flag);//false
		System.out.println(!flag);
		
		int k = 10;
		System.out.println(k++);//다음번에 1을 증가시킨다..//10
		System.out.println(k);//11
		
		int m = 10;
		System.out.println(++m);//1을 먼저 증가시킨다...11
		System.out.println(m);//11
	}
}

class Operator{
	public boolean test1() {
		System.out.println("test1() calling....");
		return true;
	}
	public boolean test2() {
		System.out.println("test2() calling....");
		return false;
	}
}








