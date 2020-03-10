package com.epam.Creational_designPattern;

public class Builder_DP {

	public static void main(String args[])
	{
		Feautures feature=new BuilderFactory().setCam_front(16).setCam_rear(32).setBattery(2000).setStorage(128).setOs("Android").setProcessor("Snapdragon 845").getall();
		System.out.println(feature);
		System.out.println("Screen_Size Required: "+feature.screen_size);
		System.out.println("Battery Required in mAh: "+feature.battery);
		System.out.println("Front camera Required MP: "+feature.cam_front);
		System.out.println("Rear camera Required MP: "+feature.cam_rear);
		System.out.println("Required OS: "+feature.os);
		System.out.println("Processor Required: "+feature.processor);
		System.out.println("Storage Required in GB: "+feature.storage);
	}
	
}
