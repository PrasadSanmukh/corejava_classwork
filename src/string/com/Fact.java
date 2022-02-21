package string.com;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = 1, sum = 0;
		int n = sc.nextInt();

		String str = Integer.toString(n);

		for (int i = 0; i < str.length(); i++) {

			System.out.println(str.charAt(i));
			for (int j = 1; j <= str.charAt(i); j++) {
				f = f * j;
			}

			sum = sum + f;
			System.out.println(sum);
		}

		

		if (n == sum) {
			System.out.println("strong number");
		} else {
			System.out.println(" not a strong number");

		}
	}

}
