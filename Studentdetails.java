package com.codegnan.fundmentals;

import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name:");
		String Name=scanner.next();
		System.out.println(" Enter RollNumber:");
		int N=scanner.nextInt();
		System.out.println("Enter age:");
		int age=scanner.nextInt();
		System.out.println("Enter Grade:");
		String Grade=scanner.next();
		System.out.println("Student details");
		System.out.println("Name :"+Name);  
		System.out.println("RollNumber :"+N);  
		System.out.println("Age :"+age); 
		System.out.println("Grade :"+Grade);  
		scanner.close();
	}

}
