package array.reference.service;

import array.reference.vo.Product;

//1. 모든 제품의 브랜드 명을 출력하는 기능을 정의
	//2. 모든 제품의 총가격을 리턴하는 기능을 정의
	//3. 모든 제품의 평균가격을 리턴하는 기능을 정의
	//4. 100만원 이상의 고가제품의 정보를 출력하는 기능을 정의
	//5. 특정한 회사 제품을 리턴하는 기능을 정의	
	// 1~5 번까지의 기능을 정의 (선언부 + 구현부)

public class ProductService {
	public void printAllProductBrand(Product[ ] pros) {//인자값으로 Hasing
		for(Product p : pros) System.out.println(p.getBrand());
	}
	public int getTotalPrice(Product[ ] pros) {//인자값으로 Hasing
		int total = 0;
		for(Product p : pros) {
			total += p.getPrice();
		}
		return total;
	}
	
	public int getAvgPrice(Product[ ] pros) {//인자값으로 Hasing				
		return getTotalPrice(pros)/pros.length;//위에 정의된 기능을 여기서 재사용한다. 
	}
	
	public void printOverPrice(Product[ ] pros, int price) {
		for(Product p : pros) {
			if(p.getPrice()>=price)
				System.out.println(p.getBrand()+","+p.getPrice());
		}//for
	}
	
	//String 아님..
	public Product[ ] getCertainBrand(Product[ ] pros,String brand) {
		Product[ ] products= new Product[pros.length];
		//향상된  for문으로 바꾸세요..
		/*for(int i=0; i<pros.length; i++) {
			if(pros[i].getBrand().equals(brand)) 
				products[i] = pros[i];	  			
		}*/
		int idx = 0;
		for(Product p : pros) {
			if(p.getBrand().equals(brand))
				products[idx++] = p;			
		}
		return products;
	}	
}









