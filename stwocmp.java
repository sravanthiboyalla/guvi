import java.util.*;
import java.lang.*;
import java.io.*;
class stwocmp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s2=s.toLowerCase();
		String s1=sc.next();
		String s3=s1.toLowerCase();
		int count=0;
		if(s2.length()==s3.length())
		{
			for(int i=0;i<s2.length();i++)
			{
				if(s2.charAt(i)==s3.charAt(i))
				{
					count++;
				}
			}
		}
		if(count==s3.length())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
