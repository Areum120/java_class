package child;

import parent.Employee;
import util.MyDate;

public class Secretary extends Employee{
	private String bossOfName;
	
	
	public Secretary(String name, MyDate birthDate, double salary,String bossOfName) {
		super(name, birthDate, salary);//super 는 부모를 의미하는 키워드, 
		this.bossOfName = bossOfName;		
	}
	
	public String getDetails() {
		return super.getDetails()+" , "+bossOfName;
	}	
}









