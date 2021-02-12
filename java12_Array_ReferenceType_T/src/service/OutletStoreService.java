package array.reference.service;
/*
 * OutletStore에서 상품을 구매하는 고객의 기능들을 모아놓은 서비스 클래스
 * 이 클래스는 이후에 DAO 클래스로 디벨롭 될 것이다.
 * 
 */

import array.reference.vo.Customer;
import array.reference.vo.Product;

public class OutletStoreService {
	//1.
	public String[ ] getAllBrand(Customer vo) {//특정고객이 구입한 제품명...반환
		Product[ ] pros=vo.getProducts();
		String[ ] temp = new String[pros.length];
		
		int idx = 0;
		for(Product p : pros) temp[idx++] = p.getBrand();		
		return temp;
	}
	
	//2.
	public Customer[ ] getAllCustomer(Customer[] custs) {
		Customer[ ] cs = new Customer[custs.length];
		int idx = 0;
		for(Customer c : custs) cs[idx++] = c;
		return cs;
	}
	
	//3.
	public Customer getACustomer(Customer[] custs, int ssn) {
		Customer cust = null;
		for(Customer c : custs) {
			if(c.getSsn()==ssn) cust = c;
		}		
		return cust;
	}
	
	//4. 
	public int maxPriceProduct(Customer vo) {
		int max = 0;
		Product[ ] pros=vo.getProducts();
		for(Product p : pros) {
			if(p.getPrice()>max) max = p.getPrice();
		}
		return max;
	}
	// 추가적으로 필요한 기능을 함께 구현하세요...	
	public int getAvgPrice(Customer vo) {
		int total = 0;
		Product[] pros = vo.getProducts();
		for(Product p : pros) 
			total += p.getPrice();
		
		return total/pros.length;		
	}
	//5. 
	public Product[ ] getMoreAvgProduct(Customer vo) {
		Product[ ] pros=vo.getProducts();
		Product[ ] temp = new Product[pros.length];
		int idx = 0;
		for(Product p: pros) {
			if(p.getPrice()>=getAvgPrice(vo))
				temp[idx++] = p;
		}
		return temp;
	}	
}







