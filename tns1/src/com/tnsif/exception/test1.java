package com.tnsif.exception;
//if finally will execute if exception with matching catch block is given
public class test1 {
	public static void main(String[] args)
	{
		try
		{
			System.out.println(100/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
		finally
		{
			System.out.println("end");
		}
	}

}

//if no matching catch block like catch(NullPointerException e), then it will show error. but finally block will execute.