package condition;

public class NumberArgument {

	public int createContact(String name, int number1) {

		System.out.print("My name is " + name);
		System.out.println(" my first number " + number1);
		return 0;
	}

	public int createContact(String name, int number1, int number2) {

		System.out.print("my name is" + name);
		System.out.print(" my first number " + number1);
		System.out.println(" my second number " + number2);
		return 0;
	}

	public static void main(String args[]) {

		NumberArgument object = new NumberArgument();
		object.createContact("Maaz", 123456987);
		object.createContact("MShaikh", 123654789, 123456987);
	}
}
/*OUTPUT 
My name is Maaz my first number 123456987
my name isMShaikh my first number 123654789 my second number 123456987
*/
