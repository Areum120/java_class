package Condition.test;

public class IfGradeTest1 {
	public static void main(String[] args) {
		
		int grade = 87;
		
		if(grade>=90 && grade<=100) System.out.println("A grade...");
		else if(grade>=80 && grade<90) System.out.println("B Grade...");
		else if(grade>=70 && grade<80) System.out.println("C Grade...");
		else System.out.println("Try Again..");
		
		
		/*��������
		 * &(and) |(or)
		 * && || --short Circuit
		 * ->>����� ������ ����� ����ȴ� ������ short Circit�� ���� ��
		 
		 *�ش� �ڵ��� ��������?
		 *���α׷��̶�?
		 
		 *�� ���α׷��� ������ 87���� ��쿡�� �ش�Ǵ� �ڵ�� �ۼ��Ǿ� �ִ�
		 *�ڵ忡 ���� ���� �ϵ��ڵ� �Ǿ��� ������ �ȵȴ�.
		 */
		
	}

}
