package test;

import vo.Product;

public class PersonArrayTest1 {
	public static void main(String[] args) {
/*		Product pro1 = new Product("HP NoteBook", 120, 1);
		Product pro2 = new Product("SM SmartPhone", 80, 2);
		Product pro3 = new Product("Wacom One", 42,3);
		
		Product[ ] pros = new Product[3];*/
		
		Product[ ] pros = {
				new Product("HP", 120, 1),
				new Product("Samsung", 80, 2),
				new Product("Apple", 42,3),
				new Product("Apple", 200,2)
		};
		
		System.out.println("배열의 주소값 : "+pros);
		
		System.out.println("=======배열안의 객체의 정보를 출력 ========= ");
		for(int i=0; i<pros.length; i++) 
			System.out.println(pros[i].getDetails());
		
		System.out.println("=======배열안의 객체의 정보를 출력 :: 향상된 for문 사용========= ");
		for(Product p:pros)	System.out.println(p.getDetails());
		
		//1. pros 배열안에 있는 각 제품들의 브랜드 명만 출력하세요
		System.out.println("각 제품 브랜드 이름입니다...");
		for(Product p : pros) System.out.println(p.getBrand());
		
		//2. pros 배열안에 있는 제품들 중에서 100만원이 넘는 고가의 제품의 이름과 가격을 출력하세여
		System.out.println("100 만원 이상 가격의 제품입니다...");
		for(Product p : pros) {
			if(p.getPrice()>=100)System.out.println(p.getBrand()+","+p.getPrice());
		}
		//3. pros 배열안에 있는 제품들의 총 가격을 출력하세요
		
		int total = 0;
		for(Product p : pros) total += p.getPrice();
		System.out.println("제품의 총 가격입니다...."+total+" 만원");
		
		//4. pros 배열안에 있는 제품들의 평균가격을 출력하세여.
	}
}
