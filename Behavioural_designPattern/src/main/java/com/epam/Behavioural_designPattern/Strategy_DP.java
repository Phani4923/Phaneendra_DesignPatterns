package com.epam.Behavioural_designPattern;

import java.util.*;

public class Strategy_DP {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		
		Calculate add = new Calculate(new Addition());		
	    add.calculate(a,b);
	    Calculate divide = new Calculate(new Division());		
	    divide.calculate(a,b);
	    Calculate squareroot = new Calculate(new SquareRoot());		
	    squareroot.calculate(a,b);
	    
	    scan.close();
	}
	
}
