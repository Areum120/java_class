package com.encore.encapsulation;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//자동으로 숫자 생성
		int month = (int)(Math.random()*12)+1;
		int day = (int)(Math.random()*31)+1;
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		day = sc.nextInt();
		
		
		//
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (day>=1&& day<= 31)System.out.println("오늘은" + month+ "월"+ day +"일 입니다.");
				else System.out.println("해당하는 날짜가 아닙니다");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day>=1&& day<= 30)System.out.println("오늘은" + month+ "월"+ day +"일 입니다.");
				else System.out.println("해당하는 날짜가 아닙니다");
				break;
			case 2:
				if (day>=1&& day<= 28)System.out.println("오늘은" + month+ "월"+ day +"일 입니다.");
				else System.out.println("해당하는 날짜가 아닙니다");
				break;
			default:
				System.out.println("해당하는 월이 아닙니다.");
				break;
				
			}
		
		}
	}
