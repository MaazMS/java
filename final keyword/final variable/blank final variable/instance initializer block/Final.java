/* If any one constructor having no initialization of final variable then 
it show Duplicate method constructor name in type class name and constructor not execute .*/

import java.io.*;

public class Final 
{  
	final int intnumber;
	
	Final()
	{
		intnumber=100;
	}
	
	 Final() // This is not execute because  no initialization of final variable
	 {
	  System.out.println("This constructor is not initialize final variable  "); 
	  }
	 
	public static void main(String args[])
	{
		Final object =new Final();
		int number=10;
		System.out.println("number := "+number); 
		System.out.println(object.intnumber);
		
	}

}
/*OUTPUT 
number := 10
100
*/
