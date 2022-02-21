package string.com;

import java.util.Scanner;

public class Loaction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the age");
		int age=sc.nextInt();
		  System.out.println("enter the gender");
		char gender=sc.next().charAt(0);
		if(gender=='F') {
			System.out.println("she will work only in urban areas.");
		} 
		if(gender=='m' && age>=20 && age<=40) {
			System.out.println("he can work in enywhere");
		}
		else if(gender=='m' && age>=40 && age<=60) {
			System.out.println("he will work in urban areas only");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
