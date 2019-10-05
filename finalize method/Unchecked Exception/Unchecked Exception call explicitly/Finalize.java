import java.io.*; 


public class Finalize 
{
	
	public static void main(String args[])
	{
		
		Finalize object = new Finalize(); 
		
		// Explicitly call to finalize and in method write unchecked exception  give run time error but object destroy
		object.finalize();  
		
		object=null; 
		
		System.gc();  // Request to call garbage collector 
		
		System.out.println("Main Completed");
	
	}
	
	
	public void finalize()  
	{
		System.out.println("finalize is overloded"); 
		
		System.out.println(10/0);  //ArithmaticException  
	}
    
}
/*OUTPUT 
finalize is overloded
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at finalizeMethod/finalizeMethod.Finalize.finalize(Finalize.java:27)
	at finalizeMethod/finalizeMethod.Finalize.main(Finalize.java:13)
*/
