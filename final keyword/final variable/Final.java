import java.io.*; 

public class Final 
{ 
	public static void main(String args[])
	{
		final int number=10;
		System.out.println("number := "+number);  
    
	//number=1;  Error: The final local variable number cannot be assigned. It must be blank and not using a compound assignment
	}

}
/*OUTPUT 
number := 10
*/
