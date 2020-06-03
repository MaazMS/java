// call the main over load method using class name because main is the static method. 
package exceptionCases;

public class MainOverload { 
	
	public static void main(String args[]) {
		
		System.out.println(" This public static void main (String args[])  method ");
		MainOverload.main(20);
	}
	
	public static void main(int a) {
		
		System.out.println(" This public static void main (int a)  method ");
	}
	
}
/*output 
  This public static void main (String args[])  method 
 This public static void main (int a)  method 
 */
