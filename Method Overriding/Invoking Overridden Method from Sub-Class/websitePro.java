import java.io.*;

public class website
{
	public void method()  
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
	public void method() 
	{ 
		super.method();
 		System.out.println("This is drived class method");
	} 
	 
	public void display()    
	{ 
		super.display();
		System.out.println("This is drived class");
	}
	public static void main(String args[])
	{
		/*
		 * websitePro object1 = new websitePro(); object1.display();
		 * 
		 * website object2 = new website(); object2.display();
		 */
		
		website object3 = new websitePro(); 
		object3.display();   //Access base class by using super keyword
		object3.method();     //Access base class by using super keyword
	}
}

/*OUTPUT
This is base class
This is drived class
This is base class function
This is drived class method
*/
