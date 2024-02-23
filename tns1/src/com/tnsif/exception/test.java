package com.tnsif.exception;
//finally block with no exception
public class test {
	public static void main(String[] args)
	{
		try
		{
			System.out.println("welcome");
		}
		catch(Exception e)
		{
			System.out.println("hi");
		}
		finally
		{
			System.out.println("hello java");
		}
	}

}
