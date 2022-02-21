package string.com;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)   
	{  
		 int r,sum=0,temp;    
		  Scanner sc=new Scanner(System.in);
		 
			int n=sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		    
		   System.out.println(temp);    
		      
		}  
}
