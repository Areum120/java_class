package child;

import parent.Employee;
import util.MyDate;

public class Manager extends Employee{
	private String dept;

	public Manager(String name, MyDate birthDate, double salary, String dept) {
		super(name, birthDate, salary);//super 는 부모를 의미하는 키워드, 
		this.dept = dept;
	}
	//추가
	public String getDept() {
		return dept;
	}
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	public String getDetails() {
		return super.getDetails()+" , "+dept;
	}
	
}









