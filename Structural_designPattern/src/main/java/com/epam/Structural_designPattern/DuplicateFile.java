package com.epam.Structural_designPattern;

public class DuplicateFile implements FileAccess{
	private String document;
	 private OriginalFile original_document;
	  
	DuplicateFile(String document)
	{
		this.document=document;		
	}
	public void copy()
	{		
		if(original_document==null)
		{
			original_document =new OriginalFile(document);
		}
		original_document.copy();
	}	
	
}
