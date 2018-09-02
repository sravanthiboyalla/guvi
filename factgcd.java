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
		int fact1=1;
		int i;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		for(i=1;i<=b;i++)
		{
			fact1=fact1*i;
		}
		while(fact!=fact1)
		{
			if(fact>fact1)
			{
				fact=fact-fact1;
			}
			else
			{
				fact1=fact1-fact;
			}
		}
		System.out.println(fact);
	}
}
