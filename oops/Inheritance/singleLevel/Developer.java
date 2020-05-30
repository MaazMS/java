package singleLevel;

public class Developer extends Employee {

	String profile;

	public Developer(int empId, String empName, int salary, String profile) {
		super(empId, empName, salary);
		this.profile = profile; 
		System.out.println("Employee Profile	"+profile);
	}
	
	public static void main(String args[]) {
		Developer object = new Developer(225,"Maaz",20000,"java");
		object.display();
	}
}
