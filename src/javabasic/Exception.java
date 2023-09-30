package javabasic;

public class Exception {

	public static void main(String[] args) {
	try {
		int result=  divide(5,0);
		System.out.println(result);
	} catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
		
		
		
		
		
		

	}
	
	public  static int divide(int dividend,int divisor) {
		return dividend/divisor;
	}

}

