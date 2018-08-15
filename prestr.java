import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prestr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='V')
			{
				if((s.substring(i,i+6)).equals("Vishal"))
					count++;
			}
			if(s.charAt(i)=='S')
			{
				if((s.substring(i,i+6)).equals("Sundar"))
					count1++;
			}
		}
		if(count>0&&count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
