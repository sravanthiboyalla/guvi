import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class limited
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String re="";
		int k=0;
		if(s1.length()>s2.length())
		{
			int i=s1.length()-s2.length();
			k=i;
			if(i==1)
			{
				s2=s2+"1";
			}
			else if(i==2)
			{
				s2=s2+"12";
			}
			else if(i==3)
			{
				s2=s2+"123";
			}
			else if(i==4)
			{
				s2=s2+"1234";
			}
			else if(i==5)
			{
				s2=s2+"12345";
			}
			else 
			{
				s2=s2+"123456";
			}
			for(int j=0;j<s1.length();j++)
			{
				re=re+s1.charAt(j)+s2.charAt(j);
			}
		}
		else if(s2.length()>s1.length())
		{
			int i=s2.length()-s1.length();
			if(i==1)
			{
				s1=s1+"1";
			}
			else if(i==2)
			{
				s1=s1+"12";
			}
			else if(i==3)
			{
				s1=s1+"123";
			}
			else if(i==4)
			{
				s1=s1+"1234";
			}
			else if(i==5)
			{
				s1=s1+"12345";
			}
			else 
			{
				s1=s1+"123456";
			}
			for(int j=0;j<s1.length();j++)
			{
				re=re+s1.charAt(j)+s2.charAt(j);
			}
		}
		else
		{
			for(int j=0;j<s1.length();j++)
			{
				re=re+s1.charAt(j)+s2.charAt(j);
			}
		}
		System.out.println(re);
	}
}
