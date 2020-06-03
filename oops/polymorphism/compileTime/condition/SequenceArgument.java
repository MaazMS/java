package condition;

public class SequenceArgument {

	public int triangle(int base, float height) {

		System.out.println("Triangle base as integer " + base);
		System.out.println(" Triangle height as float " + height);
		return 0;
	}

	public int triangle(float base, int height) {

		System.out.println("Triangle base as float " + base);
		System.out.println(" Triangle height as integer " + height);
		return 0;
	}

	public static void main(String args[]) {

		SequenceArgument object = new SequenceArgument();
		object.triangle(20, 10.0f);
		object.triangle(20.0f, 10);
	}
}
/*OUTPUT 
Triangle base as integer 20
 Triangle height as float 10.0
Triangle base as float 20.0
 Triangle height as integer 10
*/
