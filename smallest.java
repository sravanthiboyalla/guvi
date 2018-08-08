import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class smallest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2)
		{
			if(n1%n2==0)
			{
				System.out.println(n1);	
			}
			else
			{
				System.out.println(n1*n2);
			}
		}
		else
		{
			if(n2%n1==0)
			{
				System.out.println(n2);
			}
			else
			{
				System.out.println(n1*n2);
			}
		}
	}
}
