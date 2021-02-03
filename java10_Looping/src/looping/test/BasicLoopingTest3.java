package looping.test;

/*
 * 반복문 안에서의 continue 사용법
 * if가 참인 경우 반복문을 계속 한다.
 */

public class BasicLoopingTest3 {

	public static void main(String[] args) {
		//메소드안에서 실행하면 로컬 변수임. 로컬변수는 기본값이 없다. 초기화하고 사용해야 한다.
		int num = 0;
		int total = 0;
		
		for(num=1; num<=10; num++) {
			if(num % 2 == 0) continue;
			total += num;//바로 아래 있는 문장은 건너띄고 반복한다는 것
			
		}
		System.out.println("1부터 100까지의 홀수의 총점 "+total);
		
	}

}
