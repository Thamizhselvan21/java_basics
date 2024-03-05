package inputs;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name and age:");
		name=s.next();
		age=s.nextInt();
		
		if(age>=18)
		{
			System.out.println(name+" is eligible for vote");
		}
		else
		{
			System.out.println(name+" is not eligible for vote");
		}
		
	}
}
