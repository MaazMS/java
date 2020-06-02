package runTime;

public class HDFC extends Bank {
	
	public int getRateOfInterest() {
		
		System.out.println("interest rate of HDFC bank 91 days to 6 months is 5.40%");
		return 0;
	}

	public static void main(String args[]) {
		HDFC object4 = new HDFC();
		object4.getRateOfInterest();
	}
}
/*output
interest rate of HDFC bank 91 days to 6 months is 5.40%
*/
