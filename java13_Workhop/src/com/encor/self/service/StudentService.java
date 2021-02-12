package com.encor.self.service;

import com.encor.self.vo.Student;
import java.util.Scanner;

public class StudentService {
	

	private Student []s;
	int index;
	//상수...constance...변하지 않는 고정된 값
	public final int MAX_SIZE = 10;
	
	public StudentService() {
		s = new Student[MAX_SIZE];//10칸, 100칸 만들면 나중에 널값많이 들어갈 수도
		
		
	}
	//CRUD 기능을 정의..
	
	public void addStudent(Student student) {
		
		s[index]=s;
		
		System.out.println("이름 입력:");
		
		String name = SC.nextLine();
		
		System.out.println("주소 입력:");
		
		String address = SC.nextLine();
		
		System.out.println("나이 입력:");
		
		String age = SC.nextLine();
		
		System.out.println("학번 입력:");
		
		String hakbun = SC.nextLine();
		
		
		// create
		
	}
	public void readname(String name) {
		Student student = new Student();
		//read
		//select name, address, age, hakbun
		//from student
		return ;
		
	}
	
	
	
	
	//Method Overloading!!!
	public void deleteStudent(int ssn) {
		
	}
	public Student findstudent(String name) {
		return null;
		
		
	}
	
	public Student [] findStudent(String address) { //같은 동네
		
		return null;
	}
	
	
}
