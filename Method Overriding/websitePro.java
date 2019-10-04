import java.io.*;

public class website
{
  public void function()
  {
      System.out.println("This is base class function");
  }
  
   public void display()         // This method is override in driver class
   {
       System.out.println("This is base class");
   }
	
 }

public class websitePro extends website
{
  public void method()
  {
      System.out.println("This is drived class method");
  }
  
  public void display()  // This method is override method 
   {
    	System.out.println("This is drived class");
    }
		
    public static void main(String args[])
    {
        websitePro object1 = new websitePro();  // Drived class object call drived class method
	  object1.display();
	 
	 website object2 = new website();       // base class object call base class method
	 object2.display(); 
	 
	 website object3 = new websitePro();    //This object call only overriden method and not call to any normal method of drived class. 
	 object3.display();
	 object3.function(); 
	 //object3.method();  error The method method() is undefined for the type website
      
      }
   }

/*OUTPUT
This is drived class
This is base class
This is drived class
This is base class function
*/
