package array.primitive.test;

import java.util.Scanner;

/*
 * input sample
 * Scanner로 입력 받는다.
 * 6
 * 1 4 4 4 5 3
 */


public class ArrayPersonTypeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int타입의 배열을 생성..사이즈는 얼마로?
		int num = sc.nextInt();//
		int [] people = new int[num];
		
		for(int i=0; i<people.length; i++)
			people[i] = sc.nextInt();
		
		//제어문 switch 사용해서 문제를 해결하는 알고리즘을 만들어서 결과를 출력해보세요
		
		int[] types = new int[5]; // int형 types 자료가 5개
		for(int i = 0; i<people.length; i++) { 
			// i가 people에 들어있는 데이터 길이 만큼 증가 개수만큼 반복문 실행
			
			switch(people[i]) {
			case 1:
				types[0]++;// 값 저장 후 변수 증가
				break;
			case 2:
				types[1]++;
				break;
			case 3:
				types[2]++;
				break;
			case 4:
				types[3]++;
				break;
			case 5:
				types[4]++;
				break;
			}
		}
		int max = 0;
		for(int i=0; i<types.length;i++) {
			if(max<types[i])max = types[i];
		}			
		//max값에 해당하는 인덱스를 다시 찾는다.
		int answer = 0;

			for(int i = 0; i<types.length;i++) {
				if(max==types[i]) answer = i+1;
			}
			System.out.println("Result : "+ answer);
		
	}
		
}
	
	/*백경주씨 코드
	 * 
	 * for( int i = 0 ; i< num; i++) {
			people[i] = sc.nextInt();
		}
		
		for (int i =0; i<num; i++) {
			sum[people[i]-1]++;
		}
		
		int max =0;
		int index = 0;
		for(int i=0; i<5; i++) {
			if(sum[i]>max) {
				max = sum[i];
				index = i+1;
			 }
			}

		 
		System.out.println(index);

	 */
