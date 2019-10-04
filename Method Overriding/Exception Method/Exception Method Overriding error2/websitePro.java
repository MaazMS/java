public class website
{
	public void method()  throws Exception 
	{
		System.out.println("This is base class function");
	} 
	
	public void display()
	{
		System.out.println("This is base class");
	}
	
}

public class websitePro extends website
{
	public void method() throws ArithmeticException
	{ 
		
 		System.out.println("This is drived class method");
	} 
	 
	public void display()    
	{
		System.out.println("This is drived class");
	}
	public static void main(String args[])
	{
		websitePro object1 = new websitePro();
		object1.display();
		
		website object2 = new website();
		object2.display(); 
		
		website object3 = new websitePro(); 
		object3.display();
		object3.method();  // error  Unhandled exception type Exception
	}
}
