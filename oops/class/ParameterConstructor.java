public class ParameterConstructor {

	int number;
	String name;
	
	public ParameterConstructor(int number,String name) {
		this.number=number;
		this.name=name;
	}
	
	public static void main(String args[]) {
		
		ParameterConstructor object = new ParameterConstructor(101,"Maaz");
		System.out.println("default vale of number	" + object.number);
		System.out.println("default vale of name	" + object.name);
	}
}
/*
default vale of number	101
default vale of name	Maaz */
