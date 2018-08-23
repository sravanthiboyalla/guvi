import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arpe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int a=sc.nextInt();
		int c=p/2;
		int d=0;
		for(int i=1;i<a;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i+j==c&&i*j==a)
				{
					d++;
					break;
				}
			}
		}
		if(d==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
