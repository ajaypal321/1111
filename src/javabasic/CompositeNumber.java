package javabasic;
import java.util.Scanner;

public class CompositeNumber {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        int n,i,c=0;
	        System.out.println("Enter the numer");
	        n = sc.nextInt();
	        for (i=1; i<=n; i++)
	        {
	            if (n %i ==0)
	            {
	                c++;
	            }
	        }
	        if (c>2)
	        {
	            System.out.println("yes");
	        }
	        else{
	            System.out.println("No");
	        }
	    }
	}


	


