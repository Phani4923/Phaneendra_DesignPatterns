package com.epam.Creational_designPattern;

public class PhoneCostFactory {
	public Features getData(String phoneName)
	{
		if(phoneName.equalsIgnoreCase("Samsung"))
		{
			return new Samsung();
		}
		else if(phoneName.equalsIgnoreCase("OPPO"))
		{
			return new OPPO();
		}
		else if(phoneName.equalsIgnoreCase("MOTOROLA"))
		{
			return new Moto();
		}
		return null;
		
	}
}
