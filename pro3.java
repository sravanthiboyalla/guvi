import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int count=0;
		int c=0;
		if(s1.length()>s2.length())
		{
			c=s1.length()-s2.length();
			if(s2.length()==1)
			{
				if(s1.contains(s2))
				{
					count=0;
				}
				else
				{
					count++;
				}
			}
			else
			{
				for(int i=0;i<s2.length();i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						count++;
					}
				}
			}
		}
		else
		{
			c=s2.length()-s1.length();
			if(s1.length()==1)
			{
				if(s2.contains(s1))
				{
					count=0;
				}
				else
				{
					count++;
				}
			}
			else
			{
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						count++;
					}
				}
			}
		}
		int d=c+count;
		System.out.println(d);
	}
}
