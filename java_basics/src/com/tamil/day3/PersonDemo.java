//This program to demonstrate Driver/Executor program
package com.tamil.day3;

public class PersonDemo {

	public static void main(String[] args) 
	{
			Person p1;
			p1=new Person();
			p1.setPid(101);
			p1.setName("Thamizh");
			p1.setCity("Mumbai");
			System.out.println(p1);
			
			Person p2=new Person();
			p2.setPid(102);
			p2.setName("Suga");
			p2.setCity("Bangalore");
			
			
			System.out.println(p2);//calling toString method
	}

}
