/* If any one constructor having no initialization of final variable then OUTPUT of given program .
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The blank final field intnumber may not have been initialized

	at DataType/DataType.Final.<init>(Final.java:13)
	at DataType/DataType.Final.main(Final.java:23)
Final variable = 100
*/ 


import java.io.*;

public class Final 
{  
	final int intnumber;
	
	Final()
	{
		intnumber=100;
		System.out.println("Final variable = "+intnumber);
	}
	
	 Final(int number) 
	 {
		 
		 intnumber=100;
		 System.out.println("Non Final variable = "+number); 
	  }
	 
	public static void main(String args[])
	{
		Final object =new Final();
		Final object1 =new Final(30);
		
		
	}

}

/*OUTPUT 
Final variable = 100
Non Final variable = 30
*/
