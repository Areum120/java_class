package array.primitive.test;


/*
 * 배열을 선언, 생성, 초기화 동시에
 * 사이즈가 다른 배열의 요소를 copy해올 수 는 있다.
 * 
 */

public class BasicArrayTest2 {

	public static void main(String[] args) {
		//값이 6개라는 뜻은 사이즈가 6이란 것과 동일한 표현이다. 
		int[] target = {1,2,3,4,5,6}; // 배열 생성시 사이즈 반드시 명시!!?
		int[] source = {10,9,8,7,6,5,4,3,2,1};
		// 배열은 한번 지정한 사이즈를 수정할 수 없다. 사이즈를 늘리고 싶다면 어떻게?/... 10칸짜리 배열을 새로 생성 그래서 배열 한번 만들때 사이즈를 넉넉하게 만들어야 함. 사이즈 만들 때 새로운 객체를 만들어야 함.
		//		target = {1,2,3,4,5,6,7,8,9,10};
		
		
		// target 배열의 사이즈를 변경하지 않겠지만 요소는 source의 내용을 카피해올  것이다.
		//?
		// system 클래스의 arraycopy()를 사용해서 8,7,6,5,4,3으로 출력되도록 작성...
		System.arraycopy(source, 2, target, 0, target.length);
		
		//알고리즘 할 땐 이렇게 쓰기for(int i =0; i<target.length; i++)
		//	System.out.println(target[i]);
		
		
		//향상된 for문...forEach문..
		for(int i : target) System.out.println(i+"");
		
	}

}
