import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class odded
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int k=0;
		while(i>0)
		{
			if(n%i==0)
			{
				k=n/i;
				if(k%2==0)
				{
					i++;
				}
				else
				{
					break;
				}
			}
			else
			{
				i++;
			}
		}
		System.out.println(i);
	}
}
