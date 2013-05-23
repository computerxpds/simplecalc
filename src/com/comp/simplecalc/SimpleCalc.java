package com.comp.simplecalc;

/**
 * A simple java calculator.
 * @author Dakota Strickner (computerxpds)
 * @version 1
 * @build 13
 * This very arcain and simple calculator will be able to do 2 variable operations. 
 */
//import
import java.util.*;

import com.comp.simplecalc.*;
//define class
public class SimpleCalc
{

    static Scanner console = new Scanner(System.in);
    //main string
    public static void main(String[] args)
    {
        //boolean start
        boolean go = true;
        {
            //Beginning output/instructions
            System.out.println("This is my java calculator!");
            System.out.println("Version 1, all words that have a capital need to be input with a capital");
            System.out.println("Enter Add, Subtract, Multiply, or Divide");
            //importing two scanners
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            
            //start of action string
            String action = scan.nextLine();
            //first 
            if("Add".equals(action))
            {
            	Add Add = new Add(0);
            	//debug/test line
            	System.out.println("Add complete");
            }
            if("Subtract".equals(action))
            {
                Subtract Subtract = new Subtract(0);
                //debug line
                System.out.println("Subtraction");
            }
            if("Multiply".equals(action))
            {
                Multiply Multiply = new Multiply(0);
                //debug line
                System.out.println("Multiply");
            }
            if("Divide".equals(action))
            {
                Divide Divide = new Divide(0);
                //debug line
                System.out.println("Divide");
            }
            if("Exit".equals(action))
            {
            	System.out.println("Exited");
            }
            if(!"Exit".equals(action))
            {
            	System.out.println("Invalid entry, Restarted!");
            	main(null);
            }
        }
    }
}