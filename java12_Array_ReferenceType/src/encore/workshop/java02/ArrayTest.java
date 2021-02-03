package encore.workshop.java02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] Num;
		Num = new int[] {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
		//1. 배열 생성하고, 배열에 입력된 값을 출력
		for(int i = 0; i< Num.length; i++) {
			System.out.println(Num[i]);
		}
		//2. 배열에 입력된 값의 합계를 구하여 출력
		
		int total = 0;
		for(int i= 0; i <Num.length; i++){
			total+=Num[i];
			System.out.println("배열의 합:"+total);
		}
		
		
		//3. 배열에 입력된 값의 평균을 구하여 출력
		
		int average = 0;
		average = (int) total / Num.length;		
		System.out.println("배열의 평균:"+average);
		
		//4. 배열에 입력된 최소값을 구함
		
		int minimum = Num[0]; //최소값
		for(int i =0; i<Num.length; i++) {
			if(minimum>Num[i]) {
				minimum = Num[i];
			}
		System.out.println("배열의 최소값:"+minimum);
		}
				
		//5. 배열에 입력된 값을 오름차순으로 정렬
		System.out.println("====selection sort(Ascending Oreder)===");
		Arrays.sort(Num);
		
		for(int i : Num) {
			System.out.println("["+i+"]");
			
		}
	
		

	}
	
	

}
