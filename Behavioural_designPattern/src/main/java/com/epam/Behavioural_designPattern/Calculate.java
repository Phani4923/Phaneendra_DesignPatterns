package com.epam.Behavioural_designPattern;

public class Calculate {

	public Calculator calculate;
	Calculate(Calculator calculate)
	{
		this.calculate=calculate;		
	}
	public void calculate(int a,int b)
	{
		calculate.calculation(a, b);		
	}
	
}
