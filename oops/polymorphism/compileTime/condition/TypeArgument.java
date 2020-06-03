package condition;

public class TypeArgument {

	public int funtion(int number) {

		System.out.println("function argument is integer " + number);
		return 0;
	}

	public int function(String name) {

		System.out.println("function argumrnt is string " + name);
		return 0;
	}

	public static void main(String args[]) {

		TypeArgument object = new TypeArgument();
		object.funtion(100);
		object.function("Maaz");
	}
}
/*OUTPUT 
function argument is integer 100
function argumrnt is string Maaz
*/
