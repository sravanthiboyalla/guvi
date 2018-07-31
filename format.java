import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class format
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double area=l*b;
		System.out.format("%.5f",area);
	}
}
