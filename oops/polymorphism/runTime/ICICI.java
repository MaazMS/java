package runTime;

public class ICICI extends Bank  {
	
	public int getRateOfInterest() {
		
		System.out.println("interest rate of ICICI bank 61 days to 184 days is 5.25%");
		return 0 ;
	}
	
	public static void main(String args[]) {
		ICICI object5 = new ICICI();
		object5.getRateOfInterest();
	}
}
/*output
interest rate of ICICI bank 61 days to 184 days is 5.25%
*/
