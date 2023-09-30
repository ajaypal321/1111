package javabasic;

public class HandleDividebyZero {

	public static void main(String[] args) {
		int numerator= 4;
		int denominator=0;
		try {
			int result=numerator/denominator;
			System.out.println("Result"+ result);}
			
		 catch (ArithmeticException e) {
			 System.out.println("Error:"+e.getMessage());
			 System.out.println("Can not divide by zero");
		 }
	}

}
