package com.tnsif.exception;

import java.io.IOException;

//demonstrate throws
public class test2 {
	public static void main(String[] args)
	{
		Throwsdemo t=new Throwsdemo();
		try
		{
			t.display();
		
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

}
