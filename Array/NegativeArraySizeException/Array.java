// This program is show that the size of array is not nagatvie .It give us NagavieArraySizeException. 
import java.io.*; 
import java.lang.*;  

public class Array
{
    public static void main(String args[]){
	
	    int [] array = new int[-8];  // The Array Size is nagative. 
	
	    System.out.println("Address of Array"+array);
   }
}  
/*OUTPUT 
Exception in thread "main" java.lang.NegativeArraySizeException: -8   */
