package com.codegnan.fundmentals;

import java.util.Scanner;

public class SimpleandCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Principal amount is:");
		double p=scanner.nextDouble();
		System.out.println("Annual Rate of interest in %:");
		double r=scanner.nextDouble();
		System.out.println("Time in Months:");
		int t=scanner.nextInt();
		double t1=t/12;
		double simpleinterest=(p*r*t1)/100;
		double simpleamount=simpleinterest+p;
		double Amount=p*Math.pow((1+r/100),+t1);
		double compoundinterest=Amount-p;
		System.out.println("Time in Years:"+t1);
		System.out.println("simple Interest is :"+simpleinterest);
		System.out.println("Total amount with simpleInterest is:"+simpleamount);
		System.out.println("compound Interest is:"+compoundinterest);
		System.out.println("Total amount with compoundInterest is:"+Amount);
		scanner.close();
	}

}
