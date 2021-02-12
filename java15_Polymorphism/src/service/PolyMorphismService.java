package service;

import child.Manager;
import parent.Employee;

public class PolyMorphismService {
	//1. step1
   /*public void handleManager(Manager m) {     }
   public void handleEngineer(Engineer eg) {	 }
   public void handleSecretary(Secretary s) {	  }*/
	
	//2. step2
	//public void handleEmployee(Employee e) {     }
	
	//3. step3
	public void handleEmployee(Employee[] earr) { 
		for(Employee e : earr) {
			if(e instanceof Manager) {//Manager객체만true
				if(e.getName().equals("James"))
					((Manager)e).changeDept("기획부");
			}
			
			/*if(e instanceof Engineer) {
				if(e.getName().equals("Engineer1"))
					//((Engineer)e).changeTech("Pytorch");
			}*/
		}
	}
}
















