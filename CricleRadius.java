package com.codegnan.fundmentals;

import java.util.Scanner;

public class CricleRadius {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("radius of a Circle");
	float radius=scanner.nextFloat();
	double area=3.14*radius*radius;
	System.out.printf("Area of a Circle :%.2f",area);
	scanner.close();
	}

}
