package runTime;

public class Baroda extends Bank {

	public int getRateOfInterest() {
		
		System.out.println("interest rate of Baroda bank 91 days to 180 days  is 5.50%");
		return 0;
	}

	public static void main(String args[]) {
		Baroda object3 = new Baroda();
		object3.getRateOfInterest();
	}
}
/*output
interest rate of Baroda bank 91 days to 180 days  is 5.50%
*/
