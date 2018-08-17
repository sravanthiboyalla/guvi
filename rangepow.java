import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rangepow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int count=0;
		for(int i=l;i<=r;i++)	
		{
			int k=(int)(Math.sqrt(i));
			int c=k*k;
			if(c==i)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
