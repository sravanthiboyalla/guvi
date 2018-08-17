import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class compared
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				count++;
			}
		}
		if(count==k)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
