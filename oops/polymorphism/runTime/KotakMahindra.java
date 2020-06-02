package runTime;

public class KotakMahindra extends Bank {

	public int getRateOfInterest() {
		
		System.out.println("interest rate of Kotak Mahindra 181 days to 269 days is 5.80%");
		return 0;
	}

	public static void main(String args[]) {
		KotakMahindra object7 = new KotakMahindra();
		object7.getRateOfInterest();
	}
}
/*output
interest rate of Kotak Mahindra 181 days to 269 days is 5.80%
*/
