//Program to define the person entity class
package com.tamil.day3;

public class Person 
{
	//Private data members
	private int pid;
	private String name;
	private String city;
	
	//Getter and Setter
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	
}
