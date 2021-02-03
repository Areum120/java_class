package com.encore.oop;
//Shirt에 정보를 담고 있는 클래스...
public class Shirt {
	//1.  필드 선언
	public String maker;
	public boolean longSleeved;
	public char color;
	public float price;//double
	
	//2. 값 주입..기능을 정의
	public void setShirt(String maker, boolean longSleeved,char color,float price) {
		//필드 초기화
		this.maker=maker;
		this.longSleeved = longSleeved;
		this.color = color;
		this.price = price;
	}
	
	//3. 값 받아옴
	//String + No-String 이  Concat ==> String 화 되어진다.
	public String getShirt() {
		return maker+" ,"+longSleeved+","+color+","+price;//getShirt() calling
	}	
	
	//3-1.
	public void printShirtInfo() {
		System.out.println(maker+" "+longSleeved+","+color+","+price);
	}
}







