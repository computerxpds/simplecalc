package com.comp.simplecalc;

import java.util.Scanner;

public class Multiply extends SimpleCalc
{

	static Scanner console = new Scanner(System.in);
	public Multiply(double x)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Now type in the first number you would like to multiply");
        int mult1 = scan.nextInt();
        System.out.println("Now type the second number");
        int mult2 = scan.nextInt();
        int mult3 = mult1 * mult2;
        System.out.println("Equals " + mult3);
	}
}
