import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stcmp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		int count=0;
		if(s.length()==s1.length())
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==s1.charAt(i))
				{
					count++;
				}
			}
		}
		if(count==s.length())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
