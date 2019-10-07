import java.io.*;

public class Final 
{  
	static final int intnumber;
	
	static
	{
		intnumber=100;
	}
	
	 
	 
	public static void main(String args[])
	{
		System.out.println("Static block initialize final variable  : "+intnumber);	
		
	}

}
/*OUTPUT 
Static block initialize final variable  : 100
*/
