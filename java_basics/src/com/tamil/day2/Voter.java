//Program to demonstrate Checking the vote 
package com.tamil.day2;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int age;
		String sname;
		System.out.println("Enter the name and age:");
		
		sname=s.nextLine();
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println(sname+" Eligible for vote...");
		}
		else
		{
			System.out.println(sname+" Not Eligible for vote...");
		}
	}
}
