import java.io.*; 

public class Finalize 
{
	
	public static void main(String args[])
	{
		
		Finalize object = new Finalize(); 
		
		object=null; 
		
		System.gc();  // Request to call garbage collector 
		
		System.out.println("Main Completed");
	
	}
	
	public void finalize()  // only unchecked Exception is ignore by JVM 
	{
		System.out.println("finalize is overloded"); 
		
		System.out.println(10/0);  //ArithmaticException  
	}
    
}
/*OUTPUT 
Main Completed
finalize is overloded
*/
