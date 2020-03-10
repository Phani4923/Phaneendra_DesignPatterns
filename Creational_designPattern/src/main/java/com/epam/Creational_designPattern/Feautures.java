package com.epam.Creational_designPattern;

public class Feautures {

	public String weight;
	public int screen_size;
	public int  cam_front,cam_rear;
	public String os;
	int battery;
	int storage;
	String processor;
	
	Feautures(String weight,int screen_size,int cam_front,int cam_rear,String os,int battery,int storage,String processor)
	{
		this.weight=weight;
		this.screen_size=screen_size;
		this.cam_front=cam_front;
		this.cam_rear=cam_rear;
		this.os=os;
		this.battery=battery;
		this.storage=storage;
		this.processor=processor;	
	}
}
