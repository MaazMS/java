package compileTime;

public class Mobile {

	int number1, number2;
	String name;

	public int createContact(String name, int number1) {
		this.name = name;
		this.number1 = number1;

		System.out.println("Contact name is " + name + " and number is  " + number1);
		return 0;
	}

	public int createContact(String name, int number1, int number2) {
		this.name = name;
		this.number1 = number1;
		this.number2 = number2;

		System.out.print("Contact name is " + name);
		System.out.print(" This is my first number " + number1);
		System.out.print(" This is my second number " + number2);
		return 0;
	}

	public static void main(String args[]) {

		Mobile object1 = new Mobile();

		object1.createContact("Maaz", 1234567890);
		object1.createContact("Shaikh", 1236547890, 1234569870);
	}
}
/*
Contact name is Maaz and number is  1234567890
Contact name is Shaikh This is my first number 1236547890 This is my second number 1234569870 
*/
