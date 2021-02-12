package child;

import parent.Employee;
import util.MyDate;

public class Engineer extends Employee{
	private String tech;
	private double bonus;
	
	public Engineer(String name, MyDate birthDate, double salary,String tech,double bonus) {
		super(name, birthDate, salary);//super 는 부모를 의미하는 키워드, 
		this.tech = tech;
		this.bonus = bonus;
	}
	
	public String getDetails() {
		return super.getDetails()+" , "+tech;
	}

}









