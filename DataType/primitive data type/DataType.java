import java.io.*;

package DataType;

public class DataType 
{ 
	
	// if increase the range of any data type then it give compile time error Type mismatch
	public static void main(String args[])  
	{
		// byte range -128 to 127 
		byte bytenumber=-128;
		System.out.println("bytenumber = : "+ bytenumber); 
		
		// short range -32768 to 32767
		short shortnumber=32767;
		System.out.println("shortnumber = : "+ shortnumber); 
		
		// int range -2147483648 to 2147483647 
		int intnumber=2147483647;
		System.out.println("intnumber = : "+ intnumber);  
		
		// long range -9223372036854775808 to 9223372036854775807  
		// The number is end with capital "L" and small "l" . because after 922337209 and any digit give erroe
		long longnumber=9223372036854775807l;
		System.out.println("longnumber = : "+ longnumber); 
			
	}
}
/*OUTPUT 
bytenumber = : -128
shortnumber = : 32767
intnumber = : 2147483647
longnumber = : 9223372036854775807
*/
