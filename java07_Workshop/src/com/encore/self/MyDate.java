package com.encore.self;
//���� �����Ͽ� ���� ������ �����ϴ� Ŭ����
public class MyDate {
	public int year;
	public int month;
	public int day;
	
	public MyDate(int year, int month, int day) {
//		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getMyDate() {
		return year+"-"+month+"-"+day;
	}

	@Override
	public String toString() {
		return  year + "-" + month + "-" + day;
	}

	
	
	
}
//account