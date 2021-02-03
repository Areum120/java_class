package looping.test;

public class BasicLoopingTest1 {

	public static void main(String[] args) {
		System.out.println("=======for=======");
		for(int i=0, j=0; i<10&& j<10;i++) {
			System.out.println(i+".Hello....for Looping Test");
		}
		//for는 몇번 돌 지 알 때, 사이즈를 알고 있을 때 사용
		
		System.out.println("\n===============while=================");
		int i = 0;
		while(i<10) {
			System.out.println(i+".Hello...while Looping Test");
			i++;
			//while은 언제 끝날지 모를 떄, 있는 만큼 다 뽑아 낼 떄 사용
		}
		
		System.out.println("\n================do~while=============");
		int j =0;
		do {
			//이부분은 반드시 수행된다.  
			System.out.println(j+"..Always Prints...");
		j++;	
		}while(j<10);
		
		
		
//i가 10보다 작은 게 true이기 때문에 실행 i가 10이면 코드 블럭 빠져나오게 되어 있음, 즉 조건문이 true일때 실행
	}

}
