package com.epam.Structural_designPattern;

public class Facade_DP {

	public static void main(String args[])
	{
		MainFactory nameFruit=new MainFactory();
		nameFruit.applecost();
		nameFruit.bananacost();
		nameFruit.orangecost();
	}
}
