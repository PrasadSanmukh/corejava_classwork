package string.com;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the length");
		int l=sc.nextInt();
		 System.out.println("enter the breadth");
		int b=sc.nextInt();
		if(l==b)
		{
			 System.out.println("This is a square");
		}
		else {
			 System.out.println("This is rectangle");
		}
	}

}
