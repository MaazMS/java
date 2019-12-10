public class RevrseString
{
	
	public static void main(String args[])
	{
		String str="Reverse String";
		
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();   // Reverse str.
		
		System.out.println(str2);
	}

}

/*OUTPUT 
  gnirtS esreveR
 */
