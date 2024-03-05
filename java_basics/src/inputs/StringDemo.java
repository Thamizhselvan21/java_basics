package inputs;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the courses:");
		String courses;
		courses=sa.nextLine();
		System.out.println("Courses:"+courses);
	}

}
