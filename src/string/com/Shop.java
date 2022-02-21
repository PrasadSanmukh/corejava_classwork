package string.com;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the unit");
		int unit=sc.nextInt();
double cost=unit*100;
if(cost<1000) {
	System.out.println("user cost is"+cost);
}else {
	cost=cost-(cost*0.01);
	System.out.println("user cost is"+cost);
}
	}

}
