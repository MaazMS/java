import java.io.*;

class input
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the your name");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in); 
		String S = br.readLine();
		System.out.println(S); 
	}	
}
/* OUTPUT 
Enter the your name
maaz
maaz

*/
