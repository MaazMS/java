/*This program is show that the array size is not increase if the size is defined. If insert more element then 
  the size of array give ArrayIndexOutOfBoundsException */ 
  
import java.io.*; 
import java.lang.*; 

public class Array
{
    public static void main(String args[]){
	
	int [] a = new int[2]; 
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;  // Extra number add in arry 
  
	for(int i=0;i<3;i++)
	{
		System.out.println(a[i]);	
	}
    }
} 
/*OUTPUT 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2     */
