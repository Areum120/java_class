package array.reference.vo;
/*
 * 상품에 대한 정보를 저장하는 클래스..
 */
public class Product {
	private String brand;
	private int price;
	private int quantity;
	
	public Product(String brand, int price, int quantity) {
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}	
	public String getDetails() {
		return brand+", "+price+","+quantity;
	}	
	//기능 추가
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	
}
