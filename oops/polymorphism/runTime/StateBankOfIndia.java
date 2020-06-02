package runTime;

public class StateBankOfIndia extends Bank {
	
	public int getRateOfInterest() {
		
		System.out.println("interest rate of State Bank Of India 180 days to 210 days is 5.80%");
		return 0;
	}

	public static void main(String args[]) {
		StateBankOfIndia object8 = new StateBankOfIndia();
		object8.getRateOfInterest();
	}
}
/*output
interest rate of State Bank Of India 180 days to 210 days is 5.80%
*/
