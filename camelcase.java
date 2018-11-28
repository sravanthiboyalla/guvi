import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class camelcase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].charAt(0)>=65&&a[i].charAt(0)<=91)
			{
				count++;
			}
		}
		if(count==a.length)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
