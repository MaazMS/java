import java.io.*;

public class website
{
	public void method() // No error throws ArithmeticException is use in derived class and not use in base class
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
	public void method() throws ArithmeticException  // No error throws ArithmeticException is not in base class 
	{ 
		
 		System.out.println("This is drived class method");
	} 
	 
	public void display()  //throws Exception if use "Exception " then error is Unhandled exception type Exception 
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
		object3.display();      // overridden method
		object3.method();       // overridden method
	}
}

/*OUTPUT
This is drived class
This is base class
This is drived class
This is drived class method
*/
