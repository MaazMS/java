import java.io.*;
public class Withvariable { 
	public static void main(String args[]) throws Exception { 
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
		
		System.out.println("Enter first number and Second number");
		int no1 =Integer.parseInt(br.readLine()); 
		int no2 = Integer.parseInt(br.readLine()); 
		System.out.println("First number = " + no1  + "Second number = " +no2); 
		
		int temp = no1;
			no1  = no2; 
			no2  = temp; 
			
		System.out.println("First number = " + no1  + "Second number = " +no2);
	}
}
/*OUTPUT 
Enter first number and Second number
4
2
First number = 4Second number = 2
First number = 2Second number = 4
*/
