package com.epam.Structural_designPattern;

public class OriginalFile {

	private String document;
	OriginalFile(String document)
	{
		this.document=document;
		loading(document);
	}
	public void copy()
	{
		System.out.println("Sharing of file "+document);
	}
	public void loading(String read)
	{
		System.out.println("loading the file to be shared "+read);
	}	
}
