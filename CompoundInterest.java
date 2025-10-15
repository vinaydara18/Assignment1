package com.codegnan.fundmentals;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Principal amount is :");
		double P=scanner.nextDouble();
		System.out.println("Rate of Interest in % is:");
		double R=scanner.nextDouble();
		System.out.println("Time in Years: ");
		double T=scanner.nextDouble();
		double Amount=P*Math.pow((1+R/100),T);
		double compoundinterest=Amount-P;
		System.out.println("compound interest is:"+compoundinterest);
		System.out.println("Total Amount is:"+Amount);
		scanner.close();

	}

}
