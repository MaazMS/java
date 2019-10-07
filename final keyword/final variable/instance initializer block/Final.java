// instance initialzer block in execute top to bottom and execute before the constructor   

import java.io.*;

public class Final 
{  
	final int intnumber;
	
	{
		intnumber=100;
		System.out.println("Instance initializer block 1 ");
	}
	
	 
	 
	public static void main(String args[])
	{
		Final object = new Final(); 
		System.out.println(object.intnumber);		
		
	}

} 
/*OUTPUT  
Instance initializer block 1 
100
*/
