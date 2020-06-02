package runTime;

public class Bank {

	public int getRateOfInterest() {
		
		System.out.println("interest rate of RBI is 3.31%");
		return 0 ;
	}
	
	public static void main(String args[]) {
		Bank object = new Bank();
		object.getRateOfInterest();
	}
}
/*output
interest rate of RBI is 3.31% 
*/
