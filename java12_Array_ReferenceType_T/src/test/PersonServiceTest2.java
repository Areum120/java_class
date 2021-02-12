package test;

import service.ProductService;
import vo.Product;

public class PersonServiceTest2 {
	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("HP", 120, 1),
				new Product("Samsung", 80, 2),
				new Product("Apple", 42,3),
				new Product("Apple", 200,2)
		};

		ProductService service = new ProductService();
		System.out.println("1. 모든 제품의 브랜드 명을 출력합니다...");
		service.printAllProductBrand(pros);
		
		System.out.println("2. 모든 제품의 총가격을 리턴합니다...");
		System.out.println(service.getTotalPrice(pros)+ "만원");
		
		System.out.println("3. 모든 제품의 평균가격을 리턴합니다...");
		System.out.println(service.getAvgPrice(pros)+ "만원");
		
		System.out.println("4. 100만원 이상의 고가제품의 정보를 출력합니다...");
		service.printOverPrice(pros, 100);
		
		System.out.println("5. 특정한 회사 제품을 리턴하는 기능을 정의합니다...");
		Product[ ] products = service.getCertainBrand(pros, "Apple");
		for(Product p : products) {
			if(p==null)continue;
			System.out.println(p.getDetails());
		}			
	}
}







