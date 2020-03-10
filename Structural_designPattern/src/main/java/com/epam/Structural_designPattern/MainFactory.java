package com.epam.Structural_designPattern;

public class MainFactory {

	public  Fruit apple;
	public  Fruit orange;
	public  Fruit banana;

	MainFactory()
	{
		apple=new Apple();
		orange=new Orange();
		banana=new Banana();
	}
	public void applecost()
	{
		apple.cost();
		
	}
	public void orangecost()
	{
		orange.cost();
	}
	public void bananacost()
	{
		banana.cost();		
	}
}
