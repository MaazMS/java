package runTime;

public class Axis extends Bank  {
	
	public int getRateOfInterest() {
		
		System.out.println("interest rate of Axis bank 5 to 6 months is 5.40%");
		return 0 ;
	}
	
	public static void main(String args[]) {
		Axis object2 = new Axis();
		object2.getRateOfInterest();
	}
}
/*output
 interest rate of Axis bank 5 to 6 months is 5.40%
 */
