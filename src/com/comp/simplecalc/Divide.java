package com.comp.simplecalc;

import java.util.Scanner;

public class Divide extends SimpleCalc
{
	static Scanner console = new Scanner(System.in);
	public Divide(double x)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Now type the first number you would like to divide");
        int div1 = scan.nextInt();
        System.out.println("Now type the second number");
        int div2 = scan.nextInt();
        int div3 = div1 / div2;
        System.out.println("Equals " + div3);
	}
}
