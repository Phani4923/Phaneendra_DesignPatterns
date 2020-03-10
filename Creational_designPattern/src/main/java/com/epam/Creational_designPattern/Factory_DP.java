package com.epam.Creational_designPattern;

import java.util.*;
public class Factory_DP {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Phone Brand");
		String brandName=sc.next();
		
		PhoneCostFactory about=new PhoneCostFactory();
		
		Features phoneFeatures=about.getData(brandName);
		System.out.print(brandName+" RAM: ");
		phoneFeatures.ram();
		System.out.print(brandName+" Camera: ");
		phoneFeatures.camera();
		System.out.print(brandName+" Storage: ");
		phoneFeatures.storage();		
		System.out.print(brandName+" Cost: ");
		phoneFeatures.cost();
		
		sc.close();
	}
}
