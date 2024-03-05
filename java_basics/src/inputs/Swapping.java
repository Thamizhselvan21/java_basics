package inputs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a and b:");
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println("before swapping a="+a+" and b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a="+a+" and b="+b);
	}

}
