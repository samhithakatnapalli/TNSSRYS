package com.tnsif.exception;

import java.util.Scanner;

//to demonstrate throw keyword
public class testdemo {
	public static void main(String[] args)
	{
		//scanner used for user defined input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		
		if(rollno<0)
		{
			throw new ArithmeticException("rollno cannot be negative");
		}
		else
		{
			System.out.println("valid rollno");
		}
	}

}
