package array.primitive.test;

class ArrayExam{
	String type="배열";
	
	public String type() {
		return "배열";
	}
}
//[i@12h34556
//배열은 클래스가 존재하지 않는 객체이다.
//멤버를 api를 통해서 확인할 없다.
public class BasicArrayTest1 {
	public static void main(String[] args) {
		//1. int타입의 배열을 생성...3칸짜리
		int[] arr = new int[3];
		System.out.println("배열의 주소값 출력 : "+arr);
		
		ArrayExam exam = new ArrayExam();
		System.out.println("ArrayExam의 주소값 출력 : " +exam);
		
		//2. 배열안에 있는 기본값 출력
		for(int i=0; i<arr.length; i++) //사이즈를 리턴하는 배열의 필드
			System.out.print(arr[i]+" ");//0
		
		//3. 초기화
		arr[0] = 11;  arr[1] = 22;  arr[2] = 33;
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");//11,22,33		
	}
}








