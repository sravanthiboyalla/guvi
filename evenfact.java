import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evenfact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			for(int i=2;i<=n;i++)
			{
				if(n%i==0)
				{
					if(i%2==0)
					{
						if(i==n)
						{
							System.out.print(i);
						}
						else
						{
							System.out.print(i+" ");	
						}
					}
				}
			}
		}
	}
}
