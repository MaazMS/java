import java.io.*;

public class website
{

 public void function()
 {
      System.out.println("This is base class function");
 }
  
  public static void display()  // static method override in drived class
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
  
  public static void  display()         // This is static method override
  {
          System.out.println("This is drived class");
  }
		
    public static void main(String args[])
    {
       websitePro object1 = new websitePro();      // Drived class object call drived class method    
       object1.display();   
			
       website object2 = new website();            // Base class object call base class method          
        object2.display(); 
			
       website object3 = new websitePro();                                           
       object3.function(); 
       object3.display();    // object call base class method because static Methods cannot be overridden
     }
 }
  
  /*OUTPUT 
This is drived class
This is base class
This is base class
This is base class function
*/

