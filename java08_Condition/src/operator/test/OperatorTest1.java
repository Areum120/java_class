package operator.test;
//�ڹٿ��� ����ϴ� �⺻���� �����ڸ� �˾ƺ���.
public class OperatorTest1 {
	public static void main(String[] args) {
		Operator op1 = new Operator();
		Operator op2 = new Operator();
		
		op1 = op2; //�ּҰ��� ��������...op2��
		System.out.println(op1==op2); //true
		
		//short Circuit
		System.out.println(op1.test1() || op1.test2()); //true + false(�ڴ� �ǳʶڴ�)
		System.out.println(op1.test2() && op1.test1()); //false +true(�ڴ� �ǳʶڴ�)
		
		//���� ������ ����� �ʱ�ȭ
		int i=5;
		int j=3;
		
		System.out.println(i==j);//false
		System.out.println(i!=j);//true
		System.out.println("������ % :: "+i % j);//2
		
		boolean flag = false;
		System.out.println(flag);//false
		System.out.println(!flag);
		
		int k = 10;
		System.out.println(k++);//�������� 1�� ������Ų��..//10
		System.out.println(k);//11
		
		int m = 10;
		System.out.println(++m);//1�� ���� ������Ų��...11
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








