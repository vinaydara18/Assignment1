package com.codegnan.fundmentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Principal Amount is:");
		double p=scanner.nextDouble();
		System.out.println("Rate of Interest in % is:");
		double r=scanner.nextDouble();
		System.out.println("Time in Years :");
		double t=scanner.nextDouble();
		double SimpleInterest=(p*r*t)/100;
		double amount=SimpleInterest+p;
		System.out.println("Simple Interest :"+SimpleInterest );
		System.out.println("Toatal amount is:"+amount);
		scanner.close();
	}

}
