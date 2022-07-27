package com.incubation;

import java.util.Scanner;

public class HometasBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");  
		String name = sc.nextLine();  
		System.out.println("Hello, " + name);  
		
		System.out.println("Enter first number : ");
		int no1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int no2 = sc.nextInt();
		int addition = no1 + no2;
		int subtraction = no1 - no2;
		int multiply = no1 * no2;
		int division = no1/no2;
		System.out.println("Addition of 2 nos : "+ addition );  
		System.out.println("subtraction of 2 nos : "+ subtraction );  
		System.out.println("Multiplication of 2 nos : "+ multiply );  
		System.out.println("Division of 2 nos : "+ division );  		
		
	}

}
