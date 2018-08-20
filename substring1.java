import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class substring1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sub=sc.next();
		int count=0;
		int a=s.length();
		int b=sub.length();
		for(int i=0;i<a-b;i++)
		{
			if((s.substring(i,i+b)).equals(sub))
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
