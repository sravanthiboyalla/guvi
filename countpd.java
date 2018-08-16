import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class countpd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int k=0;
		int count=0;
		while(a>0)	
		{
			k=a%10;
			if(k==b)
			{
				count++;
			}
			a=a/10;
		}
		System.out.println(count);
	}
}
