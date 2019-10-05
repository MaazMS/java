import java.io.*;

public class Finalize 
{
	
	public static void main(String args[])
	{
		
		String s = new String("set of character");
		s = null; 
		
		System.gc();  // Request to call garbage collector 
		
		System.out.println("Main Completed");
	
	}
 
 // This finalize is no  to destroy string class object. String class call finalize and destroy String class object.
	public void finalize() 
	{
		System.out.println("finalize is overloded");
	}
    

}
/*OUTPUT 
Main Completed
*/
