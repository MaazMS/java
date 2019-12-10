import java.util.*;

public class StringLength {
	public static void main(String args[])
	{
		String str,str1="";  // Str1 have been initialized;
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		int i=str.length(); 
		System.out.println("The length of String ="+i);
		
		for(int j=i-1;j>=0;j--)
		{
			str1 = str1+str.charAt(j);
		}
		
		System.out.print(str1);
		
	}
} 
/*OUTPUT
 Enter the String
String
The length of String =6
gnirtS
 */
