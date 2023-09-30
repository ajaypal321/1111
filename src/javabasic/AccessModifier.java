package javabasic;

public class AccessModifier{
	// created 4 variable
 public int publicvar=20;
 private int privatevar;
 protected int protectedvar;
 int defaultvar;
 
 // public method
 public void publicMethod() {

	 System.out.println("This is public method");
 }
//private method
private void privateMethod() {
	 System.out.println("This is private method");
}
//protected method
protected void protectedMethod() {
	 System.out.println("This is protected method");}
//default method
public void defaultMethod() {
	 System.out.println("This is Default method");}

}