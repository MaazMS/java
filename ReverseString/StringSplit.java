import java.util.*;
public class StringSplit 
{
	
	public static void main(String args[])
	{
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str =sc.nextLine(); 
		
		String tocken[] = str.split(""); 
		
		int len=tocken.length;
		System.out.println("Length of String = "+len);
		
		System.out.println(Arrays.toString(tocken)); // Display array.
		
		for(int i=tocken.length-1;i>=0;i--)
		{
			System.out.print(tocken[i]);
		}
		
		}
}

/*OUTPUT
 Enter the String
Split
Length of String = 5
[S, p, l, i, t]
tilpS
*/
