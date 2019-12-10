public class StringCharacter {
	
	
	public static void main(String args[])
	{
		String str="String To Character Array";
		
		char array[] = str.toCharArray();  // String To Character Array.
		
		int j=array.length;
		
		System.out.println("Length of Character array= "+j);
		
		for(int i=array.length-1;i>0;i--)
		{
			System.out.print(array[i]);
		}
	}

}
/*OUTPUT 
 Length of Character array= 25
yarrA retcarahC oT gnirt 
 */
