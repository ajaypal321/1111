package CodewithAjay;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Please enter 3rd number");
		int c = sc.nextInt();
		System.out.println("Please enter 4th number");
		int d = sc.nextInt();
		System.out.println("Please enter 5th number");
		int e = sc.nextInt();
		int result = ((a+b+c+d+e)*100)/500;
		System.out.println("Your result in percentage is " + result);

	}

}
