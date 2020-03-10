package com.epam.Structural_designPattern;

import java.util.*;

public class Proxy_DP {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the doc to be shared");
		String document=scan.next();
		FileAccess fileAccess=new DuplicateFile(document);
		fileAccess.copy();
		System.out.println(" ");
		fileAccess.copy();
		scan.close();
	}
}
