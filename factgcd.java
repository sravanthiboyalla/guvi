import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factgcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int fact=1;
		int i;
		if(a>b)
		{
			for(i=1;i<=b;i++)
			{
				fact=fact*i;
			}
		}
		else
		{
			for(i=1;i<=a;i++)
			{
				fact=fact*i;
			}	
		}
		System.out.println(fact);
	}
}
