import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class scalance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c<a+b)
		{
			if(a!=b&&b!=c&&c!=a)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("no");
		}
	}
}
