package string.com;

import java.util.Scanner;

public class Employee {
public String name;
public static int serviceYers;
public static String department;
public static String rating;
public static int salary;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employee name");
	String name=sc.next();
	System.out.println("Enter the employee yeras of expeirence");
	int serviceYers=sc.nextInt();
	System.out.println("Enter the employee Department");
	String department=sc.next();
	System.out.println("Enter the employee rating");
	String rating=sc.next();
	System.out.println("Enter the employee salary");
	int salary=sc.nextInt();
	if(serviceYers>=2 && rating.equalsIgnoreCase("Average") || rating.equalsIgnoreCase("AboveAverage")) {
		System.out.println("Employee eligible for Bonus");
		double bonus;
		if(department.equalsIgnoreCase("HR")) {
			bonus=salary*0.02;
			System.out.println("Bonus is :"+bonus);
		}
		else if(department.equalsIgnoreCase("Accounting")) {
			bonus=salary*0.03;
			System.out.println("Bonus is :"+bonus);
		}
		else if(department.equalsIgnoreCase("IT")) {
			bonus=salary*0.05;
			System.out.println("Bonus is :"+bonus);
		}
		else if(department.equalsIgnoreCase("Sales")) {
			bonus=salary*0.08;
			System.out.println("Bonus is :"+bonus);
		}
	}
	else {
		System.out.println("Employee is not eligible for Bonus");
	}
	
	 
	
}
 
}
