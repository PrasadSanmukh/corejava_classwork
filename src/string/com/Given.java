package string.com;

import java.util.Scanner;

public class Given {
public static void main(String[] args) {
	int n=50;
	Scanner sc=new Scanner(System.in);
	 
	int x=sc.nextInt();
	if(n==x) {
		System.out.println("yes, it is given number");
	}
	else {
		System.out.println("No, it  not is given number");
	}
}
}
