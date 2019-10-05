import java.io.*; 

public class Finalize 
{
	
	public static void main(String args[])
	{
		
		Finalize object = new Finalize(); 
		
		object.finalize(); // finalize method explicitly but object is not destroy . 
		object=null; 
		
		System.gc();  // Request to call garbage collector 
		
		System.out.println("Main Completed");
	
	}
	
	public void finalize()  // object destroy after complete the class 
	{
		System.out.println("finalize is overloded");
	}
    

}
/*
finalize is overloded
Main Completed
finalize is overloded
*/
