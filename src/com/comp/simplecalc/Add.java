package com.comp.simplecalc;

import java.util.Scanner;

public class Add extends SimpleCalc
{
	static Scanner console = new Scanner(System.in);
	public Add(double x)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Now type in the first number you would like to add.");
		int add1 = scan.nextInt();
		System.out.println("Now type the second number.");
		int add2 = scan.nextInt();
		int add3 = add1 + add2;
		System.out.println(add1 + " added to " + add2 + " equals " + add3 + "!");
		final int Add4 = add3;
	}
}
