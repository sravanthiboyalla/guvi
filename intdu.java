import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class intdu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		int count=0;
		for(int j=0;j<=k;j++)
		{
			String i=String.valueOf(j);
			if(s.contains(i))
			{
				count++;
			}
		}
		if(count==k+1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
