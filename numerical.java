import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class numerical
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean b=true;
		try
		{
			Double num=Double.parseDouble(s);
		}
		catch(NumberFormatException e)
		{
			b=false;
		}
		if(b)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
