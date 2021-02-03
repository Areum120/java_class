package array.primitive.test;

public class BasicArrayMaxAndMinTest3 {

	public static void main(String[] args) {
		int[] score = {79,88,91,44,100,55,96};
		// score값 중에서 최고 점수와 최저점수를 콘솔창에 출력하는 로직을 작성
		//max, min값을 추려내는 알고리즘
		
		int min = score[0];//79배열의 첫번째 값으로 초기화
		int max = score[0];//79배열의 첫번째 값으로 초기화
		
		for(int i =0; i<score.length; i++) {
			if(score[i]<min) min = score[i];
			if(score[i]>max) max = score[i];
		}
		
		
	}

}
