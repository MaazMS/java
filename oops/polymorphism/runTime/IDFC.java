package runTime;

public class IDFC extends Bank {

	public int getRateOfInterest() {
		
		System.out.println("interest rate of IDFC bank 91 days to 180 days  is 6.75%");
		return 0;
	}

	public static void main(String args[]) {
		IDFC object6 = new IDFC();
		object6.getRateOfInterest();
	}
}
/*output
interest rate of IDFC bank 91 days to 180 days  is 6.75%
*/
