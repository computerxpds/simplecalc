package com.comp.simplecalc;

import java.util.Scanner;

public class Subtract extends SimpleCalc
{
	static Scanner console = new Scanner(System.in);
	public Subtract(double x)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Now type in the first number you would like to subtract");
	    int sub1 = scan.nextInt();
	    System.out.println("Now type the second number.");
	    int sub2 = scan.nextInt();
	    int sub3 = sub1 - sub2;
	    System.out.println(sub1 + " subtracted from " + sub2 + " equals " + sub3 + "!");
	}
	
}
