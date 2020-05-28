public class Constructor1 {

	int number;
	String name;

	public Constructor1() {

		System.out.println("default constructor created by developer");
	}

	public static void main(String args[]) {

		Constructor1 object = new Constructor1();
		System.out.println("default vale of number	" + object.number);
		System.out.println("default vale of name	" + object.name);
	}
}
/*
default constructor created by developer
default vale of number	0
default vale of name	null
*/
