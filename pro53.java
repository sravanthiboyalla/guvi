import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro53
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String k=s.toUpperCase();
		int count=0;
		for(int i=65;i<=90;i++)
		{
			char c=(char)(i);
			//System.out.println(c);
			String d=Character.toString(c);
			//System.out.println(d);
			if(k.contains(d))
			{
				count++;
			}
		}
		//System.out.println(count);
		if(count==26)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
