package com.tnsif.scanner;

import java.util.Scanner;

public class Main {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your Age:");
		String Age = sc.nextLine();
		
		System.out.println("Enter your salary:");
		double salary = sc.nextInt();
		
		System.out.println("Name"+ name);
		System.out.println("Age"+ Age);
		System.out.println("salary"+ salary);
		
	}

}
