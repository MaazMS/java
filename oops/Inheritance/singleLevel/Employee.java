package singleLevel;

public class Employee {
	
	int empId;
	String empName;
	int salary;
	
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int display() {
		
		System.out.println("Employee Id"+empId); 
		System.out.println("Employee Id"+empName); 
		System.out.println("Employee Id"+salary); 
		return 0;
	}
}
