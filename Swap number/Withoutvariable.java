import java.io.*;

public class Withoutvariable{
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Enter first number and Second number");
		int no1 = Integer.parseInt(br.readLine());
		int no2 = Integer.parseInt(br.readLine());
		System.out.println("First number = " + no1  + "Second number = " + no2); 
		
		no1 = no1 + no2;    // 13 = 5+7
		no2 = no1 - no2;    // 5 = 13-7 
		no1 = no1 - no2;    // 7 = 13-5
		
		System.out.println("First number = " + no1  + "Second number = " + no2);
	}
}
/*OUTPUT 
Enter first number and Second number
5
3
First number = 5Second number = 3
First number = 3Second number = 5
*/
