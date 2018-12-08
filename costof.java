import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class costof
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		int sum=0;
		if(s.length()>s1.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)>s.charAt(i))
				{
					sum=sum+(int)(s1.charAt(i)-s.charAt(i));
				}
				else
				{
					sum=sum+(int)(s.charAt(i)-s1.charAt(i));
				}
			}
			for(int j=s1.length();j<s.length();j++)
			{
				sum=sum+((int)s.charAt(j))-65;
			}
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				if(s1.charAt(i)>s.charAt(i))
				{
					sum=sum+(int)(s1.charAt(i)-s.charAt(i));
				}
				else
				{
					sum=sum+(int)(s.charAt(i)-s1.charAt(i));
				}
			}
			for(int j=s.length();j<s1.length();j++)
			{
				sum=sum+((int)s1.charAt(j))-65;
			}	
		}
		System.out.println(sum);
	}
}
